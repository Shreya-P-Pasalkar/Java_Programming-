/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement the business logic
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class Implement
{
    
    public int iNo = 0;

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Constructor
    //  Description :  Default constructor
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement()
    {
        // Static
        this.iNo = 6;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to display factors of 6 
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void DisplayFactors()
    {
        if(iNo % 1 == 0)
        {
            System.out.print("1\t");
        }
        if(iNo % 2 == 0)
        {
            System.out.print("2\t");
        }
        if(iNo % 3 == 0)
        {
            System.out.print("3\t");
        }
        if(iNo % 4 == 0)
        {
            System.out.print("4\t");
        }
        if(iNo % 5 == 0)
        {
            System.out.print("5\t");
        }
        if(iNo % 6 == 0)
        {
            System.out.print("6\t");
        }

        System.out.println();
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program38
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program39
{
    public static void main(String A[])
    {
        Implement iObj = new Implement();

        iObj.DisplayFactors();
    }
}