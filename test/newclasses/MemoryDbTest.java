/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newclasses;

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
public class MemoryDbTest {
    
    public MemoryDbTest() {
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
        Object obj = "ss";
        Object[] actual = {obj};
        MemoryDb instance = new MemoryDb();
        instance.save(obj);
        assertArrayEquals(instance.findAll() , actual);         
    }

    @Test
    public void testSaveInNull() throws Exception {
        System.out.println("save in null");
        Object obj = "ss";
        Object[] actual = {obj};
        MemoryDb instance = new MemoryDb();
        instance = null;
        instance.save(obj);
        assertArrayEquals(instance.findAll() , actual);         
    }
    
    @Test
    public void testSave2() throws Exception {
        System.out.println("save 2");
        Object[] obj = {"ss","sss", 5};
        MemoryDb instance = new MemoryDb();
        for(Object val : obj){
            instance.save(val);
        }
        assertArrayEquals(instance.findAll() , obj);         
    }
    
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        
    }
    
}
