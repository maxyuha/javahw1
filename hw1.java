//Реализовать функцию возведения числа а в степень b. a, b – целые числа.
//
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
import java.util.Scanner;

public class hw1 {
    public static void main (String[] args){
        hw1 Hw1 = new hw1();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число a: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.printf("введите число b: ");
        int b = Integer.parseInt(iScanner.nextLine());
        System.out.printf("a^b = %.2f", Hw1.exponential(a,b));
        iScanner.close();
    }

    public double exponential(int a, int b){
        double result = Math.pow(a,b);
        return (result);
    }
}