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
public class DummyServer 
{
    /**
     * 
     * @return true if the server is connected, false otherwise
     */
    public Boolean isConnected()
    {
        return true;
    }
    /**
     * 
     * @param a the first addendum
     * @param b the second addendum
     * @return the sum of a and b
     */
    public Double add(Double a, Double b)
    {
        System.out.println("[SERVER] - " + a + " + " + b + " = " + (a+b));
        return a+b;
    }
    /**
     * 
     * @param a the minuend
     * @param b the subtrahend
     * @return the difference of a and b
     */
    public Double subtract(Double a, Double b)
    {
        System.out.println("[SERVER] - " + a + " - " + b + " = " + (a-b));
        return a-b;
    }
    
    /**
     * 
     * @param a the multiplicand
     * @param b the multiplier
     * @return the product of the a and b
     */
    public Double multiply(Double a, Double b)
    {
        System.out.println("[SERVER] - " + a + " * " + b + " = " + (a*b));
        return a*b;
    }

    /**
     * 
     * @param a the dividend
     * @param b the divisor
     * @return a divided by b
     */
    public Double divide(Double a, Double b)
    {
        System.out.println("[SERVER] - " + a + " / " + b + " = " + (a/b));
        return a/b;
    }
}
