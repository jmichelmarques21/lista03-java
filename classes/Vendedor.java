package classes;

public class Vendedor {

  public String nome;
  public double salarioFixo;
  public double vendas;

  public double calculoComissao(double salarioFixo, double vendas) {
    double comissao = this.salarioFixo + (this.vendas * 0.15);
    return comissao;
  }

}
