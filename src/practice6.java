import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите X:");
        int X = sc.nextInt();
        System.out.println("Введите Y:");
        int Y = sc.nextInt();
        System.out.println("Введите Z:");
        int Z = sc.nextInt();
        sc.close();
        int average = (X + Y + Z) / 3;
        double average2 = Math.floor(average / 2);
        if (average2 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}