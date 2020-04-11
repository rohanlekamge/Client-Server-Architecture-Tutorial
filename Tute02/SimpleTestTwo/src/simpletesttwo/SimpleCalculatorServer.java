package simpletesttwo;

import java.util.Arrays;

/**
 *
 * @author Rohan
 */
public class SimpleCalculatorServer {

        public Boolean isServerConnected(){
            System.out.println("[SERVER] - Connection is being tested...");
            return true;
        }
        
        public int[] addIntegerNumbers(int m[], int n[]) throws Exception{
            int length = m.length < n.length ? m.length : n.length;
            int[] result = new int[length];
            
            for (int i = 0; i < length; i++) {
                result[i] = m[i] + n[i];
            }
            
            System.out.println("[SERVER] - Adding " + Arrays.toString(m) + " and " + Arrays.toString(n));
            return result;
        } 
        
        public double[] divideIntegerNumbers(double m[], double n[]) throws Exception{

            int length = m.length < n.length ? m.length : n.length;
            double[] result = new double[length];
            
            for (int i = 0; i < length; i++) {
                //result[i] = m[i] + n[i];
                if(m[i] == 0){
                    throw new Exception();
                }
                if((m[i] == 0) && (n[i] == 0)){
                    throw new Exception();
                }
            }
            
            for (int i = 0; i < length; i++) {
                result[i] = m[i] / n[i];
            }
            
            System.out.println("[SERVER] - Dividing " + Arrays.toString(m) + " and " + Arrays.toString(n) + "...");
            return result;
        }
        
        public int[] subtractIntegerNumbers(int m[], int n[]) throws Exception{
            int length = m.length < n.length ? m.length : n.length;
            int[] result = new int[length];
            
            for (int i = 0; i < length; i++) {
                result[i] = m[i] - n[i];
            }
            
            System.out.println("[SERVER] - Subtracting " + Arrays.toString(m) + " and " + Arrays.toString(n) + "...");
            return result;
        }
        
        public int[] multiplyIntegerNumbers(int m[], int n[]) throws Exception{

            int length = m.length < n.length ? m.length : n.length;
            int[] result = new int[length];
            
            for (int i = 0; i < length; i++) {
                result[i] = m[i] * n[i];
            }
            
            System.out.println("[SERVER] - Multiplying " + Arrays.toString(m) + " and " + Arrays.toString(n) + "...");
            return result;
        }
}
