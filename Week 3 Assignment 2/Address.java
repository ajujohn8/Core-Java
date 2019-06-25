class Address{
    private String id;
    private String name;
    private String address;
    private String phoneNumber;

    public Address(String id , String name , String address , String phoneNumber){
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void detailAddress(){
        System.out.println("");
        System.out.println("ID: " +this.id);
        System.out.println("Name: " +this.name);
        System.out.println("Address:" +this.address);
        System.out.println("Phone Number" +this.phoneNumber);
    }
}