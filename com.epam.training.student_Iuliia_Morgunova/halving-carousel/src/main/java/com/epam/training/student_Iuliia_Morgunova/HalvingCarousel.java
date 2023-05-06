package com.epam.training.student_Iuliia_Morgunova;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }

    @Override
    public CarouselRun run(){
        if (isRun == false) {
            isRun = true;
            return new CarouselRun(true);
        } else return null;
    }
}
