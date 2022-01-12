/*
 Escriu una funció anomenada “QuiEsIntegrantDAquestGrup” que, rebi com a 
 paràmetre un número enter i, i retorni el membre i-ésim del grup. Si no hi ha 
 membre i-ésim ha de tornar una cadena buida.
 */
package practica6_uf2;

import utils.Utils;

/**
 *
 * @author Narcis & Joan
 */
public class Parte1 {

    public static void main(String[] args) {
        int numero = Utils.LlegirInt("Número: ");
        String integrante = QuiEsIntegrantDAquestGrup(numero);
        System.out.println(integrante);
    }

    static String QuiEsIntegrantDAquestGrup(int num) {

        String nom;

        switch (num) {
            case 1:
                nom = "Joan";
                break;
            case 2:
                nom = "Narcis";
                break;
            default:
                nom = "";
                break;
        }

        return nom;
    }

}
