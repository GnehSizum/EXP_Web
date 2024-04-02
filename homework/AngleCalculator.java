/**
 * @author TheB.AI
 * @brief 计算角度的正弦值与余弦值
 * 
 * 键盘输入一个角度值，分别计算并输出这个角度的正弦值和余弦值。
 * 
 * @date 2024.03.29
 */

import java.util.Scanner;

public class AngleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个角度值: ");
        double angle = scanner.nextDouble();

        double sineValue = Math.sin(Math.toRadians(angle));
        double cosineValue = Math.cos(Math.toRadians(angle));

        sineValue = adjustValue(sineValue);
        cosineValue = adjustValue(cosineValue);

        System.out.println("正弦值为: " + sineValue);
        System.out.println("余弦值为: " + cosineValue);

        scanner.close();
    }

    // 由于计算某些为0的正/余弦值输出为极小的数值而不是0，所以添加这段代码以使输出更直观更符合预期
    private static double adjustValue(double value) {
        if (Math.abs(value) < 1.0E-10) {
            return 0.0;
        } else {
            return value;
        }
    }
}