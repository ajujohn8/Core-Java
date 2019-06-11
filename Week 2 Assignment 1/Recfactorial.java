import java.util.Scanner;

public class Recfactorial{
    static int factorial(int val){

        if(val == 1){
            System.out.print("Enter output: ");

            return 1;
        }
        else
        return val * factorial( val - 1);
    }

    public static void main(String args[]){
        System.out.print("Enter Input factorial: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        int scan = factorial(value);
        System.out.print("Enter output: ");
        System.out.print(scan);
        input.close();
    }
}