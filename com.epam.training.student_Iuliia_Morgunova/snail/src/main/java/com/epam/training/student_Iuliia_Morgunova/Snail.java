package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int distance = 0;
        int days = 0;

        if (a <= b && h > a) {
            System.out.println("Impossible");
        } else {
            while (distance < h) {
                distance += a;
                days++;
                if (distance < h) {
                    distance -= b;
                }
            }
            System.out.println(days);
        }
    }
}
