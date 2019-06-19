public class BankAddress{
    private String flatno;
    private String street;
    private String city;
    private String state;
    private String pincode;

    public BankAddress( String flatno,String street,String city,String state,String pincode){
        this.flatno = flatno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public void details(){
        System.out.println("Your Flat no.: " +flatno);
        System.out.println("Your street: " +street);
        System.out.println("Your city: " +city);
        System.out.println("Your state: " +state);
        System.out.println("Your Pincode: " +pincode);

    }

}
