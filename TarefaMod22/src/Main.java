import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> lista = List.of("Carol -f", "Bernardo -m", "Andre -m", "David -m", "Elena -f");
        Map<String, String> mapNome = new HashMap<>();

        for (String item : lista){
            String[] partes = item.split("\\s-");
            mapNome.put(partes[0], partes[1]);
        }


        List<String> chavesComValorF = mapNome.entrySet().stream()
                .filter(entry -> entry.getValue().equals("f"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Lista Mulheres "+ chavesComValorF);
    }
}