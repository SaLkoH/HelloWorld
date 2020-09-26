import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int i = 666;
        System.out.println(Integer.toBinaryString(i));
        int in = 1100001001;
        System.out.println(Integer.parseInt(String.valueOf(in), 2));
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);

        System.out.println(binNum);

    }
}