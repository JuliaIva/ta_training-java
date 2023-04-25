package com.epam.training.student_Iuliia_Morgunova;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    Point a, b, c;                                  // triangle vertices
    double ab, bc, ca;                              // triangle edges

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        ab = sqrt(pow(b.getX() - a.getX(), 2) + pow(b.getY() - a.getY(), 2));
        bc = sqrt(pow(c.getX() - b.getX(), 2) + pow(c.getY() - b.getY(), 2));
        ca = sqrt(pow(a.getX() - c.getX(), 2) + pow(a.getY() - c.getY(), 2));

        // if one of the edges equals 0
        if (ab == 0 || bc == 0 || ca == 0) {
            throw new IllegalArgumentException();
        }

        // if two of edges are parallel
        if (slope(a,b) == slope(b,c) || slope(b,c) == slope(c,a) || slope(c,a) == slope(a,b)) {
            throw new IllegalArgumentException();
        }
    }

    public double slope(Point start, Point end){                    // finding slope of the edge
        return (start.getY() - end.getY()) / (start.getX() - end.getX());
    }

    public double area() {
        double r = sqrt(((-this.ab + this.bc + this.ca) * (this.ab - this.bc + this.ca) * (this.ab + this.bc - this.ca))
                / (4 * (this.ab + this.bc + this.ca)));           // inradius
        double p = (this.ab + this.bc + this.ca) / 2;               // semiperimeter
        return r * p;                                               // area
    }

    public Point centroid(){
        double x = (this.a.getX() + this.b.getX() + this.c.getX()) / 3;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()) / 3;
        return new Point(x,y);
    }
}
