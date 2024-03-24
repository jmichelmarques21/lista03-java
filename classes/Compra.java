package classes;

public class Compra {
  public double valorCompra;


  public double calcularPrestacao(double valorCompra) {
    double parcela = valorCompra / 5;
    return parcela;
  }

}
