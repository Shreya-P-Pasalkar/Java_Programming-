import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check if the bit asked by user is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iPos = 0, iResult = 0;
        int iMask = 0x00000001;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter the Bit Position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1); 

        iResult = iNo & iMask;

        if(iResult == iMask) 
        {
            System.out.println(iPos+"th Bit is ON");
        }
        else
        {
            System.out.println(iPos+"th Bit is OFF");
        }
    }
}