import java.util.Scanner;

public class ex001{
    public static void main(String[] args) {

    //1. Crie um programa que leia dois números inteiros e exiba a soma deles.
    Scanner scan = new Scanner(System.in);
	System.out.print("Informe o primero numero: ");
	float numeros = scan.nextFloat();
	System.out.print("Informe o segundo numero: ");
	numeros += (scan.nextFloat());
	System.out.println("A soma dos dois numeros é: "+numeros);



    }
}
