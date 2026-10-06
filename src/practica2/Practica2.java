/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author PC
 */

public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner t = new Scanner (System.in);
        
        int n;
        double precio, subt=0, total, descu=0;
        
        System.out.print("Ingrese n numeros de articulos :");
        n = t.nextInt();
        
        for(int i=0; i<n; i++)
        {
            System.out.print("Ingrese el precio " + (i+1) + ": $");
            precio = t.nextDouble();
            
            subt = subt + precio;
        }
        if(subt >= 300)
        {
            descu = subt * 0.15;
            System.out.println("Tiene un descuento del 15%");
            
        }else if(subt >= 200)
        {
            descu = subt * 0.1;
            System.out.println("Tiene un descuento del 10%");
            
        }else if(subt >= 100)
        {
            descu = subt * 0.05;
            System.out.println("Tiene un descuento del 5%");
        }else 
        {
            System.out.println("No tiene descuento");
        }
        
        total = subt - descu;
        
        System.out.println("El total a pagar es: $" + total);
        
        
      t.close();
    }
    
}
