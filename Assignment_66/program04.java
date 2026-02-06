import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Toggle the nth position Bit
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

        iResult = iNo ^ iMask;

        System.out.println("Before Toggling the "+iPos+"th Bit ON : "+iNo);
        System.out.println("After Toggling the "+iPos+"th Bit ON : "+iResult);
    }
}