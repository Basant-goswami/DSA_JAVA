package TaxiBookingSystem;

public class Booking {
    static int counter = 1;
    int bookingId;
    int customerId;
    int taxiId;
    char source;
    char destination;
    int pickupTime;
    int dropTime;
    int fair;

    public Booking(int customerId, int taxiId, char source, char destination, int pickupTime) {
        this.bookingId = counter++;
        this.customerId = customerId;
        this.taxiId = taxiId;
        this.source = source;
        this.destination = destination;
        this.pickupTime = pickupTime;
        this.dropTime = pickupTime + Math.abs(source-destination);
        this.fair = Taxi.getFare(source,destination);
    }
}
