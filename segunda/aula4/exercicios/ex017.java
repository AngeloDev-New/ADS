import java.util.Scanner;

public class ex017{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite o nome do funcionário: ");
    String nome = scan.nextLine();
    System.out.print("Cargo: ");
    String cargo = scan.nextLine();
    System.out.print("Salário base: ");
    double salario_base = scan.nextDouble();
    System.out.print("Valor das horas extras: ");
    double ValorHorasExtras = scan.nextDouble();
    System.out.print("Valor do desconto: ");
    double desconto = scan.nextDouble();
    System.out.print("Valor do INSS: ");
    double inss = scan.nextDouble();
    double salario_bruto = salario_base + ValorHorasExtras;
    double salario_liquido = salario_bruto - desconto - inss;
    System.out.printf("=== Holerite ===\nNome: %s\nCargo: %s\nSalário base: R$ %.2f\nHoras extras: R$ %.2f\nDescontos: R$ %.2f\nINSS: R$ %.2f\n\n\nSalário bruto: R$ %.2f\nSalário líquido: R$ %.2f\n", nome, cargo, salario_base, ValorHorasExtras, desconto, inss, salario_bruto, salario_liquido);
    }
}
