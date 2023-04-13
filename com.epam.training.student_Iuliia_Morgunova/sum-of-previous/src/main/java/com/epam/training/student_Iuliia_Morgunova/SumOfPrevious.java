package com.epam.training.student_Iuliia_Morgunova;

import java.util.Arrays;

public class SumOfPrevious
{
    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        boolean[] result = new boolean[array.length];

        for (int i=2; i<array.length; i++) {
            result[i] = (array[i] == array[i-2] + array[i-1]) ? true : false;
        }

        return result;
    }
}
