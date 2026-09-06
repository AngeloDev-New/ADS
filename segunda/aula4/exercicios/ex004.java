import java.util.Scanner;

public class ex004{
    public static void main(String[] args) {

    //Crie um programa que leia dois números inteiros e exiba o resto da divisão do primeiro pelo segundo.
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o primeiro numero: ");
    float numero = scan.nextFloat();
    System.out.print("Digite o segundo numero: ");
    numero %= scan.nextFloat();
    System.out.println("O modulo entre os dois numeros é: "+numero);
    }
}
