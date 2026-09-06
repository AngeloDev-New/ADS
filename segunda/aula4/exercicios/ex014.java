import java.util.Scanner;

public class ex014{
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Digite a distancia em kilômetros: ");
    double km = scan.nextDouble();
    System.out.print("Digite o tempo em horas: ");
    double horas = scan.nextDouble();
    double velocidade = km / horas;
    System.out.printf("A velocidade média é: %.2f km/h\n", velocidade);
    }
}
