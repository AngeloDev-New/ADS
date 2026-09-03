// importado o scanner para poder usarlo como metodo de entradas 
import java.util.Scanner;
// classe principal nome deve ser o mesmo do arquivo
public class ex006{
    // classe de entrada todo programa precisa inicia  por algun lugar
    public static void main(String[] ars){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
		String paciente = scan.nextLine();
        System.out.print("Digite a idade do paciente: ");
		int idade = scan.nextInt();
		scan.nextLine();
        System.out.print("Digite a data da consulta (dd/mm/aa): ");
		String data = scan.nextLine();
        System.out.print("Digite o nome do medico: ");
		String medico = scan.nextLine();
        System.out.print("Digite a especialidade do medico: ");
		String especialidade = scan.nextLine();
        System.out.println("Resumo da Consulta:\nPaciente: "+paciente);
        System.out.println("Idade: "+idade+"anos");
        System.out.println("Data da conslta:"+data);
        System.out.println("Medico: "+medico);
        System.out.println("Especialidade: "+especialidade);
    }
}
