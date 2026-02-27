import java.util.*;

class TrafficViolationFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        double Tax = 0;

        System.out.println("Enter Annual Income : ");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Income <= 250000)
        {
            Tax = 0;
        }
        else if((Income > 250000) && (Income <= 500000))
        {
            Tax = 0 + ((Income - 250000) * 0.05);
        }
        else if((Income > 500000) && (Income <= 1000000))
        {
            Tax = 0 + (250000 * 0.05) + ((Income - 500000) * 0.20);
        }
        else 
        {
            Tax = 0 + (250000 * 0.05) + (500000 * 0.20) + ((Income - 1000000) * 0.30);
        }

        System.out.println("Annual Income : "+Income);
        System.out.println("Total Payable Tax : "+Tax);
        
        sobj.close();
    }
}

// Time required :- 7:35.94 mins