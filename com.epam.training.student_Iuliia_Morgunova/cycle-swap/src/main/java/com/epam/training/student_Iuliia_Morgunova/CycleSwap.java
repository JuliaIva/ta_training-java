package com.epam.training.student_Iuliia_Morgunova;

import java.util.Arrays;

public class CycleSwap
{
    static void cycleSwap(int[] array) {
        if (array.length == 0) {
            return;
        };

        int[] tmp = Arrays.copyOf(array, array.length);
        array[0] = tmp[tmp.length-1];
        for (int i=1; i < array.length; i++) {
            array[i] = tmp[i-1];
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length == 0 || shift == array.length) {
            return;
        };

        int[] tmp = Arrays.copyOf(array, array.length);
        int counter = 0;

        for (int i=shift; i < array.length; i++) {
            array[i] = tmp[counter];
            counter++;
        }

        counter = 0;
        for (int j=0; j < shift; j++) {
            array[j] = tmp[tmp.length - shift + counter];
            counter++;
        }
    }
}
