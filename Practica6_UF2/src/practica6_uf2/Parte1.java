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
        int numero = Utils.LlegirInt("Número: ");
        String integrante = quiEsIntegrantDAquestGrup(numero);
        System.out.println(integrante);
    }

    static String quiEsIntegrantDAquestGrup (int num){
        
        String nom;
        
        if (num==1){
            nom="Joan";
        }
        else if (num==2){
            nom="Narcis";
        }
        else{
            nom="";
        }
        
        return nom;
    }

}