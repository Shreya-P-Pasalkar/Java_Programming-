import java.util.*;

class ParkingRateCalculator
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Hours = 0;
        int Charges = 0;

        System.out.println("Enter total parking hours : ");
        Hours = sobj.nextInt();

        if(Hours < 0)
        {
            System.out.println("Hours cannot be negative");
            return;
        }

        if(Hours > 10)
        {
            Charges = 20 + ((Hours - 2) * 10) + 50;
        }
        else if(Hours > 2)
        {
            Charges = 20 + ((Hours - 2) * 10);
        }
        else if(Hours <= 2)
        {
            Charges = 20;
        }

        System.out.println("Total Parking Duration : "+Hours+" hours");
        System.out.println("Total Parking Fee : "+Charges);

        sobj.close();
    }
}

// Time required :- 5:26.71 mins