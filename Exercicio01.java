import java.util.Scanner;
import classes.Aluno;

public class Exercicio01 {
  public static void executar(){

    /* Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
    No final informar o nome do aluno e a sua média (aritmética). */

    Scanner scan = new Scanner(System.in);

    Aluno aluno = new Aluno();
    System.out.println("Informe o nome do aluno: ");
    aluno.nome = scan.nextLine();
    System.out.println("Informe as três notas do aluno: ");
    aluno.nota1 = scan.nextFloat();
    aluno.nota2 = scan.nextFloat();
    aluno.nota3 = scan.nextFloat();
    double media = aluno.calcularMedia(aluno.nota1, aluno.nota2, aluno.nota3);

    System.out.println("Aluno: " + aluno.nome);
    System.out.printf("Média: %.2f", media);

    scan.close();

  }
}
