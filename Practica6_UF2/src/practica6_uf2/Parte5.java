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
        int maximCD = mcd_euclides(n1, n2);
        System.out.println("MCD --> " + maximCD);
    }

    static int mcd_euclides (int a,int b){
        
        int residu=1;
        int aux=0;
        
        while (residu>0) {
            residu=a%b;
            
            a=b;
            b=residu;
            
            if (residu!=0){
                aux=residu;
            } 
        }
        
        return aux;
    }
}
