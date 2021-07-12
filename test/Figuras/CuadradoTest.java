/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

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
public class CuadradoTest {
    
    public CuadradoTest() {
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
     * Test of calcularArea method, of class Cuadrado.
     */
    @Test
    public void testCalcularArea() {
        System.out.println("calcularArea");
        double ancho = 15;
        
        Cuadrado instance = new Cuadrado(ancho);
        double expResult = 225;
        
        double result = instance.calcularArea();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of calcularPerimetro method, of class Cuadrado.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        double ancho = 15;
        
        Cuadrado instance = new Cuadrado(ancho);
        double expResult = 60;
        
        double result = instance.calcularPerimetro();
        assertEquals(expResult, result, 0.0);
    }
}
