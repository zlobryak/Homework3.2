public class Main {
    public static void main(String[] args) {
        int height = 183;
        int weight = 95;

        bmiService service = new bmiService();
        double bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}
