package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();


        Customers liste = new Customers(5);

        System.out.println(liste.countNonNull());

        System.out.println(liste.getCustomer(1001));

        Customer customer1 = new Customer("Bob Harldsen", "bob@example.com", 1000, PowerAgreementType.NORGESPRICE);
        Customer customer2 = new Customer("Bob Harldsen", "bob@example.com", 1001, PowerAgreementType.NORGESPRICE);
        Customer customer3 = new Customer("Bob Harldsen", "bob@example.com", 1002, PowerAgreementType.NORGESPRICE);
        Customer customer4 = new Customer("Bob Harldsen", "bob@example.com", 1003, PowerAgreementType.NORGESPRICE);
        Customer customer5 = new Customer("Bob Harldsen", "bob@example.com", 1004, PowerAgreementType.NORGESPRICE);
        Customer customer6 = new Customer("Bob Harldsen", "bob@example.com", 1005, PowerAgreementType.NORGESPRICE);


        System.out.println(liste.addCustomer(customer1));
        System.out.println(liste.addCustomer(customer2));
        System.out.println(liste.addCustomer(customer3));
        System.out.println(liste.addCustomer(customer4));
        System.out.println(liste.addCustomer(customer5));
        //Skal ikke eksistere til slutt
        System.out.println(liste.addCustomer(customer6));

        //Fjerner customer med ID 1002
        System.out.println(liste.removeCustomer(1002));

        System.out.println(liste.addCustomer(customer6));

        Customer[] antallKunder = liste.getCustomers();

        for(int i = 0; i < antallKunder.length; i++){
            System.out.println(antallKunder[i]);
        }
    }
}
