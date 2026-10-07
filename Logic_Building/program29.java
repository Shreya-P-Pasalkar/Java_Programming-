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
        //static 
        System.out.print("5\t");
        System.out.print("4\t");
        System.out.print("3\t");
        System.out.print("2\t");
        System.out.print("1\t");

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program28
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program29
{
    public static void main(String A[])
    {
        Implement iObj = new Implement();

        iObj.DisplayReverse();
    }
}