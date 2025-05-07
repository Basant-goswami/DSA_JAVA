package TaxiBookingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaxiBookingSystem tb = new TaxiBookingSystem(3);
        tb.taxiBooking(1,'A','B',9);
        tb.taxiBooking(2,'B','D',9);
        tb.taxiBooking(3,'B','C',10);
        tb.taxiBooking(4,'B','C',13);
        tb.taxiBooking(5,'C','E',9);
        tb.taxiBooking(6,'F','E',12);
        tb.taxiBooking(7,'A','B',15);
        tb.taxiBooking(8,'C','F',12);

        tb.displayTaxiDetails();

//        System.out.println("Welcome to the Taxi booking application");
//        System.out.println("------------------------------------------------");
//        while (true){
//            System.out.println("Choose the correct option");
//            System.out.println("1.Book Taxi\n2. Display taxi details\n3. Exit");
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1 : {
//                    System.out.println("Enter customer Id : ");
//                    int cId = sc.nextInt();
//                    System.out.println("Enter Pickup point : ");
//                    char from = sc.next().toUpperCase().charAt(0);
//                    System.out.println("Enter Drop point : ");
//                    char to = sc.next().toUpperCase().charAt(0);
//                    System.out.println("Enter pickup time(hour only & 24-hr format)");
//                    int pickupTime = sc.nextInt();
//                    tb.taxiBooking(cId,from,to,pickupTime);
//                }
//                case 2 : {
//                    tb.displayTaxiDetails();
//                }
//                case 3 : {
//                    System.exit(0);
//                }
//                default:{
//                    System.out.println("Choose a valid option.");
//                }
//            }

//        }
    }
}
