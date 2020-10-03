import java.util.Scanner;

public class practice14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        String S = Integer.toString(number);
        System.out.println("Строковая переменная S = " + S);
        int X = Integer.parseInt(S);
        System.out.println("Числовая переменная X = " + X);
        System.out.println("Число типа double Y = " + (double) X);
    }
}
