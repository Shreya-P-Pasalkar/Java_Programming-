/* 
Input :   iRow = 4      iCol = 5
Output :  A     B     C     D     E
          a     b     c     d     e
          A     B     C     D     E
          a     b     c     d     e
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;
        char ch;

        for(i = 1; i <= iRow ; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if((i % 2) == 0)
                {
                    ch = 'a';
                    System.out.print(ch+"\t");
                    ch++;
                }
                else
                {
                    ch = 'A';
                    System.out.print(ch+"\t");
                    ch++;
                }
            }
            System.out.println();
        }        
    }
}

class program02
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