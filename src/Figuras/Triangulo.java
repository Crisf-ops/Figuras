/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;


/**
 *
 * @author Nolosedimetu
 */
public class Triangulo extends Figura{
    
    //Constructor
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    //Atrivutos
    double lado1;
    double lado2;
    double lado3;
    
    //Metodos
    @Override
    public double calcularArea(){
        double area = (lado3*Math.sqrt((lado1*lado2) - ((lado3*lado3)/4)))/2;
        return Math.round(area);
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = lado1 + lado2 + lado3;
        return Math.round(perimetro);
    }
    
    public String imprimir(Object String){
        return "\nTipo: "+tipo()+"\nPerimetro: "+calcularPerimetro()+"\nArea: "+calcularArea();
    }
    
    public String tipo(){
        String resultado;
        if ((lado1+lado2>lado3 && (lado1+lado3)>lado2) && (lado2+lado3)>lado1) {

            //resultado = "Esto es un Triangulo";
            
            if (lado1==lado2 && lado1 == lado3 && lado2==lado3) {

                resultado = "Esto es un Triangulo Equilatero";
            }
            else if (lado1==lado2 || lado1==lado3 || lado2==lado3){

                resultado = "Esto es un Tieangulo Isosceles";
            }
            else{

                resultado ="Esto es un Tieangulo Escaleno";
            }
        }else{

            resultado = "Los lados no corresponden a un Triangulo";
        }
        return resultado;
    }
}
