import java.util.Scanner;
public class ex007 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A:");
        double a = scan.nextDouble();
        System.out.println("B:");
        double b = scan.nextDouble();
        System.out.println("C:");
        double c = scan.nextDouble();
        double ab = a+b;
	if(ab<c){
		System.out.println("A+B e menor que C resultado: "+ab);
	}else{
		System.out.println("A+B e maior que C resultado: "+ab);
	}
	}
}
