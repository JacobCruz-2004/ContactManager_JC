/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ice4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jacob
 */
public class ContactManagerTest {
    
    public ContactManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    
    
    
    private ContactManager instance;
    
    @BeforeEach
    public void arraySetup(){
        instance = new ContactManager();
        
        instance.getList().add(new Contact("Jacob", "Cruz", "cruzjac@sheridancollege.ca"));
        instance.getList().add(new Contact("testFirst", "testLast", "testEmail@test.com"));
        instance.getList().add(new Contact("Joe", "smith", "joe@gmail.com"));
        instance.getList().add(new Contact("Tim", "Tim", "tim@gmail.com"));
    }
    @Test
    public void testFindContact1() {
        System.out.println("findContact1 test");
        String emailAddress = "cruzjac@sheridancollege.ca";
        
        Contact expResult = instance.getList().get(0);
        Contact result = instance.findContact(emailAddress);
        assertEquals(expResult, result);}
    
    @Test
    public void testFindContact2() {
        System.out.println("findContact2");
        String emailAddress = "testEmail@test.com";
        
        Contact expResult = instance.getList().get(1);
        Contact result = instance.findContact(emailAddress);
        assertEquals(expResult, result);}
    
    @Test
    public void testFindContact4() {
        System.out.println("findContact4");
        String emailAddress = "joe@gmail.com";
        
        Contact expResult = instance.getList().get(2);
        Contact result = instance.findContact(emailAddress);
        assertEquals(expResult, result);}
    
    
    @Test
    public void testFindContact3() {
        System.out.println("findContact3");
        String emailAddress = "tim@gmail.com";
        
        Contact expResult = instance.getList().get(3);
        Contact result = instance.findContact(emailAddress);
        assertEquals(expResult, result);}
    

   
//    @Test
//    public void testClearContacts() {
//        System.out.println("clearContacts");
//        instance.clearContacts();
//
//    }
    
}
