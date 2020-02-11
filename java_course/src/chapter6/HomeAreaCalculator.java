package chapter6;

/*
 * Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String args[]) {

        // Rectangle 1

        Rectangle room1 = new Rectangle();
        room1.setWidth(40);
        room1.setLength(20);
        double areaOfRoom1 = room1.calculateArea();

        // Rectangle 2
        Rectangle room2 = new Rectangle(30, 35);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The area of both rooms is " + totalArea + " square ft.");
    }
}
