import java.util.Scanner;

public class ex015{
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o raio da esfera: ");
    double raio = scan.nextDouble();
    double volume = (4.0/3.0) * 3.14 * raio * raio * raio;
    System.out.printf("O volume da esfera é: %.2f\n", volume);
    }
}
