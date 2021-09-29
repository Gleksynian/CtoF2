package ctof2;

import java.util.Scanner;

public class CtoF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите кол-во градусов по Цельсию:");
        int TC = scanner.nextInt();
        System.out.println();
        int a = 32;
        double b = 1.8;
        double g = ((TC*b)+a);
        System.out.println(g);
    }
}