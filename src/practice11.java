import java.util.Scanner;

public class practice11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int s = input.nextInt();
        String str = String.format("%d",  s);
        input.close();
        System.out.println("Строковая переменная: " + str);
    }
}
