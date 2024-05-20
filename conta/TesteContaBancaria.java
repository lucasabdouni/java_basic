package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria contaBancaria = new ContaBancaria();
    contaBancaria.setNumero("1234");
    contaBancaria.setTitular("Lucas");

    contaBancaria.depositar(50);
    contaBancaria.sacar(100);
  }
}
