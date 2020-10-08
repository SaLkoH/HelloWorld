import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class practice18 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("practice18.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
        fr.close();
        List<String> lines = Files.readAllLines(Paths.get("practice18.txt"), Charset.defaultCharset());
        for (String s : lines) {

        }
        Files.write(Paths.get("practice18.txt"), lines);
    }
}
