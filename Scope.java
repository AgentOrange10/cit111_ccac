/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chad.lemasters
 */
public class Scope {
    
    private static int numCalls = 0;
    
    public static void main(String[] args){
        
        printStatement();
        
    }
    
    public static void printStatement(){
        
        System.out.println("All work and no play makes Jack a dull boy");
        numCalls = numCalls + 1;
        System.out.println("Total Calls: " + numCalls);
    }
}
