package TCS_Prep;
import java.util.*;

public class HotelsAndMethods {
    public static ArrayList<Hotel> hotelByWifi(Hotel[] hotels, String wifi){
        ArrayList<Hotel> avlHotel = new ArrayList<>();
        for(Hotel h : hotels){
            if(h.getWifiFacility().equalsIgnoreCase(wifi)){
                avlHotel.add(h);
            }
        }
        if(avlHotel.isEmpty()){
            return null;
        }
        Collections.sort(avlHotel,Comparator.comparingDouble(Hotel::getTotalBill).reversed());
        return avlHotel;
    }

    public static int noOfRooms(Hotel[] hotels, String month){

     for(Hotel h : hotels){
        if(h.getDateOfBooking().toLowerCase().contains(month.toLowerCase())){
            return h.getNoOfRoomsBooked();
        }
     }
        return 0;
     }

     public static void main(String[] args){
               Scanner sc = new Scanner(System.in);
               Hotel[] hotels = new Hotel[4];
               for(int i=0;i<4;i++){
                    int hotelId = sc.nextInt();
                    sc.nextLine();
                    String hotelName = sc.nextLine();
                    String dateOfBooking = sc.nextLine();
                    int noOfRoomsBooked = sc.nextInt();
                    sc.nextLine();
                    String wifiFacility = sc.nextLine();
                    double totalBill = sc.nextDouble();
                    hotels[i] = new Hotel(hotelId,hotelName,dateOfBooking,noOfRoomsBooked,wifiFacility,totalBill);
               }
               sc.nextLine();
               String inp1 = sc.nextLine();
               String inp2 = sc.nextLine();
               int res1 = noOfRooms(hotels,inp1);
               if(res1>0){
                    System.out.println(res1);
               } else {
                    System.out.println("No rooms booked in the given month");
               }
               ArrayList<Hotel> arr = hotelByWifi(hotels,inp2);
               if(arr == null){
                    System.out.println("No such option available");
               } else {
                    System.out.println(arr.get(1).getHotelId());
               }
          }
     }

     class Hotel{
          private int hotelId;
          private String hotelName;
          private String dateOfBooking;
          private int noOfRoomsBooked;
          private String wifiFacility;
          private double totalBill;
          public Hotel(int hotelId,String hotelName,String dateOfBooking,int noOfRoomsBooked,String wifiFacility,double totalBill){
               this.hotelId = hotelId;
               this.hotelName = hotelName;
               this.dateOfBooking = dateOfBooking;
               this.noOfRoomsBooked = noOfRoomsBooked;
               this.wifiFacility= wifiFacility;
               this.totalBill = totalBill;
          }
          public int getHotelId(){
               return hotelId;
          }
          public String getHotelName(){
               return hotelName;
          }
          public String getDateOfBooking(){
               return dateOfBooking;
          }
          public int getNoOfRoomsBooked(){
               return noOfRoomsBooked;
          }
          public String getWifiFacility(){
               return wifiFacility;
          }
          public double getTotalBill(){
               return totalBill;
          }
     }
