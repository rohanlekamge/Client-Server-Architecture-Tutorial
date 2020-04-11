package simpletestthree;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rohan
 */
public class SimpleClient {

    public static void main(String[] args) {
        SimpleClient simpleClient = new SimpleClient();
        simpleClient.executeTest();
    }
    
    private void executeTest(){
        SimpleTemperatureRecorderServer server = new SimpleTemperatureRecorderServer();
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The Server is connected, the test can proceed...\n");
            try {
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());  
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
                System.out.println("[CLIENT] - The number of recorded temperature is " + server.getNumberOfSamples() + "\n");
            try {    
                server.addTemperature(10.0,"C");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperature is " + server.getNumberOfSamples() + "\n");
                server.addTemperature(270.0,"K");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperatures are " + server.getNumberOfSamples() + "\n");
                server.addTemperature(12.0,"F");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperatures are " + server.getNumberOfSamples() + "\n");
                server.addTemperature(-0.1,"C");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperatures are " + server.getNumberOfSamples() + "\n");
                server.addTemperature(-18.0,"C");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperatures are " + server.getNumberOfSamples() + "\n");
                server.addTemperature(18.0,"F");
                System.out.println("[CLIENT] - The minnimum recorded temperature is " + server.getColdestTemperature());
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHottestTemperature());
                System.out.println("[CLIENT] - The average temperature is " + server.getAverageTemperature());
                System.out.println("[CLIENT] - The number of recorded temperatures are " + server.getNumberOfSamples() + "\n");
                //server.addTemperature(new Double((10)));
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("[CLIENT] - The Server is NOT connected, the test has failed...");
        }
    }
    
}
