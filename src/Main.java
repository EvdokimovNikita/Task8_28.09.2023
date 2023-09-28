import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание : 8) Напечатать N первых простых чисел
        while (true) {
            System.out.print("Введите количество чисел: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            for (int i = 2; i <= number; i++) {
                int num = 0;
                int count = 0;
                for (int j = 2; j <= number; j++) {
                    if (i % j == 0) {
                        num = i;
                        count++;
                    }
                }
                if (count <= 1) {
                    System.out.print(num + ", ");
                }
            }
        }
    }
}