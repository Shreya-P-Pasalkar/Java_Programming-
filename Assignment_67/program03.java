import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check if the 9th or 12th  bit of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPos = 0, iMask1 = 0, iMask2 = 0, iResult = 0;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iMask1 = 0x00000100;
        iMask2 = 0x00000800;

        iResult1 = iNo & iMask1;
        iResult2 = iNo & iMask2;

       if((iResult1 == iMask1) || (iResult2 == iMask2))
        {
            System.out.println("9th or 12th bit is ON");
        }
        else
        {
            System.out.println("9th or 12th bit is OFF");
        }
    }
}