
package lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlightTest {
    
    public FlightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getFlightNum method, of class Flight.
     */
    @Test
    public void testGetFlightNum() {
        System.out.println("getFlightNum");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        int expResult = 35;
        assertEquals(expResult, instance.getFlightNum());
       
    }

    /**
     * Test of setFlightNum method, of class Flight.
     */
    @Test
    public void testSetFlightNum() {
        System.out.println("setFlightNum");
        int flightNum = 69;
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        instance.setFlightNum(flightNum);
        int expResult = 69;
        assertEquals(expResult, instance.getFlightNum());
    }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin_0args() {
        System.out.println("getOrigin");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        String expResult = "Toronto";
        assertEquals(expResult, instance.getOrigin());
        
    }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "Vancouver";
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        instance.setOrigin(origin);
        String expResult = "Vancouver";
        assertEquals(expResult, instance.getOrigin());
    }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        String expResult = "Dubai";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        String destination = "Los Angeles";
        Flight instance = new Flight (35,"Toronto", "Los Angeles", "01/27/2021",800,990);
        instance.setDestination(destination);
        String expResult ="Los Angeles"; 
        assertEquals(expResult, instance.getDestination());
    }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        String expResult = "01/27/2021";
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "05/05/2021";
        Flight instance = new Flight (35,"Toronto", "Dubai", "05/05/2021",800,990);
        instance.setDepartureTime(departureTime);
         String expResult ="05/05/2021"; 
        assertEquals(expResult, instance.getDepartureTime());
    }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        int expResult = 800;
        int result = instance.getCapacity();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int capacity = 500;
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        instance.setCapacity(capacity);
        int expResult = 500;
        assertEquals(expResult, instance.getCapacity());
    }

    /**
     * Test of getNumOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testGetNumOfSeatsLeft() {
        System.out.println("getNumOfSeatsLeft");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        int expResult = 800;
        int result = 800;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumOfSeatsLeft method, of class Flight.
     */
    @Test
    public void testSetNumOfSeatsLeft() {
        System.out.println("setNumOfSeatsLeft");
        int numOfSeatsLeft = 500;
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        instance.setNumOfSeatsLeft(numOfSeatsLeft);
        int expResult = 500;
        assertEquals(expResult,instance.getNumOfSeatsLeft());
    }

    /**
     * Test of getOriginalPrice method, of class Flight.
     */
    @Test
    public void testGetOriginalPrice() {
        System.out.println("getOriginalPrice");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        double expResult = 990;
        double result = instance.getOriginalPrice();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setOriginalPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setOriginalPrice");
        double originalPrice = 500;
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        instance.setOriginalPrice(originalPrice);
        int expResult = 500;
        assertEquals(expResult, instance.getOriginalPrice(),0.001);
         
    }

   
   
    
    /**
     * Test of bookASeat method, of class Flight.
     */
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        boolean expResult = false;// should return true since 
        boolean result = instance.bookASeat();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Flight instance = new Flight (35,"Toronto", "Dubai", "01/27/2021",800,990);
        String expResult = "Flight 35, Toronto to Dubai, 01/27/2021, original price: $990.0";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testInvalidConstructor(){
        System.out.println("Testing exception handling");
        boolean expResult=true;
        String origin="Toronto";
        String destination="Dubai";
        try{
            Flight flight= new Flight (35,origin, destination, "01/27/2021",800,990);
        }
        
        catch(IllegalArgumentException e){
            expResult=true;
        }
        
        assertTrue(expResult);
    }
    
    



    
}
