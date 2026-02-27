import java.util.*;

class CustomerBudget
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Budget = 0;
        int Items = 0;
        int TotalPrice = 0;
        int i = 0;

        System.out.println("Enter Budget : ");
        Budget = sobj.nextInt();

        System.out.println("Enter number of items purchased : ");
        Items = sobj.nextInt();

        int[] Price = new int[Items];

        System.out.println("Enter Prices of N items : ");
        for(i = 0; i < Items; i++)
        {
            Price[i] = sobj.nextInt();
        }

        if((Budget < 0) || (Items < 0))
        {
            System.out.println("Invalid Input");
            return;
        }

        for(i = 0;i < Items; i++)
        {
            if(Price[i] <= 0)
            {
                System.out.println("Items price should be greater than 0");
                return;
            }
        }

        for(i = 0;i < Items; i++)
        {
            TotalPrice = TotalPrice + Price[i];
        }

        System.out.println("Items Purchased : "+Items);
        System.out.println("Remaining Balance : "+(Budget - TotalPrice));

        sobj.close();
    }
}

// Time required :- 8:57.58 mins