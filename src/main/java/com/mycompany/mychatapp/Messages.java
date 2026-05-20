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
            System.out.println("You have exceeded 250 characters for your message.");
            
        }
        return message;
    }
    
    public String sentMessage(String sent){
        if(sent.contains("Send")){
            System.out.println("Message sent successfully.");
        }else if(sent.contains("Disregard")){
            System.out.println("Press 0 to delete the message.");
        }else if(sent.contains("Store")){
            System.out.println("Message has been stored.");
        }
        return sent;
    }
    
    public boolean recipientCellNo(String Pnumber) {
        String regexSANumber = "^(\\+27)[0-9]{9}$";
        
         if (Pnumber.contains(regexSANumber) && Pnumber.length() <= 11 ) {
            System.out.println("Cellphone number successfully added");
        }else{
            System.out.println("Cellphone number is incorrectly added");
        }
        return Pnumber != null && Pnumber.matches(regexSANumber);
    }
    
}
