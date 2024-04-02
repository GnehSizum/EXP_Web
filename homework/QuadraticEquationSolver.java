/**
 * @author TheB.AI 
 * @brief 解一元二次方程
 * 
 * 键盘输入一元二次方程的三个系数，然后运用Math类求平方根的方法和其他运算符计算出方程的两个根。
 * 
 * @date 2024.03.29
 */

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一元二次方程的三个系数 (a, b, c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("方程的两个实根分别为: " + root1 + " 和 " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("方程有一个实根: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("方程的两个虚根分别为: " + realPart + " + " + imaginaryPart + "i 和 " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}