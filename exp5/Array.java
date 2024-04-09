/**
 * @author TheB.AI
 * @brief 声明各种类型的数组并对其进行构造及初始化
 * @date 2024.04.03
 */

public class Array {
    public static void main(String[] args) {
        // 声明并初始化整型数组
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i * 10;
        }
        // 输出整型数组内容
        System.out.println("整型数组内容: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 声明并初始化字符串数组
        String[] stringArray = {"apple", "banana", "orange"};
        // 输出字符串数组内容
        System.out.println("\n字符串数组内容: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        // 声明并初始化二维数组
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }
        // 输出二维数组内容
        System.out.println("\n二维数组内容: ");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 声明并初始化对象数组
        MyClass[] objectArray = new MyClass[2];
        objectArray[0] = new MyClass("Object 1");
        objectArray[1] = new MyClass("Object 2");
        // 输出对象数组内容
        System.out.println("\n对象数组内容: ");
        for (MyClass obj : objectArray) {
            System.out.println(obj.getName());
        }

    }
}

class MyClass {
    String name;

    public MyClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}