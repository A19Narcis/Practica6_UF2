/*
 Escriu un procediment anomenat “PrintReverseString” al que se li passa un 
 string i el torna del revés
*/

package practica6_uf2;

import utils.Utils;

/**
 *
 * @author Narcis & Joan
 */
public class Parte2 {

    public static void main(String[] args) {
        String frase = Utils.LlegirString("");
        PrintReverseString(frase);
    }

    static void PrintReverseString(String frase) {
        char[] caracters = frase.toCharArray();

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(caracters[i]);
        }

        System.out.println("");

    }

}