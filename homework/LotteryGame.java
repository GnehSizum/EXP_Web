/**
 * @author TheB.AI 
 * @brief 3.彩票抽奖游戏
 * 
 * 用户键盘输入一个1～20的数字，然后程序随机产生3个不同的1～20的数字分别
 * 代表一等奖、二等奖、三等奖的中奖数字，然后进行比较并输出用户是否中奖。
 * 
 * @date 2024.03.29
 */

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;

public class LotteryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("欢迎参加彩票抽奖游戏! 请输入一个1~20的数字: ");
        int userNumber = scanner.nextInt();
        while (userNumber < 1 || userNumber > 20) {
            System.out.println("输入错误! 请输入一个1~20的数字: ");
            userNumber = scanner.nextInt();
        }

        // 生成3个不同的1～20的中奖数字
        HashSet<Integer> winningNumbers = new HashSet<>();
        while (winningNumbers.size() < 3) {
            int randomNumber = random.nextInt(20) + 1;
            winningNumbers.add(randomNumber);
        }

        System.out.println("下面公布中奖号码!");
        System.out.println("一等奖号码: " + winningNumbers.toArray()[0]);
        System.out.println("二等奖号码: " + winningNumbers.toArray()[1]);
        System.out.println("三等奖号码: " + winningNumbers.toArray()[2]);

        if (winningNumbers.contains(userNumber)) {
            System.out.println("恭喜您中奖啦！🎉");
        } else {
            System.out.println("很遗憾，您没有中奖，再接再厉！💪");
        }

        scanner.close();
    }
}