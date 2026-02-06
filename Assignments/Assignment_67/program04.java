import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check if the two nth bits of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0, iPos1 = 0, iPos2 = 0, iResult = 0;
        int iMask1 = 0x00000001, iMask2 = 0x00000001

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter first Position : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second Position : ");
        iPos2 = sobj.nextInt();

        iMask1 = iMask1 << (iPos-1);
        iMask2 = iMask2 << (iPos-1);

        iResult1 = iNo & iMask1;
        iResult2 = iNo & iMask2;

       if((iResult1 == iMask1) || (iResult2 == iMask2))
        {
            System.out.println(iPos1+"th or "+iPos2+"th bit is ON");
        }
        else
        {
            System.out.println(iPos1+"th or "+iPos2+"th bit is ON");
        }
    }
}