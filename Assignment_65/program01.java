import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  OFF the 7th bit of number is it is ON and return the updated number
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

        iMask = 0x00000040; 

        iMask = ~iMask;    

        iResult = iNo & iMask;

        System.out.printf("Number before turning 7th bit OFF : %d\n",iNo);
        System.out.printf("Number after turning 7th bit OFF : %d\n",iResult);
    }
}