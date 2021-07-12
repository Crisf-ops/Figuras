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
public class NumerosNegativos extends Exception {

    /**
     * Creates a new instance of <code>NumerosNegativos</code> without detail
     * message.
     */
    public NumerosNegativos() {
    }

    /**
     * Constructs an instance of <code>NumerosNegativos</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NumerosNegativos(String msg) {
        super(msg);
    }
}
