import java.util.Scanner;
import classes.Cliente;

public class Exercicio22 {
  public static void executar(){

/* Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
Tipo de Cliente Valor do KW/h:
1 (Residência) 0,60
2 (Comércio) 0,48
3 (Indústria) 1,29 */

Scanner scan = new Scanner(System.in);
Cliente cliente = new Cliente();

System.out.println("Informe o tipo do consumidor: ");
cliente.tipoCliente = scan.nextInt();
System.out.println("Informe a quantidade de KW/h: ");
cliente.quantidadeKwh = scan.nextDouble();

cliente.calcularContaLuz(cliente.tipoCliente, cliente.quantidadeKwh);




scan.close();
  }
}
