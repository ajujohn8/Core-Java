class BankCurrent extends BankAccount{
    private int balance;
    private int moneyWanted;

    public BankCurrent(int balance,int moneyWanted){
        this.moneyWanted = moneyWanted;
        this.balance = balance;
    

    }

    @Override
    public int money(){
        return balance - moneyWanted;
    }

}