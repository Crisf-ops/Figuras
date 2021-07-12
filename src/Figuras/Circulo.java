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

public class Circulo extends Figura{
    
    //Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //Atributos
    double radio;

    //Metodos
    @Override
    public double calcularArea(){
        double area = Math.pow(radio, 2);
        area = area * 3.14;
        return Math.round(area);
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro =  Math.round(radio * 2 * 3.14);
        return perimetro;
    }
    
    public String imprime(Object String){
        return "\nPerimetro: "+calcularPerimetro()+"\nArea: "+calcularArea();
    }
}
