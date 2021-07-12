/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertSame;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Nolosedimetu
 */
public class ImpresoraFigurasTest {
    
    public ImpresoraFigurasTest() {
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
     * Test of Circulo method, of class ImpresoraFiguras.
     */
    @Test
    public void testCirculo() {
        System.out.println("Circulo");

        double radio = 5;
        Circulo instance = new Circulo(radio);
        instance.imprime(instance);
        
        String expResult = "\nPerimetro: "+instance.calcularPerimetro()+"\nArea: "+instance.calcularArea();
        String result = instance.imprime(instance);
        
        Assert.assertTrue(expResult.contains(result));

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Triangulo method, of class ImpresoraFiguras.
     */
    @Test
    public void testTriangulo() {
        System.out.println("Triangulo");
        double lado1 = 4;
        double lado2 = 4;
        double lado3 = 4;
        
        Triangulo instance = new Triangulo(lado1, lado2, lado3);
        instance.imprimir(instance);
        
        String expResult = "\nTipo: "+instance.tipo()+"\nPerimetro: "+instance.calcularPerimetro()+"\nArea: "+instance.calcularArea();
        String result = instance.imprimir(instance);
        
        Assert.assertTrue(expResult.contains(result));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Cuadrado method, of class ImpresoraFiguras.
     */
    @Test
    public void testCuadrado() {
        System.out.println("Cuadrado");
        
        double ancho = 10;
        
        Cuadrado instance = new Cuadrado(ancho);
                
        String expResult = "\nPerimetro: "+instance.calcularPerimetro()+"\nArea: "+instance.calcularArea();
        String result = instance.imprime(instance);
        
        Assert.assertTrue(expResult.contains(result));
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of NumNegativoCu method, of class ImpresoraFiguras.
     */
    @Test
    public void testNumNegativoCu() throws Exception {
        System.out.println("NumNegativoCu");
        double ancho = 5;
        
        ImpresoraFiguras instance = new ImpresoraFiguras();
        instance.NumNegativoCu(ancho);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of NumNegativoT method, of class ImpresoraFiguras.
     */
    @Test
    public void testNumNegativoT() throws Exception {
        System.out.println("NumNegativoT");
        double lado1 = 4;
        double lado2 = 4;
        double lado3 = 4;
        
        ImpresoraFiguras instance = new ImpresoraFiguras();
        instance.NumNegativoT(lado1, lado2, lado3);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of NumNegativoCir method, of class ImpresoraFiguras.
     */
    @Test
    public void testNumNegativoCir() throws Exception {
        System.out.println("NumNegativoCir");
        double radio = 5;
        
        ImpresoraFiguras.NumNegativoCir(radio);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
