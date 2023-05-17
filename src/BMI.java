public class BMI {

    public int Calculate(double height, double weight) {
        double index = height / weight;
        return (int) index;
    }

}
