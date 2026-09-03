// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex003{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){

        Scanner scan = new Scanner(System.in);
	System.out.print("Digite o titulo do seu livro favorito: ");
	String livro = scan.nextLine();
	System.out.print("Diite o nome do autor");
	String autor = scan.nextLine();
	System.out.print("Seu livro favorito é '"+livro+"' escrito por '"+autor+"'.");
    }
}
