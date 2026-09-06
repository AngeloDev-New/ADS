import java.util.Scanner;
public class ex008 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A:");
        double a = scan.nextDouble();
        System.out.print("B:");
        double b = scan.nextDouble();
        if (a==b){
                double c = a+b; 
                System.out.println("A é igual a B");
                System.out.println("A+B é igual a: "+c);
        }else{
                double c = a*b;
                System.out.println("A é diferente de B");
                System.out.println("A*B é igual a: "+c);
        }
	}
}
