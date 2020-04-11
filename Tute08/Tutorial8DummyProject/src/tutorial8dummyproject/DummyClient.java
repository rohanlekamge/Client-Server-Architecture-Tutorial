/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial8dummyproject;

/**
 *
 * @author Gab
 */
public class DummyClient 
{
    /**
     * The instance of the dummy server
     */
    DummyServer server = new DummyServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DummyClient client = new DummyClient();
        client.execute();
    }

    private void execute() 
    {
        System.out.println("[CLIENT] - Test Starting...");
        System.out.println("[CLIENT] - Testing if the server is connected...");
        if(server.isConnected())
        {
            System.out.println("[CLIENT] - The server is connected, test can proceed...");
            Double a    =   7.0;
            Double b    =   3.0;
            
            System.out.println("[CLIENT] - Testing the sum...");
            if(server.add(a, b).equals(a+b))
            {
                System.out.println("[CLIENT] - The server has returned the correct sum...");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong sum...");                            
            }

            System.out.println("[CLIENT] - Testing the difference...");
            if(server.subtract(a, b).equals(a-b))
            {
                System.out.println("[CLIENT] - The server has returned the correct difference.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong difference.");                            
            }
        
            System.out.println("[CLIENT] - Testing the multiplication...");
            if(server.multiply(a, b).equals(a*b))
            {
                System.out.println("[CLIENT] - The server has returned the correct product.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong product.");                            
            }

            System.out.println("[CLIENT] - Testing the division...");
            if(server.divide(a, b).equals(a/b))
            {
                System.out.println("[CLIENT] - The server has returned the correct ratio.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong ratio.");                            
            }

            
        }
        else
        {
            System.out.println("[CLIENT] - The server is not connected, test aborted !");
            
        }
        System.out.println("[CLIENT] - Test Completed !");
    }
    
}
