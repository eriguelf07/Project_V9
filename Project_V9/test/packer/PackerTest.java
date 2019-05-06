/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packer;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Frank Eriguel - 91030193
 */
public class PackerTest {
    
    public PackerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of packProducts method, of class Packer.
     */
    @Test
    public void testPackProducts() {
        //--------------------ADDED A FEW DATA UP HERE TO MAKE THE THE TEST WORK
        System.out.println("packProducts");
        //CUSTOMERS
        Coordinates testCoordinates1 = new Coordinates(3,4);
        Address testAddress1 = new Address("1 First St", "Aplace", "Citadel City", "A111", testCoordinates1);
        Customer c1 = new Customer("C1",testAddress1);
        //CUSTOMER2
        Coordinates testCoordinates2 = new Coordinates(30,40);
        Address testAddress2 = new Address("123 Count St", "Brooklyn", "Welling Town", "B222", testCoordinates2);
        Customer c2 = new Customer("C2",testAddress2);
        //CUSTOMER3
        Coordinates testCoordinates3 = new Coordinates(300, 400);
        Address testAddress3 = new Address("321 Back St", "Christly", "Holly Oaks", "C333", testCoordinates3);
        Customer c3 = new Customer("C3",testAddress3);
        
        //DEPOT
        Coordinates testCoordinates0 = new Coordinates(0,0);
        Address testAddress0 = new Address("111 Emerge Rd", "Really", "Inn Town", "D444", testCoordinates0);
        Depot d = new Depot("Test Depot", testAddress0);
        //RUNNING OUT OF TIME!
        //MANIFEST1
        Manifest m1 = new Manifest();
        //MANIFEST2
        Manifest m2 = new Manifest();
        //MANIFEST3
        Manifest m3 = new Manifest();
        
        
        //--------------------
        //TEST1
        List<Box> expResult1 = Packer.packProducts(c1, d, m1);
        List<Box> result1 = Packer.packProducts(c1, d, m1);
        assertEquals(expResult1, result1);
        //TEST2
        List<Box> expResult2 = Packer.packProducts(c2, d, m2);
        List<Box> result2 = Packer.packProducts(c2, d, m2);
        assertEquals(expResult2, result2);
        //TEST3
        List<Box> expResult3 = Packer.packProducts(c3, d, m3);
        List<Box> result3 = Packer.packProducts(c3, d, m3);
        assertEquals(expResult3, result3);
    }
    
}
