package com.mycompany.mychatapp;

public class Messages {
    private int totalMessages;
    private String message;
    private String sentMessage;
    private String recipientCellNo;
    private String messageHash;
    private String status;
    
    long min = 1000000000L;
    long max = 9999999999L;
        
    long messageID = (long) (Math.random()*(max - min + 1) + min);
    
    //random 10 digit number generator checker
    public boolean checkNumGen(int messageID){
        if(messageID <= 10){
            return true;
        }else{
            return false;
        }
    }
    
    public String checkMessage(String message){
        if(message.length() <= 250){
            System.out.println("Message is ready to be sent.");
        }else{
            System.out.println("You have exeeded 250 characters for your message.");
            
        }
        return message;
    }
    
}
