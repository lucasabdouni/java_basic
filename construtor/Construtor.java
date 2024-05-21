package construtor;

public class Construtor {
  private int numero;
  private String nome;

  public Construtor(int numero) {
    this.numero = numero;
    System.out.println("construtor com 1 parametro criado");
  }

  public Construtor(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
