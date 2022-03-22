package week7.java;

        /* HRA = (basicsalary * 10) / 100;
        TA = (basicsalary * 8)  / 100;
        DA = (basicsalary *  9) / 100;
        PF = (basicsalary * 20) / 100;
        */
import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        int empId;
        String empname;
        double bs, hra, ta, da, pf;
        double gross = 0;

            Scanner em = new Scanner(System.in);
            System.out.print("Enter employee Id: ");
            empId = em.nextInt();

            System.out.print("Enter employee name: ");
            empname = em.next();

            System.out.print("Enter employee salary: ");
            bs = em.nextDouble();
            da = 9.0 / 100.0 * bs;
            hra = 10.0 / 100.0 * bs;
            ta = 8.0 / 100.0 * bs;
            pf = 20.0 / 100.0 * bs;

            gross = ((bs + hra + ta + da) - (pf));


            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("|          Salary Slip               |");
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("| Employee Id          : " + empId + "   |");
            System.out.println("| Employee Name        : " + empname + " |");
            System.out.println("|¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬|");
            System.out.println("| Basic Salary         : " + bs + "      |");
            System.out.println("| HRA  10%             : " + hra + "     |");
            System.out.println("| TA    8%             : " + ta + "      |");
            System.out.println("| DA    9%             : " + da + "      |");
            System.out.println("| PF - 20 &            : " + pf + "      |");
            System.out.println("|____________________________________|");
            System.out.println("| Gross Salary         : " + gross + "   |");
            System.out.println("|====================================|");
        }
    }
