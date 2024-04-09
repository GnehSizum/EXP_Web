/**
 * @author TheB.AI
 * @brief 用顺序机构及分支结构进行程序设计
 * @date 2024.04.03
 */

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我想好了一个1到100之间的数字, 猜猜是多少: ");

        int randomNumber = (int) (Math.random() * 100) + 1;

        int guess = scanner.nextInt();
        System.out.println("答案: " + randomNumber);
        if (guess == randomNumber) {
            System.out.println("恭喜你，猜对了！");
        } else if (guess < randomNumber) {
            System.out.println("猜的数字有点小，再试试吧！");
        } else {
            System.out.println("猜的数字有点大，再试试吧！");
        }

        scanner.close();
    }
}