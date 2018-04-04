package main.java.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

public class PeriodDemo {

    public static void main(String[] args) {

        Period period = Period.ofDays(10);
        Temporal temporal = period.addTo(LocalDate.now());
        System.out.println(temporal);

        // Construct a new Period instance using the specified data
        Period period1 = Period.of(2018, 03, 10);
        System.out.println(period1.toString());


        // Subtract period
        Period period2 = period1.minus(Period.ofMonths(2));
        System.out.println(period2);

        // Add period
        period2 = period2.plus(Period.ofMonths(2));
        System.out.println(period2);

    }

}
