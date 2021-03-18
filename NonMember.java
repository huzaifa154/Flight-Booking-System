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
public class NonMember extends Passenger {
    
    public NonMember(String name, int age) {
        //Constructor inherited from Passenger class
        super(name, age);
    }
    
    @Override
    double applyDiscount(double p) {
        if(age >= 65){ // if person is older than 65 years old, , person will get 10% discount 
            System.out.println("10% discount will be applied");
            return p*0.9; 
        } else{// if person is younger than 65 years old, , person will get no discount 
            System.out.println("no discount can be applied");
            return p; 
        }
            
    }
    
}
