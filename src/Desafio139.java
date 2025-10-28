import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Desafio139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = sc.nextInt();
        
        while (entrada != 0) {
            Set<Integer> conjunto = new TreeSet<>();
            //boolean cubifinito = false;
            conjunto.add(entrada);

            if (entrada == 1) 
                System.out.println(entrada + " -> cubifinito.");
            else {
                System.out.print(entrada + " - ");                
                int valor = entrada;
        
                while (true) {
                    int suma = 0;
                    while (valor > 0) {
                        suma += Math.pow((valor % 10), 3);
                        valor /= 10;
                    }

                    if (suma == 1)  {
                        System.out.println(suma + " -> cubifinito.");
                        break;
                    }
                    else if (conjunto.contains(suma)) {
                        System.out.println(suma + " -> no cubifinito.");
                        break;
                    }
                    else {
                        conjunto.add(suma);
                        valor = suma;
                        System.out.print(suma + " - ");
                    }
                }
                
            }
            
            entrada = sc.nextInt(); 
        }

        sc.close();
    }
}