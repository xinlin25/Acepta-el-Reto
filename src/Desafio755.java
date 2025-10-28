import java.util.Scanner;

public class Desafio755 {
    private static long mcd(long a, long b) {
        while (b != 0) {
            long num = a % b;
            a = b;
            b = num;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            long ancho = sc.nextLong();
            long alto = sc.nextLong();

            long mcd = mcd(ancho, alto);
            long parcelas = (ancho / mcd) * (alto / mcd);
            System.out.println(parcelas);
        }

        sc.close();
    }
}