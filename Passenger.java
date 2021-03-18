/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Huzaifa Ali
 * 500901727
 * TA: Sunbal Cheema
 * Section: 11
 */
public abstract class Passenger {
//Instance Variables
    private String name; 
    public int age; 
    
    public Passenger(String name, int age){
         //Constructor 
        this.name = name;
        this.age = age; 
    }
    
   
            
            
            
    // getters and setters for each instance variable    
    public String getName(){
        return this.name; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
     public int getAge(){
        return this.age; 
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    
     abstract double applyDiscount(double p);// abstract mthod, thus no body
    
}


