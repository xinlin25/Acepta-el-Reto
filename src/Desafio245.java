import java.util.Scanner;

public class Desafio245 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    long personajes;

        do {
            personajes = sc.nextLong();
                
            if (personajes > 1) {
                boolean ascendente = true;
                boolean descendente = true;
            long anterior = sc.nextLong();

            for (int i = 1; i < personajes; i++) {
                long actual = sc.nextLong();
                    if (anterior >= actual) {
                        ascendente = false; 
                    }
                    if (anterior <= actual) {
                        descendente = false;
                    }
                    anterior = actual;
                }

                if (ascendente || descendente) {
                    System.out.println("DALTON");
                } else {
                    System.out.println("DESCONOCIDOS");
                }
            }
        } while (personajes != 0);
        sc.close();
    }
}