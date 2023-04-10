package com.epam.training.student_Iuliia_Morgunova;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = Math.pow(b,2) - 4*a*c;

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d))/(2*a);
            double x2 = (-b - Math.sqrt(d))/(2*a);

            if (x1 == (int) x1 && x2 == (int) x2) {
                System.out.println((int) x1 + " " + (int) x2);
            } else if (x1 == (int) x1 && x2 != (int) x2) {
                System.out.println((int) x1 + " " + x2);
            } else if (x1 != (int) x1 && x2 == (int) x2) {
                System.out.println(x1 + " " + (int) x2);
            } else {
                System.out.println(x1 + " " + x2);
            }
        } else if (d == 0) {
            double x = (-b)/(2*a);
            if (x == (int) x) {
                System.out.println((int) x);
            } else System.out.println(x);
        } else {
            System.out.println("no roots");
        }
    }
}
