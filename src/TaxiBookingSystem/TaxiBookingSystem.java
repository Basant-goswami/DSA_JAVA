package TaxiBookingSystem;

import java.util.ArrayList;

public class TaxiBookingSystem {

    ArrayList<Taxi> taxis = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    public TaxiBookingSystem(int n){
        for (int i=1;i<=n;i++){
            taxis.add(new Taxi(i));
        }
    }

    public void taxiBooking(int customerId, char pickupPoint, char dropPoint, int pickupTime){
        ArrayList<Taxi> availableTaxis = new ArrayList<>();
        for(Taxi t : taxis){
            int ftime = t.freeTime;
            if(t.currentLocation != pickupPoint){
                ftime += Math.abs(t.currentLocation - pickupPoint);
            }
            if(ftime <= pickupTime){
                availableTaxis.add(t);
            }
        }
        int minEarning = Integer.MAX_VALUE;
        int minDistance = Integer.MAX_VALUE;
        Taxi selectedTaxi = null;

        // checking nearest and min earning taxi
        for(Taxi t : availableTaxis){
            int distance = Math.abs(t.currentLocation - pickupPoint);
            if(distance < minDistance || (distance == minDistance && t.totalEarning < minEarning)){
                minDistance = distance;
                minEarning = t.totalEarning;
                selectedTaxi = t;
            }
        }

        if(selectedTaxi == null){
            System.out.println("No Taxi is free right now. Booking rejected");
            return;
        }

        Booking booking = new Booking(customerId, selectedTaxi.taxiId, pickupPoint, dropPoint, pickupTime);
        selectedTaxi.bookTaxi(booking);
        bookings.add(booking);

        System.out.println("Taxi can be allotted.");
        System.out.println("Taxi-"+selectedTaxi.taxiId+" is allotted.");
    }

    public void displayTaxiDetails(){
        for (Taxi t : taxis){
            if(t.bookings.size()>0){
                System.out.println("--------------------------------------------------------------------------------------");
                System.out.println("Taxi no : " + t.taxiId + "\t Total earning : " + t.totalEarning);
                System.out.println("Booking id | Customer id | Form | To | Pickup time | Drop time | Amount");
                for(Booking b : t.bookings){
                    System.out.printf("%-10s | %-11s | %-4s | %-2s | %-11s | %-9s | %-6s\n",b.bookingId,b.customerId,b.source,b.destination,b.pickupTime,b.dropTime,b.fair);
                }
            }
        }
    }
}
