/* 
Input :   iRow = 4      iCol = 5
Output :  1    2     3     4     5
          2    3     4     5     6
          3    4     5     6     7
          4    5     6     7     8
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;
        int iCount = 1;
        int iCnt = 0;

        iCount = 1;
        for(i = 1; i <= iRow; i++)
        {
            for(j = iCount; j < (iCount + iCol); j++)
            {
                System.out.print(j+"\t");
            }
            iCount++;
            System.out.println();
        }
    }        
}

class program05
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0 , iValue2 = 0;

        System.out.println("Enter number of rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of columns:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1 , iValue2);
    }
}