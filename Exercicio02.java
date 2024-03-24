import java.util.Scanner;
import classes.Carro;

public class Exercicio02 {
  public static void executar(){

    /*  Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida 
    a distância total percorrida pelo automóvel e o total de combustível gasto. */

    Scanner scan = new Scanner(System.in);

    Carro carro = new Carro();

    System.out.println("Informe a distância total percorrida: ");
    carro.distancia = scan.nextFloat();
    System.out.println("Informe o total de combustível gasto: ");
    carro.combustivel = scan.nextFloat();

    float media = carro.calcularConsumo(carro.distancia, carro.combustivel);

    System.out.println();
    System.out.printf("O consumo médio do carro é: %.2f", media, "litros por km.");


    scan.close();
  }
}
