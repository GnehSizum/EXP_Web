/**
 * @author TheB.AI
 * @brief 用嵌套的循环结构完成n行的右上左下直角三角形及2n-1行的菱形图形的输出
 * @date 2024.04.03
 */

import java.util.Scanner;

public class GeometricDraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("请输入一个整数 n, 表示菱形的行数(2n-1): ");
        int n = scanner.nextInt();
        
        // 输出右上为直角的三角形
        System.out.println("\n右上直角三角形: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 输出左下为直角的三角形
        System.out.println("\n左下直角三角形: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // 输出菱形
        System.out.println("\n菱形: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}