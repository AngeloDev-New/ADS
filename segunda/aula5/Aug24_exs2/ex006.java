import java.util.Scanner;

public class ex006{
public int input(Scanner scan,String text){
	System.out.print(text);
	return scan.nextInt();
}
public static void main(String[] args) {

    //Crie um programa que leia três números inteiros e calcule a expressão:
    //(a + b) * c, exibindo o resultado.
    Scanner scan = new Scanner(System.in);
    int result = this.input(scan,"a: ");
    result += this.input(scan,"b: ");
    result *= this.input(scan,"c: ");
    System.out.println("(a+b)*c="+result);
    
    
    }
}
