import java.util.Scanner;
import classes.Carro;

public class Exercicio07 {
  public static void executar(){

    /* O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos 
    (aplicados, primeiro os impostos sobre o custo de fábrica, e depois a percentagem do distribuidor sobre o resultado). 
    Supondo que a percentagem do distribuidor seja de 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro 
    e informe o custo ao consumidor do mesmo */

    Carro carro = new Carro();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor de custo do automóvel: ");
    carro.custo = scan.nextDouble();

    double distribuidor = 0.28;
    double imposto = 0.45;

    double valorImposto = (carro.custo * imposto);
    double valorDistribuidor = ((carro.custo + valorImposto) * distribuidor);
    double valorFinal = carro.custo + valorImposto + valorDistribuidor;

    System.out.printf("Custo do carro: R$%.2f%n", carro.custo);
    System.out.printf("Valor de venda ao consumidor: R$%.2f", valorFinal);

    scan.close();
  }
}
