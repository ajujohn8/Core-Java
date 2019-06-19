class EmpRegular extends Employee{
    private int noOfDays = 20;
    private int leave;

    public EmpRegular(int leave){
        this.leave = leave;
    }
    @Override
    public int vacation(){
        //if(leave >  noOfDays){
        return noOfDays - leave;//}
       // else
       // return 0;
    }
}