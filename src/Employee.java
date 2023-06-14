
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double taxAmount = 0;
        if (salary>1000){
            taxAmount=salary * 0.03;
        }
        return taxAmount;
    }
    public double bonus(){
        int extraHours = workHours - 40;
        double bonusAmount = extraHours * 30;
        return bonusAmount;
    }
    public double totalSalary() {
        return salary + bonus() - tax();
    }
    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        double raisePercentage = 0;
        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            raisePercentage = 0.1;
        } else if (yearsWorked >= 20) {
            raisePercentage = 0.15;
        }

        double raiseAmount = salary * raisePercentage;
        double raiseSalary = totalSalary() + raiseAmount;
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Salary: " + salary + "\n" +
                "Work Hours: " + workHours + "\n" +
                "Hire Year: " + hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Salary Increase: " + (raiseSalary()-totalSalary()) + "\n" +
                "Total Salary (including tax and bonus): " + totalSalary() + "\n" +
                "Total Salary: " + (raiseSalary());
    }
    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000, 45, 1985);
        employee.raiseSalary();
        System.out.println(employee.toString());
    }
}
