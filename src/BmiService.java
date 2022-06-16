public class BmiService {
    public double calculate(double weight, double growth) {

        return weight / Math.pow(growth,2);
    }
}
