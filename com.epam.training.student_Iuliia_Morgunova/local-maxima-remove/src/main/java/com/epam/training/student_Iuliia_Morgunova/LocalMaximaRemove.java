package com.epam.training.student_Iuliia_Morgunova;

import java.util.Arrays;

public class LocalMaximaRemove
{
    public static void main(String[] args) {
        int[] array = new int[]{-3, 2, 4, 3, 5, 12, 8};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        int[] tmp = new int[array.length];
        int counter = 0;

        for (int i=0; i<array.length; i++) {
            if (i == 0) {
                if (array[i] <= array[i + 1]) {
                    tmp[counter] = array[i];
                    counter++;
                }
            } else if (i == array.length - 1) {
                if (array[i] <= array[i - 1]) {
                    tmp[counter] = array[i];
                    counter++;
                }
            } else {
                if (array[i] <= array[i - 1] || array[i] <= array[i + 1]) {
                    tmp[counter] = array[i];
                    counter++;
                }
            }
        }

        int[] result = Arrays.copyOf(tmp, counter);
        return result;
    }
}
