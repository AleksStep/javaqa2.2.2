// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double height = 1.90;
        double weight = 90;
        BMI bmi = new BMI();
        System.out.println(bmi.Calculate(weight, height));
    }
}