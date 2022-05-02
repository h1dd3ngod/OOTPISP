package com.company.figures;

import com.company.painting.LinePainter;

public class Line extends Figure{
    public Point point1;
    public Point point2;


    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
}
