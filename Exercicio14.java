import java.util.Scanner;
import classes.Produto;

public class Exercicio14 {
  public static void executar(){

    /* Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado se houve lucro, 
    prejuízo ou empate para cada produto. Informe média de preço de custo e do preço de venda. */

    Scanner scan = new Scanner(System.in);
    Produto produto = new Produto();
    double mediaCusto = 0;
    double mediaVenda = 0;

    System.out.println("Quantos produtos serão computados? ");
    int n = scan.nextInt();

    for (int i = 0; i < n; i++){
      System.out.println("Informe o valor de custo do produto: ");
      produto.custo = scan.nextDouble();
      mediaCusto += produto.custo;
      System.out.println("Informe o valor de venda do produto: ");
      produto.ValorDeVenda = scan.nextDouble();
      mediaVenda += produto.ValorDeVenda;
    }

    mediaCusto = mediaCusto / n;
    mediaVenda = mediaVenda / n;

    System.out.printf("Média dos custos: R$%.2f%n", mediaCusto);
    System.out.printf("Media das vendas: R$%.2f%n", mediaVenda);

    if (mediaVenda > mediaCusto) {
      System.out.println("Houve lucro!");
    } else if (mediaVenda < mediaCusto) {
      System.out.println("Houve prejuízo!");
    } else {
      System.out.println("Houve empate nos valores!");
    }


    scan.close();
  }
}
