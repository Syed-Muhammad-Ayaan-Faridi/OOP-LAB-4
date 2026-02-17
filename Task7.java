class Employee {

    private int empID;
    private String name;
    private double basicSalary;
    private int daysWorked;

    public Employee() {
        this.empID = 0;
        this.name = "Not Assigned";
        this.basicSalary = 0.0;
        this.daysWorked = 0;
    }

    public Employee(int empID, String name, double basicSalary, int daysWorked) {
        this.empID = empID;
        this.name = name;
        this.basicSalary = basicSalary;
        this.daysWorked = daysWorked;
    }

    public Employee(Employee obj) {
        this.empID = obj.empID;
        this.name = obj.name;
        this.basicSalary = obj.basicSalary;
        this.daysWorked = obj.daysWorked;
    }

    // Setter
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0)
            this.basicSalary = basicSalary;
        else
            System.out.println("Salary cannot be negative.");
    }

    public void setDaysWorked(int daysWorked) {
        if (daysWorked >= 0 && daysWorked <= 30)
            this.daysWorked = daysWorked;
        else
            System.out.println("Invalid number of days.");
    }

    // Getter Methods
    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public int getDaysWorked() {
        return daysWorked;
    }

    public double calculateSalary() {
        return (basicSalary / 30) * daysWorked;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Days Worked: " + daysWorked);
        System.out.println("Calculated Salary: " + calculateSalary());
        System.out.println("----------------------------");
    }
    protected void finalize() throws Throwable {
        System.out.println("Employee object with ID " + empID + " is removed.");
    }
}

public class Task7 {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.setEmpID(101);
        emp1.setName("Ali");
        emp1.setBasicSalary(30000);
        emp1.setDaysWorked(26);

        Employee emp2 = new Employee(102, "Sara", 45000, 28);

        Employee emp3 = new Employee(103, "Ahmed", 50000, 30);

        Employee emp4 = new Employee(emp2);

        emp4.setEmpID(104);
        emp4.setName("Sara Copy");

        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
        emp4.displayEmployee();

        emp1 = null;
        emp2 = null;
        emp3 = null;
        emp4 = null;

        System.gc();
    }
}
