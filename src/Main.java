public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.85;
        double weight = 85.00;
        double bmi = service.calculate(weight, growth);
        System.out.println(bmi);
    }

}
