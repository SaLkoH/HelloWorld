import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры: ");
        String s = input.nextLine();
        String str = String.format("%s",  s);
        input.close();
        System.out.println("Строковая переменная: " + str);
    }
}
