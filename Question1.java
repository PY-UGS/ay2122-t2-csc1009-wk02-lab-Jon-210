import java.util.Scanner;

public class Question1 {
    static final double PI = 3.14159;

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
