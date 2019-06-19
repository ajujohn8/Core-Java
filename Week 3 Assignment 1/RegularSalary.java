public class RegularSalary extends EmpRegular{
    private final int salary =15000;
    private final int bonus = 1000;
    private int value;

    public void salaryDetails(int salary, int bonus){
        System.out.println("My salary: " +salary);
    }
    public RegularSalary(int leave){
        super(leave);
        System.out.println("My salary: " +this.salary);
        System.out.println("My bonus: " +this.bonus);
    }
    public void print(){
        value = super.vacation();

        if(value >= 0){
        System.out.println("Leave approved, leave balance: " +value);
        System.out.println("");        

        }
        else{
        System.out.println("Not enough leave");
        System.out.println("");        
        }
    }

}