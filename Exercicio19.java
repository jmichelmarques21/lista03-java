import java.util.Scanner;
import classes.Triangulo;

public class Exercicio19 {
  public static void executar(){

    /* Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
    Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
    Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados.
    Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
    Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isóscele;
    Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes */

    Scanner scan = new Scanner(System.in);
    Triangulo triangulo = new Triangulo();


    System.out.println("Informe os três lados do triângulo: ");
    triangulo.lado1 = scan.nextInt();
    triangulo.lado2 = scan.nextInt();
    triangulo.lado3 = scan.nextInt();

    String tipoTriangulo = triangulo.calcularTipoTriangulo(triangulo.lado1, triangulo.lado2, triangulo.lado3);

    System.out.println("O triângulo informado é: " + tipoTriangulo);





    scan.close();
  }
}
