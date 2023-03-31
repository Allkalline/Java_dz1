//Реализовать простой калькулятор

import java.util.Scanner;
public class zad3 {
    public static int ScanNum() {
        Scanner str = new Scanner(System.in);
        int num = str.nextInt();
        return num;
    }
    public static String ScanOperation() {
        Scanner str = new Scanner(System.in);
        String operation = str.nextLine();
        return operation;
    }
    public static int Result(String opr, int a, int b) {
        int res = 0;
            switch (opr) {
                case  "+":
                    res = a+b;
                    break;
                case  "-":
                    res = a-b;
                    break;
                case  "*":
                    res = a*b;
                    break;
                case  "/":
                    res = a/b;
                    break;
            }
        return res;
    }
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int a = ScanNum();
        System.out.print("Введите '+', '-', '*' или '/': ");
        String operation = ScanOperation();
        System.out.print("Введите второе число: ");
        int b = ScanNum();
        System.out.println(a + operation + b + " = " + Result(operation, a, b));
    }
}