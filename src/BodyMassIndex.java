import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double height, weight, bmi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight(in kilograms): ");
        weight = scanner.nextDouble();
        System.out.println("Enter your height(in meters: ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18) {
            System.out.print("bmi is underweight");
        } else if (bmi < 25) {
            System.out.print("bmi is normal");
        } else if (bmi < 30) {
            System.out.print("bmi is overweight");
        } else {
            System.out.print("bmi is obese");
        }
    }
}
