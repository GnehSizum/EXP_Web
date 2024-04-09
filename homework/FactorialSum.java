/**
 * @author TheB.AI 
 * @brief 4. 1!+2!+3!+......+n!
 * 
 * 键盘输入正整数n，计算 1!+2!+3!+......+n! 的值并输出。
 * 
 * @date 2024.03.31
 */

import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个正整数 n: ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("输入错误! 请输入一个正整数: ");
            n = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int factorial = calculateFactorial(i);
            sum += factorial;
        }

        System.out.println("结果为：" + sum);

        scanner.close();
    }

    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}