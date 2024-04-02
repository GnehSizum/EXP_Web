/**
 * @author TheB.AI
 * @brief 在文本中查找并替换单词
 * @date 2024.04.02
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordReplace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要查找并替换的单词：");
        String word1 = scanner.nextLine();

        System.out.println("请输入用于替换的单词：");
        String word2 = scanner.nextLine();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            StringBuilder text = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                text.append(line).append("\n");
            }

            reader.close();
            scanner.close();

            String newText = text.toString().replaceAll(word1, word2);
            
            if (newText.equals(text.toString())) {
                System.out.println("文本中不存在单词 " + word1);
            } else {
                BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));
                writer.write(newText);
                writer.close();
                System.out.println("单词 " + word1 + " 已替换为 " + word2 + " 并保存至 result.txt");
            }

        } catch (IOException e) {
            System.err.println("发生IO异常: " + e.getMessage());
        }
    }
}