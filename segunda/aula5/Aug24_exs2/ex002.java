import java.util.Scanner;

public class ex002{
    public static void main(String[] args) {

    //Crie um programa que leia três números inteiros e exiba o produto deles.

    Scanner scan = new Scanner(System.in);
    float produto = 1;
    for(int i=0;i<3;i++){
        System.out.print("Digite um numero ("+(i+1)+"/3:) ");
	produto *= scan.nextFloat();
    }
    System.out.println();
    System.out.println("O produto numerico dos 3 numeros é: "+produto);
    }
}
