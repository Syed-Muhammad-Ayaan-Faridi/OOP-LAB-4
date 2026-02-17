class Holiday{
    String Name;
    int Day;
    String Month;
    public Holiday(String name,int day,String month){
        this.Name = name;
        this.Day = day;
        this.Month = month;
    }
    public boolean inSameMonth(Holiday obj){
        return this.Month.equalsIgnoreCase(obj.Month);
    }
    //4(b) Copy Constructor
    public Holiday(Holiday Object){
        this.Month = Object.Month;
        this.Name = Object.Name;
        this.Day = Object.Day;
    }
    //getters to show 
    public int getDay() {
        return Day;
    }
    public String getMonth() {
        return Month;
    }
    public String getName() {
        return Name;
    }
}
public class Task4 {
    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Independence Day", 14, "August");
        Holiday holiday2 = new Holiday(holiday1);
        System.out.println(holiday2.getName());
        System.out.println(holiday2.getDay());
        System.out.println(holiday2.getMonth());
    }
}
