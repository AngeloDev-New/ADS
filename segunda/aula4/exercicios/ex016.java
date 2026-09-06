import java.util.Scanner;

public class ex016{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o comprimento em metros: ");
    double metros = scan.nextDouble();
    double centimetros = metros * 100;
    double milimetros = centimetros * 100;
    System.out.printf("O comprimento em centímetros é: %.2f\n", centimetros);
    System.out.printf("O comprimento em milímetros é: %.2f\n", milimetros);
    }
}
