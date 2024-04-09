/**
 * @author TheB.AI
 * @brief 时间类
 * @date 2024.04.03
 */

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void showTime() {
        System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }

    public void addTime(int hours, int minutes, int seconds) {
        this.hours += hours;
        this.minutes += minutes;
        this.seconds += seconds;
        if (this.seconds >= 60) {
            this.seconds -= 60;
            this.minutes++;
        }
        if (this.minutes >= 60) {
            this.minutes -= 60;
            this.hours++;
        }
        if (this.hours >= 24) {
            this.hours %= 24;
        }
    }

    public static void main(String[] args) {
        Time myTime = new Time(0, 0, 0);

        // 获取显示系统当前时间
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println("当前时间：" + sdf.format(date));
        System.out.println();

        // 设置并显示新时间
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入新的时间（小时 分钟 秒）：");
        int newHours = scanner.nextInt();
        int newMinutes = scanner.nextInt();
        int newSeconds = scanner.nextInt();
        myTime.setTime(newHours, newMinutes, newSeconds);
        System.out.print("新设置的时间为：");
        myTime.showTime();
        System.out.println();

        // 添加时间后显示时间
        System.out.println("请输入要添加的时间（小时 分钟 秒）：");
        int addHours = scanner.nextInt();
        int addMinutes = scanner.nextInt();
        int addSeconds = scanner.nextInt();
        myTime.addTime(addHours, addMinutes, addSeconds);
        System.out.print("添加时间后的时间为：");
        myTime.showTime();

        scanner.close();
    }
}