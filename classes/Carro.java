package classes;

public class Carro {
  public double custo;
  public float distancia;
  public float combustivel;

  public float calcularConsumo(float distancia, float combustivel) {
    float consumo = distancia / combustivel;
    return consumo;


    
  }
}
