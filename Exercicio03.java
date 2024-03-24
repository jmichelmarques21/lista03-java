import java.util.Scanner;
import classes.Vendedor;

public class Exercicio03 {
  public static void executar(){
    
    /*  Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. */

    Vendedor vendedor = new Vendedor();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o nome do vendedor: ");
    vendedor.nome = scan.nextLine();
    System.out.println("Informe o valor do salário fixo: ");
    vendedor.salarioFixo = scan.nextDouble();
    System.out.println("Informe o valor das vendas desse vendedor: ");
    vendedor.vendas = scan.nextDouble();

    double salarioFinal = vendedor.calculoComissao(vendedor.salarioFixo, vendedor.vendas);

    System.out.println("Vendedor: " + vendedor.nome);
    System.out.printf("Salário fixo: R$%.2f%n",  vendedor.salarioFixo);
    System.out.printf("Vendas: R$%.2f%n", vendedor.vendas);
    System.out.printf("Salário final: R$%.2f", salarioFinal);



    scan.close();
  }
}
