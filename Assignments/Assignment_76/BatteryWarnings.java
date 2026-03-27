import java.util.*;

class BatteryWarnings
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Battery = 0;

        System.out.println("Enter Battery Percentage : ");
        Battery = sobj.nextInt();

        if((Battery < 0) || (Battery > 100))
        {
            System.out.println("Battery Percentage must be between 0-100");
            return;
        }

        System.out.println("Battery Percentage : "+Battery+" %");

        if(Battery <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(Battery <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }

        sobj.close();
    }
}

// Time required :- 3:09.21 mins