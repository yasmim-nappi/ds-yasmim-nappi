import java.util.Scanner;
public class Input {
      public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String userName;
        
        System.out.println("Entre seu nome: "); 
        userName = myObj.nextLine();   
           
        System.out.println("Olá " + userName +'!');        
      }
    }
