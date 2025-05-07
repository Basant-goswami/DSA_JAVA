package TCS_Prep.PRA_prep;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class TV_show_Ques {

    public static TV showWithMaxRating(TV[] arr){
        TV temp = null;
        float max = 0;
        for(TV t : arr){
            if(t.getRating() > max){
                temp = t;
                max = t.getRating();
            }
        }
        return temp;
    }

    public static TV[] showByShowId(TV[] arr){
        for (TV t : arr){
            for(int i=0; i<arr.length-1;i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i].getShow_Id() > arr[j].getShow_Id()){
                        TV temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0) {
            System.out.println("Number should be greater than 0");
            return;
        }

        TV[] tvArr = new TV[n];

        for(int i=0;i<n;i++){
            float rating = sc.nextFloat();
            int show_Id = sc.nextInt();
            sc.nextLine();
            String show = sc.nextLine();
            String anchor_name = sc.nextLine();
            tvArr[i] = new TV(rating, show_Id, show, anchor_name);
        }
        TV maxRating = showWithMaxRating(tvArr);
        if(maxRating == null){
            System.out.println("No TV show found.");
        } else {
            System.out.println(maxRating.getRating());
            System.out.println(maxRating.getShow_Id());
            System.out.println(maxRating.getShow());
            System.out.println(maxRating.getAnchor_name());
        }
        TV[] res = showByShowId(tvArr);
        for(TV t : res ){
            System.out.println(t.getShow_Id()+"-"+t.getShow()+"-"+t.getRating()+"-"+t.getAnchor_name());
        }
    }
}

class TV {
    private float rating;
    private int show_Id;
    private String show;
    private String anchor_name;

    public TV(float rating, int show_Id, String show, String anchor_name) {
        this.rating = rating;
        this.show_Id = show_Id;
        this.show = show;
        this.anchor_name = anchor_name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getShow_Id() {
        return show_Id;
    }

    public void setShow_Id(int show_Id) {
        this.show_Id = show_Id;
    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public String getAnchor_name() {
        return anchor_name;
    }

    public void setAnchor_name(String anchor_name) {
        this.anchor_name = anchor_name;
    }
}