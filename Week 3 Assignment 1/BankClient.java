import java.util.*;
public class BankClient{
    public static void main(String Args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = input.next();
        
        System.out.print("Acc No.: ");
        int accNo = input.nextInt();
        
        System.out.print("Account creation date : ");
        String accCreationDate = input.next();
        
        System.out.print("Branch Name: ");
        String branchName = input.next();

        System.out.println(" ");
        System.out.println("Address ");

        System.out.print("Enter flat no: ");
        String flatno = input.next();

        System.out.print("Enter Street: ");
        String street = input.next();

        System.out.print("Enter City: ");
        String city = input.next();

        System.out.print("Enter State: ");
        String state = input.next();

        System.out.print("Enter pin code: ");
        String pincode = input.next();

        System.out.println(" ");
        System.out.print("Enter Nominee of your account: ");
        String nominee = input.next();


        System.out.println(" ");

        System.out.print("Balance: ");
        int balance = input.nextInt();
        
        System.out.println(" ");
        System.out.print("Type  of account(Current,Saving or salary): ");
        String accType = input.next();
        String yesNo;
        int withDrawAmt;
        System.out.println(" ");


        do{
        if(accType.equalsIgnoreCase("Saving")){   
        if( balance >= 1000 ){
        System.out.print("Please enter withdraw amount: ");
        withDrawAmt = input.nextInt();

        BankSaving banksaving = new BankSaving(balance,withDrawAmt);
        banksaving.moneyTake(withDrawAmt);
        balance = banksaving.money();
        if(balance >= 1000){
        System.out.println(" ");
        System.out.print("Your remaining amount is: " +balance);
        System.out.println(" ");

        }
        else{
            System.out.println(" ");
            System.out.println("Balance below thousand");
            System.out.println(" ");

        }
        
        }
        else{
            System.out.println(" ");
            System.out.print("Your balance below minimum requirment");
            System.out.println(" ");


        }

        }
        else if(accType.equalsIgnoreCase("Current")){
            if(balance > 25000){    
            System.out.print("Please enter withdraw amount: ");
            withDrawAmt = input.nextInt();
            BankCurrent bankcurrent = new BankCurrent(balance,withDrawAmt);
            balance = bankcurrent.money();
            System.out.println(" ");
            System.out.print("Your remaining amount is: " +balance);
            System.out.println(" ");

        }
        else{        
            System.out.println(" ");
            System.out.print("Your balance below minimum requirment");
            System.out.println(" ");


        }

        }
        else if(accType.equalsIgnoreCase("Salary")){
            if(balance > 1){
            System.out.print("Please enter withdraw amount: ");
            
            withDrawAmt = input.nextInt();
            BankSaving banksaving = new BankSaving(balance,withDrawAmt);
            banksaving.moneyTake(withDrawAmt);
            
            balance = banksaving.money();
            
            System.out.println(" ");
            System.out.print("Your remaining amount is: " +balance);
            System.out.println(" ");

            }

            else{
                System.out.println(" ");
                System.out.print("Your balance is zero");
                System.out.println(" ");

            }
            
        }
        else
        {        
            System.out.println(" ");
            System.out.println("Wrong Input ");
            System.out.println(" ");


        }
        System.out.println(" ");

        BankAddress bankAddress = new BankAddress(flatno, street, city, state, pincode);
        bankAddress.details();
        System.out.println(" ");

        BankNominee bankNominee = new BankNominee(nominee);
        bankNominee.changeNomiee();
        System.out.println(" ");

        System.out.print("Do want to withdraw and change nominee again: ");
        yesNo = input.next();
        }while(yesNo.equalsIgnoreCase("yes"));
    
            }
    
    
}