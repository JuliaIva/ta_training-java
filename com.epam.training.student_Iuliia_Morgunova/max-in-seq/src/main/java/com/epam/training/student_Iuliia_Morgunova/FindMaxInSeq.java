package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int max = Integer.MIN_VALUE;

        while (input != 0) {
            max = Math.max(max, input);
            input = scan.nextInt();
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
