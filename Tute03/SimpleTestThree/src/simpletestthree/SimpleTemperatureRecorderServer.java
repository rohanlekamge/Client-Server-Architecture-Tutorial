package simpletestthree;

import java.util.ArrayList;

/**
 *
 * @author Rohan
 */
public class SimpleTemperatureRecorderServer {
    
    ArrayList<Double> temperatures = new ArrayList<Double>();
    public Boolean isServerConnected(){
        System.out.println("[SERVER] - Connection is being tested...");
        return true;
    }
    
    public void addTemperature(Double sample, String scale) throws Exception{
        if (sample < -273 || sample > 10000){
            throw new Exception();
        }
        Double finalSample = 0.0;
        if(scale == "C"){
            finalSample = sample;
        } else if(scale == "F") {
            finalSample = (sample-32)*5/9;
        } else if(scale == "K"){
            finalSample = sample - 273.15;
        }
        System.out.println("[SERVER] - Adding sample: " + sample);
        temperatures.add(finalSample);
        System.out.println("[SERVER] - All samples now are: " + temperatures);
    }
    
    public Double getColdestTemperature() throws Exception{
        //Double min = 0.0;
        if(temperatures.size() == 0){
                throw new Exception();
        }
        Double min = temperatures.get(0);
        for(int index = 0; index < temperatures.size(); index++){
            if(min > temperatures.get(index)){
                min = temperatures.get(index);
            }
        }
        return min;
    }
    
    public Double getHottestTemperature() throws Exception{
        //Double high = 0.0;
        if(temperatures.size() == 0){
                throw new Exception();
        }
        Double high = temperatures.get(0);
        for(int index = 0; index < temperatures.size(); index++){
            if(high < temperatures.get(index)){
                high = temperatures.get(index);
            }
        }
        return high;
    }
    
    public Double getAverageTemperature() throws Exception{
        //Double average = 0.0;
        if(temperatures.size() == 0){
                throw new Exception();
        }
        Double total = 0.0;
        Double average = temperatures.get(0);
        for(int index = 0; index < temperatures.size(); index++){
            total = total + temperatures.get(index); 
        }
        average = total/temperatures.size();
        return average;
    }
    
    public int getNumberOfSamples(){
        int total = 0;
        for(int index = 0; index < temperatures.size(); index++){
            total = total + 1; 
        }
        return total;
    }
}
