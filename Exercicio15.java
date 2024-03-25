import java.util.Scanner;
import classes.Carro;

public class Exercicio15 {
  public static void executar(){

    /* A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um programa que calcule e exiba o 
    valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser calculado sobre o valor do veículo de acordo com o 
    combustível (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. 
    Informe total de desconto e total pago pelos clientes. */

    Scanner scan = new Scanner(System.in);
    Carro carro = new Carro();

    double valorTotal = 0;
    double valorFinal = 0;
    int soma = 0;

    do {
      System.out.println("Informe o valor do veículo: ");
      carro.valor = scan.nextDouble();
      System.out.println("Informe o tipo de combustível desse veículo (A / G / D): ");
      carro.tipoCombustivel = scan.next().charAt(0);
      String a = scan.nextLine();

      if (carro.tipoCombustivel == 'A' || carro.tipoCombustivel == 'a') {
        valorFinal = carro.valor - (carro.valor * 0.25);
        System.out.printf("Valor do veículo: R$%.2f%n", valorFinal);
        soma++;
        valorTotal += valorFinal;
      } else if (carro.tipoCombustivel == 'G' || carro.tipoCombustivel == 'g') {
          valorFinal = carro.valor - (carro.valor * 0.21);
          System.out.printf("Valor do veículo: R$%.2f%n", valorFinal);
          soma++;
          valorTotal += valorFinal;
      } else if (carro.tipoCombustivel == 'D' || carro.tipoCombustivel == 'd') {
          valorFinal = carro.valor - (carro.valor * 0.14);
          System.out.printf("Valor do veículo: R$%.2f%n", valorFinal);
          soma++;
          valorTotal += valorFinal;
      } else {
        System.out.println("Tipo de combustível inválido.");
      }
    } while(carro.valor != 0);

    System.out.println("Foram calculados " + soma + " veículos.");
    System.out.printf("Valor total dos veículos: R$%.2f%n", valorTotal);


    scan.close();
  }
}
