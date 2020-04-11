package simpletesttwo;

/**
 *
 * @author Rohan
 */
public class SimpleCalculatorServerOld {

        public boolean isServerConnected(){
            System.out.println("[SERVER] - Connection is being tested...");
            return true;
        }
        
        public double addIntegerNumbers(double a, double b) throws Exception{
            
            System.out.println("[SERVER] - Adding " + a + " and " + b);
            return a+b;
        } 
        
        public double divideIntegerNumbers(double a, double b) throws Exception{
            if(b == 0){
                throw new Exception();
            }
            
            if((b == 0) && (a == 0)){
                throw new Exception();
            }
            
            System.out.println("[SERVER] - Dividing " + a + " and " + b + "...");
            return a/b;
        }
        
        public double subtractIntegerNumbers(double a, double b) throws Exception{
            
            System.out.println("[SERVER] - Subtracting " + a + " and " + b + "...");
            return a-b;
        }
        
        public double multiplyIntegerNumbers(double a, double b) throws Exception{
            
            System.out.println("[SERVER] - Multiplying " + a + " and " + b + "...");
            return a*b;
        }
}
