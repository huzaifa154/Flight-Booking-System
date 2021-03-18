
package lab1;

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


