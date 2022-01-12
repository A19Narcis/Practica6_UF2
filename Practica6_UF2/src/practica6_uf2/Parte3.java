/*
 Escriu una funció anomenada “Maxim” al que se li passa un vector d’enters i 
 ha de tornar el més gran dels números que conté el vector.
*/

package practica6_uf2;

/**
 *
 * @author Narcis & Joan
 */
public class Parte3 {

    public static void main(String[] args) {
        int[] vectores = {8, 2, 4, 9, 1};
        System.out.println(Maxim(vectores));
    }

    static int Maxim(int[] vectores) {
        int maxim = Integer.MIN_VALUE;

        for (int i = 0; i < vectores.length; i++) {
            if (vectores[i] > maxim) {
                maxim = vectores[i];
            }
        }

        return maxim;
    }
}