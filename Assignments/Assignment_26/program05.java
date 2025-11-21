// Input :   4
// Output :  2    4    6   8

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (2 * iNo); iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print(iCnt+"\t");
            }    
        }
        System.out.println();
    }
}

class program05
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