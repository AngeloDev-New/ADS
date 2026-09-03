import java.util.Scanner;
public class ex004 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = scan.nextDouble();
        System.out.println("Digite o terceiro numero:");
        double num3 = scan.nextDouble();
        System.out.println("Digite o quarto numero:");
        double num4 = scan.nextDouble();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num3 && num2 > num4) {
            System.out.println("O maior numero é: " + num2);
        } else if (num3 > num4) {
            System.out.println("O maior numero é: " + num3);
        } else {
            System.out.println("O maior numero é: " + num4);
        }
	}
}
