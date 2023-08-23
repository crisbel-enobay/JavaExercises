package SelfTraining;

import java.util.Scanner;

public class AreaOfPolygon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of sides: ");
        int sides = scan.nextInt();
        System.out.print("Enter the sides of the regular polygon: ");
        double sidesPolygon = scan.nextInt();

        double totalArea = area(sides, sidesPolygon);
        System.out.println("The area of the regular polygon is: " + totalArea);
    }

    public static double area(int n, double side) {
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / n);
        return numerator / denominator;
    }
}
