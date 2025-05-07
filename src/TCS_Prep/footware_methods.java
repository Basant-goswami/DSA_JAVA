package TCS_Prep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class footware_methods {

    public static int getCountByType(Footware[] foot, String s){
        int count = 0;
        for(Footware f : foot){
            if(f.getType().equalsIgnoreCase(s)){
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Footwear not available");
        }
        return count;
    }

    public static Footware getSecondHighestPriceByBrand(Footware[] foot, String s){
        ArrayList<Footware> ans = new ArrayList<>();
        for(Footware f : foot){
            if(f.getName().equalsIgnoreCase(s)){
                ans.add(f);
            }
        }
        if (ans.isEmpty()) return null;
        Collections.sort(ans, Comparator.comparingDouble(Footware::getPrice).reversed());
        return ans.get(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footware[] foot = new Footware[5];
        for (int i=0;i<5;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String type = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            foot[i] = new Footware(id,name,type,price);
        }
        String inp1 = sc.nextLine();
        String inp2 = sc.nextLine();
        int res1 = getCountByType(foot,inp1);
        if(res1 != 0) System.out.println(res1);

        Footware res2 = getSecondHighestPriceByBrand(foot,inp2);
        if (res2 == null){
            System.out.println("Brand not available");
        } else {
            System.out.println(res2.getId());
            System.out.println(res2.getName());
            System.out.println(res2.getPrice());
        }
    }
}

class Footware{
    int id;
    String name;
    String type;
    double price;
    public Footware(int id,String name,String type,double price){
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
