import java.util.Scanner;
import java.util.Arrays;

public class practice15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Введенный пользователем массив: ");
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
    }
    public static void bubbleSort(int[] arrayToSort) {

        int changeCounter;

        do {
            changeCounter = 0;
            for (int index = 0; index < arrayToSort.length - 1; index++) {
                if (arrayToSort[index] > arrayToSort[index + 1]) {
                    int temp = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = temp;
                    changeCounter++;
                }
            }
        } while (changeCounter > 0);
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(arrayToSort));
    }
}