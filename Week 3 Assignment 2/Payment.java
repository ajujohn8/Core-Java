interface Payment{
    public abstract void Service();
}

class Debit implements Payment{
    String id;
    String type;
    public Debit (String id, String type){
        this.id = id;
        this.type = type;
    }

public void Service(){

    System.out.println("Id: " +id +"  Type:" +type);
    System.out.println("Payment done");
    }
}

class Credit implements Payment{
    String id;
    String type;
    public Credit (String id, String type){
        this.id = id;
        this.type = type;
    }

public void Service(){

    System.out.println("Id: " +id +"  Type :" +type);
    System.out.println("Payment done");

    }

}
class Netbanking implements Payment{
    String id;
    String type;
    public Netbanking (String id, String type){
        this.id = id;
        this.type = type;
    }

public void Service(){

    System.out.println("Id: " +id +"  Type: " +type);
    System.out.println("Payment done");


    }
}
