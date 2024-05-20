package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    pessoa1.cpf = "115215411";
    pessoa1.nome = "Lucas";
    pessoa1.idade = 26;

    System.out.println(pessoa1.imprimirDadosDaPessoa());

    Pessoa pessoa2 = new Pessoa();
    pessoa2.cpf = "1113213";
    pessoa2.nome = "Joao";
    pessoa2.idade = 46;

    System.out.println(pessoa2.imprimirDadosDaPessoa());
  }
}
