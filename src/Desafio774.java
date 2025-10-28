import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio774 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        while (entrada != 0) {
            Map<Integer,Integer> mapa1 = new HashMap<>();
            Map<Integer,Integer> mapa2 = new HashMap<>();
            long nivelDiseminacion = 0;

            for (int i = 1; i < entrada + 1; i++) {
                int color = sc.nextInt();
                
                if (!mapa1.containsKey(color)) 
                    mapa1.put(color, i); 
            
                mapa2.put(color, i);
            }

            for (int color : mapa1.keySet()) {
                nivelDiseminacion += (mapa2.get(color) - mapa1.get(color));
            }
            
            System.out.println(nivelDiseminacion);

            entrada = sc.nextInt();
        }
        sc.close();
    }
}