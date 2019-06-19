class EmpContract extends Employee{

    private int noOfDays = 60;
    private int vacation;

    public EmpContract( int vacation){
        this.vacation = vacation;
    }
    @Override
    public int vacation(){
        return noOfDays + vacation;
    }


}