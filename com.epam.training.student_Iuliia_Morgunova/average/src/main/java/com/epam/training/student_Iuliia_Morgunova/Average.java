package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class Average
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;
        int numbers = 0;

        while (input != 0) {
            sum += input;
            numbers++;
            input = scanner.nextInt();
        }

        System.out.println(sum/numbers);
    }
}
