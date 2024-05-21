package veiculo;

public class Carro implements Veiculo {
  @Override
  public void acelerar() {
    System.out.println("acelerar carro");
  }

  @Override
  public void frear() {
    System.out.println("frear carro");
  }
}
