package classes;

public class Produto {
  public double custo;
  public double percentual;

  public double calcularValorVenda(double custo, double percentual) {
    double valorVenda = this.custo * this.percentual;
    return valorVenda;
  }
}
