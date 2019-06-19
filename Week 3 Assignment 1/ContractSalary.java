public class ContractSalary extends EmpContract{
    private final int salary = 24000;
    private int value;

    
    public ContractSalary(int leave){
        super(leave);
    
    }
    public void print(){
        value = super.vacation();
        System.out.println("Leave approved, leave balance: " +value);
        System.out.println("Your per hour salary is: 50");
        System.out.println("Your contract salary for 60 days: " +salary);
        System.out.println("");        

    }

} 