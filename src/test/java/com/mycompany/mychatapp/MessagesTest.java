package com.mycompany.mychatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessagesTest {
    
    public MessagesTest() {
    }

    @Test
    public void testCheckNumGen() {
        int randomNum = 0;
        Messages msTest = new Messages();
        
        System.out.println(msTest.checkNumGen(randomNum));
        
    }

    @Test
    public void testCheckMessage() {
        String message = "Hi Mike, are you coming tonight?";
        Messages msTest = new Messages();
        
        assertTrue(msTest.checkMessage(message));
    }

    @Test
    public void testMenuOptions() {
        int options = 1;
        Messages msTest = new Messages();
        
        System.out.println(msTest.menuOptions(options));
    }

    @Test
    public void testSentMessage() {
        String sent = "Disregard";
        Messages msTest = new Messages();
        
        assertTrue(msTest.sentMessage(sent));
    }

    @Test
    public void testRecipientCellNo() {
        String Rnumber = "+27647384647";
        Messages msTest = new Messages();
        
        System.out.println(Rnumber);
    }

    private void assertTrue(String checkMessage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
