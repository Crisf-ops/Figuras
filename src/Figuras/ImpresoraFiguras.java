/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nolosedimetu
 */
public class ImpresoraFiguras {
    
    Scanner teclado = new Scanner(System.in);
    double ancho,lado1,lado2,lado3,radio;
    
    public void Circulo(){
        
        try {
        System.out.println("Digite el Radio del circulo");
        radio = teclado.nextDouble();
        Circulo ci = new Circulo(radio);
        NumNegativoCir(radio);
        System.out.println("Circulo: "+ci.imprime(ci));
        
        } catch (InputMismatchException e) {
            System.out.println("\nSolo se permiten numeros\n ");
        } catch (NumerosNegativos e){System.out.println("\nSolo se permiten numeros positivos y mayores a cero\n");}

    }
    
    public void Triangulo(){
        
        try {
        System.out.println("Digite lado 1");
        lado1 = teclado.nextDouble();
        System.out.println("Digite lado 2");
        lado2 = teclado.nextDouble();
        System.out.println("Digite lado 3");
        lado3 = teclado.nextDouble();
        Triangulo tri = new Triangulo(lado1, lado2, lado3);
        NumNegativoT(lado1,lado2,lado3);
        System.out.println("Triangulo: "+tri.imprimir(tri));
        
        } catch (InputMismatchException e) {
            System.out.println("\nSolo se permiten numeros\n ");
        } catch (NumerosNegativos e){
            System.out.println("\nSolo se permiten numeros positivos y mayores a cero\n");
        }

    }
    
    public void Cuadrado(){

        try {
        System.out.println("Escriba por favor el ancho del cuadrado");
        ancho = teclado.nextInt();
        Cuadrado cu = new Cuadrado(ancho);
        NumNegativoCu(ancho);
        System.out.println("Cuadrado: "+ cu.imprime(cu));
        
        } catch (InputMismatchException e) {
            System.out.println("\nSolo se permiten numeros\n ");
        }catch (NumerosNegativos e) {  System.out.println("\nSolo se permiten numeros positivos y mayores a cero\n "); }
        
    }
    
    /*Metodos para validar si es numero ingresado es cero o negativo*/
    public void NumNegativoCu(double ancho) throws NumerosNegativos{
        if (ancho <= 0) {
            throw new NumerosNegativos();
        }
    }
    
    public void  NumNegativoT(double lado1,double lado2, double lado3) throws NumerosNegativos{
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new NumerosNegativos();
        }
    }
    
    public static void NumNegativoCir(double radio) throws NumerosNegativos{
        if (radio <= 0) {
           throw new NumerosNegativos();
        }
    }
}
