import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Toggle the 7th and 10th bit of the number and return the updated number
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iPos = 0, iResult = 0;
        int iMask = 0x00000000;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        iMask = 0x00000240; 

        iResult = iNo ^ iMask;

        System.out.printf("Number before Toggling 7th and 10th bit : %d\n",iNo);
        System.out.printf("Number after Toggling 7th and 10th bit : %d\n",iResult);
    }
}