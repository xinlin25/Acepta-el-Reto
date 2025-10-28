import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Desafio416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        while (casos != 0 && casos > -1) {

            Set<String> cumples = new TreeSet<>(); 
            boolean repe = false;

            for (int i = 0; i < casos; i++) {
                String[] fechas = sc.next().split("/");
                if (cumples.contains(fechas[0] + " " + fechas[1])) { 
                    repe = true; 
                    sc.nextLine(); 
                    break; 
                } else
                    cumples.add( fechas[0] + " " + fechas[1] );
            }
            if (repe)
                System.out.println("SI");
            else
                System.out.println("NO");
            
            casos = sc.nextInt();
        }
        sc.close();
    }
}