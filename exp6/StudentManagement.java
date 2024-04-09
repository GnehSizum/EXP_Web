/**
 * @author TheB.AI
 * @brief 学生信息管理
 * @date 2024.04.03
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private static final String FILE_NAME = "students.txt";

    public static void main(String[] args) {
        List<Student> students = loadStudentData(FILE_NAME);
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        String query = "exit";
        while (!exit) {
            System.out.println("\n========= 欢迎使用 =========");
            System.out.println("+                          +");
            System.out.println("+       1. 成绩录入        +");
            System.out.println("+       2. 信息管理        +");
            System.out.println("+                          +");
            System.out.println("+      输入 exit 退出      +");
            System.out.println("+                          +");
            System.out.println("============================");
            System.out.print("\n请选择操作: ");
            String choice_ = scanner.nextLine();
            switch (choice_) {
                case "1":
                    clearScreen();
                    System.out.println("\n请输入学生信息以录入成绩:");
                    System.out.print("学号: ");
                    String id = scanner.nextLine();
                    System.out.print("姓名: ");
                    String name = scanner.nextLine();
                    System.out.print("专业: ");
                    String major = scanner.nextLine();
                    System.out.print("高数成绩: ");
                    int mathScore = scanner.nextInt();
                    System.out.print("英语成绩: ");
                    int englishScore = scanner.nextInt();
                    System.out.print("计算机成绩: ");
                    int computerScore = scanner.nextInt();
                    scanner.nextLine();
        
                    Student newStudent = new Student(id, name, major, mathScore, englishScore, computerScore);
                    students.add(newStudent);
                    saveStudentData(students, FILE_NAME);
                    System.out.println("成绩录入完成！");
                    break;
                case "2":
                    System.out.print("\n请输入学号或姓名以查询学生信息: \n");
                    query = scanner.nextLine();
                    break;
                case "exit":
                    exit = true;
                default:
                    clearScreen();
                    System.out.println("无效选择！");
            }

            if (query.equalsIgnoreCase("exit")) {
                exit = true;
                continue;
            }

            Student selectedStudent = null;
            for (Student student : students) {
                if (student.getId().equals(query) || student.getName().equals(query)) {
                    selectedStudent = student;
                    break;
                }
            }

            if (selectedStudent != null) {
                clearScreen();
                selectedStudent.displayBasicInfo();

                boolean backToMainMenu = false;
                while (!backToMainMenu) {
                    System.out.println("\n========= 功能菜单 =========");
                    System.out.println("+                          +");
                    System.out.println("+       1. 查询成绩        +");
                    System.out.println("+       2. 修改信息        +");
                    System.out.println("+       3. 返回上级        +");
                    System.out.println("+                          +");
                    System.out.println("+      输入 exit 退出      +");
                    System.out.println("+                          +");
                    System.out.println("============================");
                    System.out.print("\n请选择操作: ");
                    String choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            clearScreen();
                            selectedStudent.displayAllScores();
                            break;
                        case "2":
                            clearScreen();
                            selectedStudent.modifyInformation(scanner);
                            saveStudentData(students, FILE_NAME);
                            clearScreen();
                            System.out.println("信息修改完成！");
                            break;
                        case "3":
                        case "back":
                            backToMainMenu = true;
                            break;
                        case "exit":
                            exit = true;
                            backToMainMenu = true;
                            break;
                        default:
                            clearScreen();
                            System.out.println("无效选择！");
                    }
                }
            } else if (query.equalsIgnoreCase("exit")) {
                exit = true;
            } else {
                System.out.println("未找到匹配的学生信息");
            }
        }

        System.out.println("\n感谢使用, 再见!");
        scanner.close();
    }

    public static List<Student> loadStudentData(String fileName) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                String major = parts[2];
                int mathScore = Integer.parseInt(parts[3]);
                int englishScore = Integer.parseInt(parts[4]);
                int computerScore = Integer.parseInt(parts[5]);
                students.add(new Student(id, name, major, mathScore, englishScore, computerScore));
            }
        } catch (IOException e) {
            System.out.println("无法读取文件: " + e.getMessage());
        }

        return students;
    }

    public static void saveStudentData(List<Student> students, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getMajor() + ","
                        + student.getMathScore() + "," + student.getEnglishScore() + "," + student.getComputerScore() + "\n");
            }
        } catch (IOException e) {
            System.out.println("无法写入文件: " + e.getMessage());
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Student {
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