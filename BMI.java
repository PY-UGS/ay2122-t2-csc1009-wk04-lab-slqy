public class BMI {

    private double weight;
    private double height;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        // return the weight
        return weight;
    }

    public double getHeight(){
        // return the height
        return height;
    }

    public void setWeight(double weight){
        // set a new weight
        this.weight = weight;
    }

    public void setHeight(double height){
        // set a new height
        this.height = height;
    }

    public double BMICalulator(){
        // convert weight from pounds to kilograms
        double userWeight = this.weight * 0.45359237;
        // convert height from inches to meters
        double userHeight = this.height * 0.0254;
        // calculate BMI
        double userBMI = userWeight / Math.pow(userHeight, 2);
        // return the BMI
        return userBMI;
    }

    public String BMIInterpretation(){
        // retrieve the BMI
        double BMI = this.BMICalulator();
        // create an empty string for interpretation
        String interpretation = "";

        if (BMI < 18.5){
            interpretation = "Underweight";
        }
        else if (BMI >= 18.5 && BMI < 25.0){
            interpretation = "Normal";
        }
        else if (BMI >= 25.0 && BMI < 30.0){
            interpretation = "Overweight";
        }
        else {
            interpretation = "Obese";
        }

        // return the BMI interpretation
        return interpretation;
    }
}
