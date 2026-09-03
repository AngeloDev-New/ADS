import java.util.Scanner;

public class ex005{
    public static void main(String[] args) {

    //Crie um programa que leia três números inteiros e calcule a expressão:
    //(a + b) * c, exibindo o resultado.
    Scanner scan = new Scanner(System.in);
	System.out.print("a: ");
	int a = scan.nextInt();
	System.out.print("b: ");
	int b = scan.nextInt();
	System.out.print("c: ");
	int c = scan.nextInt();
	System.out.println("(a + b) * c = "+((a+b)*c));
    }
}
