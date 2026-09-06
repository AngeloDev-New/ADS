import java.util.Scanner;
public class ex009 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o salário do funcionário: ");
        double salario = scan.nextDouble();
        System.out.print("Digite o número de dependentes: ");
        int dependentes = scan.nextInt();
        if (salario < 2000 && dependentes > 2) {
            double novoSalario = salario * 1.255;
            System.out.println("O novo salário é: R$ " + novoSalario);
        } else if (salario > 2000 && dependentes == 1) {
            double novoSalario = salario * 1.15;
            System.out.println("O novo salário é: R$ " + novoSalario);
        } else if (salario > 2000 && dependentes == 0) {
            double novoSalario = salario * 1.075;
            System.out.println("O novo salário é: R$ " + novoSalario);
        } else {
            System.out.println("O funcionário não se enquadra em nenhuma das condições para aumento.");
	}
    }
}
