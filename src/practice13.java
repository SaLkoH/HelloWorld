import java.util.Scanner;

public class practice13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите сообщение #1: ");
        String str1 = input.nextLine();
        System.out.println("Введите сообщение #2: ");
        String str2 = input.nextLine();
        input.close();
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 < len2) {
            System.out.println("Выведено сообщение 2: " + str2);
        } else if (len1 > len2) {
            System.out.println("Выведено сообщение 1: " + str1);
        } else {
            System.out.println("Сообщения равны по длине!");

        }
    }
}
