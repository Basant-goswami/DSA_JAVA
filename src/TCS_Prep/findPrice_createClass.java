package TCS_Prep;

import java.util.HashSet;
import java.util.Scanner;

public class findPrice_createClass {

    public static int findTotalPriceForGivenBrand(HeadSets[] hs, String b){
        int cost = 0;
        for (int i=0;i<hs.length;i++){
            if (hs[i].getBrand().equalsIgnoreCase(b)){
                cost += hs[i].getPrice();
            }
        }
        return cost;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] hs){

        int count = 0;
        // check availability of the brands
        for (int i=0;i<hs.length;i++){
            if(hs[i].getAvailable()){
                count++;
            }
        }
        if (count == 0){
            return null;
        }
        // copying objects to new array
        HeadSets[] newHeadSets = new HeadSets[count];
        int k=0;
        for (int i=0;i<hs.length;i++){
            if(hs[i].getAvailable()){
                newHeadSets[k++] = hs[i];
            }
        }
        // sorting objects based on price
        HeadSets temp = null;
        for (int i=0;i<newHeadSets.length;i++){
            for (int j=i+1; j<newHeadSets.length; j++){
                if (newHeadSets[i].getPrice() > newHeadSets[j].getPrice()){
                    temp = newHeadSets[i];
                    newHeadSets[i] = newHeadSets[j];
                    newHeadSets[j] = temp;
                }
            }
        }
        // 2nd minimum price item
        return newHeadSets[1];
    }
    public static void main(String[] args) {

        HeadSets[] hs = new HeadSets[4];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<hs.length;i++){
            String headsetName = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            boolean available = sc.nextBoolean();
            sc.nextLine();
            hs[i] = new HeadSets(headsetName,brand,price,available);
        }
        // user input for brand name
        System.out.println("give the brand name : ");
        String userBrand = sc.nextLine();

        int sum = findTotalPriceForGivenBrand(hs, userBrand);
        if(sum == 0){
            System.out.println("No Headsets available with the given brand");
        }
        System.out.println(sum);

        HeadSets h1 = findAvailableHeadsetWithSecondMinPrice(hs);
        if(h1 == null){
            System.out.println("No Headsets available");
        } else{
            System.out.println(h1.getHeadsetName());
            System.out.println(h1.getPrice());
        }

    }
}

class HeadSets{
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    HeadSets(String headsetName, String brand, int price, boolean available){
        this.headsetName = headsetName;
        this.brand = brand;
        this.price = price;
        this.available = available;
    }

    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public boolean getAvailable(){
        return available;
    }
    public String getHeadsetName(){
        return headsetName;
    }
}
