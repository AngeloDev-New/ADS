// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex002{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){
	//imprimindo mensagem
	System.out.print("Digite sua idade: ");
	//declarando variavel scan
	Scanner scan = new Scanner(System.in);
	// entrada de inteiro
	int idade = scan.nextInt();
	/**[INPORTANTE]
		Quando trocamos o tipo de entrada repentinamente o java tem o costume de se peder nos
		buffers ps Pesquisar mais a respeito, sendo assim , uma forma de contornar esse erro
		e simplesmente deixar um nextLine na proxima linha


**/
	scan.nextLine();
	// mensagem
	System.out.print("Digite a cidade onde você mora: ");
	// entrada Texto
	String cidade = scan.nextLine();
	// saida final concatenando tudo
	System.out.print("Você tem "+idade+" anos, e mora em "+cidade);
    }
}
