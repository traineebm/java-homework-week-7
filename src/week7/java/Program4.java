package week7.java;

public class Program4 {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        System.out.println("-----------------------");
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1, -2020);
    }

    //With return type nad with parameters method
    public static boolean isLeapYear(int year) {

        boolean x;
        if (year < 1 || year > 9999) {
            x = false;
            System.out.print(x);
            System.out.println(year + " Parameter not in given range (1-9999)");

        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            x = true;
            System.out.print(x);
            System.out.println(" This year " + year + " is a leap year");
        } else {
            x = false;
            System.out.print(x);
            System.out.println(" This year " + year + " is not a leap year");
        }
        return x;
    }


    // With return type and two parameters method
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println("Invalid Month or Year");
        }
        switch (month) {
            case 1:
                System.out.println("31");
                break;

            case 2:
                if ((month == 2) && isLeapYear(year)) {
                    System.out.println("29");
                } else
                    System.out.println("28");
                break;

            case 3:
                System.out.println("31");
                break;

            case 4:
                System.out.println("30");
                break;

            case 5:
                System.out.println("31");
                break;

            case 6:
                System.out.println("30");
                break;

            case 7:
                System.out.println("31");
                break;

            case 8:
                System.out.println("31");
                break;

            case 9:
                System.out.println("30");
                break;

            case 10:
                System.out.println("31");
                break;

            case 11:
                System.out.println("30");
                break;

            case 12:
                System.out.println("31");
                break;

            default:


        }
        return 0;
    }
}