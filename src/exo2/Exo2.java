/*
 * TP0 exercice2
 * Aurélien Zeljko
 * 09/21
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author aurelienzeljko
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb;
        int result;
        int ind;
        //nb=5;
        result=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        
        ind=1;
        while (ind<=nb) {
            result+=ind;
            ind+=1;
        }
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);
        
    } 
    
}
