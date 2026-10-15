package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int  getId(){
        return customer_id;
    }
    public void setId(int cusotmer_id){
        this.customer_id = cusotmer_id;
    }

    public PowerAgreementType agreement(){
        return agreement;
    }
    public void setAgreement(PowerAgreementType agreement){
        this.agreement = agreement;
    }


    @Override 
    public String toString(){
        return "Customer{name='" + name + "', email='" + email + "', customer_id=" + customer_id + ", agreement=" + agreement + "}";
    }

}
