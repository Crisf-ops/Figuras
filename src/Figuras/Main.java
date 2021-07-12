package Figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ImpresoraFiguras impreme = new ImpresoraFiguras();

        int opcion;
        try{
            do { 

                System.out.print(" ----------------- BIENVENIDO ----------------- \n");
                System.out.print("1) Cuadrado \n"+"2) Circulo \n"+"3) Tiangulo \n"+
                        "4) Salir \n"+"Escoja una opcion del 1 - 4 \n");
                
                opcion = teclado.nextInt();

                        switch(opcion){
                        case 1:
                        impreme.Cuadrado();
                        break;

                        case 2:
                        impreme.Circulo();
                        break;

                        case 3:
                        impreme.Triangulo();
                        break;

                        case 4:
                        System.exit(0);
                        break;

                        default:
                        System.out.print("opcion no valida \n \n");
                        break;
                        }
                        
            } while (opcion >= 4); 
        }catch(InputMismatchException e){
            System.out.println("Debe ingresar solo NUMEROS del 1 - 4");
        }
    }
}