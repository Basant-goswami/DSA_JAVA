package TCS_Prep.PRA_prep;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Amazone_prime_Ques {

    public static int findRemaningSubcriptionDays(int inpId, int days, Amazoneprime[] arr){
        int ans = 0;
        for(Amazoneprime a : arr) {
            if (a.getPrimeId() == inpId) {
                ans = a.getSubscribedPackage() - days;
                break;
            }
        }
        return ans;
    }

    public static ArrayList<Amazoneprime> findDetailsForGivenShow(String show , Amazoneprime[] arr){
        ArrayList<Amazoneprime> resArr = new ArrayList<>();

        for (Amazoneprime a : arr){
            if(a.getShowStreaming().equalsIgnoreCase(show)){
                resArr.add(a);
            }
        }
        if(resArr.isEmpty()) return null;
        Collections.sort(resArr, Comparator.comparingInt(Amazoneprime :: getViews));

        return resArr;
    }

    public static void main(String[] args) {
        Amazoneprime[] amazoneArr = new Amazoneprime[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            int primeId = sc.nextInt();
            sc.nextLine();
            String userName = sc.nextLine();
            int subscribedPackage = sc.nextInt();
            sc.nextLine();
            String showStreaming = sc.nextLine();
            int views = sc.nextInt();
            amazoneArr[i] = new Amazoneprime(primeId,userName,subscribedPackage,showStreaming,views);
        }
        int inpPrimeId = sc.nextInt();
        int days = sc.nextInt();
        sc.nextLine();
        String show = sc.nextLine();
        sc.close();
        int remaningDays = findRemaningSubcriptionDays(inpPrimeId,days,amazoneArr);
        if(remaningDays == 0) {
            System.out.println("Its time to recharge to your account");
        } else {
            System.out.println(remaningDays);
        }

        ArrayList<Amazoneprime> res = findDetailsForGivenShow(show,amazoneArr);
        if (res == null ) {
            System.out.println("No such shows available");
        } else {
            for(Amazoneprime a : res){
                System.out.println(a.getPrimeId()+"$"+a.getUserName()+"$"+a.getViews());
            }
        }

    }
}

class Amazoneprime {
    private int primeId ;
    private String userName;
    private int subscribedPackage;
    private String showStreaming;
    private int views;


    public Amazoneprime(int primeId, String userName, int subscribedPackage, String showStreaming, int views) {
        this.primeId = primeId;
        this.userName = userName;
        this.subscribedPackage = subscribedPackage;
        this.showStreaming = showStreaming;
        this.views = views;
    }

    public void setPrimeId(int primeId) {
        this.primeId = primeId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSubscribedPackage(int subscribedPackage) {
        this.subscribedPackage = subscribedPackage;
    }

    public void setShowStreaming(String showStreaming) {
        this.showStreaming = showStreaming;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getPrimeId() {
        return primeId;
    }

    public String getUserName() {
        return userName;
    }

    public int getSubscribedPackage() {
        return subscribedPackage;
    }

    public String getShowStreaming() {
        return showStreaming;
    }

    public int getViews() {
        return views;
    }
}