//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = str.nextInt();
        int sum = 0;
        int mult = 1;
         for(int i = 1; i <= n; i++) {
             sum += i;
             mult = mult*i;
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
        System.out.println("Произведение чисел от 1 до " + n + " = " + mult);
        
    }
    
}