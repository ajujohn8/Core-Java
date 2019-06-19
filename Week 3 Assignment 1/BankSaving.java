class BankSaving extends BankAccount{
    private int moneyWithdraw;
    private int balance;
    private int moneyWanted;

    public BankSaving(int balance, int moneyWanted){
        this.moneyWithdraw = 25000;
        this.balance = balance;
        this.moneyWanted = moneyWanted;

    }

    public void moneyTake(int moneyWanted){
        if(moneyWanted > moneyWithdraw){
            System.out.println("Limit exceeded");
        }
        else{
            System.out.println("limit Ok");
            
        }
    }
    @Override
    public int money(){
        return balance - moneyWanted;
    }


}