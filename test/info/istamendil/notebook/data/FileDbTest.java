/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info.istamendil.notebook.data;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nazar
 */
public class FileDbTest {
    
    public FileDbTest() {
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

    @Test
    public void testSave() throws Exception {
        System.out.println("save");
        Object[] obj = {"aas","sss"};
        FileDb instance = null;
        instance.save(obj[0]);
        instance.save(obj[1]);
        assertArrayEquals(instance.findAll(), obj);
    }

    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        FileDb instance = null;
        Object[] expResult = null;
        Object[] result = instance.findAll();
        assertArrayEquals(expResult, result);
    }
    
}
