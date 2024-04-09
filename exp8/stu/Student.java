/**
 * @author TheB.AI
 * @brief 学生类
 * @date 2024.04.03
 */

package stu;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private String major;
    private int mathScore;
    private int englishScore;
    private int computerScore;

    public Student(String id, String name, String major, int mathScore, int englishScore, int computerScore) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
        this.computerScore = computerScore;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void displayBasicInfo() {
        System.out.println("\n+++++++++ 学生信息 +++++++++");
        System.out.println("+                          +");
        System.out.println("+     学号: " + id + "       +");
        System.out.println("+     姓名: " + name + "         +");
        System.out.println("+     专业: " + major + "       +");
        System.out.println("+                          +");
        System.out.println("++++++++++++++++++++++++++++");
    }

    public void displayAllScores() {
        System.out.println("\n+++++++++ 学生成绩 +++++++++");
        System.out.println("+                          +");
        System.out.println("+      高数成绩:   " + mathScore + "      +");
        System.out.println("+      英语成绩:   " + englishScore + "      +");
        System.out.println("+      计算机成绩: " + computerScore + "      +");
        System.out.println("+                          +");
        System.out.println("++++++++++++++++++++++++++++");
    }

    public void modifyInformation(Scanner scanner) {
        System.out.println("\n========= 修改信息 =========");
        System.out.println("+                          +");
        System.out.println("+     选择要修改的信息     +");
        System.out.println("+                          +");
        System.out.println("+      1. 学号             +");
        System.out.println("+      2. 姓名             +");
        System.out.println("+      3. 专业             +");
        System.out.println("+      4. 高数成绩         +");
        System.out.println("+      5. 英语成绩         +");
        System.out.println("+      6. 计算机成绩       +");
        System.out.println("+                          +");
        System.out.println("+    输入 back 返回上级    +");
        System.out.println("+                          +");
        System.out.println("============================");
        System.out.print("\n请选择操作: ");

        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
    
            switch (choice) {
                case 1:
                    System.out.print("新的学号: ");
                    setId(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("新的姓名: ");
                    setName(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("新的专业: ");
                    setMajor(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("新的高数成绩: ");
                    setMathScore(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.print("新的英语成绩: ");
                    setEnglishScore(scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("新的计算机成绩: ");
                    setComputerScore(scanner.nextInt());
                    scanner.nextLine();
                    break;
                default:
                    System.out.println("无效选择！");
            }
        }
        else {
            System.out.println("无效选择！");
            scanner.nextLine();
        }
    }
}