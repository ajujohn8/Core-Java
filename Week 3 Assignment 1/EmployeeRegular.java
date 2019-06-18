public class EmployeeRegular{

    
    private int vacation;

    public EmployeeRegular(){
        this.vacation = 30;
    }
    

    public void vacationDays(int noOfDays){
        if( vacation > noOfDays){
            vacation = vacation  - noOfDays;
            System.out.println("Leave confirmed: " +vacation);
            System.out.println("Your Salary and bonus will be remain same");
        }
        else
        System.out.println("Not enough leave");
    }


}
