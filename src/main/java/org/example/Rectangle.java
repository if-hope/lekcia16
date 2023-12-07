package org.example;

public class Rectangle {


    public int findPerimeter(int firstSide, int secondSide){
    int perimeter = (firstSide + secondSide) * 2;
    return perimeter;
    }

    public int findArea(int firstSide, int secondSide){
        int area = firstSide * secondSide;
        return area;
    }
}
