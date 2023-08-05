
public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    private String generateBadgeIdCode() {
        String randomPrefix = "XYZ";
        String randomSuffix = "ZYX";
        return randomPrefix + employee.name + employee.surname + randomSuffix;
    }

    public void showBadgeDetails() {
        System.out.println("Total number of employees tracked by the badges: " + totalNumberOfEmployees);
        System.out.println("Employee Details:\n" + employee.getEmployeeDetails());
        System.out.println("Badge ID Code: " + badgeIdCode);
    }

    public Badge(Employee employeeThatNeedsBadge) {
        keepTrackOfEmployeesNumber();
        this.employee = employeeThatNeedsBadge;
        this.badgeIdCode = generateBadgeIdCode();
    }
    }

