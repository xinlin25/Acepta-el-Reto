import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Desafio365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        
        for (int i = 0; i < casos; i++) {
            Queue<Integer> queue = new LinkedList<>();
            int tiempoEspera = 0;
            int cantNinos = sc.nextInt();
            int posAitor = sc.nextInt() - 1;
            sc.nextLine();

            String[] regalos = sc.nextLine().split(" "); 
            int[] nRegalos = new int[cantNinos]; 
            
            for (int j = 0; j < cantNinos;j++) {
                nRegalos[j] = Integer.parseInt(regalos[j]);
                queue.offer(nRegalos[j]);
            } 
           
            int pos = 0;
            int regalosActuales = 0;

            while (!queue.isEmpty()) {
                tiempoEspera += 2;
                regalosActuales = queue.poll();
                regalosActuales--;

                if (regalosActuales > 0)
                    queue.offer(regalosActuales);
               
                if (pos == posAitor && regalosActuales == 0)
                    break;
                else if (pos == posAitor && regalosActuales != 0) {
                    pos = 0;
                    posAitor = queue.size()-1;
                } else
                    pos +=1;
            }
            System.out.println(tiempoEspera);
        }
        sc.close();
    }
}