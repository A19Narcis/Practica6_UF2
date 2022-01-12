/*
 Escriu una funció anomenada “QuiEsIntegrantDAquestGrup” que, rebi com a 
 paràmetre un número enter i, i retorni el membre i-ésim del grup. Si no hi ha 
 membre i-ésim ha de tornar una cadena buida.
*/

package practica6_uf2;

import utils.Utils;

/**
 *
 * @author Narcis
 */
public class Parte1 {

    public static void main(String[] args) {
        String[] membres = {"''", "Narcis", "PersonaX"};
        int numero = Utils.LlegirInt("Número: ");
        int integrante = QueEsIntegrantDAquestGrup(numero, membres);
        System.out.println(membres[integrante]);
    }

    static int QueEsIntegrantDAquestGrup(int numero, String[] membres) {
        int result;

        final int ESPAI = 0;
        
        if (numero > membres.length || numero <= 0) {
            result = ESPAI;
        } else {
            result = numero;
        }

        return result;
    }

}