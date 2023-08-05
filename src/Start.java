public class Start {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Gigi", "Fanariu", "via vincenzo bellini 32");
        Employee emp2 = new Employee("Mary", "Gloe", "via roma 20");

        Badge badge1 = new Badge(emp1);
        Badge badge2 = new Badge(emp2);

        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
