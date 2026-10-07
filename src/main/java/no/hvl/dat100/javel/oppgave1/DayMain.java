package no.hvl.dat100.javel.oppgave1;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        System.out.println("a)");
        DailyPower.printPowerPrices(powerprices_day);
        System.out.println("");

        System.out.println("b)");
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println("");

        System.out.println("c)");
        System.out.println(DailyPower.computePowerUsage(powerusage_day));
        System.out.println("");

        System.out.println("d)");
        System.out.printf("%.2f%n",DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println("");
        
        System.out.println("e)");
        for(int i = 0; i < DayPowerData.powerprices_day.length; i++){
            System.out.print(i+1 + " ");
            System.out.println(DailyPower.getSupport(powerusage_day[i], powerprices_day[i]));
        }
        System.out.println("");

        System.out.println("f)");
        System.out.printf("%.2f%n" ,DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println("");

        System.out.println("g)");
        System.out.println(DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println("");

        System.out.println("g)");
        System.out.println(DailyPower.findPeakUsage(powerusage_day));
        System.out.println("");

        System.out.println("g)");
        System.out.printf("%.2f%n" ,DailyPower.findAvgPower(powerusage_day));
        System.out.println("");
    }
}
