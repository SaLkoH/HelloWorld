import java.io.*;

public class practice18 {
    public static void main(String[] args) throws IOException {
        String s;
        BufferedReader br = new BufferedReader(new FileReader("practice18.txt"));
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }


        LineNumberReader linenumber = new LineNumberReader(new FileReader("practice18.txt"));
        int ln = 0;
        while (linenumber.readLine() != null) {
            ln++;
        }
        System.out.println("Количество строк в файле: " + ln);

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("practice18.txt");
        String text;
        int i = 0;
        while (i < ln) {
            System.out.print("Измените " + (i+1) + " строку: ");
            text = br1.readLine();
            fw.write(text + "\n");
            i++;
            fw.flush();
        }
    }
}
