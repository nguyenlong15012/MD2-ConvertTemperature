import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu. ");
            System.out.println("1. Fahrenheit convert to Celsius");
            System.out.println("2. Celsius convert to Fahrenheit.");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.printf("Enter a Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.printf("Enter a Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = 32 + celsius*9/5.0;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit-32)*(5.0/9);
        return celsius;
    }
}
