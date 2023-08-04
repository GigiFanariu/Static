public class Employee {

    private final String name;
    private final String surname;
    private  final  String address;

    public Employee(String newEmployee, String newEmployeeSurname, String newEmployeeAddress) {
        this.name = newEmployee;
        this.surname = newEmployeeSurname;
        this.address = newEmployeeAddress;
    }
    public String getEmployeeDetails() {
        return String.format("\nName: %s\nSurname: %s\nAddress: %s", name, surname, address);
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAddress() {
        return address;
    }
    }

