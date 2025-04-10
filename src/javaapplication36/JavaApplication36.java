/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication36;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class JavaApplication36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner (System.in);
        System.out.print("Enter firstName ");
        String firstName = scanner.nextLine();
         System.out.print("Enter lastName ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter username ");
        String username = scanner.nextLine();
      
        System.out.print("Enter password ");
        String password = scanner.nextLine();
      
        System.out.print("Enter CellphoneNumber  ");
        String CellphoneNumber = scanner.nextLine();
        
        Log login = new Log(firstName,lastName,username,password,CellphoneNumber);
        String registrationMessage = login.registerUser();
        
        System.out.println(registrationMessage);
        
      if(login.checkUserName(username)){
       System.out.println ("username successfully captured.");
      }else{
        System.out.println("username is not correctly formatted,please endure that your username contain an underscore and is no more than five characters in length");
      }
      if(login.checkpasswordcomplexity(password)){
          System.out.println("password successfully");
      }else{
           System.out.println("password is not correctly formatted;please ensure that the password contains at least eight characters,a capital letter,a number,and a special character");
    }
      if(login.checkCellphoneNumber(CellphoneNumber)){
          System.out.println("cell phone number successfully added");
      }else{
          System.out.println("cell phone number incorrectly formatted or does not contain international code");
      }
      if (registrationMessage.contains("Successfully")){
             System.out.println("\n====Login=== ");
              System.out.print("Enter username ");
              String loginUsername = scanner.nextLine();
              
               System.out.print("Enter password ");
               String loginpassword = scanner.nextLine();
               
                System.out.print("Enter firstName ");
                String logfirstName = scanner.nextLine();
              
               System.out.print("Enter lastName ");
               String loglastName = scanner.nextLine();
               
               
              String loginStatus = login.returnLoginStatus(username, password, firstName, lastName);
              System.out.println(loginStatus);
      }    
      
          
    } 
    
}
