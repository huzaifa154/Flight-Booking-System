
package lab1;


public class Ticket {
 //Instance Variables  
    private Passenger passenger;
    private Flight flight;
    double price;
    private static int ticketNumber =0;
    
    //Constructor 
    public Ticket (Passenger p, Flight flight, double price) {
        this.passenger = p;
        this.flight = flight;
        this.price = price;
    }
  
// getters and setters for each instance variable
    public Passenger getPassenger() {
        return this.passenger;
    }
    
    public void setPassenger (Passenger p) {
        this.passenger = p;
    }

    public Flight getFlight() {
        return this.flight;
    }
    
    public void setFlight (Flight flight) {
        this.flight = flight;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    

    @Override
    public String toString() {
        return getPassenger().getName() + ", " + flight.toString() + ",ticket Price: " + getPrice();
    }
}
