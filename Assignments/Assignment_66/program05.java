import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Toggle Bits of first and last Nibble
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        long iNo = 0;
        int iResult = 0;
        int iMask = 0x00000001;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextLong();

        iMask = 0xf000000f; 

        iResult = (int)iNo ^ iMask;

        System.out.println("Before Toggling the bits of first and last nibble ON : "+iNo);
        System.out.println("After Toggling the bits of first and last nibble ON : "+iResult);
    }
}