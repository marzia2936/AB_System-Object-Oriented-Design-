package Package1;
public class Manager extends Employee {

    @Override
    public void getBonus() {
        System.out.println("He/She will get 15% Bonus"+salary*0.15);
    }

    @Override
    public void checkingFile() {
    System.out.println("Checking file on system construction");

    }

    @Override
    public void monitorActivitites() {
        System.out.println("Monitoring activities on company development");
    }
    
}
