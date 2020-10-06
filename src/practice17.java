import java.io.*;

public class practice17 {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("practice17.txt"))) {
            System.out.println("Введите текст");
            System.out.println("Введите 'Стоп' для завершения");
            String text;
            while(! (text = br.readLine()).equals("Стоп")) {

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("Введенные данные успешно сохранены в файле - 'practice17.txt'");
    }
}


