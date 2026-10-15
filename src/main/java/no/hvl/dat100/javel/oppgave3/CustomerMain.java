package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer customer1 = new Customer(
            "Alice Smith",
            "alice@example.com",
            1001,
        PowerAgreementType.SPOTPRICE
        );

        Customer customer2 = new Customer(
            "Sebastian",
            "sebastian@example.com",
            1002,
            PowerAgreementType.NORGESPRICE
        );

        System.out.println(customer1);
        System.out.println(customer2.getName());
    }
}
