import java.util.Scanner;

public class ex007{
    public static void main(String[] args) {

    //1. Crie um programa que leia dois números inteiros e exiba a soma deles.
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o ano de seu nascimento: ");
    int anoNascimento = scan.nextInt();
    final int ANOATUAL = 2026;
    int idade = ANOATUAL - anoNascimento;
    System.out.println("Sua idade é: " + idade);

    }
}
