/**
 * @author TheB.AI
 * @brief 实现高数成绩的统计，要求统计出各个分数段的人数
 * @date 2024.04.03
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ScoreStatistics {
    public static void main(String[] args) {
        String fileName = "scores.txt";

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int score = Integer.parseInt(parts[1]);
                students.add(new Student(name, score));
            }
        } catch (IOException e) {
            System.out.println("无法读取文件：" + e.getMessage());
        }

        int[] scoreCounts = new int[10]; // 分数段为0-10, 10-20, ..., 90-100 共11个分数段
        for (Student student : students) {
            int index = student.getScore() / 10;
            if (student.getScore() == 100) {
                scoreCounts[9]++;
            } else {
                scoreCounts[index]++;
            }
        }

        System.out.println("高数成绩分数段统计：");
        for (int i = 0; i < scoreCounts.length; i++) {
            if (i < 9) {
                System.out.printf("%d-%d 分： %d 人\n", i * 10, i * 10 + 9, scoreCounts[i]);
            } else {
                System.out.printf("%d-%d 分： %d 人\n", i * 10, 100, scoreCounts[i]);
            }
        }
        System.out.println();
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}