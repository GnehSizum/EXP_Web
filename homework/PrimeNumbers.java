/**
 * @author TheB.AI 
 * @brief 输出100以内的素数
 * @date 2024.03.31
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("100以内的素数有: ");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
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
}