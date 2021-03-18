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
public class Member extends Passenger{
    //Instance Variable
        public int  yearsOfMembership;
        
        
       
    public Member(String name, int age,int yearsOfMembership ) {
         //Constructor inherited from Passenger class
        super(name, age);
        this.yearsOfMembership= yearsOfMembership;
    }

   
   
    
    @Override
    double applyDiscount(double p) {
        if (yearsOfMembership > 5){ // if person has membership for more than 5 years , member will get 50% discount 
           System.out.println("50% discount will be applied");
           return p*0.5; 
        }
        else if(yearsOfMembership > 1 && yearsOfMembership  <= 5  ){ // if person has membership for less than or equal to 5 years but more than 1 year, member will get 10% discount 
            System.out.println("10% discount will be applied");
            return p * 0.9; 
        }
        else{
            System.out.println("no discount can be applied"); // if person has membership for less than 1 year , member will get no discount 
            return p;
        }
          
    }
        
}     
