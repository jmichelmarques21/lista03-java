package classes;

public class Aluno {
  public String nome;
  public float nota1;
  public float nota2;
  public float nota3;

  public float calcularMedia(float n1, float n2, float n3) {
    float media = (n1 + n2 + n3) / 3;
    return media;
  }

}
