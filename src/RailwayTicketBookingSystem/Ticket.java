package RailwayTicketBookingSystem;

import java.util.List;

public class Ticket {

    String pnr;
    String source;   // booking from
    String destination;       // booking till station
    boolean isConformed;
    int noOfPassengers;
    List<Integer> seatNo;

    public Ticket(String pnr, String source, String destination, boolean isConformed, int noOfPassengers, List<Integer> seatNo) {
        this.pnr = pnr;
        this.source = source;
        this.destination = destination;
        this.isConformed = isConformed;
        this.noOfPassengers = noOfPassengers;
        this.seatNo = seatNo;
    }
}
