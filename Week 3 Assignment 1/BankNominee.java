import java.util.Scanner;
public class BankNominee{

    private String nomineeName;

    public BankNominee(String nomineeName){
        this.nomineeName = nomineeName;
    }

    public String changeNomiee(){
        System.out.println("  ");
    
        System.out.print("Your current nominee name is: " +this.nomineeName);
        System.out.println("  ");
    
        System.out.print("Do you want to change the nominee: ");
        Scanner input = new Scanner(System.in);
        String noYes = input.next();
        System.out.println("  ");
    
        if(noYes.equalsIgnoreCase("Yes")){
        System.out.print("Please enter new nominee name: ");
        String newNominee = input.next();
        nomineeName = newNominee;
        System.out.println("  ");
        System.out.println("  ");
    
        }
        else 
        {

        System.out.print("Nominee not changed ");
    
        }
        
        return nomineeName;
            
        }
}