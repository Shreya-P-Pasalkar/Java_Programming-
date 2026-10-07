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
    //  Description :  It is used to display Reverse Numbers
    //  Pattern :      5    4   3   2   1
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
        for(iCnt = 5; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt+"\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program30
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program30
{
    public static void main(String A[])
    {
        Implement iObj = new Implement();

        iObj.DisplayReverse();
    }
}