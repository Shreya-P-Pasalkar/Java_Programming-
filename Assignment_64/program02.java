import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check is the 5th and 18th bit of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPos = 0, iMask = 0, iResult = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iMask = 0x00020010;     // For 5th,18th bit

        iResult = iNo & iMask;

       if(iResult == iMask)
        {
            System.out.println("5th & 18th bit is ON");
        }
        else
        {
            System.out.println("5th & 18th bit is OFF");
        }
    }
}