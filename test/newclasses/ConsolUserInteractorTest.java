/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclasses;

import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nazar
 */
public class ConsolUserInteractorTest {
    
    public ConsolUserInteractorTest() {
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
     * Test of readCommand method, of class ConsolUserInteractor.
     */
    @Test
    public void testReadCommand() throws Exception {
        System.out.println("readCommand");
        ConsolUserInteractor instance = new ConsolUserInteractor();
        String expResult = "sss";
        instance.sc = new Scanner(expResult); 
        String result = instance.readCommand();
        assertEquals(expResult, result);
    }


//    @Test
//    public void testPrint() throws Exception {
//        System.out.println("print");
//        String output = "";
//        ConsolUserInteractor instance = new ConsolUserInteractor();
//        instance.print(output);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
