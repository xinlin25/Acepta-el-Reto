import java.util.Scanner;

public class Desafio178 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < casos; i++) {
            String titular = sc.nextLine().toLowerCase();
            String mensaje = sc.nextLine().toLowerCase().replace(" ", "");
            int indice = 0;
            int num = 0;
            String contiene = "SI";
            
            for (int j = 0; j < mensaje.length(); j++){
                char letra = mensaje.charAt(j);

                indice = titular.indexOf(letra,num);
                   
                if (indice == -1) {
                    contiene = "NO";
                    break;
                } else {
                    num = indice + 1;
                }
            }
            System.out.println(contiene);
        }
        sc.close();
    }
}