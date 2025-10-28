import java.util.Scanner;

public class Desafio370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String caso = sc.nextLine();
            String[] ab = caso.split("-");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            int mayor;
            int menor;

            if (a > b) {
                mayor = a;
                menor = b;
            } else if (b > a) {
                mayor = b;
                menor = a;
            } else {
                System.out.println("NO");
                continue;
            }
            if (mayor % 2 == 0) {
                System.out.println("NO");
                continue;
            } else if (!(mayor == menor + 1)) {
                System.out.println("NO");
                continue;
            } else {
                System.out.println("SI");
            }
        }
        sc.close();
    }
}