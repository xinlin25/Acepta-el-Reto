import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio146 {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();

        while (entrada != 0) {

            for (int i = 1; i < entrada + 1; i++) {
                lista1.add(i);
            }
            
            int num = 2;

            while (num <= lista1.size()) {
                for (int i = 0; i < lista1.size(); i++) {
                    if (i % num != 0) {
                        lista2.add(lista1.get(i));
                    }
                }
                lista1.clear();
                lista1.addAll(lista2);
                lista2.clear();
                num++;
            }

            System.out.print(entrada + ":");

            for (int i = lista1.size() - 1; i >= 0; i--) {
                System.out.print(" " + lista1.get(i));
            }

            System.out.println();
            lista1.clear();
            entrada = sc.nextInt();
        }
        sc.close();
    }
}