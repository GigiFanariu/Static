public class Start {
    public static void main(String[] args) {

        Employee employee1 = new Employee(" Gigi", "Fanariu", "Via vincenzo bellini, 32");
        Badge badge1 = new Badge(employee1);
        System.out.println("badge 1 details");
        badge1.showBadgeDetails();

        Employee employee2 = new Employee("Federica", "Vecchio", "VIa roma, 15");
        Badge badge2 = new Badge(employee2);
        System.out.println("\nbadge 2 details:");
        badge2.showBadgeDetails();
    }
}
