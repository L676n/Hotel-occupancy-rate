
package javaassignment4;

import java.util.Scanner;

public class HotelOccupancy {

    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner (System.in);
        
        int floors;
        int rooms;
        int occupied_rooms;
        double occupancy_rate = 0;
        int total_rooms = 0;
        int total_occupied_rooms = 0;
        int vacant_rooms = 0;
        
        System.out.print("Enter the number of floors in the hotel: ");
        floors = keyboard.nextInt();
        
        while(floors < 1){
            System.out.println("Enter a valid number: ");
            floors = keyboard.nextInt();        
        }
        
        for(int count = 1; count <= floors; ++count){
            
            System.out.printf("\nEnter the number of rooms in %d floor: ", count);
            rooms = keyboard.nextInt();
            
            while(rooms < 10){
            System.out.println("Enter a valid number: ");
            rooms = keyboard.nextInt();        
        }
            
            System.out.print("Enter the number of occupied"
                                + " rooms in this floor: ");
            occupied_rooms = keyboard.nextInt();
            
            total_rooms += rooms;
            total_occupied_rooms += occupied_rooms;
            vacant_rooms = total_rooms - total_occupied_rooms;
            occupancy_rate = (double)total_occupied_rooms / total_rooms;
        }
        
        System.out.printf("\n\nThe number of rooms in the hotel = %d\n", total_rooms);
        System.out.printf("\nThe number of occupied rooms"
                           + " in the hotel = %d\n", total_occupied_rooms);
        System.out.printf("\nThe number of vacant rooms"
                          + " in the hotel = %d\n", vacant_rooms);
        System.out.printf("\nThe occupancy rate is = %.2f\n\n", occupancy_rate);
    }
    
}
