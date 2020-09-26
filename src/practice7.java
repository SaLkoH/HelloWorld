import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число:");
        int number = sc.nextInt();
        sc.close();
        int X = 3;
        int Y = 4;
        int Z = 5;
        if (number == X | number == Y | number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}
