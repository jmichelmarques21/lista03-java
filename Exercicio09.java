import java.util.Scanner;

public class Exercicio09 {
  public static void executar(){

    /*  Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 (inclusive). */

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe quantos números serão digitados: ");
    int num = scan.nextInt();
    int vet[] = new int[num];
    int soma = 0;

    for(int i = 0; i < vet.length; i++){
      System.out.println("Digite o " + (i + 1) + "º número: ");
      vet[i] = scan.nextInt();
    }

    System.out.println();
    System.out.println("Número dentro do intervalo");
    for(int i = 0; i < vet.length; i++) {
      if (vet[i] >= 10 && vet[i] <= 150) {
        soma++;
        System.out.println(vet[i]);
      }
    }

    System.out.println("A quantidade de números dentro do intervalo é: " + soma);


    scan.close();
  }
}
