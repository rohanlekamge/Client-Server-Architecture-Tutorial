/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial5client;

/**
 *
 * @author Rohan
 */
public class Tutorial5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tutorial5Client client = new Tutorial5Client();
        client.executeTest();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Executing connection test");
        if(isConnected()){
            System.out.println("[CLIENT] - Server is connected test can continue...");
        } else {
            System.out.println("[CLIENT] - Server is not connected, test has failed!");
        }
    }

    private static Boolean isConnected() {
        tutorial5client.SimpleWebService_Service service = new tutorial5client.SimpleWebService_Service();
        tutorial5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }
    
}
