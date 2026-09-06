import java.util.Scanner;
public class ex010{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X: ");
        double x = scan.nextDouble();
        System.out.print("Y: ");
        double y = scan.nextDouble();
        System.out.print("Z: ");
        double z = scan.nextDouble();
        boolean propriedade = (x+y>z) && (x+z>y) && (y+z>x);
        if (propriedade) {
            if (x==y && y==z) {
                System.out.println("Triângulo Equilátero");
            }else if (x==y || x==z || y==z) {
                System.out.println("Triângulo Isósceles");
            }else{
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("Alerta: As medidas não formam um triângulo.");
        }
    }
}
