/*
 Escriu una funció “MCD_Euclides” que retorni el màxim comú divisor de dos 
 números segons l’algorisme d’Euclides. Aquest algorisme el podeu trobar 
 detallat a https://ca.wikipedia.org/wiki/Algorisme_d%27Euclides 
 */
package practica6_uf2;

/**
 *
 * @author Narcis
 */
public class Parte5 {

    public static void main(String[] args) {
        int n1 = 656;
        int n2 = 848;
        int maximCD = MCD_Eucalides(n1, n2);
        System.out.println("MCD --> " + maximCD);
    }

    static int MCD_Eucalides(int n1, int n2) {
        float result;

        if (n1 > n2) {
            result = n1 / n2;
            while (result % 1 != 0) {
                result = n2 / result;
                n2 = (int) result;
            }

        } else if (n1 < n2) {
            do {
                result = (float) n2 / n1;
                if (n2 % n1 != 0) {
                    result = n1 * (int) result;
                    result = n2 - result;
                }
            } while (n1 % result != 0);

        } else {
            result = n1 / n2;
        }

        return (int) result;
    }
}