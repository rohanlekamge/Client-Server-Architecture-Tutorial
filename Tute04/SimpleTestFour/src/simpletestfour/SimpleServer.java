package simpletestfour;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SE2018259
 */
public class SimpleServer {   
    
    ArrayList<TemperatureSample> samples = new ArrayList<TemperatureSample>();
    String fileName = "Sample.ser";
    
    public SimpleServer(){
        try {
            loadFromFile();
        } catch (IOException ex) {
            Logger.getLogger(SimpleServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SimpleServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public boolean isConnected() {
        System.out.println("[SERVER] - Testing if server is connected...");
        return true;
    }
    
    public void addSample(TemperatureSample s) throws IOException{
        System.out.println("[SERVER] - Adding " + s + " to " + samples);
        samples.add(s);
        System.out.println("[SERVER] - Samples are " + samples);
        saveToFile();
    }
    
    private void saveToFile() throws FileNotFoundException, IOException{
        System.out.println("[SERVER] - Saving " + samples + " to file " + fileName);
        
        //Saving of Object in File
        FileOutputStream file = new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(file);
        
        //Method for serialization Object
        out.writeObject(samples);
        
        out.close();
        file.close();
        
        System.out.println("Object has been serialized");
    }
    
    
    private void loadFromFile() throws IOException, ClassNotFoundException{
        System.out.println("[SERVER] - Loading samples from file " + fileName);
        
        //Reading the Object from the file
        FileInputStream file = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(file);
        
        //Method for deserialization of Object
        samples = (ArrayList<TemperatureSample>)in.readObject();
        
        in.close();
        file.close();
    }
}
