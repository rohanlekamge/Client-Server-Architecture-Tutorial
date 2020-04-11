/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial8client;

/**
 *
 * @author Rohan
 */
public class Tutorial8Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tutorial8Client client = new Tutorial8Client();
        client.executeTest();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Test Starting...");
        System.out.println("[CLIENT] - Testing if the server is connected...");
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected test can continue...");
            System.out.println("[CLIENT] - The server is connected, test can proceed...");
            Double a    =   7.0;
            Double b    =   3.0;
            
            System.out.println("[CLIENT] - Testing the sum...");
            if(add(a, b).equals(a+b))
            {
                System.out.println("[CLIENT] - The server has returned the correct sum...");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong sum...");                            
            }

            System.out.println("[CLIENT] - Testing the difference...");
            if(subtract(a, b).equals(a-b))
            {
                System.out.println("[CLIENT] - The server has returned the correct difference.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong difference.");                            
            }
        
            System.out.println("[CLIENT] - Testing the multiplication...");
            if(multiply(a, b).equals(a*b))
            {
                System.out.println("[CLIENT] - The server has returned the correct product.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong product.");                            
            }

            System.out.println("[CLIENT] - Testing the division...");
            if(divide(a, b).equals(a/b))
            {
                System.out.println("[CLIENT] - The server has returned the correct ratio.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong ratio.");                            
            }
        } else {
            System.out.println("[CLIENT] - Server is not connected, test has failed!");
        }
        System.out.println("[CLIENT] - Test Completed !");
    } 

    private static Double add(java.lang.Double a, java.lang.Double b) {
        tutorial8client.Tutorial8WebService_Service service = new tutorial8client.Tutorial8WebService_Service();
        tutorial8client.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.add(a, b);
    }

    private static Double divide(java.lang.Double a, java.lang.Double b) {
        tutorial8client.Tutorial8WebService_Service service = new tutorial8client.Tutorial8WebService_Service();
        tutorial8client.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.divide(a, b);
    }

    private static Double multiply(java.lang.Double a, java.lang.Double b) {
        tutorial8client.Tutorial8WebService_Service service = new tutorial8client.Tutorial8WebService_Service();
        tutorial8client.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.multiply(a, b);
    }

    private static Double subtract(java.lang.Double a, java.lang.Double b) {
        tutorial8client.Tutorial8WebService_Service service = new tutorial8client.Tutorial8WebService_Service();
        tutorial8client.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.subtract(a, b);
    }

    private static Boolean isConnected() {
        tutorial8client.Tutorial8WebService_Service service = new tutorial8client.Tutorial8WebService_Service();
        tutorial8client.Tutorial8WebService port = service.getTutorial8WebServicePort();
        return port.isConnected();
    }
    
}
