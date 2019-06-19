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
    

        RegularSalary regSal = new RegularSalary(leave);
        regSal.print();
       
    }
    else if(employeeType.equalsIgnoreCase("Contract")){

        ContractSalary conSal = new ContractSalary(leave);
        conSal.print();
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