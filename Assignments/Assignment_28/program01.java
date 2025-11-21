/* 
Input :   iRow = 4      iCol = 5
Output :  A     B     C     D     E
          A     B     C     D     E
          A     B     C     D     E
          A     B     C     D     E
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;
        char ch;

        iCount = 1;
        for(i = 1; i <= iRow ; i++)
        {
            ch = 'A';
            for(j = 1; j <= iCol; j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }        
    }
}

class program01
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