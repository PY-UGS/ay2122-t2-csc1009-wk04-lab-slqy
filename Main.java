import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // read the input for weight
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        // read the input for height
        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        // calculate BMI by calling the BMI class
        BMI bmiObj = new BMI(weight, height);

        // print the output for BMI
        System.out.println("BMI is " + bmiObj.BMICalulator());

        // print the output for BMI interpretation
        System.out.println(bmiObj.BMIInterpretation());
    }
}
