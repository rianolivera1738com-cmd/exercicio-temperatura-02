import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.printf("Celsius: %.2f%n", celsius);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();
    }
}