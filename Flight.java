
package lab1;

public class Flight {
//Instance Variables
    private int flightNum; 
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numOfSeatsLeft;
    private double originalPrice;
   
 //Constructor without numOfSeatsLeft variables
    public Flight(int flightNum, String origin, String destination, String departureTime, int capacity, double  originalPrice){
        this.flightNum = flightNum; 
        this.origin = origin; 
        this.destination = destination; 
        this.departureTime = departureTime; 
        this.capacity = capacity; 
        this.originalPrice = originalPrice; 
    }
  
// getters and setters for each instance variable
     public int getFlightNum() {
        return this.flightNum;
    }
    
    public void setFlightNum (int flightNum) {
        this.flightNum = flightNum;
    }
    public String getOrigin () {
        return this.origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    public String getDestination () {
        return this.destination;
    }
    
    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public String getDepartureTime () {
        return this.departureTime;
    }
    
    public void setDepartureTime (String departureTime) {
        this.departureTime = departureTime;
    }
    
    
    public int getCapacity () {
        return this.capacity;
    }
    
    public void setCapacity (int capacity) {
        this.capacity = capacity;
    }
    
    public int getNumOfSeatsLeft () {
        return this.numOfSeatsLeft;
    }
    
    public void setNumOfSeatsLeft (int numOfSeatsLeft) {
        this.numOfSeatsLeft = numOfSeatsLeft;
    }
    
    public double getOriginalPrice() {
        return this.originalPrice;
    }
    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
    
    // decrements number of seats left if seat is booked
    public boolean bookASeat () {
        if (numOfSeatsLeft > 0) {
            numOfSeatsLeft--;
            return true;
        }
        
        else {
            return false;
        }
    }
    
   // throws illegal argument exception if origin is equal to destination
     public int getDestination(String destination)throws IllegalArgumentException {
        if(destination.equals(origin)) {
         throw new IllegalArgumentException();
          
        }
       return 0;
    }


    @Override
    public String toString() {
        return "Flight " + getFlightNum() + ", " + getOrigin() + " to " + getDestination() + ", " + getDepartureTime() + ", original price: $" + getOriginalPrice();
    }
}
