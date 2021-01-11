//HOTEL BOOKING SYSTEM:
//
//The hotel needs a new booking system for their rooms 
//The hotel offers a discount of 20% off the daily rate for each day that 
//you stay over 1 week 
//
//1. ask user what room they want 
//2. ask what board they would like 
//3. ask how many days they would like to stay 
//4. calculate how much they need to pay to stay for this amount of time 
//5. tell the user how much money they are spending


package hotel_booking_system;

import java.util.Scanner; 

public class Hotel_Booking_System {
    
    private static Scanner input = new Scanner(System.in); 
    
    private static double total = 0; 
    private static double price = 0; 
    
    
    public static void main(String[] args) {
        
        //Call the class and then the method name to print it:
        System.out.println(Formalities.Intro()); 
        
        //Running the room method to get room size 
        Room(); 
        
    }
   
    
    public static void Room(){ 
        System.out.println("");
        System.out.println("What room size would you like?"); 
        System.out.println("Single, Double, Family");
        System.out.println(""); 
        String roomSize = input.next(); 
        
        if(roomSize.equalsIgnoreCase("Single")){
            Single(); 
            Board();
            Nights(); 
            System.out.println(Formalities.Outro());
            System.out.println("");
            System.out.println("Your whole stay will cost:");
            System.out.println("£" + total); 
            
        }
        
        if(roomSize.equalsIgnoreCase("Double")){
            Double(); 
            Board(); 
            Nights(); 
            System.out.println(Formalities.Outro());
            System.out.println(Formalities.Outro());
            System.out.println("");
            System.out.println("Your whole stay will cost:");
            System.out.println("£" + total); 
        }
        
        if(roomSize.equalsIgnoreCase("Family")){ 
            Family(); 
            Board(); 
            Nights(); 
            System.out.println(Formalities.Outro());
            System.out.println(Formalities.Outro());
            System.out.println("");
            System.out.println("Your whole stay will cost:");
            System.out.println("£" + total); 
        }
       
        
    }
    
    
    
    
    public static void Single(){ 
        System.out.println(""); 
        System.out.println("You have chosen a SINGLE room");
        System.out.println("This will cost £50 per night"); 
        price = 50; 
    }
    
    public static void Double(){ 
        System.out.println(""); 
        System.out.println("You have chosen a DOUBLE room");
        System.out.println("This will cost £75 per night"); 
        price = 75; 
    }
    
    public static void Family(){ 
        System.out.println(""); 
        System.out.println("You have chosen a FAMILY room");
        System.out.println("This will cost £105 per night"); 
        price = 105; 
    }
    
    
    
    
    
    
    
    public static void Board(){
        System.out.println("");
        System.out.println(""); 
        System.out.println("What board will you stay in?");
        System.out.println("Self-Catering, Half-Board, Full-Board");
        System.out.println(""); 
        String boardType = input.next(); 
        
        if(boardType.equalsIgnoreCase("Self-Catering")){
            Self(); 
        }
        
        if(boardType.equalsIgnoreCase("Half-Board")){
            Half(); 
        }
        
        if(boardType.equalsIgnoreCase("Full-Board")){
            Full(); 
        }
        
        
    }
    
    
    public static void Self(){ 
        System.out.println("");
        System.out.println("You have chosen SELF-CATERING"); 
        System.out.println("This will cost £0 per night");
        price = price + 0; 
    }
    
       public static void Half(){ 
        System.out.println("");
        System.out.println("You have chosen HALF-BOARD"); 
        System.out.println("This will cost £10 per night"); 
        price = price + 10; 
    }
    
       public static void Full(){ 
        System.out.println("");
        System.out.println("You have chosen FULL BOARD"); 
        System.out.println("This will cost £20 per night"); 
        price = price + 20; 
    }   
       
    
    
    
       public static void Nights(){
           System.out.println("");
           System.out.println(""); 
           System.out.println("How many nights are you staying?");
           int stays = input.nextInt(); 
           
           if(stays < 7){
               total = price * stays; 
           }
           
           if(stays > 7){ 
               int over = stays - 7; 
               total = price * 7; 
               
               for(int i=over; i>0; i--){
                   double extra = price * 0.2; 
                   price = price - extra; 
                   total = total + price; 
               }

           }
           
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

