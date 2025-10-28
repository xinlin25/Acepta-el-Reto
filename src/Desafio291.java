import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Desafio291 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        while (casos != 0) {
            Map<String, Set<Integer>> mapa = new TreeMap<>();
            for (int i = 0; i <= casos; i++) {
                String[] palabrasFrase = sc.nextLine().toLowerCase().split(" ");
                for (String palabra : palabrasFrase) {
                    if (palabra.length() > 2) {
                        palabra = palabra.toLowerCase();
                        if (!mapa.containsKey(palabra)) 
                            mapa.put(palabra, new TreeSet<>(Arrays.asList(i)));
                        else {
                            Set<Integer> aux = mapa.get(palabra);
                            aux.add(i);
                            mapa.put(palabra, aux);
                        }
                }   }  
            }
            for (Map.Entry<String, Set<Integer>> entrada : mapa.entrySet()) {
                System.out.print(entrada.getKey());
                for (Integer n : entrada.getValue()) {
                    System.out.print(" " + n);
                }
                System.out.println();
            }
            System.out.println("----");
            casos = sc.nextInt();
        }
        sc.close();
    }
}   