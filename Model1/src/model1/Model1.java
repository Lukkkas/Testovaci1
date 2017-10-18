/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model1;

import java.util.Scanner;

/**
 *
 * @author Pracovni
 */
public class Model1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // inicializace promennych
        Scanner sc = new Scanner(System.in,"Windows-1250");
        String vstup = sc.nextLine();
        System.out.printf("Puvodni zprava: %s\n" , vstup);
        String zprava = "";
        int posun = 1;
        
        // cyklus projizdejici jednotlive znaky
        for (char c : vstup.toCharArray()) {
            int i = (int)c;
            i += posun;
            // kontrola preteceni
            if (i > (int)'z') {
                i -= 26;
            }
            char znak = (char)i;
            zprava += znak;
        }
        // vypis
        System.out.printf(" Zasifrovana zprava: %s\n" , zprava);
        
        }
    }
    

