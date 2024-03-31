package classes;

public class Pessoa {
  public String nome;
  public char genero;
  public int idade;
  public char saude;
  public double altura;

  public void calcularPesoIdeal(char genero, double altura, int idade){    
    if (genero == 'M' || genero == 'm') {
      if (altura > 1.70) {
        if (idade <= 20) {
          double pesoIdeal = (72.7 * altura) - 58;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade >= 21 && idade <= 39) {
          double pesoIdeal = (72.7 * altura) - 53;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade >= 40) {
          double pesoIdeal = (72.7 * altura) - 45;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        }
      } else if (altura <= 1.70) {
        if (idade <= 40) {
          double pesoIdeal = (72.7 * altura) - 50;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        } else if (idade > 40) {
          double pesoIdeal = (72.7 * altura) - 58;
          System.out.printf("Peso ideal para um homem com %.2f é: %.2f quilos.", altura, pesoIdeal); 
        }
      }
    } else if (genero == 'F' || genero == 'f'){
      if (altura > 1.50) {
        double pesoIdeal = (62.1 * altura) - 44.7;
        System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal); 
      } else if (altura <= 1.50) {
        if (idade >= 35) {
          double pesoIdeal = (62.1 * altura) - 45;
          System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal);   
        } else if (idade < 35) {
          double pesoIdeal = (62.1 * altura) - 49;
          System.out.printf("Peso ideal para uma mulher com %.2f é: %.2f quilos.", altura, pesoIdeal);   
        }
      }
    } else {
      System.out.println("Gênero inválido...");
    }
  }
}
