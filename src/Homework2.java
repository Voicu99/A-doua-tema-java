import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        // Step 1: Declare and initialize variables of different data types
        int age = 25;
        double height = 1.70;
        char firstLetter = 'L';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("First letter of your name: " + firstLetter);
        System.out.println("Is student: " + isStudent);

        // Step 2: Perform simple arithmetic operations
        int num1 = 25;
        int num2 = 20;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        double division = (double) num1 / num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        // Step 3: Concatenate strings
        String firstName = "Librimir";
        String lastName = "Voicu";
        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        // Step 4: Convert between different numeric data types
        double ageDouble = (double) age;
        int heightInt = (int) height;

        System.out.println("Age as double: " + ageDouble);
        System.out.println("Height as int: " + heightInt);

        // Step 5: Calculate the area of a rectangle
        double length = 14.0;
        double width = 7.0;
        double areaRectangle = length * width;

        System.out.println("Area of the rectangle: " + areaRectangle);

        // Step 6: Calculate the average of three numbers
        double numA = 25.0;
        double numB = 20.0;
        double numC = 45.0;
        double average = (numA + numB + numC) / 3;

        System.out.println("Average of three numbers: " + average);

        // Step 7: Calculate the body mass index (BMI)
        double weight = 82.5; // in kg
        double heightMeters = 1.70; // in meters
        double bmi = weight / (heightMeters * heightMeters);

        System.out.println("BMI: " + bmi);

        // Step 8: Calculate the circumference and area of a circle
        double radius = 14.0;
        double circumference = 2 * Math.PI * radius;
        double areaCircle = Math.PI * radius * radius;

        System.out.println("Circumference of the circle: " + circumference);
        System.out.println("Area of the circle: " + areaCircle);

        // Step 9: Convert temperature from Celsius to Fahrenheit
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}
