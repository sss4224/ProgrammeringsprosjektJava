package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for(int i = 0; i < usage.length; i++){
            int day = i + 1;
            System.out.println("Dag " + day + ": ");
            for(int j = 0; j < usage[i].length; j++){
                System.out.print(usage[i][j] + "kWh ");
            }
            System.out.println("");
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for(int i = 0; i < prices.length; i++){
            int day = i + 1;
            System.out.println("Dag " + day + ": ");
            for(int j = 0; j < prices[i].length; j++){
                System.out.print(prices[i][j] + "kr ");
            }
            System.out.println("");
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                sum += usage[i][j];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        int i = 0;

        while(i < powerusage.length){
            int j = 0;

            while(j < powerusage[i].length){
                usage += powerusage[i][j];
                if(usage > threshold){
                    exceeded = true;
                    break;
                }
                j++;
            }
            if(exceeded){
                break;
            }
            i++;
        }

        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        double totCost = 0;
        double totUsage = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                totCost += usage[i][j] * prices[i][j];
                totUsage += usage[i][j];
            }
        }

        price = totCost/totUsage;

        return price;
    }

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {
        
        final double THRESHOLD = 0.9375;
        final double PERCENTAGE = 0.9;

        double supportPerkWh = 0;
        double support = 0;

        for(int i = 0; i < prices.length; i++){
            for(int j = 0; j < prices[i].length; j++){
                if(prices[i][j] > THRESHOLD){
                    supportPerkWh = (prices[i][j] - THRESHOLD) * PERCENTAGE;

                    support += supportPerkWh * usage[i][j];
                }
            }
        }

        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        final double NORGESPRIS_KWH = 0.5;

        double price = 0;

        for(int i = 0; i < usage.length; i++){
            for(int j = 0; j < usage[i].length; j++){
                price += NORGESPRIS_KWH * usage[i][j];
            }
        }

        return price;
    }
}
