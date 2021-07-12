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
public class Cuadrado extends Figura{

    //Constructor
    public Cuadrado(double ancho) {
        this.ancho = ancho;
    }
    
    //Atributo
     double ancho;
     
     
    
    //Metodos
    @Override
    public double calcularArea(){
        double are = Math.pow(ancho, 2);
        return are;
    }
    
    @Override
    public double calcularPerimetro(){
        double per = ancho * 4;
        return per;
    }


    public String imprime(Object String){
        return "\nPerimetro: "+calcularPerimetro()+"\nArea: "+calcularArea();
    }
}
