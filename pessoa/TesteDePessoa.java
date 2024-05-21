package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();
    professor.setCpf("123123123");
    professor.setIdade(20);
    professor.setNome("Lucas");
    professor.setSalario(3000);

    System.out.println(professor.imprimirDadosDaPessoa());

    Aluno aluno = new Aluno();
    aluno.setCpf("1231231222");
    aluno.setIdade(6);
    aluno.setNome("Douglas");
    aluno.setMatricula("10");
    System.out.println(aluno.imprimirDadosDaPessoa());
  }
}
