import java.util.Scanner;
import classes.Funcionario;

public class Exercicio17 {
  public static void executar(){

    /* Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário reajustado. 
    Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua folha de pagamento. */

    Scanner scan = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    System.out.println("Informe o nome do funcionário: ");
    funcionario.nome = scan.nextLine();
    System.out.println("Informe o valor do salário: ");
    funcionario.salario = scan.nextDouble();
    System.out.println("Informe o valor do salário mínimo: ");
    double salarioMinimo = scan.nextDouble();
    
    double nSal = funcionario.calcularNovoSalario(funcionario.salario, salarioMinimo);

    System.out.println("Funcinário: " + funcionario.nome);
    System.out.printf("Salário atual: R$%.2f%n", funcionario.salario);
    System.out.printf("Novo salário é: R$%.2f%n", nSal);
    double aumentoFolha = nSal - funcionario.salario;
    System.out.printf("O valor referente ao aumento na folha de pagamento é: R$%.2f%n", aumentoFolha);



    scan.close();
  }
}
