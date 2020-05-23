/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexcesarmoya
 */
public class FuncionesTest {
    
    public FuncionesTest() {
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
     * Test of oper method, of class Funciones.
     */
    @Test
    public void testOper() {
        System.out.println("oper");
        Character value = null;
        boolean expResult = false;
        boolean result = Funciones.oper(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parentesis method, of class Funciones.
     */
    @Test
    public void testParentesis() {
        System.out.println("parentesis");
        Character value = null;
        boolean expResult = false;
        boolean result = Funciones.parentesis(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of negative method, of class Funciones.
     */
    @Test
    public void testNegative() {
        System.out.println("negative");
        Character value = null;
        boolean expResult = false;
        boolean result = Funciones.negative(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jerarquia method, of class Funciones.
     */
    @Test
    public void testJerarquia() {
        System.out.println("jerarquia");
        String signo = "";
        int expResult = 0;
        int result = Funciones.jerarquia(signo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertidor method, of class Funciones.
     */
    @Test
    public void testConvertidor() {
        System.out.println("convertidor");
        String str = "";
        char expResult = ' ';
        char result = Funciones.convertidor(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastCharacter method, of class Funciones.
     */
    @Test
    public void testRemoveLastCharacter() {
        System.out.println("removeLastCharacter");
        String str = "";
        String expResult = "";
        String result = Funciones.removeLastCharacter(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elPaso method, of class Funciones.
     */
    @Test
    public void testElPaso() {
        System.out.println("elPaso");
        String str = "";
        ArrayList expResult = null;
        ArrayList result = Funciones.elPaso(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of postfix method, of class Funciones.
     */
    @Test
    public void testPostfix() {
        System.out.println("postfix");
        ArrayList arr1 = null;
        ArrayList expResult = null;
        ArrayList result = Funciones.postfix(arr1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of evaluar method, of class Funciones.
     */
    @Test
    public void testEvaluar() {
        System.out.println("evaluar");
        ArrayList arr = null;
        double expResult = 0.0;
        double result = Funciones.evaluar(arr);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parentesisVacios method, of class Funciones.
     */
    @Test
    public void testParentesisVacios() {
        System.out.println("parentesisVacios");
        String str = "";
        boolean expResult = false;
        boolean result = Funciones.parentesisVacios(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operadoresJuntos method, of class Funciones.
     */
    @Test
    public void testOperadoresJuntos() {
        System.out.println("operadoresJuntos");
        String str = "";
        boolean expResult = false;
        boolean result = Funciones.operadoresJuntos(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operadorAntesYDespueseParantesis method, of class Funciones.
     */
    @Test
    public void testOperadorAntesYDespueseParantesis() {
        System.out.println("operadorAntesYDespueseParantesis");
        String str = "";
        boolean expResult = false;
        boolean result = Funciones.operadorAntesYDespueseParantesis(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of revisaParentesis method, of class Funciones.
     */
    @Test
    public void testRevisaParentesis() {
        System.out.println("revisaParentesis");
        String txt = "";
        boolean expResult = false;
        boolean result = Funciones.revisaParentesis(txt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Funciones.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Funciones.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
