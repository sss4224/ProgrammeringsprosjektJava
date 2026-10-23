package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();


        
        Customer c1 = new Customer("Sebastian", "sebastian@example.com", 1001, PowerAgreementType.NORGESPRICE);
        Customer c2 = new Customer("Bob", "bob@example.com", 1409, PowerAgreementType.SPOTPRICE);
        Customer c3 = new Customer("Stine", "stine@example.com", 2761, PowerAgreementType.POWERSUPPORT);
        Customer c4 = new Customer("Finn", "finn@example.com", 1005, PowerAgreementType.NORGESPRICE);
        
        Invoice faktura1 = new Invoice(c1, Month.SEPTEMBER, CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice faktura2 = new Invoice(c2, Month.APRIL, CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice faktura3 = new Invoice(c3, Month.DESEMBER, CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);
        Invoice faktura4 = new Invoice(c4, Month.JANUAR, CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        
        faktura1.computeAmount();
        faktura2.computeAmount();
        faktura3.computeAmount();
        faktura4.computeAmount();
        
        Invoice[] fakturaListe = {faktura1, faktura2, faktura3, faktura4};

        Invoices.processInvoices(fakturaListe);
    }
}
