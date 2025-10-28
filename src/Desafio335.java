import java.util.Scanner;
public class Desafio335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for(int i = 0; i < casos; i++) {
            long base = sc.nextLong();
            long piso = 1;
            long suma = 1;
            for (int j = 1; j < base; j++) {
                piso = piso + j + 1;
                suma = suma + piso;
            }
            System.out.println(suma);
        }

        sc.close();
    }   
}