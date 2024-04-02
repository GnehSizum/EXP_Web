/**
 * @author TheB.AI 
 * @brief 1!+(1!+2!)+......+(1!+2!+......+n!)
 * 
 * 键盘输入正整数n，计算 1!+(1!+2!)+......+(1!+2!+......+n!) 的值并输出。
 * 
 * @date 2024.03.31
 */

import java.util.Scanner;

public class FactorialSumPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数 n: ");
        int n = input.nextInt();
        while (n < 1) {
            System.out.println("输入错误! 请输入一个正整数: ");
            n = input.nextInt();
        }
        input.close();

        long sum = 0;
        long factorialSum = 0;

        for (int i = 1; i <= n; i++) {
            long factorial = factorial(i);
            factorialSum += factorial;
            sum += factorialSum;
        }

        System.out.println("结果是：" + sum);
    }

    public static long factorial(int num) {
        if (num <= 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}