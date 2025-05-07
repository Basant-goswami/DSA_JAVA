package RailwayTicketBookingSystem;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        RailwayBooking obj = new RailwayBooking();

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\t\t\tWelcome to railway ticket booking application");
        while(true){
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("1. Book tickets");
            System.out.println("2. Cancel tickets");
            System.out.println("3. Display chart");
            System.out.println("4. Display chart details with PNR no.");
            System.out.println("5. Get ticket details by PNR No.");
            System.out.println("6. Passenger tracker from each station (source to destination)");
            System.out.println("7. Exit");

            Scanner sc = new Scanner(System.in);
            try {

                int n = sc.nextInt();
                try {
                    switch (n) {
                        case 1: {
                            System.out.println("Enter the no of passengers : ");
                            int noOfPassengers = sc.nextInt();
                            System.out.println("Enter the source station (A -> B -> C -> D -> E) : ");
                            String src = sc.next().toUpperCase();
                            System.out.println("Enter the destination station (A -> B -> C -> D -> E) : ");
                            String dsc = sc.next().toUpperCase();
                            obj.bookTicket(noOfPassengers, src, dsc);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter your PNR No. : ");
                            String pnr = sc.next().toUpperCase();
                            System.out.println("Enter no of passengers : ");
                            int noOfPassengers = sc.nextInt();
                            obj.cancelledTicket(noOfPassengers, pnr);
                            break;
                        }
                        case 3: {
                            obj.displayChart();
                            break;
                        }
                        case 4: {
                            obj.pnrChartDetails();
                            break;
                        }
                        case 5: {
                            System.out.println("Enter PNR No. : ");
                            String pnr = sc.next().toUpperCase();
                            obj.ticketByPnr(pnr);
                            break;
                        }
                        case 6: {
                            obj.passengerTrackerFromEachStation();
                            break;
                        }
                        case 7: {
                            System.exit(0);
                        }
                        default: {
                            System.out.println("Choose correct option.");
                            break;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter correct input");
                }
            }catch (InputMismatchException e){
                System.out.println("Input format is not in Integer...");
            }
        }
    }
}
