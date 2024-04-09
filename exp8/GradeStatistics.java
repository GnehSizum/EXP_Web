/**
 * @author ChatGPT 3.5
 * @brief 实现10个学生的成绩统计，统计每科的最高分和最低分
 * @date 2024.04.09
 */

import stu.Student;

public class GradeStatistics {

    public static void main(String[] args) {
        
        Student[] students = new Student[10];

        students[0] = new Student("001", "Alice", "Computer Science", 80, 90, 85);
        students[1] = new Student("002", "Bob", "Mathematics", 75, 85, 90);
        students[2] = new Student("003", "Charlie", "Physics", 88, 92, 78);
        students[3] = new Student("004", "David", "Biology", 82, 79, 85);
        students[4] = new Student("005", "Eve", "Psychology", 85, 87, 89);
        students[5] = new Student("006", "Frank", "Chemistry", 90, 68, 82);
        students[6] = new Student("007", "Grace", "Sociology", 72, 84, 95);
        students[7] = new Student("008", "Henry", "History", 84, 88, 86);
        students[8] = new Student("009", "Ivy", "Economics", 91, 90, 85);
        students[9] = new Student("010", "Jack", "English Literature", 88, 85, 90);

        int maxMathScore = Integer.MIN_VALUE;
        int minMathScore = Integer.MAX_VALUE;

        int maxEnglishScore = Integer.MIN_VALUE;
        int minEnglishScore = Integer.MAX_VALUE;

        int maxComputerScore = Integer.MIN_VALUE;
        int minComputerScore = Integer.MAX_VALUE;

        for (Student student : students) {
            maxMathScore = Math.max(maxMathScore, student.getMathScore());
            minMathScore = Math.min(minMathScore, student.getMathScore());

            maxEnglishScore = Math.max(maxEnglishScore, student.getEnglishScore());
            minEnglishScore = Math.min(minEnglishScore, student.getEnglishScore());

            maxComputerScore = Math.max(maxComputerScore, student.getComputerScore());
            minComputerScore = Math.min(minComputerScore, student.getComputerScore());
        }

        System.out.println("数学科目的最高分 : " + maxMathScore);
        System.out.println("数学科目的最低分 : " + minMathScore);

        System.out.println("英语科目的最高分 : " + maxEnglishScore);
        System.out.println("英语科目的最低分 : " + minEnglishScore);

        System.out.println("计算机科目的最高分 : " + maxComputerScore);
        System.out.println("计算机科目的最低分 : " + minComputerScore);
    }
}
