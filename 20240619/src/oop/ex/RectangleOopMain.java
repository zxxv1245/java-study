package oop.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.area();
        System.out.println("area = " + area);

        int perimeter = rectangle.perimeter();
        System.out.println("perimeter = " + perimeter);
    }
}
