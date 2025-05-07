package TaxiBookingSystem;

import java.awt.print.Book;
import java.util.ArrayList;

public class Taxi {
    int taxiId;
    int totalEarning;
    int freeTime;
    char currentLocation;
    ArrayList<Booking> bookings;

    public Taxi(int taxiId) {
        this.taxiId = taxiId;
        this.totalEarning = 0;
        this.freeTime = 0;
        this.currentLocation = 'A';
        this.bookings = new ArrayList<>();
    }

    public static int getFare(char from, char to ){
        int distance =  Math.abs(from - to)*15;
        int fare = 100;
        if(distance > 5){
            fare = fare + (distance - 5) * 10;
        }
        return fare;
    }

    public void bookTaxi(Booking booking){
        int distance = Math.abs(booking.source-booking.destination);
        this.freeTime = booking.pickupTime + distance;
        this.currentLocation = booking.destination;
        this.totalEarning += getFare(booking.source, booking.destination);
        this.bookings.add(booking);
    }
}
