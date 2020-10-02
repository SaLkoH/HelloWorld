import java.util.Scanner;

public class practice12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String s = input.nextLine();
        String str = s.replaceAll(" " , "");
        input.close();
        System.out.println("Сообщение без пробелов: " + str);
    }
}
