package oop.ex;

public class Rectangle {
    int width;
    int height;

    int area(){
        return width * height;
    }

    int perimeter(){
        return (2*width) + (2*height);
    }
}
