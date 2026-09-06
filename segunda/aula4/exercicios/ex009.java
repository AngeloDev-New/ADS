import java.util.Scanner;

public class ex009{
    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = scan.nextDouble();
    double celsius = (fahrenheit - 32) / 1.8;
    System.out.println("A temperatura em Celsius é: " + celsius);

    }
}
