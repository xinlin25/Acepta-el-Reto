import java.util.Scanner;

public class Desafio376 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        while (entrada != 0) {
            sc.nextLine();
            String cadena = sc.nextLine();
            int picos = 0;

            String [] array = cadena.split(" ");
            int[] alturas = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                alturas[i] = Integer.parseInt(array[i]);
            }
            int num = alturas.length;
            for (int j = 0; j < num; j++) {
                if (j == 0) {
                    if (alturas[j] > alturas[j + 1] && alturas[j] > alturas[num - 1])
                        picos++;
                } else if (j == num - 1) {
                    if (alturas[j] > alturas[j - 1] && alturas[j] > alturas[0])
                        picos++;
                } else {
                    if (alturas[j] > alturas[j - 1] && alturas[j] > alturas[j + 1]) 
                        picos++;
                }   
            }
            System.out.println(picos);
            entrada = sc.nextInt();
        }
             
        sc.close();
    }
}