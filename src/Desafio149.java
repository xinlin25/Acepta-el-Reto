import java.util.Scanner;

public class Desafio149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int toros = sc.nextInt();

            int mayor = 0;
            for(int i = 0; i < toros; i++) {
                int actual = sc.nextInt();
                if (actual > mayor) {
                    mayor = actual;
                }
            }
            System.out.println(mayor);
        }
        sc.close();
    }
}