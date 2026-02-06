import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check is the 7th, 8th, 9th bit of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program04
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPos = 0, iMask = 0, iResult = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iMask = 0x000001c0;     // For 7th,8th,9th Bit

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("7th & 8th & 9th bit is ON");
        }
        else
        {
            System.out.println("7th & 8th & 9th bit is OFF");
        }
    }
}