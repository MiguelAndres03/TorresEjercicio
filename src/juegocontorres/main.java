/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocontorres;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class main {
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        construirajedrez();
     
    }
 
    private static void construirajedrez(){

        JuegoConTorres juegoTorres = new JuegoConTorres(); 
        Scanner reader = new Scanner(System.in);
        int R,C,S;
        System.out.println("Ingrese R");
        R = reader.nextInt();
         System.out.println("Ingrese C");
        C = reader.nextInt();
          int N=C*R;
    
        String[] resultado = juegoTorres.construir (R, C, N);
       
        imprimirResultado(resultado);
    }
    
         private static void imprimirResultado (String[] respuesta){
    System.out.print("{");
    for (int i = 0; 1< respuesta.length; i++){
        if (i == (respuesta.length-1)){
                System.out.print("\""+ respuesta[i]+ "\"");
            }else{
                System.out.print("\""+ respuesta[i]+ "\"");
            }
        
            System.out.print(" }\n");
        }
    }
    
  
}
