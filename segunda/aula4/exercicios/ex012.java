import java.util.Scanner;

public class ex012{
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Qual a base do triângulo? ");
    double base = scan.nextDouble();
    System.out.print("Qual a altura do triângulo? ");
    double altura = scan.nextDouble();
    double area = (base * altura) / 2;
    System.out.println("A área do triângulo é: " + area);
    }
}
