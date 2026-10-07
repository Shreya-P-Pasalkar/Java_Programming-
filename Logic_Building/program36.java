/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner; 

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement Iteration for numbers
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
    //  Description :  It is used to display Even Numbers
    //  Pattern :      2    4   6   8   10
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void DisplayEven()
    {   
        // Loop Counter
        int iCnt = 0;

        // Iteration : for loop
        for(iCnt = 2; iCnt <= this.iNo; iCnt += 2)
        {
            if((iCnt % 2) == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program36
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program36
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        Implement iObj;

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sObj.nextInt();

        iObj = new Implement(iNo);

        iObj.DisplayEven();
    }
}