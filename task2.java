import java.util.Scanner;
class Book {
    private String Title;
    private String Author;
    private double price;
    public Book(String Title,String Author,double price){
        this.Title = Title;
        this.Author = Author;
        this.price = price;
    }
    public void setTitle(String title){
        this.Title = title;
    }
    public void setAuthor(String auth){
        this.Author = auth;
    }
    public void setprice(double Price){
        this.price = Price;
    }
    public String getTitle(){
        return this.Title;
    }
    public String getAuthor(){
        return this.Author;
    }
    public double getprice(){
        return this.price;
    }
}
public class  task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Title of book: ");
        String Title = sc.nextLine();
        System.out.print("Enter Author of book: ");
        String Author = sc.nextLine();
        System.out.print("Enter price of book: ");
        double price = sc.nextDouble();
        Book obj = new Book(Title,Author,price);
        System.err.println(obj.getTitle());
        System.err.println(obj.getAuthor());
        System.err.println(obj.getprice());
        obj.setTitle("Alice in wonderland");
        obj.setAuthor("Max Brown");
        obj.setprice(460.2);
        System.err.println(obj.getTitle());
        System.err.println(obj.getAuthor());
        System.err.println(obj.getprice());
        sc.close();
    }
}
