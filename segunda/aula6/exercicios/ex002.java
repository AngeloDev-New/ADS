import java.util.Scanner;
public class ex002 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:");
        double num2 = scan.nextDouble();
        if (num1 > num2) {
            System.out.println("O menor numero é: " + num2);
        } else {
            System.out.println("O menor numero é: " + num1);
        }
	}
}
