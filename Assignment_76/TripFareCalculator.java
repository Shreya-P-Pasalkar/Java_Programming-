import java.util.*;

class TrafficViolationFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Fare = 0;
        int Distance = 0;
        String PeakHours = null;

        System.out.println("Enter Distance in km : ");
        Distance = sobj.nextInt();

        System.out.println("Peak Hours : (Yes/No)");
        PeakHours = sobj.next();

        if(Distance < 0)
        {
            System.out.println("Distance cannot be negative");
            return;
        }

        Fare = 50;

        if(Distance <= 10)
        {
            Fare = Fare + (Distance * 12);
        }
        else if(Distance > 10)
        {
            Fare = Fare + (10 * 12) + ((Distance - 10) * 15);
        }

        if(PeakHours.equalsIgnoreCase("Yes"))
        {
            Fare = Fare + (Fare * 0.20f);
        }

        System.out.println("Distance : "+Distance+" km");
        System.out.println("Peak Hour : "+PeakHours);
        System.out.println("Total Fare : "+Fare);
        
        sobj.close();
    }
}

// Time required :- 6:32.58 mins