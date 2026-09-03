// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex005{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do seu time de futebol favorito: ");
        String time = scan.nextLine();
        System.out.print("Digite o nome de um jogador famoso desse time: ");
	String jogador = scan.nextLine();
	System.out.print("Voce torce para o "+time+" e o seu jogador favorito e o "+jogador+".");
    }
}
