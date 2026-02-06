import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////////////
//  Count the number of ON bits in a number without using % and /
/////////////////////////////////////////////////////////////////////////////////////////////////////

class program01
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iResult = 0, iCnt = 0, iCount = 0;
        int iMask = 0x00000001;

        System.out.println("Enter the Number : ");
        iNo = sobj.nextInt();

        for(iCnt = 0;iCnt <= 8; iCnt++) 
        {
            iResult = iNo & iMask;

            if(iMask == iResult) 
            {
                iCount++;
            }

            iMask = iMask << 1;
        }

        System.out.println("Number of 1's in "+iNo+" are : "+iCount);
    }
}