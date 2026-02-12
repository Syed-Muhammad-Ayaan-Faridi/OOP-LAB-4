import java.util.Scanner;

class Box{
    double width;
    double height;
    public Box(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of box: ");
        double Height = sc.nextDouble();
        System.out.print("Enter Width of box: ");
        double Width = sc.nextDouble();
        if (Width > 0 && Height > 0) {
            this.height = Height;
            this.width = Width;
        }
        else {
            throw new IllegalArgumentException("Width must be positive");
        }
    }
    //
    public Box(double h,double w){
        if(h > 0 && w > 0){
            this.height = h;
            this.width = w;
        }
        else {
            throw new IllegalArgumentException("Width must be positive");
        }
    }
    public Box(double h, Scanner sc){
        if (h > 0) {
            this.height = h;
        }
        else{
            System.out.println("Height must be positive");
            this.height = 1;
        }
        System.out.print("Enter width of box:");
        double W = sc.nextDouble();
        if (W > 0) {
            this.width = W;
        }
        else{
            throw new IllegalArgumentException("Width must be positive");
        }
        sc.close();
    }

    public void print(){
        System.out.println("Your Box height is "+height+" and width is "+width);
    }
}
public class task1 {
    public static void main(String[] args) {
        //Constructor without parameter
        Box obj = new Box();
        obj.print();
        //Constructor with height parameter
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height of box: ");
        double Height = sc.nextDouble();
        Box b1 = new Box(Height,sc);
        b1.print();
        //Constructor with height and width parameter
        System.out.print("Enter Width of box: ");
        double Width = sc.nextDouble();
        Box obj2 = new Box(Height,Width);
        obj2.print();
        sc.close();
    }
}