import java.util.Scanner;
import java.util.Arrays;

public class finalpractice2 {
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
        insertSort(array);
    }
    public static void insertSort(int[] arrayToSort) {

        int element;
        int indexToInsert;

        for (int index = 0; index < arrayToSort.length; index++) {
            element = arrayToSort[index];
            indexToInsert = index;

            while (indexToInsert > 0 && arrayToSort[indexToInsert - 1] > element) {
                arrayToSort[indexToInsert] = arrayToSort[indexToInsert - 1];
                indexToInsert--;
                arrayToSort[indexToInsert] = element;
            }
        }
        System.out.print("Сортировка вставкой: ");
        System.out.println(Arrays.toString(arrayToSort));
    }
}
