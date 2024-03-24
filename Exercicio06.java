import java.util.Scanner;
import classes.Produto;

public class Exercicio06 {
  public static void executar(){

    /* Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. 
    Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário. */

    Produto produto = new Produto();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor de custo do produto: ");
    produto.custo = scan.nextDouble();
    System.out.println("Informe o percentual: ");
    produto.percentual = scan.nextDouble();

    double valorVenda = produto.calcularValorVenda(produto.custo, produto.percentual);
    
    System.out.printf("Custo do produto: R$%.2f%n", produto.custo);
    System.out.printf("Percentual para venda: %.2f%n", produto.percentual);
    System.out.printf("Valor de venda: R$%.2f%n", valorVenda);
  }
}
