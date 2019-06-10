import java.util.Scanner;
public class Age_factor{
    public static void main(String args[]){
        System.out.print("Input Age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        input.close();

        if(age < 2){
            System.out.println("Infant");
        }

        else if(age > 2 && age < 12){
            System.out.println("Child ");
        }
        else if(age > 12 && age < 18){
            System.out.println("Teenage ");
        }
        else if(age > 18 && age < 58){
            System.out.println("Adult ");
        }
        else if(age > 58){
            System.out.println("Senior Citizen ");

        }

    }
}