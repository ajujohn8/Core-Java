import java.util.Scanner;

class EmpClient{
   

    public static void main(String args[]){
        System.out.println(" ");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Employee ID: ");
        int id1 = input.nextInt();
        
        System.out.print("Name: ");
        String name1 = input.next();
        
        System.out.print("Age: ");
        int age1 = input.nextInt();
        
        System.out.print("No. of Skill: ");
        int noOfSkill = input.nextInt();
        
        String skill[] = new String[noOfSkill];
        
        for(int index = 0; index < noOfSkill; index ++){
            System.out.print("Skill "+(index+1) +": ");
            skill[index] = input.next();
        }
        System.out.print("Enter no. days want leave: ");
        
        int leave = input.nextInt();
        System.out.println(" ");
        System.out.print("Employee Type (Contract or Regular): ");
    String employeeType =  input.next();
    
    if(employeeType.equalsIgnoreCase("Regular")){
    

        EmpRegular empReg = new EmpRegular(leave);
        int leaveBalanceRegular = execute(empReg);
        if(leaveBalanceRegular >= 0){
        System.out.println("Leave applied, No of leave available: "+leaveBalanceRegular);
        System.out.println(" ");}
        else{
            System.out.println("No leave available ");

        }

    }
    else if(employeeType.equalsIgnoreCase("Contract")){
        EmpContract empCon = new EmpContract(leave);
        int leaveBalanceContract = execute(empCon);
        System.out.println("Leave applied, No of contract period extended by: "+leaveBalanceContract);
        System.out.println(" ");
    }
    else {
        System.out.println("wrong input");
    }

        EmployeeDetails empdetails = new EmployeeDetails(id1, name1, age1);
        empdetails.details(noOfSkill,skill);

    }

        public static int execute(Employee employee){
            return employee.vacation();
        }

        

    

}