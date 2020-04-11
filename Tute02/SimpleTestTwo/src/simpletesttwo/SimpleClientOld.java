package simpletesttwo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rohan
 */
public class SimpleClientOld {
    
    double z;
            
    SimpleCalculatorServerOld server = new SimpleCalculatorServerOld();
    
    public static void main(String[] args){
        SimpleClientOld simpleClientOld = new SimpleClientOld();
        simpleClientOld.execute();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Testig if the serber is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can proceed...");
        } else {
            System.out.println("[CLIENT] - The client is NOT connected, the test has failed...");
        }
    }
    
    private void execute(){
        System.out.println("[CLIENT] - Testig if the server is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - Server IS CONNECTED, test can proceed...");
            
            //Testing Addig Method
            double x = 2;
            double y = 3;
            System.out.println("[CLIENT] - Asking the server what is the sum of " + x + " and " + y);
            try {
                z = server.addIntegerNumbers(x,y);
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - The server has replied that the sum of " + x + " and " + y + " is " + z);
            if(z == x+y){
                System.out.println("[CLIENT] - The server has returned the correct answer\n");
            } else {
                System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
            }
            
            //Testing Devide Method
            x = 4;
            y = 0;
            System.out.println("[CLIENT] - Asking the server what is the division of " + x + " and " + y);
            try {
                z = server.divideIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the division of " + x + " and " + y + " is " + z);
                if(z == x/y){
                    System.out.println("[CLIENT] - The server has returned the correct answer\n");
                } else {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            //Testing Subtract Method
            x = 4;
            y = 3;
            System.out.println("[CLIENT] - Asking the server what is the subtraction of " + x + " and " + y);
            try {
                z = server.subtractIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the subtraction of " + x + " and " + y + " is " + z);
                if(z == x*y){
                    System.out.println("[CLIENT] - The server has returned the correct answer\n");
                } else {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            //Testing Multiply Method
            x = 4;
            y = 2;
            System.out.println("[CLIENT] - Asking the server what is the multiplication of " + x + " and " + y);
            try {
                z = server.multiplyIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the multiplication of " + x + " and " + y + " is " + z);
                if(z == x*y){
                    System.out.println("[CLIENT] - The server has returned the correct answer\n");
                } else {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else {
            System.out.println("[CLIENT] - Server is NOT CONNECTED, test CANNOT proceed...");
        }
    }
}
