package com.epam.training.student_Iuliia_Morgunova;

public class GraduallyDecreasingCarousel extends DecrementingCarousel{
    public GraduallyDecreasingCarousel(final int capacity) {
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
