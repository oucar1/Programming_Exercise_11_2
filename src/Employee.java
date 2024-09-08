class Employee extends Person {
    String office;
    double salary;
    String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String toString() {
        return "Employee: " + name;
    }
}
