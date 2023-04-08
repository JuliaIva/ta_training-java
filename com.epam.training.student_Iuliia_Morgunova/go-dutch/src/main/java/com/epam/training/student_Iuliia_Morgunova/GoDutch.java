package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class GoDutch
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        if (bill >= 0) {
            int friends = scan.nextInt();
            if (friends > 0) {
                int pay = (bill + bill/10)/friends;
                System.out.println(pay);
            } else {
                System.out.println("Number of friends cannot be negative or zero");
            }
        } else {
            System.out.println("Bill total amount cannot be negative");
        }
    }
}
