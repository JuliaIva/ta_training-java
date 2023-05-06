package com.epam.training.student_Iuliia_Morgunova;

public class CarouselRun
{
    private int index = 0;          // index of a current element
    private boolean isHalving = false;     // is a carousel halving?

    public CarouselRun(){}

    public CarouselRun(boolean isHalving){
        this.isHalving = isHalving;
    }

    public int next() {
        if (this.isFinished()) return -1;

        while (DecrementingCarousel.carousel[index] == 0){                    // while current value == 0
            if (index < DecrementingCarousel.carousel.length-1){
                index++;                                                      // go to the next value
            } else if (index == DecrementingCarousel.carousel.length-1) {
                index = 0;
            }
        }

        int value = DecrementingCarousel.carousel[index];         // saving a value of a current element
        if(this.isHalving == true){                               // if it's a halving carousel
            DecrementingCarousel.carousel[index] /= 2;
        } else{                                                   // if it's a decrementing carousel
            DecrementingCarousel.carousel[index]--;
        }

        if (index < DecrementingCarousel.carousel.length-1){
            index++;
        } else if (index == DecrementingCarousel.carousel.length-1) {
            index = 0;
        }

        return value;
    }

    public boolean isFinished() {
        int positiveElements = 0;                       // number of positive elements in the array (value > 0)
        for (int el: DecrementingCarousel.carousel) {
            if (el > 0) positiveElements++;
        }
        return positiveElements == 0;
    }
}
