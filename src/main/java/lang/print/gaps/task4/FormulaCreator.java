package lang.print.gaps.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        long result = (9 * a * a - 5 * b + a - 5) * (a + b - 4 * a * b) / 2;

        System.out.println(result);
    }
}
