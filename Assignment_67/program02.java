import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Display the common ON bits 
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0;
        int iResult1 = 0, iResult2 = 0, iCnt = 0, iCount = 0;
        int iMask = 0x00000001;

        System.out.println("Enter first Number : ");
        iNo1 = sobj.nextInt();

        System.out.println("Enter second Number : ");
        iNo2 = sobj.nextInt();

        System.out.println("Common ON bits of the given numbers : ");

        for(iCnt = 0;iCnt <= 8; iCnt++) 
        {
            iResult1 = iNo1 & iMask;
            iResult2 = iNo2 & iMask;

            if((iMask == iResult1) && (iMask == iResult2))
            {
                System.out.printf(iCnt+"\t");
            }

            iMask = iMask << 1;
        }
    }
}