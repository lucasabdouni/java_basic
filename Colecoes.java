
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();
    notas.put("Dani", 4);
    notas.put("Lucas", 10);
    notas.put("Julho", 9);

    // var nota = notas.get("Dani");
    // System.out.println(nota);

    for(Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.err.println("A chave é " + key + " e o valor é: " + value);
    }
  }
}
