// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class entrada{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = scan.nextInt();
        System.out.println(numero);
        
    }
}