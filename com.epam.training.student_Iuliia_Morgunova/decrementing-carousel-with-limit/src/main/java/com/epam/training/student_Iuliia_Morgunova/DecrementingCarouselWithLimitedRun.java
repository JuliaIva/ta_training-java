package com.epam.training.student_Iuliia_Morgunova;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    public static int limit;

    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        limit = actionLimit;
    }

    @Override
    public CarouselRun run(){
        if (isRun == false) {
            isRun = true;
            return new CarouselRun(true);
        } else return null;
    }
}
