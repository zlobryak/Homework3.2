public class bmiService {
    public double calculate(int height, int weight) {
        return (weight / Math.pow(height * 0.01, 2));
    }
}
