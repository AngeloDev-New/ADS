import java.util.Scanner;

public class ex008{
    public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);
    System.out.print("Qual o raio do círculo? ");
    double raio = scan.nextDouble();
    double area = 3.14 *raio* raio;
    System.out.println("A área do círculo é: " + area);
    }
}
