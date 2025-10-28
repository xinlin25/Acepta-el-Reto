import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Desafio558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int nCasos = sc.nextInt();
            sc.nextLine();
            Map<String,String> palabras = new HashMap<>();
            Map<String,Integer> nMayusculas = new HashMap<>();
            List<String> lista = new ArrayList<>();

            for (int i = 0; i < nCasos; i++) {
                String caso = sc.nextLine();
                String minusculas = caso.toLowerCase();
                int contador = 0;

                for (char c : caso.toCharArray()) {
                    if (Character.isUpperCase(c)) contador++;
                }

                if (!palabras.containsKey(minusculas) || contador > nMayusculas.get(minusculas)) {
                    palabras.put(minusculas, caso);
                    nMayusculas.put(minusculas, contador);
                }
                
                lista.add(caso);
            }

            for (String valor : lista) {
                System.out.println(palabras.get(valor.toLowerCase()));
            }
            System.out.println("---");
        }
        sc.close();
    }
}