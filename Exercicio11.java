import java.util.Scanner;
import classes.Pessoa;

public class Exercicio11 {
  public static void executar(){

    /* Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou mulher. 
    No final informe total de homens e de mulheres. */

    Scanner scan = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    System.out.println("Informe quantas vezes o programa vai rodar: ");
    int n = scan.nextInt();
    String nomes[] = new String[n];
    char generos[] = new char[n];

    for (int i = 0; i < n; i++) {
        System.out.println("Informe o nome da " + (i + 1) + "ª pessoa: ");
        pessoa.nome = scan.nextLine();
        pessoa.nome = scan.nextLine();
        nomes[i] = pessoa.nome;
        System.out.println("Informe o gênero da " + (i + 1) + "ª pessoa (M / F): ");
        pessoa.genero = scan.next().charAt(0);
        generos[i] = pessoa.genero;
    }

    int feminino = 0;
    int masculino = 0;

    for(int i = 0; i < n; i++) {
      if (generos[i] == 'f' || generos[i] == 'F') {
        System.out.println("Nome: " + nomes[i] + " | Gênero: Feminino.");
        feminino++;
      } else if (generos[i] == 'm' || generos[i] == 'M') {
        System.out.println("Nome: " + nomes[i] + " | Gênero: Masculino.");
        masculino++;
      } else {
        System.out.println("Nome: " + nomes[i] + " | Gênero incorreto.");
      }
    }



    scan.close();
  }
}
