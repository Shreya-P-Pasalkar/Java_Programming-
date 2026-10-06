/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement Iteration to print 
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class Implement
{
    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to display Number *
    //  Pattern :      1    *   2    *    3   *    4   *    5   *
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void Display()
    {   
        int iCnt = 0;

        // Iteration : for loop
        // Static printing
        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.print(iCnt+"\t*\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program27
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program27
{
    public static void main(String A[])
    {
        Implement iObj = new Implement();

        iObj.Display();
    }
}