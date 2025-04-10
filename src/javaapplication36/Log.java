/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication36;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Log {
     private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String CellphoneNumber;
    
    
    
 public Log(String firstName,String lastName,String username,String password,String CellphoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.CellphoneNumber = CellphoneNumber;
        
        
 }   
   public boolean checkUserName(String username){
       String regex =("^(?=._).{1,5}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
   
         return matcher.matches();
         
         
   }
        public boolean checkpasswordcomplexity(String password){
       String regex =("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,20}$");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        
        return matcher.matches();
        }
       public boolean checkCellphoneNumber(String CellphoneNumber){
           String regex = ("^\\+27\\d{9}$");
          Pattern pattern = Pattern.compile(regex);
          Matcher matcher = pattern.matcher(CellphoneNumber);
          
          return matcher.matches();
       } 
        public String registerUser(){
        if(checkUserName(username)&& checkpasswordcomplexity(password)&&checkCellphoneNumber(CellphoneNumber)){
            return "Registration is successfull";
        }else{
            return "Registration is unsuccessful";
        }
        }
        public boolean loginUser(String username,String password){
         return this.username.equals(username)&& this.password.equals(password);
    }
    public String returnLoginStatus(String username,String password,String firstName,String lastName){
        if (loginUser(username,password)){
            return "Welcome" + firstName + (",")+ lastName + "it is great to see you again";
        }else{
            return "Login is unsuccessfully";
            
        }
        }
        
}
