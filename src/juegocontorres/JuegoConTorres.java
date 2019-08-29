/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegocontorres;

/**
 *
 * @author migue
 */

public class JuegoConTorres {
    
    public String [] construir (int R, int C, int N){
        
        String [][] ajedrez = new String [R][C];
        
      String [] ataque = {""};
      
      if (R < 1 ){
         System.out.print("Error: El valor de R es menor a 1");
         if(R>50){
             System.out.print("Error: El valor de R es mayor a 50");
             if(C<1){
                 System.out.print("Error: El valor de C es menor a 1");
                 if (C>50){
                    System.out.print("Error: El valor de C es mayor a 50");
                 }
             }
         }
      }   
           for (int i = 0; i < R; i++){
            for (int j = 0; j < C; j++){
                int Residuo = (i + j) %2;
                if(Residuo == 0){ 
                    
                    ajedrez [i][j]="W";              
                }else {
                    ajedrez [i][j]="B";
                }
             }
           }
        
        for (int i=0; i < R; i++){
            for (int j = 0; j < C; j++) {
                System.out.print(" " +ajedrez [i][j]);
            }
            System.out.print("\n");
        }
        return ataque;

    }
     
     
}



