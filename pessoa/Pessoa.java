package pessoa;

public class Pessoa {
  // nome, idade, cpf
  // tipo nomeDaVariavel

  private String nome;
  private int idade;
  private String cpf;

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  String imprimirDadosDaPessoa() {
    return "O nome da pessoa é " + nome + " a idade é: " + idade;
  }
}
