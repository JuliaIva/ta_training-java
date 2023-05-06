package com.epam.training.student_Iuliia_Morgunova;

public class DecrementingCarousel {
    static int[] carousel;
    int current;                     // current element for filling the array
    boolean isRun;                   // has the method run() been started

    public DecrementingCarousel(int capacity){

        this.carousel = new int[capacity];
    }

    public boolean addElement(int element){
        if (isRun == false) {
            if (element > 0) {
                if (current < carousel.length) {
                    carousel[current] = element;
                    current++;
                    return true;
                } else return false;
            } else return false;
        } else return false;
    }

    public CarouselRun run(){
        if (isRun == false) {
            isRun = true;
            return new CarouselRun();
        } else return null;
    }
}
