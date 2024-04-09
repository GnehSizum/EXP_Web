/**
 * @author TheB.AI 
 * @brief 8.哥德巴赫猜想
 * 
 * 哥德巴赫猜想：任何一个大于2的偶数都是两个素数之和。
 * 键盘输入一个大于2的偶数，找出这个偶数是哪两个素数之和并输出。
 * 
 * @date 2024.03.31
 */

import java.util.Scanner;

public class GoldbachConjecture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenNum;
        do {
            System.out.print("请输入一个大于2的偶数: ");
            evenNum = input.nextInt();
        } while (evenNum <= 2 || evenNum % 2 != 0);

        findPrimePair(evenNum);

        input.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void findPrimePair(int evenNum) {
        boolean found = false;
        for (int i = 2; i <= evenNum / 2; i++) {
            if (isPrime(i) && isPrime(evenNum - i)) {
                System.out.println(evenNum + " = " + i + " + " + (evenNum - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("未找到两个素数之和等于" + evenNum + "的情况。");
        }
    }
}