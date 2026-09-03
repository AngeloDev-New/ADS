// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex004{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua ocupação: ");
	String ocupacao = scan.nextLine();
	System.out.print(nome+" trabalha como "+ocupacao);
    }
}
