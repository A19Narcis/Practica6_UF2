/*
 Escriu un funció anomenada “Inicials” que rebi com a paràmetre una frase i 
 torni un string amb les inicials de cada paraula convertides a majúscules.
 Exemple: Inicials(“Escriu una funció anomenada Inicials”) ha de tornar “EUFAI”. 
 */
package practica6_uf2;

import utils.Utils;

/**
 *
 * @author Narcis
 */
public class Parte6 {

    public static void main(String[] args) {
        String frase = Utils.LlegirString("Frase: ");
        String inicialsParaulesFrase = Inicials(frase);
        System.out.printf("Inicials de les paraules de la frase --> %s\n", inicialsParaulesFrase);
    }

    static String Inicials(String frase) {
        String result;

        char[] carac = new char[frase.length()];

        for (int i = 0; i < carac.length; i++) {
            if (i == 0 || (frase.charAt(i - 1) == ' ')) {
                carac[i] = frase.charAt(i);
            }
        }

        result = String.valueOf(carac).toUpperCase();

        return result;
    }

}