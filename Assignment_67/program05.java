import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Check if the two nth bits of the Number is ON or OFF
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;
        int iNo = 0,iRange = 0, iPos1 = 0, iPos2 = 0, iResult = 0;
        int iMask = 0x1;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter first Position of the range(smaller number) : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second Position of the range(greater number) : ");
        iPos2 = sobj.nextInt();

        iRange = iPos2 - iPos1;

        iMask = iMask << (iPos1-1);

        iResult = iNo ^ iMask;

        for(iCnt = 1; iCnt <= iRange; iCnt++)
        {
            iMask = iMask << 1;
            iResult = iResult ^ iMask;
        }

        System.out.println("Number before the bit range from "+iPos1+" to "+iPos2+" : "+iNo);
        System.out.println("Number after the bit range from "+iPos1+" to "+iPos2+" : "+iResult);
    }
}