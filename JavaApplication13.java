/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double vo, tiempo, acel, dis;
       Scanner capturar = new Scanner(System.in);
     System.out.println("Velocidad inicial (m/s):" );
     vo = capturar.nextDouble();
     System.out.println("Tiempo (s):" );
     tiempo = capturar.nextDouble();
     System.out.println("Aceleracion (m/s):" );
     acel = capturar.nextDouble();
     
     dis= vo * tiempo +(acel*(tiempo*tiempo)/2 );
            
     
     System.out.println("La distancia (m) es:" + dis);
    }

    }
    