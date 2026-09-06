import java.util.Scanner;

public class ex006{
public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("Digite a idade do aluno: ");
        int idade = scan.nextInt();
        scan.nextLine(); // Limpar o buffer
        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = scan.nextDouble();
        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = scan.nextDouble();
        System.out.print("Digite a nota do terceiro bimestre: ");
        double nota3 = scan.nextDouble();
        System.out.print("Digite a nota do quarto bimestre: ");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média do aluno " + nome + " que tem " + idade + " anos: " + media);

    }
}
