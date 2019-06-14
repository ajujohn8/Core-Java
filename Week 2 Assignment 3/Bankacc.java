import java.util.Scanner;

public class Bankacc{
    public static int depositChallan(String name,int accountBalance){
        
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Please fill the form to deposit money");
        System.out.println("  ");
        System.out.print("Enter your name: ");
        Scanner input1 = new Scanner(System.in);
        String accholder = input1.next();
        System.out.println("  ");

        System.out.print("Enter your account number: ");
        int accNo = input1.nextInt();
        System.out.println("  ");

        System.out.print("Enter date(format DDMMYYYY): ");
        int date = input1.nextInt();
        System.out.println("  ");

        System.out.print("Enter Amount to deposit: ");
        int amount = input1.nextInt();
        System.out.println("  ");

        System.out.println("Enter Mulitiplication of amount(Note wise)");
        System.out.println("  ");

        System.out.print("Enter no. of 2000 notes: ");
        int twoT = input1.nextInt();

        System.out.print("Enter no. of 500 notes: ");
        int fiveH = input1.nextInt();

        System.out.print("Enter no. of 200 notes: ");
        int twoH = input1.nextInt();

        System.out.print("Enter no. of 100 notes");
        int oneH = input1.nextInt();

        System.out.print("Enter no. of 50 notes: ");       
        int fiveTen = input1.nextInt();

        System.out.print("Enter no. of 20 notes: ");
        int twoTen = input1.nextInt();

        System.out.print("Enter no. of 10 notes: ");
        int oneTen = input1.nextInt();

        System.out.print("Enter no. of 5 coins: ");
        int fiveC = input1.nextInt();

        System.out.print("Enter no. of 2 coins: ");
        int twoC = input1.nextInt();

        System.out.print("Enter no. of 1 coins: ");
        int OneC = input1.nextInt();
        System.out.println("  ");
        System.out.println("  ");


        int totalAmount = 0;
        totalAmount = twoT * 2000 + fiveH * 500 + twoH * 200 + oneH * 100+ fiveTen * 50 + twoTen * 20 +oneTen *10 +fiveC *5 +twoC * 2 + OneC * 1;
        if( totalAmount == amount){
            if(totalAmount < 50000){
            System.out.print("Please Enter Amount in words: ");
            String amtWords = input1.next();
            System.out.println("  ");
  
            System.out.print("Please do a digital signature: ");
            String sign = input1.next();
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");

            accountBalance = totalAmount + accountBalance;
            System.out.print("Your amt has deposit successfully");
            System.out.println("  ");
            System.out.println("  ");


            }

            else if(totalAmount >= 50000){
            System.out.print("Please Enter Pan Card No.: ");
            String panCard = input1.next();
            System.out.println("  ");

            System.out.print("Please Enter Amount in words: ");
            String amtWords = input1.next();  
            System.out.println("  ");
   
            System.out.print("Please do a digital signature: ");
            String sign = input1.next();
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");

            System.out.print("Your amt has deposit successfully ");
            System.out.println("  ");
            System.out.println("  ");

            accountBalance = totalAmount + accountBalance;

            }
        }

        else{
            System.out.println("  ");
            System.out.println("  ");

            System.out.print("Invalid Amount");
            System.out.println("  ");
            System.out.println("  ");

        }
        System.out.print("Your amt has deposit successfully Current bal: " +totalAmount);

        return accountBalance;
    }

    public static int withdrawChallan(String name,int accountBalance){
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("WITHDRAW CHALLAN");
        System.out.println("  ");

        System.out.print("Please fill the details to withdraw money ");
        System.out.println("  ");
        System.out.println("  ");

        System.out.print("Enter your name: ");
        Scanner input2 = new Scanner(System.in);
        String accholder = input2.next();
        System.out.println("  ");

        System.out.print("Enter your account number: ");
        int accNo1 = input2.nextInt();
        System.out.println("  ");


        System.out.print("Enter date(format DDMMYYYY): ");
        int date1 = input2.nextInt();
        System.out.println("  ");


        System.out.print("Please enter the amount you want to withdraw: ");
        int amount1 = input2.nextInt();
        System.out.println("  ");

        accountBalance = accountBalance - amount1;

        System.out.print("Please Enter Amount in words: ");
        String amtWords1 = input2.next();     
        System.out.println("  ");


        System.out.print("Please do a digital signature: ");
        String sign1 = input2.next();
        System.out.println("  ");
        System.out.println("  ");



        System.out.print("Your amt has deposit successfully");
        System.out.println("  ");
        System.out.println("  ");


        return accountBalance;


    }
    public static int atmDeposit(int accountBalance,int pinNo1){
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("ATM Deposit ");
        System.out.println("  ");

        System.out.print("Please fill the details to deposit money ");
        System.out.println("  ");
        Scanner input3 = new Scanner(System.in);
        System.out.println("  ");

        System.out.print("Enter your account pin: ");
        int pinNo11 = input3.nextInt();
        System.out.println("  ");

        if(pinNo11 == pinNo1){
        System.out.print("Please enter the amount you want to deposit: ");
        int amount2 = input3.nextInt();
        System.out.println("  ");
        System.out.println("  ");

        accountBalance = accountBalance + amount2;

        System.out.print("Your amt has deposit successfully");
        System.out.println("  ");
        System.out.println("  ");

        }
        else{
            System.out.print("Pin no. not matching ");         
            System.out.println("  ");
            System.out.println("  ");
        }

        return accountBalance;
    }

    public static int atmWithdraw(int accountBalance, int pinNo2){
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("ATM Withdraw ");
        System.out.println("  ");
        System.out.println("  ");


        System.out.print("Please fill the details to withdraw money ");

        Scanner input4 = new Scanner(System.in);
       
        System.out.print("Enter your account pin: ");
        int pinNo22 = input4.nextInt();
        System.out.println("  ");

        if(pinNo22 == pinNo2){

        System.out.print("Please enter the amount you want to withdraw: ");
        int amount3 = input4.nextInt();
        accountBalance = accountBalance - amount3;
        System.out.println("  ");
        System.out.println("  ");


        System.out.print("Your amt has deposit successfully");
        System.out.println("  ");
        System.out.println("  ");

        }
        else{
        System.out.println("  ");
        System.out.print("Pin no. not matching ");

        }
        return accountBalance;


    }

    public static int accountMoney(int accountBalance){
    System.out.println("  ");
    System.out.println("  ");

    System.out.print("Your account balance is: " +accountBalance);
    System.out.println("  ");
    System.out.println("  ");

    return accountBalance;
    }

    public static String changeNomiee(String nomineeName){
    System.out.println("  ");

    System.out.print("Your current nominee name is: " +nomineeName);
    System.out.println("  ");

    System.out.print("Do you want to change the nominee: ");
    Scanner input5 = new Scanner(System.in);
    String yesNO = input5.next();
    System.out.println("  ");

    if(yesNO.equalsIgnoreCase("Yes")){
    System.out.print("Please enter new nominee name: ");
    String newNominee = input5.next();
    nomineeName = newNominee;
    System.out.println("  ");
    System.out.println("  ");

    }
    else 
    {
    System.out.println("  ");

    System.out.print("Thank you ");
    System.out.println("  ");
    System.out.println("  ");

    }
    
    return nomineeName;
        
    }

    public static void main(String args[]){
        //OPEN BANK ACCOUNT
        String customerName;
        int customerAge = 0;
        int accBalance = 0;
        String nominee;
        String panNumber;
        int pinNumber = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the customer details to open a bank account");
        System.out.println("  ");
        System.out.println("  ");

        System.out.print("Enter the customer Name: ");
        customerName = input.next();
        System.out.println("  ");

        System.out.print("Enter the customer Age: ");
        customerAge = input.nextInt();
        System.out.println("  ");

        System.out.print("Enter your account pin: ");
        pinNumber = input.nextInt();
        System.out.println("  ");

        System.out.print("Enter the nominee name: ");
        nominee = input.next();
        System.out.println("  ");

        System.out.print("Enter the customer Pan Number: ");
        panNumber = input.next();
        System.out.println("  ");

        /*if(panNumber.length == 10){
            System.out.print("Enter the nominee name: ");
        }
        else{
            System.out.print("Length should be of 10 digit ");
            panNumber = input.nextInt();
        }*/
        String continueNext;
     
        do{
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Please enter one of our facilities(Please type numbers from given list)");
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("1. ChallanDeposit ");
        System.out.println("2. ChallanWithdraw ");
        System.out.println("3. ATMDeposit");
        System.out.println("4. ATMWithdraw");
        System.out.println("5. AccountBalance");
        System.out.println("6. ChangeNominee");
        System.out.println("  ");
        System.out.println("  ");
        System.out.print("Enter Details: ");
        String facilities = input.next();

        switch (facilities) {
            case "1":
            accBalance = depositChallan(customerName, accBalance);
            break;

            case "2":
            accBalance = withdrawChallan(customerName, accBalance);
            break;

            case "3":
            accBalance = atmDeposit(accBalance,pinNumber);
            break;

            case "4":
            accBalance = atmWithdraw(accBalance,pinNumber);
            break;

            case "5":
            accountMoney(accBalance);
            break;

            case "6":
            nominee = changeNomiee(nominee);
            break;

            default:
                System.out.println("WRONG CHOICE");
                break;
        }
        System.out.println("  ");
        System.out.println("  ");

    System.out.print("Do want to continue: ");
    continueNext = input.next();
    }while(continueNext.equalsIgnoreCase("Yes"));
    
    System.out.println("THANK YOU ");



    }
}