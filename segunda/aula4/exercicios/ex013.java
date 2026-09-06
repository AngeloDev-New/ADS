import java.util.Scanner;

public class ex013{
    public static void main(String[] args) {

   
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite a taxa de conversão do dólar: ");
    double taxa = scan.nextDouble();
    System.out.print("Digite o valor em reais: ");
    double reais = scan.nextDouble();
    double dolares = reais / taxa;
    System.out.printf("O valor em dólares é: %.2f\n", dolares);
    }
}
