import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Turn the nth position bit OFF if it is ON
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
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

        iMask = ~iMask;

        iResult = iNo & iMask;

        System.out.println("Number before turning "+iPos+"th bit OFF : "+iNo);
        System.out.println("Number after turning "+iPos+"th bit OFF : "+iResult);
    }
}