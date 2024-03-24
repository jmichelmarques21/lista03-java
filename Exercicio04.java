import java.util.Scanner;
import classes.Moeda;

public class Exercicio04 {
  public static void executar(){

    /* Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
    O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. */

    Moeda moeda = new Moeda();
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe o valor em dólares (U$): ");
    moeda.valor = scan.nextDouble();
    System.out.println("Informe a cotação do dólar: ");
    moeda.cotacao = scan.nextDouble();

    double valorFinal = moeda.converterMoeda(moeda.valor, moeda.cotacao);

    System.out.printf("Valor em dólares: U$%.2f%n", moeda.valor);
    System.out.printf("Cotação do dia: %.2f%n", moeda.cotacao);
    System.out.printf("Valor convertido em reais: R$%.2f%n", valorFinal);


    scan.close();
  }
}
