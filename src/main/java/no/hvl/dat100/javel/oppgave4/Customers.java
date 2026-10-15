package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        this.customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {


        int count = 0;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] != null){
                count++;
            }
        }

        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] != null){
                if(customers[i].getId() == customer_id){
                    c = customers[i];
                    break;
                }
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] == null){
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for(int i = 0; i < customers.length; i++){
            if(customers[i] != null){
                if(customers[i].getId() == customer_id){
                    c = customers[i];
                    customers[i] = null;
                    break;
                }
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int antallLedig = countNonNull();

        Customer[] customers = new Customer[antallLedig];

        int count = 0;

        for(int i = 0; i < this.customers.length; i++){
            if(this.customers[i] != null){
                customers[count] = this.customers[i];
                count++;
            }
        }
        

        return customers;
    }
}