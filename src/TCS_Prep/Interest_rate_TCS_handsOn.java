package TCS_Prep;

import java.util.*;

public class Interest_rate_TCS_handsOn {
    public static double CalculateInterest(Account a, int t){
        double r = a.getR();
        double extraInterestRate = (t*r)/100;
        double finalInterestRate = r + extraInterestRate;
        System.out.println("final interest rate : " + finalInterestRate);
        return (a.getBalance()*finalInterestRate) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("id : ");
        int id = sc.nextInt();
        System.out.print("balance : ");
        double balance = sc.nextDouble();
        System.out.print("r : ");
        double r = sc.nextDouble();
        System.out.print("time : ");
        int t = sc.nextInt();

        Account a = new Account(id,balance,r);
        double finalInterest = CalculateInterest(a,t);
        System.out.printf("ans is : %.3f", finalInterest);
    }
}
class Account{
    private int id;
    private double balance;
    private double r;
    // constructor
    Account(int id, double balance, double r){
        this.id = id;
        this.balance = balance;
        this.r = r;
    }
    // getters
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getR(){
        return r;
    }
    // setters
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double p){
        this.balance = p;
    }
    public void setR(double r){
        this.r = r;
    }
}
