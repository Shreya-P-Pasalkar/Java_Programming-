import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check is the 1st and last bit of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iNo = 0;
        int iPos = 0, iMask = 0, iResult = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextLong();

        iMask = 0x80000001;     // For first and last Bit

        iResult = (int)iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("1st and last bit is ON");
        }
        else
        {
            System.out.println("1st and last bit is OFF");
        }
    }
}