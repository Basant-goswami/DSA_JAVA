package TCS_Prep;
import java.util.*;

public class LaptopsAndMethods{
    public static ArrayList<Laptop> searchLaptopByOsType(Laptop[] laptops, String inpOs){
        ArrayList<Laptop> ans = new ArrayList<>();
        for(Laptop lap : laptops) {
            if(lap.getOsType().equalsIgnoreCase(inpOs)){
                ans.add(lap); } } return ans;
    }
    public static int countOfLaptopsByBrand(Laptop[] laptops, String inpBrand){
        int ans = 0; for(Laptop lap : laptops){
            if(lap.getBrand().equalsIgnoreCase(inpBrand)){
                if(lap.getRating() > 3){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];
        for(int i=0;i<4;i++){
            int laptopId = sc.nextInt();
            sc.nextLine();
            String brand = sc.nextLine();
            String osType = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            int rating = sc.nextInt();
            laptops[i] = new Laptop(laptopId,brand,osType,price,rating);
        }
        sc.nextLine();
        String inpBrand = sc.nextLine();
        String inpOs = sc.nextLine();
        int res1 = countOfLaptopsByBrand(laptops, inpBrand);
        if(res1 ==0 ){
            System.out.println("The given brand is not available");
        } else {
            System.out.println(res1);
        }
        ArrayList<Laptop> arr = searchLaptopByOsType(laptops, inpOs);
        if(arr.isEmpty()){
            System.out.println("The given os is not available");
        } else {
            Collections.sort(arr, Comparator.comparingInt(Laptop::getLaptopId).reversed());
            for(Laptop lap : arr){
                System.out.println(lap.getLaptopId());
                System.out.println(lap.getRating());
            }
        }
    }
}
class Laptop{
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating){
        this.laptopId = laptopId;

        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }
    public int getLaptopId(){
        return laptopId;
    }
    public String getBrand(){
        return brand;
    }
    public String getOsType(){
        return osType;
    } public double getPrice(){
        return price;
    }
    public int getRating() {
        return rating;
    }
}