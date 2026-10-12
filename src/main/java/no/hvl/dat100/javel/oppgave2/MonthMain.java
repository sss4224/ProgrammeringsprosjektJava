package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DayPowerData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        System.out.println("Oppgave a)");
        MonthlyPower.print_PowerUsage(power_usage_month);
        System.out.println("");

        System.out.println("Oppgave b)");
        MonthlyPower.print_PowerPrices(power_prices_month);
        System.out.println("");

        System.out.println("Oppgave c)");
        System.out.printf("%.2f kWh\n", MonthlyPower.computePowerUsage(power_usage_month));
        System.out.println("");

        System.out.println("Oppgave d)");
        System.out.println("Hytte: " + MonthlyPower.exceedThreshold(power_usage_month, 1000));
        System.out.println("Primær Hus: " + MonthlyPower.exceedThreshold(power_usage_month, 5000));
        System.out.println("");

        System.out.println("Oppgave e)");
        System.out.printf("%.2f\n" ,MonthlyPower.computeSpotPrice(power_usage_month, power_prices_month));
        System.out.println("");

        System.out.println("Oppgave f)");
        System.out.printf("%.2f\n" ,MonthlyPower.computePowerSupport(power_usage_month, power_prices_month));
        System.out.println("");

                System.out.println("Oppgave g)");
        System.out.printf("%.2f\n" ,MonthlyPower.computeNorgesPrice(power_usage_month));
        System.out.println("");
    }
}