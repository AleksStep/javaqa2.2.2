// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double height = 1.5;
        double weight = 50;
        BmiService bmiService = new BmiService();
        System.out.println(bmiService.calculate(weight, height));

    }
}