/* 
Input :   iRow = 5      iCol = 5
Output :    1   2   3   4   5
                2   3   4   5
                    3   4   5
                        4   5
                            5
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow , int iCol)
    {
        int i = 0 , j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid input");
            System.out.println("Number of rows and columns should be equal");
        }

        for(i = 1;i <= iRow; i++)
        {
            for(j = 1; j <= iRow; j++)
            {
                if(j < i)
                {
                   
                    System.out.print(" \t");
                }
                else
                {
                    System.out.print(j+ "\t");
                }
            }
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