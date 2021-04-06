package Package1;
public class Staff extends Employee implements IDiscount {

    @Override
    public void getBonus() {
    System.out.println("He/She will get 15% Bonus"+salary*0.10);

    }

    @Override
    public void checkingFile() {
        System.out.println(" Checking file on risk management");
    }

    @Override
    public void monitorActivitites() {
        System.out.println("Monitoring activities on website development");
    }

    @Override
    public void eid_discount() {
        System.out.println("Geting 5% eid discount based on their working hours");
    }
    
}
