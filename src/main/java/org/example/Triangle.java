package org.example;

public class Triangle {


    public int findPerimeter(int firstSide, int secondSide, int thirdSide){
        int perimeter = firstSide + secondSide + thirdSide;
        return perimeter;
    }

    public int findArea(int firstSide, int secondSide){
        int area = (firstSide * secondSide) / 2;
        return area;
    }
}
