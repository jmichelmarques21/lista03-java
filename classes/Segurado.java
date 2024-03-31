package classes;

public class Segurado {
  public String nome;
  public int idade;
  public String grupoDeRisco;

  public void categoriaPretendente(int idade, String grupoDeRisco) {
    if (idade >= 17 && idade <= 20) {
      if (grupoDeRisco.equals("Baixo")) {
        int categoria = 1;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Medio")) {
        int categoria = 2;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Alto")) {
        int categoria = 3;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      }
    } else if (idade >= 21 && idade <= 24) {
      if (grupoDeRisco.equals("Baixo")) {
        int categoria = 2;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Medio")) {
        int categoria = 3;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Alto")) {
        int categoria = 4;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      }
    } else if (idade >= 25 && idade <= 34) {
      if (grupoDeRisco.equals("Baixo")) {
        int categoria = 3;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Medio")) {
        int categoria = 4;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Alto")) {
        int categoria = 5;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      }
    } else if (idade >= 35 && idade <= 64) {
      if (grupoDeRisco.equals("Baixo")) {
        int categoria = 4;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Medio")) {
        int categoria = 5;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Alto")) {
        int categoria = 6;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      }
    } else if (idade >= 65 && idade <= 70) {
      if (grupoDeRisco.equals("Baixo")) {
        int categoria = 7;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Medio")) {
        int categoria = 8;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      } else if (grupoDeRisco.equals("Alto")) {
        int categoria = 9;
        System.out.println("Nome: " + nome + " - Idade: " + idade + " - Categoria: " + categoria);
      }
    } else {
      System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
    }
  }
}
