import java.util.Scanner;

public class Recfebonacci{
    static int firstNumber = 0;
    static int secondNumber = 1;
    static int thirdNumber = 0;

    static void febonacci(int count1){

        if(count1 > 0){
            thirdNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            
            System.out.print(" ");

            System.out.print(+thirdNumber);
            febonacci(count1-1);

        }

        
    }


    public static void main(String args[]){
        
        System.out.print("Count for Febonacci Series: ");
        
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.print(firstNumber+" "+secondNumber);

        febonacci(count - 2);
        input.close();
        
    }
}