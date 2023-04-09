package com.epam.training.student_Iuliia_Morgunova;

import java.util.Scanner;

public class PizzaSplit
{
    public static void main( String[] args )
    {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scan = new Scanner(System.in);
        int people = scan.nextInt();
        int pieces = scan.nextInt();
        int pizzas = 1;

        while ((pieces*pizzas)%people != 0) {
            pizzas++;
        }

        System.out.println(pizzas);
    }
}
