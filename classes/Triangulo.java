package classes;

public class Triangulo {
  public int lado1;
  public int lado2;
  public int lado3;


  public String calcularTipoTriangulo(int l1, int l2, int l3){
    if (l1 == l2 && l1 == l3 && l2 == l3) {
      String tipoTriangulo = "Triangulo Equilátero";
      return tipoTriangulo;
    } else if (l1 != l2 && l1 != l3){
      String tipoTriangulo = "Triângulo Escaleno";
      return tipoTriangulo;
    } else {
      String tipoTriangulo = "Triângulo Isóscele";
      return tipoTriangulo;
    }
  }
}
