public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ozgur Ucar", "15408 Royal Grove Court", "317-5150955", "ozgur@assignment.com");
        Student student = new Student("Utku Ucar", "9542 Carlyle Court", "317-0000011", "utku@assignment.com", "Freshman");
        Employee employee = new Employee("Dusan Tadic", "123 Shark", "317-0000022", "dusan@assignment.com", "Office 100", 50000, "09/02/2024");
        Faculty faculty = new Faculty("Dominik Livakovic", "456 Dolphin St", "317-0000033", "dominik@assignment.com", "Office 101", 40000, "06/01/2020", "9 AM - 5 PM", "Professor");
        Staff staff = new Staff("Edin Dzeko", "789 Whale St", "317-0000044", "edin@assignment.com", "Office 102", 45000, "01/01/2018", "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
