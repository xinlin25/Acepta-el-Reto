import java.util.Scanner;

public class Desafio210 {
    
    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        if (n <= 1 || n % 2 == 0) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        return esPrimo;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            int suma = 0;
            String caso = sc.nextLine();

            for (int j = 0; j < caso.length(); j++) {
                suma += caso.charAt(j); 
            }

            suma--;
            while (!esPrimo(suma)) {
                suma--;
            }

            System.out.println(suma);
        }
        sc.close();
    }
}