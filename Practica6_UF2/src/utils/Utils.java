/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 * Llibreria d'utilitats
 *
 * @author Narcís
 * @version 1.0
 *
 */
public class Utils {
// <editor-fold defaultstate="collapsed" desc="Implementació de LlegirInt()">

    private static Scanner scan = null;

    /**
     *
     * @return Creació d'un scanner en cas que no hi hagi cap.
     */
    public static int LlegirInt() {
        int result;

        if (scan == null) {
            scan = new Scanner(System.in);
        }
        result = LlegirInt(scan);

        return result;
    }

    /**
     *
     * @param missatge És el missatge que es mostra abans de la resposta de
     * l'usuari
     * @return Mostra el número que ha introduït l'usuari.
     */
    public static int LlegirInt(String missatge) {
        int result;

        if (scan == null) {
            scan = new Scanner(System.in);
        }
        result = LlegirInt(scan, missatge);

        return result;
    }

    public static String LlegirString(String missatge) {
        String result;

        if (scan == null) {
            scan = new Scanner(System.in);
        }
        result = LlegirString(scan, missatge);

        return result;
    }

    /**
     *
     * @param scan Utilitzant l'escàner creat abans llegeix el missatge
     * introduït per l'usuari
     * @return Torna un escànner per que l'usuari pugui introduïr un valor
     */
    public static int LlegirInt(Scanner scan) {
        return LlegirInt(scan, null);
    }

    public static String LlegirString(Scanner scan) {
        return LlegirString(scan, null);
    }

    /**
     *
     * @param scan És l'escàner
     * @param missatge El missatge que rep l'usuari
     * @param valorMin El valor <b>MÍNIM</b> del rang de números (3)
     * @param valorMax El valor <b>MÀXIM</b> del reng de números (8)
     * @return Si és un número entre 3-8 continua, si no, torna a preguntar
     */
    public static int LlegirInt(Scanner scan, String missatge, int valorMin, int valorMax) {
        int result = 0;
        do {
            result = LlegirInt(scan, missatge);
        } while (result < valorMin || result > valorMax);

        return result;
    }

    /**
     *
     * @param scan És l'escàner
     * @param missatge És el missatge que es mostra per pantalla
     * @return Comprova el valor de l'usuari. Si és vàlid el mostra si no, torna
     * a mostrar el missatge.
     */
    public static int LlegirInt(Scanner scan, String missatge) {
        boolean dadesCorrectes;
        int result = 0;
        do {
            if (missatge != null) {
                System.out.print(missatge);
            }
            dadesCorrectes = scan.hasNextInt();
            if (dadesCorrectes) {
                result = scan.nextInt();
            } else if (scan.hasNext()) {
                scan.nextLine();
            }
        } while (!dadesCorrectes);

        return result;
    }

    public static String LlegirString(Scanner scan, String missatge) {
        String result;

        if (missatge != null) {
            System.out.print(missatge);
        }

        result = scan.nextLine();

        return result;
    }

// </editor-fold>
}