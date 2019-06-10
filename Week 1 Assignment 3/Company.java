import java.util.Scanner;
public class Company{  
    public static void main( String[] args )  
    {  
        Scanner input = new Scanner(System.in);
        System.out.print("Input company stock code: ");
        String nameofcompany = input.next();
        
        switch (nameofcompany) {
            case "INF":
                System.out.println("Infosys");
                break;
            case "TCS":
                System.out.println("Tata Consultancy Services");
                break;
            case "RIL" :
                System.out.println("Reliance Industries");
                break;
        
            default:
                System.out.println("Not Mapped");
                break;
        }
    }
}