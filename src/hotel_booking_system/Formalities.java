//Java class for hotle booking system 
//
//Java class that is used for the formalities 
//Deals with the introductions and the exit of the program 


package hotel_booking_system;


public class Formalities {
    
    //Making a method in this class that will introduce the program:
    public static String Intro() {
        System.out.println("Hello and welcome to the new hotel booking system"); 
        System.out.println("You will be able to book your room through this program"); 
        System.out.println("");
        System.out.println("Here are the prices per night:");
        System.out.println("Single Room -- £50");
        System.out.println("Double Room -- £75");
        System.out.println("Family Room -- £105");
        System.out.println("");
        System.out.println("Self Catering -- £0");
        System.out.println("Half Board -- £10");
        System.out.println("Full Board -- £20"); 
        System.out.println("");
        System.out.println("");
        System.out.println("*Note* there is a 20% discount for each day that you stay for over a week");
        System.out.println("");
        System.out.println("");
        return "";
        
    }
    
    public static String Outro() {
      System.out.println("Thank you for using the new booking system");
      System.out.println("Enjoy your stay at the hotel"); 
        return "";
      
    }
    
  
 
    
}
