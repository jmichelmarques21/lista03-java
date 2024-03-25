package classes;

public class Carro {
  public double custo;
  public float distancia;
  public float combustivel;
  public int ano;
  public double valor;
  public char tipoCombustivel;

  public float calcularConsumo(float distancia, float combustivel) {
    float consumo = distancia / combustivel;
    return consumo;


    
  }
}
