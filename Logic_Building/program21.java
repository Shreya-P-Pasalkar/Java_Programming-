/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner; 

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement Iteration
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
    public Implement(int A)
    {
        this.iNo = A;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     ImplementIteration
    //  Description :  It is used to implement Iteration ~ for loop
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void ImplementIteration()
    {   
        int iCnt = 0;
        // Iteration
        for(iCnt = 0; iCnt < iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program21
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program21
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        // Filter
        if(iNo < 0)
        {
            System.out.println("Invalid Input : Number should be Positive");
            return;
        }

        Implement iobj = new Implement(iNo);

        iobj.ImplementIteration();
    }
}