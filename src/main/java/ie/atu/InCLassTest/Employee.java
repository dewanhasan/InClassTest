package ie.atu.InCLassTest;

public class Employee {
    private String name;
    private String PPSN;
    private String type;

    public Employee() {
    }

    public Employee(String name, String PPSN, String type) {
        this.name = name;
        this.PPSN = PPSN;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee Data\n" +
                "\nname:" + name  +
                "\nPPSN:" + PPSN +
                "\ntype:" + type ;
    }
}
