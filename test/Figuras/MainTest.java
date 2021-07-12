/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import org.hamcrest.Matcher;
import static org.hamcrest.core.Is.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nolosedimetu
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
    
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        
        int opcion = -5;
        double radio = 5;
        double ancho = 5;
        double lado1 = 6;
        double lado2 = 6;
        double lado3 = 6;
        
        
        switch (opcion){
            
            case 1:
                try {
                    if(radio > 0){
                        Circulo cir = new Circulo(radio);
                        cir.imprime(cir);
                    }
                }catch(Exception e){
                        assertThat(e.getMessage(),is("Error"));
                        }
            break;
            
            case 2:
                try {
                    if(ancho > 0){
                        Cuadrado cua = new Cuadrado(ancho);
                        cua.imprime(cua);
                    }
                }catch(Exception e){
                        assertTrue(e.getMessage(),is("Error"));
                        }
            break;
            
            case 3:
                try {
                    if(lado1 > 0 && lado2 > 0 && lado3 > 0){
                        Triangulo ti = new Triangulo(lado1, lado2, lado3);
                        ti.imprimir(ti);
                    }
                }catch(Exception e){
                        assertTrue(e.getMessage(),is("Error"));
                        }
            break;
            default:
                System.out.print("opcion no valida \n \n");
            break;
            
        }
        
        //String[] args = null;
        //Main.main(args);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    private void assertTrue(String message, Matcher<String> is) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
