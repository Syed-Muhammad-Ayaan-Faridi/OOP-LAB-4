import java.util.Scanner;

class Laptop{
    private String brand;
    private String model;
    private double price;
    private int stock;
    //default constructor
    public Laptop(){
        brand = "";
        model = "";
        price = 0.0;
        stock = 0;
    }
    //Parameterised Constructor
    public Laptop(String Brand,String Model,double Price,int Stock){
        this.brand = Brand;
        this.model = Model;
        this.price = Price;
        this.stock = Stock;
    }
    //Copy Constructor
    public Laptop(Laptop obj){
        this.brand = obj.brand;
        this.model = obj.model;
        this.price = obj.price;
        this.stock = obj.stock;
    }
    //Getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void increaseStock(int IncStock){
        this.stock += IncStock;
    }
    //destructor 
    protected void finalize(){
        System.out.println("Laptop "+getModel()+" of "+getBrand()+"removed from Inventory");
    }
}

public class Task5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String Brand = inp.nextLine();
        String Model = inp.nextLine();
        double Price = inp.nextDouble();
        int Stock = inp.nextInt();

        Laptop laptop1 = new Laptop(Brand,Model,Price,Stock);
        Laptop laptop2 = new Laptop(laptop1);

        //displaying Laptop1 details
        System.out.println("Brand: "+laptop1.getBrand()+"\nModel:"+laptop1.getModel()+"\nPrice "+laptop1.getPrice()+"\nStock: "+laptop1.getStock());
        System.out.println("Brand: "+laptop2.getBrand()+"\nModel:"+laptop2.getModel()+"\nPrice "+laptop2.getPrice()+"\nStock: "+laptop2.getStock());

        laptop1 = null;
        System.gc();
        laptop2 = null;
        System.gc();
        inp.close();
    }
}
