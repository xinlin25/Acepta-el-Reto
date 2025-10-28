import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Desafio141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String secuencia = sc.nextLine();
            boolean balanceado = true;
            Deque<Character> pila = new ArrayDeque<>();
            
            for (char caracter : secuencia.replace(" ", "").toCharArray()) {
                if (caracter == '(' ||caracter == '{' ||caracter == '[') 
                    pila.push(caracter);
                else if (pila.isEmpty() && (caracter == ')' ||caracter == '}' ||caracter == ']')) {
                    balanceado = false;
                    break;
                } else if (caracter == ')' ||caracter == '}' ||caracter == ']') {
                    if (caracter == ')' && pila.pop() != '(') {
                        balanceado = false;
                        break;
                    } else if (caracter == '}' && pila.pop() != '{') {
                        balanceado = false;
                        break;
                    } else if (caracter == ']' && pila.pop() != '[') {
                        balanceado = false;
                        break;
                    }
                } 
            }
            if(!pila.isEmpty())
                balanceado = false;
            if (balanceado) 
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
        sc.close();
    }
}