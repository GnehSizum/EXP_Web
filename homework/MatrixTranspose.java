/**
 * @author TheB.AI 
 * @brief 4x4矩阵行列互换
 * @date 2024.03.31
 */

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        System.out.println("请输入一个4x4矩阵: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[][] transposedMatrix = transposeMatrix(matrix);

        System.out.println("行列互换后的矩阵: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}