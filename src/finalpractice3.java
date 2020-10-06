import java.util.Scanner;

public class finalpractice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        double dollar = input.nextDouble();
        System.out.print("Введите количество рублей: ");
        double ruble = input.nextDouble();
        input.close();
        double convert = ruble / dollar;
        String result = String.format("%.2f" , convert);
        System.out.println("Итого: " + result + " долларов");
    }
}
