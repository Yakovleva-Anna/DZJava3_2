public class BmiService {
    public int calculate(double weight, double height) {
        System.out.println("Введите вес в килограммах: " + weight + " (кг)");
        System.out.println("Введите рост в метрах: " + height + " (м)");
        double index = weight / (height * height);
        return (int) index;
    }
}
