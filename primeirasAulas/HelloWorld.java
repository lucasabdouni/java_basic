package primeirasAulas;
/*
 * HelloWorld = nome da minha classe
 * public = tipo de acesso da classe
 * class = tipo da classe
 */

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  

    int dadoDoTipoInt = 10;

    if (dadoDoTipoInt == 10) {
      System.out.println("Dado do tipo int é igual a 10");
    } else {
      System.out.println("Dado do tipo int não é igual a 10");
    }

    int valorInicial = 0;
  
    while(valorInicial < 3) {
      System.out.println("O valor inicial é menor que 3");
      valorInicial++;
    }

    for(int i = 0; i < 4; i++) {
      System.out.println("O valor de i é: " + i);
    }
  }
}