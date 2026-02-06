import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check is the 7th, 15th, 21st, 28th bit of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPos = 0, iMask = 0, iResult = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iMask = 0x008104040;    // For 7th,15th,21st,28th 
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th & 15th & 21th & 28th bit is ON");
        }
        else
        {
            System.out.println("7th & 15th & 21th & 28th bit is OFF");
        }
    }
}