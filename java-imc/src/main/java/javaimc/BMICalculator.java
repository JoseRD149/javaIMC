package javaimc;

public class BMICalculator {
    public double calculateBMI(double weight, double height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than zero");
        }
        return weight / Math.pow(height, 2);
    }

    public String classifyBMI(double bmi) {
        if (bmi < 16) {
            return "Delgadez severa";
        } else if (bmi >= 16 && bmi < 17) {
            return "Delgadez moderada";
        } else if (bmi >= 17 && bmi < 18.5) {
            return "Delgadez leve";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Peso normal";
        } else if (bmi >= 25 && bmi < 30) {
            return "Sobrepeso";
        } else if (bmi >= 30 && bmi < 35) {
            return "Obesidad leve";
        } else if (bmi >= 35 && bmi < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}

