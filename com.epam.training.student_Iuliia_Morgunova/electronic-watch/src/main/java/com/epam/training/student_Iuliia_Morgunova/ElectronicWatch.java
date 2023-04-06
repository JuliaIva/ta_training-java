package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class ElectronicWatch
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int hour = seconds / 3600;
        hour = hour >= 24 ? hour % 24 : hour;

        int minute = seconds % 3600 / 60;
        String minuteStr = minute < 10 ? "0" + minute : "" + minute;

        int second = seconds % 3600 % 60;
        String secondStr = second < 10 ? "0" + second : "" + second;

        System.out.println(hour + ":" + minuteStr + ":" + secondStr);
    }
}
