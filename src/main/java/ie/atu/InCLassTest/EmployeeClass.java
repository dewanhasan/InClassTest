package ie.atu.InCLassTest;

public class EmployeeClass {
    public static void main(String[] args) {
        Employee Sean = new Employee("Sean","11211111234", "FullTime");
        System.out.println(Sean.toString());

        Employee Lucas = new Employee("Lucas","11266754353", "PartTime");
        System.out.println(Lucas.toString());
    }
}
