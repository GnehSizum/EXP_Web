/**
 * @author TheB.AI
 * @brief 编程实现有n个元素的数组元素的升序排序
 * @date 2024.04.03
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("原始数组: ");
        printArray(array);

        bubbleSort(array);

        System.out.println("\n排序后的数组: ");
        printArray(array);
        System.out.println();
    }

    // 冒泡排序
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}