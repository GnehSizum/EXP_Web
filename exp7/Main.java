/**
 * @author ChatGPT 3.5
 * @brief 学生类、研究生类、类的继承
 * @date 2024.04.09
 */

// 学生类
class Student {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void displayInfo() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("成绩：" + score);
    }

    public void modifyScore(double newScore) {
        this.score = newScore;
    }

    public void setInfo(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}

// 研究生类
class Graduate extends Student {
    private String college;
    private String major;

    public Graduate(String name, int age, double score, String college, String major) {
        super(name, age, score);
        this.college = college;
        this.major = major;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("专业：" + major);
        System.out.println("学院：" + college);
    }

    public void setGraduateInfo(String name, int age, double score, String college, String major) {
        super.setInfo(name, age, score);
        this.major = major;
        this.college = college;
    }
}

public class Main {
    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student("张三", 20, 85.5);
        System.out.println("学生信息: ");
        student.displayInfo();
        System.out.println();

        // 创建研究生对象
        Graduate graduate = new Graduate("李四", 25, 92.5, "吉林大学", "信息工程");
        System.out.println("学生信息: ");
        graduate.displayInfo();
        System.out.println();
        
        // 修改学生和研究生信息并显示出来
        student.modifyScore(90.0);
        student.setInfo("王五", 22, 78.5);

        graduate.modifyScore(95.0);
        graduate.setGraduateInfo("赵六", 27, 89.0, "吉林大学", "通信工程");
        
        System.out.println("修改后的学生信息: ");
        student.displayInfo();
        System.out.println();
        
        System.out.println("修改后的研究生信息: ");
        graduate.displayInfo();
    }
}