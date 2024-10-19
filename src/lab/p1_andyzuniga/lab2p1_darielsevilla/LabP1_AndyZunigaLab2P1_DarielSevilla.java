/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.p1_andyzuniga.lab2p1_darielsevilla;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class LabP1_AndyZunigaLab2P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Numeros comunes en multiplicacion");
            System.out.println("2. Juego de suerte");
            System.out.println("3. Llenar el trapecio");
            System.out.println("4. Salida");
            System.out.println("Elija una opcion: ");
            opcion = input.nextInt();
            
            switch (opcion){
                    case 1 -> {                       
                        int num1 = getUserInput(input,"Introduzca el primer numero entre 1-12: ");
                        int num2 = getUserInput(input,"Introduzca el segundo numero entre 1-12: ");
                        showCommonNumbers(num1, num2);
                }
                    case 3 -> {
                        System.out.println("Que tan completo deseas el trapecio?");
                        System.out.println("1. 25%");
                        System.out.println("2. 50%");
                        System.out.println("3. 75%");
                        System.out.println("4. 100%"); 
                        int porcentaje = input.nextInt();
                        
                        int rows = 8;
                        int Indexrows = 0;
                        
                        while (Indexrows < rows ){
                            int columnas = rows - (Indexrows - (rows - 1)/2);
                            
                            int printedColumnas = 0;
                            
                            int IndexColumnas = 0;
                            
                            
                            while (IndexColumnas < columnas){
                                int completacion = (printedColumnas * 100) / (columnas - 1);
                                if (completacion <= porcentaje){ 
                                    System.out.printf((IndexColumnas + 1 > (rows - 1)/2 && Indexrows + IndexColumnas + 1 > rows) ? "*" : " ");
                                    printedColumnas++;
                                } else {
                                    System.out.print("*");
                                }
                                
                                IndexColumnas++;
                            }
                            
                            System.out.println();
                            Indexrows++;
                        }
                        break;
                        
                    }
                      
            }
        } while (4!=opcion); 
    }
    
    private static int getUserInput(Scanner input, String message){
        int numero;
        do {
            System.out.println(message);
            numero = input.nextInt();
        } while (numero < 1 || numero > 12);
        return numero;
    }
    
    private static void showCommonNumbers(int num1, int num2) {
        System.out.print("_");
        int i = 1;
        while (i <= 12 ){
            int producto1 = num1 * i;
            boolean esComun = false;
            int j = 1;
            while (j <= 12){
                int producto2 = num2 * j;
                if (producto1 == producto2){
                    esComun = true;
                    break;
                }
                j++;
            }
            if (esComun){
                System.out.printf("%-4d",producto1 );
            } else {
                System.out.print("_");
            }
            i++;
        }
        System.out.println();
    }
}
