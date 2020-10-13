import java.io.*;

public class practice18 {
    public static void main(String[] args) throws IOException {
        String s;
        int ln = 0;
        BufferedReader br = new BufferedReader(new FileReader("practice18.txt"));
        LineNumberReader linenumber = new LineNumberReader(new FileReader("practice18.txt"));
        while ((s = br.readLine()) != null & linenumber.readLine() != null) {
            System.out.println(s);
                ln++;
        }
        System.out.println("Количество строк в файле: " + ln);


        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = new FileWriter("practice18.txt");
        String text;
        for (int i = 0; i < ln; i++) {
            System.out.print("Измените " + (i + 1) + " строку: ");
            text = br1.readLine();
            fw.write(text + "\n");
            fw.flush();
        }
    }
}
