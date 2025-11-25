// Input :   5
// Output :  1    *    2   *   3   *   4   *   5    *
//           1    2    3   4   5   6   7   8   9   10 

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        iCount = 1;
        for(iCnt = 1; iCnt <= (2 * iNo); iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print(iCount+"\t");
                iCount++;
            }
        }
    }
}

class program03
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}