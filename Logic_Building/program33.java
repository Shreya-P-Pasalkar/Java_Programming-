/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner; 

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement Iteration to print 
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class Implement
{
    public int iNo = 0;

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Constructor
    //  Description :  Parameterized constructor
    //  Input :        Integer
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement(int iNo)
    {
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to display Reverse Numbers
    //  Pattern :      5    4   3   2   1   0
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void DisplayReverse()
    {   
        // Loop Counter
        int iCnt = 0;

        // Iteration : for loop
        for(iCnt = this.iNo; iCnt >= 0; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program33
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program33
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        Implement iObj;

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sObj.nextInt();

        iObj = new Implement(iNo);

        iObj.DisplayReverse();
    }
}