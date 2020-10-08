import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int size1 = input.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int size2 = input.nextInt();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Введите элемент матрицы [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }
        input.close();

        for (int j = 0; j < size2; j++) {
                System.out.print(array[0][j] * 2 + "\t");


            }
            System.out.println();
        }
    }
