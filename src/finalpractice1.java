import java.util.Scanner;

public class finalpractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате: ");
        String bin = sc.nextLine();
        int two = 0;
        for (int i = bin.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            two += (bin.charAt(i) - '0') * j;
        }
        System.out.println("Число в бинарном формате - " + bin + " переведено в двоичный формат - " + two);
    }
}
