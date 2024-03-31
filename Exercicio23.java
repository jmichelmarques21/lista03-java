import java.util.Scanner;
import classes.Pessoa;

public class Exercicio23 {
public static void executar(){

/* Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostre
nome e o seu peso ideal de acordo com as seguintes características da pessoa: */

Scanner scan = new Scanner(System.in);
Pessoa pessoa = new Pessoa();

System.out.println("Informe o nome da pessoa: ");
pessoa.nome = scan.nextLine();
System.out.println("Informe o gênero: ");
pessoa.genero = scan.next().charAt(0);
System.out.println("Informe a altura: ");
pessoa.altura = scan.nextDouble();
System.out.println("Informe a idade: ");
pessoa.idade = scan.nextInt();

pessoa.calcularPesoIdeal(pessoa.genero, pessoa.altura, pessoa.idade);




scan.close();
}
}
