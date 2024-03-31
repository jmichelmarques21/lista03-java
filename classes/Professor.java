package classes;

public class Professor {
  public double salario;
  public double nivel;
  public double cargaHoraria;


  public void calculoSalarioProfessor(double cargaHoraria, double nivel) {
    if (nivel == 1) {
      salario = cargaHoraria * 12;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else if (nivel == 2) {
      salario = cargaHoraria * 17;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else if (nivel == 3) {
      salario = cargaHoraria * 25;
      System.out.printf("Salário: R$%.2f%n", salario);
    } else {
      System.out.println("Nível incorreto.");
    }}}
