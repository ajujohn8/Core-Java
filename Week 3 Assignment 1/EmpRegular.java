class EmpRegular extends Employee{
    private int noOfDays = 20;
    private int vacation;

    public EmpRegular(int vacation){
        this.vacation = vacation;
    }
    @Override
    public int vacation(){
        if(vacation >  noOfDays){
        return noOfDays - vacation;}
        else
        return 0;
    }
}