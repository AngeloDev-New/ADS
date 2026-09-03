import java.util.Scanner;

public class ex003{
    public static void main(String[] args) {

    //Crie um programa que leia dois números inteiros e exiba o resultado da divisão do primeiro pelo segundo.
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um numero:  ");
    float numero = scan.nextFloat();
    System.out.print("Digite outro numero: ");
    numero /= scan.nextFloat();
    System.out.println("A divisao dos dois numeros corresponde a: "+numero);
    }
}
