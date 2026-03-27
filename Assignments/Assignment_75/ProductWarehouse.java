import java.util.*;

class ProductWarehouse
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurStock = 0;
        int ReqQuantity = 0;

        System.out.println("Enter current Stock : ");
        CurStock = sobj.nextInt();

        System.out.println("Enter requested quantity : ");
        ReqQuantity = sobj.nextInt();

        if((CurStock < 0) || (ReqQuantity <= 0))
        {
            System.out.println("Current Stock cannot be Negative and requested quantity must greater than 0");
            return;
        }

        if(ReqQuantity > CurStock)
        {
            System.out.println("Order Failed : Insufficient Stock");
            return;
        }
        else
        {
            System.out.println("Order Processed Successfully.");
            CurStock = CurStock - ReqQuantity;
            System.out.println("Remaining Stock : "+CurStock);
        }

        if(CurStock < 5)
        {
            System.out.println("Low Stock Alert !");
        }

        sobj.close();
    }
}

// Time required :- 8:04.59 mins