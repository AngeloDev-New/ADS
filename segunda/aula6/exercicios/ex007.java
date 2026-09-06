import java.util.Scanner;
public class ex007 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A:");
        double a = scan.nextDouble();
        System.out.print("B:");
        double b = scan.nextDouble();
        System.out.print("C:");
        double c = scan.nextDouble();
        double ab = a+b;
	if(ab<c){
		System.out.println("A+B é menor que C resultado: "+ab);
	}else{
		System.out.println("A+B é maior que C resultado: "+ab);
	}
	}
}
