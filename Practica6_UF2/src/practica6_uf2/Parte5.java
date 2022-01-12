/*
 Escriu una funció “MCD_Euclides” que retorni el màxim comú divisor de dos 
 números segons l’algorisme d’Euclides. Aquest algorisme el podeu trobar 
 detallat a https://ca.wikipedia.org/wiki/Algorisme_d%27Euclides 
 */
package practica6_uf2;

/**
 *
 * @author Narcis & Joan
 */
public class Parte5 {

    public static void main(String[] args) {
        int n1 = 656;
        int n2 = 848;
        int maximCD = MCD_Euclides(n1, n2);
        System.out.println("MCD --> " + maximCD);
    }

    static int MCD_Euclides(int n1, int n2) {
        int result;

        if (n2 == 0) {
            result = n1;
        } else {
            result = MCD_Euclides(n2, n1 % n2);
        }
        return result;
    }
}
