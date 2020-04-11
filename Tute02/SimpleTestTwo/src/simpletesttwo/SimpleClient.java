package simpletesttwo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rohan
 */
public class SimpleClient {
    
    int[] k;
    double[] l;
            
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    
    public static void main(String[] args){
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.execute();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Testig if the serber is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The Server is connected, the test can proceed...");
        } else {
            System.out.println("[CLIENT] - The Server is NOT connected, the test has failed...");
        }
    }
    
    private void execute(){
        System.out.println("[CLIENT] - Testig if the server is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - Server IS CONNECTED, test can proceed...");
            
            //Testing Addig Method
            int m[]  = {1,2,0};
            int n[]  = {3,4,5};
            System.out.println("[CLIENT] - Asking the server what is the sum of " + Arrays.toString(m) + " and " + Arrays.toString(n));
            try {
                k = server.addIntegerNumbers(m,n);
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("[CLIENT] - The server has replied that the sum of " + Arrays.toString(m) + " and " + Arrays.toString(n) + " is " + Arrays.toString(k));
            if(k == k){
                System.out.println("[CLIENT] - The server has returned the correct answer\n");
            } else {
                System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
            }
            
            //Testing Devide Method
            double q[]  = {1,2,3,5};
            double r[]  = {3,0,4,0};
            System.out.println("[CLIENT] - Asking the server what is the division of " + Arrays.toString(q) + " and " + Arrays.toString(r));
            try {
                l = server.divideIntegerNumbers(q,r);
                System.out.println("[CLIENT] - The server has replied that the division of " + Arrays.toString(q) + " and " + Arrays.toString(r) + " is " + Arrays.toString(k));
                if(k == k){
                    System.out.println("[CLIENT] - The server has returned the correct answer\n");
                } else {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            //Testing Subtract Method
            int a[]  = {1,2,3};
            int b[]  = {3,4,5};
            System.out.println("[CLIENT] - Asking the server what is the subtraction of " + Arrays.toString(a) + " and " + Arrays.toString(b));
            try {
                k = server.subtractIntegerNumbers(a,b);
                System.out.println("[CLIENT] - The server has replied that the subtraction of " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is " + Arrays.toString(k));
                if(k == k){
                    System.out.println("[CLIENT] - The server has returned the correct answer\n");
                } else {
                    System.out.println("[CLIENT] - The server has returned the WRONG answer\n");
                }
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            //Testing Multiply Method
            int x[]  = {1,2,3};
            int y[]  = {3,4,5};
            System.out.println("[CLIENT] - Asking the server what is the multiplication of " + Arrays.toString(x) + " and " + Arrays.toString(y));
            try {
                k = server.multiplyIntegerNumbers(x,y);
                System.out.println("[CLIENT] - The server has replied that the multiplication of " + Arrays.toString(x) + " and " + Arrays.toString(y) + " is " + Arrays.toString(k));
                if(k == k){
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
