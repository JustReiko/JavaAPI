package Seminar_1;
import java.util.Scanner;
public class task001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cubs = new int[1000];
        for (int i = 0; i < 1000; i++) {
            cubs[i] = (i + 1) * (i + 1) * (i + 1);
        }
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        int cub1 = cubs[num1 - 1];
        int cub2 = cubs[num2 - 1];
        System.out.println("Куб первого числа: " + cub1);
        System.out.println("Куб второго числа: " + cub2);
        sc.close();
    }

    public char[] shuffle(String s, int[] index) {
        return null;
    }
}
