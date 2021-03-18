/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Huzaifa Ali
 * 500901727
 * TA: Sunbal Cheema
 * Section: 11
 */

public class Manager {

    ArrayList<Flight> flights = new ArrayList<Flight>();
    
   
    public void createFlights() {

       Scanner scanner = new Scanner(System.in);// takes input of flight details and stores in memory 
    System.out.println("Enter flight number: "); 
    int flightNum=scanner.nextInt();
    System.out.println("Enter the origin: ");
    scanner.nextLine();
    String origin=scanner.nextLine();
    System.out.println("Enter the destination: ");
    String destination= scanner.nextLine();
    System.out.println("Enter the departure date: ");
    String departureTime=scanner.nextLine();
    System.out.println("Enter the capacity: ");
    int capacity=scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the original price: ");
    double originalPrice=scanner.nextDouble();
    
    Flight flight= new Flight(flightNum, origin, destination,departureTime, capacity , originalPrice);// creates flight object
    flights.add(flight); 
    }
    
   
    public void displayAvailableFlights (String origin, String destination) {// finds if there are available flights matching to origin to destination, and seats left
        for (Flight flight: flights) {
            if ((flight.getNumOfSeatsLeft() > 0) || ((flight.getDestination().equals(destination)) && (flight.getOrigin().equals(origin)))) {
                System.out.println(flight.toString());// if available, will show details about the flight
            }
            
            else {
                System.out.println("No flights were available");// if not, outputs "There are no matches found"
            }
        }
    }

 
    public Flight getFlight (int flightNum) {//checks if flight number matches the flight number inputted
        for (Flight flight: flights) {
            if (flight.getFlightNum() == flightNum) {
                return flight;
            }
        }
        return null;
    }
 
 
    public void bookSeat (int flightNum, Passenger p) {// books the seat depending on ticket and discounts
        for (Flight flight: flights) {
            if (flight.getFlightNum() == flightNum) {
                double price = p.applyDiscount(flight.getOriginalPrice());// create price with dedicated discount
                Ticket ticket = new Ticket(p, flight, price);
                System.out.println(ticket.toString());
            }
        }
    }
    
  
    public static void main(String[] args) {
        Scanner scannerMain = new Scanner(System.in);//object to scan what the input 
        Manager manager = new Manager();
        System.out.println("Testing the createFlight method");
        manager.createFlights();
        
        System.out.println("Please enter a flight number from the flight added above: ");
        int flightNum = scannerMain.nextInt();
        System.out.println(manager.getFlight(flightNum));
        
        System.out.println("Entering the flight path");
         scannerMain.nextLine();
        System.out.println("Enter the flight origin: ");
        String origin=scannerMain.nextLine();

        System.out.println("Enter the flight destination: ");
        String destination= scannerMain.nextLine();
        manager.displayAvailableFlights(origin, destination);
        
         System.out.println("Creating the booking method");
        System.out.println("Enter your name: ");
        String name=scannerMain.nextLine();
        System.out.println("Enter your age: ");
        int age= scannerMain.nextInt();
        System.out.println("Type 1 if you are a member, or 2 if you are a non-member");
        int option=scannerMain.nextInt();
        
        if (option == 1) {// if user types 1 and enters years of membership, it will spply discount 
           System.out.println("How long have you been a member?");
            int yearsOfMembership = scannerMain.nextInt();
            Member member = new Member (name, age, yearsOfMembership);
            System.out.println("Enter the flight number of the flight you want to book");
            flightNum = scannerMain.nextInt();
            manager.bookSeat(flightNum, member);
        }
        
        if (option == 2) {// if user types 2, it will not spply discount unless over the age of 65 years old
            System.out.println("Enter the flight number of the flight you want to book");
            flightNum = scannerMain.nextInt();
            NonMember nonMember = new NonMember (name, age);
            manager.bookSeat(flightNum, nonMember);
        }
    }
}
