import java.util.*;

class DeliveryCharges
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Weight = 0;
        int Charges = 0;

        System.out.println("Enter Parcel Weight (in kg) : ");
        Weight = sobj.nextInt();

        if(Weight < 0)
        {
            System.out.println("Weight must be greater than 0");
            return;
        }

        if(Weight > 5)
        {
            Charges = 150 + ((Weight-5) * 30);
        }
        else if(Weight > 1)
        {
            Charges = 50 + ((Weight - 1) * 20);
        }
        else if(Weight <= 1)
        {
            Charges = 50;   
        }

        System.out.println("Parcel Weight : "+Weight+" kg");
        System.out.println("Courier Charges : "+Charges);
                
        sobj.close();
    }
}

// Time required :- 6:19.82 mins