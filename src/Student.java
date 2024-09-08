class Student extends Person {
    // Student status: freshman, sophomore, junior, or senior.
    String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public String toString() {
        return "Student: " + name;
    }
}
