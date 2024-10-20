package Examples;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Libot18_4
{
    public static main void (String[] args)
    {
        Scanner inp = new Scanner (System.in);
        DecimalFormat tdc = new DecimalFormat ("0.00");

        double q, a, p, e, c, q1, a1, p1, e1, c1, fg;

        System.out.println("Quiz                    :   " );
        q = inp.nextdouble();
        q1 = q * .20;

        System.out.println("Activity                :   " );
        a = inp.nextdouble();
        a1 = a * .15;

        System.out.println("Project                 :   " );
        p = inp.nextdouble();
        p1 = p * .25;

        System.out.println("Exam                    :   " );
        e = inp.nextdouble();
        e1 = e * .30;

        System.out.println("Class Standing          :   " );
        c = inp.nextdouble();
        c1 = c * .10;

        System.out.println("---------------------------------------------------------------------------" );

        fg = q1 + a1 + p1 + e1 + c1;
        System.out.println("Final Grade             :   " + twodec.DecimalFormat(fg));

        if (fg >=75)
        {
            System.out.println("Remarks               :   PASSED");
        }

        else if (fg <75)
        {
            System.out.println("Remarks               :   FAILED");
        }
    }
}