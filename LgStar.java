/*
* Name: Kollin Labowski
* Date: December 5, 2020
* Academic Integrity Statement: This program complies with the academic integrity
* requirements for WVU and for CS 310
*/

import java.lang.Math;

public class LgStar
{
    //Main method
     public static void main(String []args)
     {
        System.out.println(lgstar(70000, 4));
        System.out.println(lgstar(70000, 3));
        System.out.println(lgstar(70000));
        System.out.println(lgstar(8));
     }
     
     /*
     * This case of the method is for when both parameters are defined
     * by the user (or when neither parameter is a variable)
     */
     public static boolean lgstar(double N, int Iterations)
     {
        if(N <= 1)
            return Iterations == 0;
        double newN = Math.floor(Math.log(N)/Math.log(2));
        return lgstar(newN, Iterations - 1);
     }
     
     /*
     * Ths case of the method is for when the number of iterations is
     * not provided by the user
     */
     public static int lgstar(double N)
     {
        return lgstarcount(N, 0);
     }
     
     /*
     * A private helper method used by the second lgstar method to
     * calculate the number of iterations there should be for the
     * expression to evaluate as true
     */
     private static int lgstarcount(double N, int counter)
     {
        if(N <= 1)
            return counter;
        double newN = Math.floor(Math.log(N)/Math.log(2));
        return lgstarcount(newN, counter + 1);
     }
}