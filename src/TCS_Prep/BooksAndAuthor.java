//package TCS_Prep;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.SimpleTimeZone;
//
//public class BooksAndAuthor {
//
//    public static ArrayList<Book> getBooksBelongingToAGenre(ArrayList<Book> books,String genre){
//        ArrayList<Book> bookByGenre = new ArrayList<>();
//        for (Book el : books){
//            if(el.getGenre().equalsIgnoreCase(genre) ){
//                bookByGenre.add(el);
//            }
//        }
//        if (bookByGenre.isEmpty()){
//            System.out.println("Genre is not available in the list");
//        }
//        return bookByGenre;
//    }
//
//    public static ArrayList<Book> calculateDiscountedPrice(ArrayList<Book> books, String genre, double discount){
//        ArrayList<Book> discountedBooks = new ArrayList<>();
//        for (Book el : books){
//            if (el.getGenre().equalsIgnoreCase(genre)){
//                double newPrice = (el.getPrice() - (el.getPrice() * discount/100));
//                el.setPrice(newPrice);
//                discountedBooks.add(el);
//            }
//        }
//        if (discountedBooks.isEmpty()){
//            System.out.println("Discounted books are unavailable in the given genre");
//        }
//        return discountedBooks;
//    }
//
//
//    public static void main(String[] args) {
//        ArrayList<Book> books = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i=0;i<n;i++){
//            int authorId = sc.nextInt();
//            sc.nextLine();
//            String authorName = sc.nextLine();
//            int bookId = sc.nextInt();
//            sc.nextLine();
//            String title = sc.nextLine();
//            String genre = sc.nextLine();
//            double price = sc.nextDouble();
////            sc.nextLine();
//            Author author = new Author(authorId, authorName);
//            Book book = new Book(bookId,title,genre,price,author);
//            books.add(book);
//        }
//
//        sc.nextLine();
//        String inpGenre = sc.nextLine();
//        String inpGenreForDiscount = sc.nextLine();
//        double discount = sc.nextDouble();
//
//        ArrayList<Book> result1 = getBooksBelongingToAGenre(books,inpGenre);
//            for (Book el : result1){
//                System.out.println("AuthorName: "+ el.author.getAuthorName()+", Title: "+el.getTitle());
//            }
//        System.out.println();
//
//        ArrayList<Book> result2 = calculateDiscountedPrice(books,inpGenreForDiscount,discount);
//        if (!result2.isEmpty()) {
//            System.out.println("Discounted " + inpGenreForDiscount + " Books:");
//            for (Book el : result2) {
//                System.out.println("AuthorName: " + el.author.getAuthorName() + ", Title: " + el.getTitle() + ", Updated Price: " + el.getPrice());
//            }
//        }
//        sc.close();
//    }
//}
//
//class Author{
//    private int authorId;
//    private String authorName;
//    public Author(int authorId, String authorName){
//        this.authorId = authorId;
//        this.authorName = authorName;
//    }
//    public int getAuthorId(){
//        return authorId;
//    }
//    public  String getAuthorName(){
//        return authorName;
//    }
//}
//
//class Book{
//    private int bookId;
//    private String title;
//    private String genre;
//    private double price;
//    Author author;
//
//    public Book(int bookId, String title, String genre, double price, Author author){
//        this.bookId = bookId;
//        this.title = title;
//        this.genre = genre;
//        this.price = price;
//        this.author = author;
//    }
//
//    public int getBookId(){
//        return bookId;
//    }
//    public String getTitle(){
//        return title;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double newPrice){
//        price = newPrice;
//    }
//}
