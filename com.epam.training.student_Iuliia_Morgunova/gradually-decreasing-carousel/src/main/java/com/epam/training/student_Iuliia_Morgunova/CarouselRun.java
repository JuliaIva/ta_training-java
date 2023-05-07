package com.epam.training.student_Iuliia_Morgunova;

public class CarouselRun {

    private int index = 0;                             // index of a current element
    private boolean isGraduallyDecreasing = false;     // is a carousel gradually decreasing?
    private int step = 1;

    public CarouselRun(){}

    public CarouselRun(boolean isGraduallyDecreasing){
        this.isGraduallyDecreasing = isGraduallyDecreasing;
    }

    public int next() {
        if (this.isFinished()) return -1;

        while (DecrementingCarousel.carousel[index] <= 0){                    // while current value <= 0
            if (index < DecrementingCarousel.carousel.length-1){
                index++;                                                      // go to the next value
            } else if (index == DecrementingCarousel.carousel.length-1) {
                index = 0;
                step++;
            }
        }

        int value = DecrementingCarousel.carousel[index];         // saving a value of a current element
        if(this.isGraduallyDecreasing == true){                   // if it's a gradually decreasing carousel
            DecrementingCarousel.carousel[index] -= step;
        } else{                                                   // if it's a decrementing carousel
            DecrementingCarousel.carousel[index]--;
        }

        if (index < DecrementingCarousel.carousel.length-1){
            index++;
        } else if (index == DecrementingCarousel.carousel.length-1) {
            index = 0;
            step++;
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
