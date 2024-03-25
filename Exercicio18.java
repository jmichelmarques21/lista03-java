import java.util.Scanner;
import classes.Funcionario;

public class Exercicio18 {
  public static void executar(){

    /* Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostre o nome e o salário líquido acrescido do abono conforme o sexo e a idade:
    Sexo Idade Abono
      M  >= 30 100,00
          < 30 50,00
      F
          >= 30 200,00
          < 30 80,00 */

    Scanner scan = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    System.out.println("Digite o nome do funcionário: ");
    funcionario.nome = scan.nextLine();
    System.out.println("Digite a idade: ");
    funcionario.idade = scan.nextInt();
    System.out.println("Digite o salário fixo: ");
    funcionario.salario = scan.nextDouble();
    System.out.println("Informe o gênero (F / M): ");
    funcionario.genero = scan.next().charAt(0);

    double abono = funcionario.calcularAbono(funcionario.genero, funcionario.idade);
    double novoSalario = funcionario.salario + abono;


    System.out.println();
    System.out.println("Nome do funcionário: " + funcionario.nome);
    System.out.println("Idade: " + funcionario.idade);
    System.out.printf("Salário fixo: %.2f%n", funcionario.salario);
    System.out.println("Gênero: " + funcionario.genero);
    System.out.printf("Salário com abono: R$%.2f%n", novoSalario);




    scan.close();
  }
}
