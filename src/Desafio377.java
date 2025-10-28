import java.math.BigInteger;
import java.util.Scanner;

public class Desafio377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String num = sc.nextLine();
            BigInteger base = new BigInteger(num,10);
            String num_hex = base.toString(16);
    
            char ultimo = num_hex.charAt(num_hex.length()-1);

            if (ultimo == '0' || ultimo == '1' || ultimo == '4' || ultimo == '9') {
                System.out.println("NO SE");
            } else {
                System.out.println("IMPERFECTO");
            }    
        }
        sc.close();
    }
}