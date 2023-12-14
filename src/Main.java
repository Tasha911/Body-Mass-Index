public class Main {
    public static void main(String[] args) {
        BMI servise = new BMI();
        int weight = 95;
        double height = 1.86;
        int bmi = servise.bmi(weight, height);
        System.out.println("Индекс массы тела " + bmi);
    }
}
