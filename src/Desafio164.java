import java.util.Scanner;

public class Desafio164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = true;
        while (correcto) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            
            if (x2 < x1 || y2  < y1) {
                correcto = false;
            } else {
                int base = x2 - x1;
                int altura = y2 - y1;
                int area_rectangulo = base * altura;
                System.out.println(area_rectangulo);
            }
        }
        sc.close();
    }
}