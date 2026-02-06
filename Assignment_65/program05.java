import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  On the first 4 bits of number if they are OFF and return the updated number
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

        iMask = 0x0000000f; 

        iResult = iNo | iMask;

        System.out.printf("Number before doing the first 4 bits ON : %d\n",iNo);
        System.out.printf("Number after doing the first 4 bits ON : %d\n",iResult);
    }
}