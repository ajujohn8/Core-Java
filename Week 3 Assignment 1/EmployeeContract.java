public class EmployeeContract{

    private int cantractDuration;
    private int payPerHour;
    
    public EmployeeContract(){
        this.cantractDuration = 60;
        this.payPerHour = 75;
    }

    public void contractVacation(int leaveVacation){

    if(leaveVacation > 1){
        cantractDuration = cantractDuration + leaveVacation;
        System.out.println("Your leave approved. Your Contract period is extended to: "+cantractDuration);
        System.out.println("Your salary of "+leaveVacation*9*75 + " will be deducted for " +leaveVacation +" leave days" );

    }
    }



}