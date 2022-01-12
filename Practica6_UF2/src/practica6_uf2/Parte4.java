/*
 Escriu un procediment anomenat “Dau” que escrigui per pantalla un enter a 
 l’atzar que estigui comprès entre 1 i 6.
*/

package practica6_uf2;

/**
 *
 * @author Narcis
 */
public class Parte4 {

    public static void main(String[] args) {
        Dau();
    }
    
    static void Dau() {
        System.out.println((int) (Math.random() * 6 + 1));
    }
}