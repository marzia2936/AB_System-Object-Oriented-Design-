package Package1;
public class Salesperson extends Employee implements IDiscount {

    @Override
    public void getBonus() {
   System.out.println("He/She will get 15% Bonus"+salary*0.08);

    }

    @Override
    public void checkingFile() {
        System.out.println("Checking file on swoat analysis");
    }

    @Override
    public void monitorActivitites() {
        System.out.println("Monitoring activities on employee development");
        
    }

    @Override
    public void eid_discount() {
        System.out.println("Geting 3% eid bonus on their selling products");
    }
    
}
