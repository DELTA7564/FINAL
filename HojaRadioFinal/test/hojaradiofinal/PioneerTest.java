/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojaradiofinal;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ma. Belen
 */
public class PioneerTest {
    
    public PioneerTest() {
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
     * Test of setESTADO method, of class Pioneer.
     */
    @Test
    public void testSetESTADO() {
        System.out.println("setESTADO");
        boolean estado = false;
        Pioneer instance = new Pioneer();
        instance.setESTADO(estado);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getEstado method, of class Pioneer.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pioneer instance = new Pioneer();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAMFM method, of class Pioneer.
     */
    @Test
    public void testGetAMFM() {
        System.out.println("getAMFM");
        Pioneer instance = new Pioneer();
        int expResult = 0;
        int result = instance.getAMFM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setAMFM method, of class Pioneer.
     */
    @Test
    public void testSetAMFM() {
        System.out.println("setAMFM");
        int amfm = 0;
        Pioneer instance = new Pioneer();
        instance.setAMFM(amfm);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Sintonizar method, of class Pioneer.
     */
    @Test
    public void testSintonizar() {
        System.out.println("Sintonizar");
        boolean ud = true;
        Pioneer instance = new Pioneer();
        instance.Sintonizar(ud);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Guardar method, of class Pioneer.
     */
    @Test
    public void testGuardar() {
        System.out.println("Guardar");
        int pos = 0;
        Pioneer instance = new Pioneer();
        instance.Guardar(pos);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Memoria method, of class Pioneer.
     */
    @Test
    public void testMemoria() {
        System.out.println("Memoria");
        int pos = 0;
        Pioneer instance = new Pioneer();
        instance.Memoria(pos);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEmisora method, of class Pioneer.
     */
    @Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        Pioneer instance = new Pioneer();
        double expResult = 0.0;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
