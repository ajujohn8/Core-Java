class EmpContract extends Employee{

    private int noOfDays = 60;
    private int leave;

    public EmpContract( int leave){
        this.leave = leave;
    }
    @Override
    public int vacation(){
        return noOfDays + leave;
    }


}