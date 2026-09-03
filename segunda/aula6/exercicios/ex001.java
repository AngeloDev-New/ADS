import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno:");
        String nome = scan.nextLine();
        System.out.println("Digite a primeira nota:(1/3)");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a segunda nota:(2/3)");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a terceira nota:(3/3)");
        double nota3 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas é: " + media);   
        if (media >= 7) {
            System.out.println("O aluno " + nome + " foi aprovado!");
        } else {
            System.out.println("O aluno " + nome + " foi reprovado!");
        }
	}
}
