package com.epam.training.student_Iuliia_Morgunova;

public class CarouselRun {

    private int index = 0;                  // index of a current element
    private boolean isLimited = false;      // is a carousel limited?
    private int limitStep = 0;              // step number for limited carousel

    public CarouselRun(){}

    public CarouselRun(boolean isLimited){
        this.isLimited = isLimited;
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
        DecrementingCarousel.carousel[index]--;

        if (index < DecrementingCarousel.carousel.length-1){
            index++;
        } else if (index == DecrementingCarousel.carousel.length-1) {
            index = 0;
        }

        if(isLimited){
            this.limitStep++;
        }

        return value;
    }

    public boolean isFinished() {
        if (isLimited && this.isLimitReached()){
            return true;
        }

        int positiveElements = 0;                       // number of positive elements in the array (value > 0)
        for (int el: DecrementingCarousel.carousel) {
            if (el > 0) positiveElements++;
        }
        return positiveElements == 0;
    }

    private boolean isLimitReached(){
        return this.limitStep == DecrementingCarouselWithLimitedRun.limit;
    }
}
