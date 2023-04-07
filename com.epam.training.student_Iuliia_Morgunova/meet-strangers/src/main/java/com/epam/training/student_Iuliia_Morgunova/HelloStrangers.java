package com.epam.training.student_Iuliia_Morgunova;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers
{
    public static void main(String[] args) throws IOException {
        Scanner scanNumber = new Scanner(System.in);
        int inputNumber = scanNumber.nextInt();

        if (inputNumber > 0) {
            String[] names = new String[inputNumber];

            for (int i=0; i<names.length; i++) {
                Scanner scanName = new Scanner(System.in);
                names[i] = scanName.nextLine();
            }

            for (int i=0; i<names.length; i++) {
                System.out.println("Hello, " + names[i]);
            }
        } else if (inputNumber == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }
    }
}
