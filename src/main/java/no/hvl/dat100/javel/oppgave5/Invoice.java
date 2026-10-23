package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, Month month, double[][] usage, double[][] power_prices) {

        this.c = c;
        this.usage = usage;
        this.month = month.name().substring(0, 1).toUpperCase() +
        month.name().substring(1).toLowerCase();
        this.prices = power_prices;
        this.amount = 0.0;

    }

    public void computeAmount() {

        final double THRESHOLD = 0.9375;
        final double PERCENTAGE = 0.9;
        final double NORGESPRIS_KWH = 0.5;

        PowerAgreementType agreement = this.c.agreement();

        this.amount = 0;

        switch(agreement){
            case SPOTPRICE:
                for(int i = 0; i < usage.length; i++){
                    for(int j = 0; j < usage[i].length; j++){
                        this.amount += this.usage[i][j] * this.prices[i][j];
                    }
                }
                break;

            case POWERSUPPORT:

                for(int i = 0; i < usage.length; i++){
                    for(int j = 0; j < usage[i].length; j++){
                        double currentPrice = this.prices[i][j];
    
                        if(currentPrice > THRESHOLD){
                            double support = (currentPrice - THRESHOLD) * PERCENTAGE;
                            currentPrice = currentPrice - support;
                        }
                        this.amount += this.usage[i][j] * currentPrice;
                    }
                }
                break;

            case NORGESPRICE:
                for(int i = 0; i < usage.length; i++){
                    for(int j = 0; j < usage[i].length; j++){
                        this.amount += usage[i][j] * NORGESPRIS_KWH;
                    }
                }
                break;

            default:
                System.out.println("Det er ikke valgt noen strømavtale");
                break;
        }

    }

    public void printInvoice() {

        double totUsage = 0;

        for(int i = 0; i < this.usage.length; i++){
            for(int j = 0; j < this.usage[i].length; j++){
                totUsage += this.usage[i][j];
            }
        }

        System.out.println(
            "Customer number " + c.getId() + 
            "\nName " + c.getName() +
            "\nEmail " + c.getEmail() +
            "\nAgreement " + c.agreement() +
            "\n\nMonth: " + this.month +
            "\nUsage: " + String.format("%.2f", totUsage) + " kWh" +
            "\nAmount: " + String.format("%.2f", this.amount) + " NOK");
    }
}
