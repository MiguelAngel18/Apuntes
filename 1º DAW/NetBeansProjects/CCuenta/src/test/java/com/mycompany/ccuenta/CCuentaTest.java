/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ccuenta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author migue
 */
public class CCuentaTest 
{
    
    public CCuentaTest() 
    {
    }

    /**
     * Test of ingresar method, of class CCuenta.
     */
    @org.junit.jupiter.api.Test
    public void testIngresar() 
    {
        System.out.println("ingresar");
        double cantidad = 100.0;
        CCuenta instance = new CCuenta();
        int expResult = 0;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testIngresar2() 
    {
        System.out.println("ingresar");
        double cantidad = -3.0;
        CCuenta instance = new CCuenta();
        int expResult = 2;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testIngresar3() 
    {
        System.out.println("ingresar");
        double cantidad = -100.0;
        CCuenta instance = new CCuenta();
        int expResult = 1;
        int result = instance.ingresar(cantidad);
        assertEquals(expResult, result);
    }
}