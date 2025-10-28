import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int[][] cuadrado = new int[n][n];
            Set<Integer> conjunto = new HashSet<>();
            int cm = 0;
            int cm2 = 0;
            int sumL1 = 0;
            int sumL2 = 0;
            int sumL3 = 0;
            int sumL4 = 0;
            int sumD1 = 0;
            int sumD2 = 0;
            boolean esoterico = true;
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int num = sc.nextInt();
                    if (!conjunto.add(num)) esoterico = false;
                    else conjunto.add(num);
                    cuadrado[i][j] = num;
                    if (num > (n * n) || num < 1 ) esoterico = false;
                    if (i == 0) sumL1 += num;
                    if (j == n-1) sumL2 += num;
                    if (i == n-1) sumL3 += num;               
                    if (j == 0) sumL4 += num;
                    if (i == j) sumD1 += num;
                    if (i + j == n-1) sumD2 += num;
                }
            }
            if (sumL1 == sumL2 && sumL2 == sumL3 && sumL3 == sumL4 && sumL4 == sumD1 && sumD1 == sumD2) {
                cm = sumL1;
                cm2 = (4 * cm) / n;
                if (esoterico) {
                    if ((cuadrado[0][0] + cuadrado[n-1][n-1] + cuadrado[0][n-1] + cuadrado[n-1][0]) != cm2) 
                        esoterico = false;
                    else {
                        if (n % 2 != 0) {
                            if ((cuadrado[n/2][n/2] * 4) != cm2 || cuadrado[n/2][0] + cuadrado[0][n/2] + cuadrado[n-1][n/2] + cuadrado[n/2][n-1] != cm2) 
                                esoterico = false;
                        } else {
                            if (cuadrado[0][(n/2)-1] + cuadrado[0][n/2] + cuadrado[(n/2)-1][n-1] + cuadrado[n/2][n-1] + cuadrado[n-1][(n/2)-1] + cuadrado[n-1][n/2] + cuadrado[(n/2)-1][0] + cuadrado[n/2][0] != 2*cm2 || cuadrado[n/2][n/2] + cuadrado[n/2][(n/2)-1] + cuadrado[(n/2)-1][n/2] + cuadrado[(n/2)-1][(n/2)-1] != cm2) {
                                esoterico = false;
                            }
                        }
                    }
                }
                if (!esoterico) 
                    System.out.println("DIABOLICO");
                else
                    System.out.println("ESOTERICO");

            } else System.out.println("NO");
            
            n = sc.nextInt();
        }
        sc.close();
    }
}