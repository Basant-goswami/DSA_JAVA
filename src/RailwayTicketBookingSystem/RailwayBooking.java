package RailwayTicketBookingSystem;

import java.util.*;

public class RailwayBooking {
    private int pnrCounter = 1000;
    private final int MAX_WAITING = 2;
    private final int MAX_SEATS = 8;

    private List<Ticket> conformTickets = new ArrayList<>();
    private List<Ticket> waitingList = new ArrayList<>();
    private HashMap<String, Ticket> pnrMap = new HashMap<>();

    // five station is there A -> B -> C -> D -> E
    private Map<String, Integer> stationMap = Map.of("A",0,"B",1,"C",2,"D",3,"E",4);
    boolean[][] seatChart = new boolean[8][5];

    // generating pnr number
    private String generatePnr(){
        return "PNR" + (++pnrCounter);
    }

    public List<Integer> getAvailableSeats(int src, int dst){
        List<Integer> seats = new ArrayList<>();
        for(int i=0; i<8; i++){
            boolean avl = true;
            for(int j=src; j<dst; j++){
                if(seatChart[i][j]){
                    avl = false;
                    break;
                }
            }
            if(avl){
                seats.add(i);
            }
        }
        return seats;
    }

    // for booking tickets
    public void bookTicket(int noOfPassengers, String source, String destination){
        int src = stationMap.get(source);
        int dst = stationMap.get(destination);
        List<Integer> availableSeats = getAvailableSeats(src,dst);
        String pnr = generatePnr();

        // conform tickets process
        if(availableSeats.size() >= noOfPassengers){
            int count = 0;
            for (int seat : availableSeats.subList(0,noOfPassengers)){
                for(int j=src; j<dst; j++){
                    seatChart[seat][j] = true;
                }
            }
            Ticket newTicket = new Ticket(pnr,source,destination,true,noOfPassengers,availableSeats.subList(0,noOfPassengers));
            conformTickets.add(newTicket);
            pnrMap.put(pnr,newTicket);
            System.out.println("Successfully "+noOfPassengers+" seats booked. Your PNR No. is "+pnr);
        }
        // waiting list --> Maximum 2 waiting list allowed and per waiting list ticket max 2 person
        else if (waitingList.size() < MAX_WAITING && noOfPassengers <= MAX_WAITING  ) {
            Ticket ticket = new Ticket(pnr,source,destination,false,noOfPassengers,new ArrayList<>());
            waitingList.add(ticket);
            pnrMap.put(pnr,ticket);
            System.out.println(noOfPassengers+" seats booked in Waiting list. Your PNR No. is "+pnr);
        }
        // not available
        else {
            System.out.println("No seats available");
        }
    }

    // for ticket Cancellation
    public void cancelledTicket(int noOfPassengers, String pnr){
        if(!pnrMap.containsKey(pnr)){
            System.out.println("Invalid PNR No.");
            return;
        }
        Ticket ticket = pnrMap.get(pnr);
        if(ticket.noOfPassengers < noOfPassengers){
            System.out.println("Invalid no of passengers.");
            return;
        }
        List<Integer> cencelledSeat = new ArrayList<>();
        if(ticket.isConformed){
            int src = stationMap.get(ticket.source);
            int dst = stationMap.get(ticket.destination);
            for(int i=0; i<noOfPassengers; i++ ){
                int seat = ticket.seatNo.get(i);
                for(int j=src; j<dst; j++){
                    seatChart[seat][j] = false;
                }
                cencelledSeat.add(seat);
            }
            for (int seat : cencelledSeat){
                ticket.seatNo.remove((Integer) seat);
            }
            ticket.noOfPassengers -= noOfPassengers;
            if (ticket.noOfPassengers == 0){
                conformTickets.remove(ticket);
                pnrMap.remove(pnr);
            }
            System.out.println("Cancelled "+ noOfPassengers+" passengers from PNR No. "+ pnr);

            // moving the waiting list into the conform ticket
            if(!waitingList.isEmpty()){
//                for(Ticket wt : waitingList){
                    Ticket wt = waitingList.get(0);
                    int wSrc  = stationMap.get(wt.source);
                    int wDst  = stationMap.get(wt.destination);
                    List<Integer> avlSeats = getAvailableSeats(wSrc,wDst);
                    if(avlSeats.size() >= wt.noOfPassengers){
                        for (int i=0;i<wt.noOfPassengers;i++){
                            int seat = avlSeats.get(i);
                            for (int j=wSrc; j<wDst; j++){
                                seatChart[seat][j] = true;
                            }
                        }
                        wt.isConformed = true;
                        wt.seatNo = avlSeats.subList(0,wt.noOfPassengers);
                        conformTickets.add(wt);
                        waitingList.remove(0);
                        System.out.println("Waiting ticket " + wt.pnr + " moved to conformed.");
                    }
//                }
            }
        } else {
            waitingList.remove(ticket);
            pnrMap.remove(pnr);
            System.out.println("Ticket will cancelled from waiting list");
        }
    }

    // display all chart of the tickets
    public void displayChart(){
        System.out.println("------------------------------");
        System.out.println("Seats | A - B - C - D - E");
        for (int i=0;i<8;i++){
            System.out.printf("%5d |",(i+1));
            for (int j=0; j<5; j++){
                if(seatChart[i][j]){
                    System.out.printf("%4s"," x");
                } else {
                    System.out.printf("%4s", " ");
                }
            }
            System.out.println();
        }
    }

    // chart details with pnr no
    public void pnrChartDetails(){
        System.out.printf("%-2s | %-2s | %-2s | %-2s | %-10s | %-10s", "PNR No.", "Source", "Destination", "Passengers", "Status", "Seats");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        for(String pnr : pnrMap.keySet()){
            Ticket ticket = pnrMap.get(pnr);
            if(ticket.isConformed) {
                for(int i=0;i<ticket.seatNo.size();i++){
                    ticket.seatNo.set(i,ticket.seatNo.get(i)+1);
                }
            }
            System.out.printf("%-7s | %-6s | %-11s | %-10d | %-10s | %-10s ", pnr, ticket.source, ticket.destination, ticket.noOfPassengers,ticket.isConformed ? "Conformed" : "Waiting", ticket.isConformed ? ticket.seatNo : "Not allocated");
            System.out.println();
        }
    }

    // find tickets details by pnr number
    public void ticketByPnr(String pnr){
        if(pnrMap.containsKey(pnr)){
            Ticket ticket = pnrMap.get(pnr);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("PNR No - "+ticket.pnr);
            System.out.println("Source Station - "+ticket.source);
            System.out.println("Destination Station - "+ticket.destination);
            System.out.println("Status - "+(ticket.isConformed ? "Conformed" : "Waiting"));
            System.out.println("No of Passengers - "+ ticket.noOfPassengers);
            if(ticket.isConformed) {
                for(int i=0;i<ticket.seatNo.size();i++){
                    ticket.seatNo.set(i,ticket.seatNo.get(i)+1);
                }
                System.out.println("Seats no - " + ticket.seatNo);
            }
        } else  {
            System.out.println("Invalid PNR No.");
        }
    }

    // passenger traker from each station (source to destination)
    public void passengerTrackerFromEachStation(){
        int[][] passengerArr = new int[5][5];
        for(Ticket ticket : pnrMap.values()){
            int src = stationMap.get(ticket.source);
            int dst = stationMap.get(ticket.destination);
            passengerArr[src][dst] += ticket.noOfPassengers;
        }
        System.out.println("-------- Passenger traker from each station ---------");

        // <-- Hardcoded stations names -->
        List<String> stationsName = new ArrayList<>();
        stationsName.add("A");
        stationsName.add("B");
        stationsName.add("C");
        stationsName.add("D");
        stationsName.add("E");

        for(int i=0;i<=passengerArr.length;i++){
            for (int j=0;j<=passengerArr.length;j++){
                if(i==0 && j==0){
                    System.out.printf("%-2s | ", "Station");
                } else if (i == 0 && j > 0) {
                    System.out.printf("%-2s", stationsName.get(j-1));
                } else if( j==0 && i > 0 ){
                    System.out.printf("%-7s | ", stationsName.get(i-1));
                } else {
                    System.out.printf("%-2d", passengerArr[i-1][j-1]);
                }
            }
            System.out.println();
        }
    }


}
