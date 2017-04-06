/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegit;


import java.util.Scanner;

/**
 *
 * @author daw124
 */
public class codegit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=0;    
    System.out.println("Introducir un numero para comprobar");
    n=sc.nextInt();
    
    if(n%2==0){
        System.out.println("El numero "+n+" es par");
    }
    else{
        System.out.println("El numero "+n+" es NO ES PAR");
    }
    
    }
    
}
