import java.io.FileReader;
import java.util.Scanner;

public class practice16 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("practice16.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
        }
    }

