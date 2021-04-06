package Package1;
public class Main {
    public static void main(String[] args) {
        System.out.println("For Manager-->");
        Manager M1 = new Manager();
        M1.getBonus();
        M1.checkingFile();
        M1.monitorActivitites();
        System.out.println("For Staff-->");
        Staff S1 = new Staff();
        S1.getBonus();
        S1.checkingFile();
        S1.monitorActivitites();
        System.out.println("For Salesperson-->");
        Salesperson Saleman1 = new Salesperson();
        Saleman1.getBonus();
        Saleman1.checkingFile();
        Saleman1.monitorActivitites();
        System.out.println("For Customer-->");
        Customer c1 = new Customer();
        c1.eid_discount();
        
    }
    
}
