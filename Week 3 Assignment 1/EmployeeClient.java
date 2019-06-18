import java.util.Scanner;
public class EmployeeClient{
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
    
    System.out.println(" ");
    System.out.print("Employee Type (Contract or Regular): ");
    String employeeType =  input.next();
    int noOfVacation = 0;
    
    if(employeeType.equalsIgnoreCase("Regular"))
    {
    
    System.out.print("No. of Leave required: ");
    noOfVacation = input.nextInt();
    
    EmployeeRegular empR = new EmployeeRegular();
    empR.vacationDays(noOfVacation);
    }

    else if(employeeType.equalsIgnoreCase("Contract")){
    System.out.print("No. of Leave required: ");
    noOfVacation = input.nextInt();
    
    EmployeeContract empC = new EmployeeContract();
    empC.contractVacation(noOfVacation);     
    }

    else {
        System.out.println("wrong input");
    }

    System.out.println(" ");

    EmployeeDetails empD = new EmployeeDetails(id1,name1,age1);
    empD.details(noOfSkill,skill);

    input.close();

}
}