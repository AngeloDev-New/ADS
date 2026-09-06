import java.util.Scanner;
public class ex006 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o salário do funcionário:");
        double salario = scan.nextDouble();

        if (salario < 5000) {
            double novoSalario = salario * 1.3;
            System.out.println("O novo salário é: R$ " + novoSalario);
        } else {
            System.out.println("O salário não é inferior a R$ 5.000,00.");
        }
	}
}
