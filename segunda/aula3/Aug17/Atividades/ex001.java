// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex001{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){

        // texto inicial
	System.out.print("Digite seu nome completo:");
	// declarendo scan de "Scanner" classe responsavel pela entrada de dados 
	Scanner scan = new Scanner(System.in);
	//next line e um metodo de Scanner que recebe um texto contendo espaços e etc....
	//alem dele temos nextInt(inteiro),next(palvra...sem espaco tipo palavra isolada),nextDouble,nextFloat(ambos sao pra flutuantes ex 0.234 ou "pi" sla)
	//nextBoolean pra bool...
	String nome = scan.nextLine();
	//saida final concatena apresentacao com nome
	System.out.print("Olá,"+nome+"!");
        
        
    }
}   
