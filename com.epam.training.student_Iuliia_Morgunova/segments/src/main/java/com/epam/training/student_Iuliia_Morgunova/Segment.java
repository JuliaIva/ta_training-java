package com.epam.training.student_Iuliia_Morgunova;

import static java.lang.Math.sqrt;
import static java.lang.StrictMath.pow;

public class Segment {
    double x1, y1;                                 // coordinates of the starting point of the segment
    double x2, y2;                                 // coordinates of the ending point of the segment

    public Segment(Point start, Point end) {
        this.x1 = start.getX();
        this.y1 = start.getY();
        this.x2 = end.getX();
        this.y2 = end.getY();


        if (this.x1 == this.x2 && this.y1 == this.y2) {   // if the segment is degenerate
            throw new IllegalArgumentException();
        }
    }

    double length() {
        return sqrt(pow(this.x2 - this.x1, 2) + pow(this.y2 - this.y1, 2));
    }

    Point middle() {
        double x = (this.x1 + this.x2)/2;
        double y = (this.y1 + this.y2)/2;
        return new Point(x,y);
    }

    Point intersection(Segment another) {
        // https://en.wikipedia.org/wiki/Intersection_(geometry)#Two_line_segments

        double s = ((this.x1 - another.x1) * (another.y1 - another.y2)
                - (this.y1 - another.y1) * (another.x1 - another.x2))
                / (((this.x1 - this.x2) * (another.y1 - another.y2)
                - (this.y1 - this.y2) * (another.x1 - another.x2)));

        double t = ((this.x1 - another.x1) * (this.y1 - this.y2)
                - (this.y1 - another.y1) * (this.x1 - this.x2))
                / (((this.x1 - this.x2) * (another.y1 - another.y2)
                - (this.y1 - this.y2) * (another.x1 - another.x2)));

        if (0.0 <= s && t <= 1.0) {
            double x = this.x1 + s * (this.x2 - this.x1);
            double y = this.y1 + s * (this.y2 - this.y1);
            return new Point(x,y);
        } else {
            return null;
        }
    }
}
