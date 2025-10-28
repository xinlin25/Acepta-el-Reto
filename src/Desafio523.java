import java.util.Scanner;

public class Desafio523 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();

        String matricula1, matricula2;
        String numero1, numero2, letras1, letras2;
        int viejos, nuevos;

        for (int i = 0; i < casos; i++) {

            matricula1 = sc.next();
            numero1 = matricula1.substring(0, 4);
            letras1 = matricula1.substring(4, 7);

            nuevos = viejos = 0;

            matricula2 = sc.next();
            while (!matricula2.equals("0")) {
                numero2 = matricula2.substring(0, 4);
                letras2 = matricula2.substring(4, 7);

                if (letras1.equals(letras2)) {
                    if (numero2.compareTo(numero1) < 0) viejos++;
                    else nuevos++;
                } else {
                    if (letras1.compareTo(letras2) < 0) nuevos++;
                    else viejos++;
                }

                matricula2 = sc.next(); 
            }

            System.out.println( viejos + " " + nuevos );
        }
        sc.close();
    }
}