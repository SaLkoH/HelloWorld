import java.util.Scanner;

public class practice9 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Введите данные массива: ");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            System.out.print ("Введенные данные массива, умноженные на два: ");
            for (int i = 0; i < size; i++) {
                array[i] = array[i] * 2;
                System.out.print (" " + array[i]);
            }
            System.out.println();
    }
}
