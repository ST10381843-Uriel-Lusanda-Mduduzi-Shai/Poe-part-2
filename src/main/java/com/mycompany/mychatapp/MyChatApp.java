package com.mycompany.mychatapp;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Scanner;

public class MyChatApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String Username;
        String Password;
        String firstName;
        String lastName;
        String Pnumber;
        String Rnumber;
        int option;
        String SEND;
        String message;
        UserLogin user1 = new UserLogin();
        Messages message1 = new Messages();
        
        
        System.out.println("Please  enter your first name:");
        firstName = scan.nextLine();
        System.out.println("Please  enter your last name :");
        lastName = scan.nextLine();
        
        System.out.println("Please  enter your Username:");
        Username = scan.nextLine();
        System.out.println(user1.checkUsername(Username));
        
        System.out.println("Please  enter your Password:");
        Password = scan.nextLine();
        System.out.println(user1.checkPasswordComplexity(Password));
        
        System.out.println("Please  enter your valid SA number :");
        Pnumber = scan.nextLine();
        user1.checkCellPhoneNumber(Pnumber);
       
        System.out.println(user1.registerUser(Username, Password));
        
        System.out.println(user1.loginUser(Username, Password));
        
        System.out.println(user1.returnLoginUser(Username, Password));
        
        System.out.println("Welcome " + firstName + "," + lastName + " " + "it is great to see you again." );
      
        try{ 
            System.out.println("Welcome to QuickChat");
            System.out.println("----QuickChat Menu----");
            System.out.println("Option 1. Send Messages : ");
            System.out.println("Option 2. Show recent mesagges :  ");
            System.out.println("Option 3. Quit : ");
            option = scan.nextInt();
            message1.menuOptions(option);

            System.out.println("Please enter the recipeints cell number");
            Rnumber = scan.nextLine();
            message1.recipientCellNo(Pnumber);


            System.out.println("Type your message");
            message = scan.nextLine();
            message1.checkMessage(message);
            System.out.println("Message ID:" + message1.messageID);

            System.out.println("Type 'Send', 'Store' or 'Disregard' ");
            SEND = scan.nextLine();
            message1.sentMessage(SEND);
            
            ObjectMapper mapper = new ObjectMapper();
            
            String json = mapper.writeValueAsString(message1);
            
            System.out.println(json);
            
        }catch(Exception e){
            System.out.println();
        }
        
    }
    
}
