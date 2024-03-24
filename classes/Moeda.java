package classes;

public class Moeda {
  public double valor;
  public double cotacao;


  public double converterMoeda(double valor, double cotacao) {
    double valorConvertido = valor * cotacao;
    return valorConvertido;
  }
}
