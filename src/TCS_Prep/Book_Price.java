package TCS_Prep;

import java.util.*;

public class Book_Price {
    public static ArrayList<Book> sortBookByPrice(Book[] books){
        ArrayList<Book> ans = new ArrayList<>();
        for (Book b : books){
            ans.add(b);
        }
        Collections.sort(ans, Comparator.comparingDouble(Book::getPrice));
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[4];
        for (int i=0;i<4;i++){
            int id = sc.nextInt();
            sc.nextLine();
            String title = sc.nextLine();
            String author = sc.nextLine();
            double price = sc.nextDouble();
            sc.nextLine();
            books[i] = new Book(id,title,author,price);
        }
        ArrayList<Book> ans = sortBookByPrice(books);
        for (Book b : ans){
            System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
        }
    }
}

class Book{
    int id;
    String title;
    String author;
    double price;
    public Book(int id,String title,String author,double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}