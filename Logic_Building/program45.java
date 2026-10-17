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
    //  Description :  Parameterized constructor
    //  Input :        Integer
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement(int iNo)
    {
        // Static
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //  Updater
    /////////////////////////////////////////////////////////////////////////////////////////
    public void Update()
    {
        if(this.iNo < 0)
        {
            this.iNo = -this.iNo;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to return total number of factors
    //  Input :        Nothing
    //  Output :       Integer
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public int DisplayFactors()
    {
        int iCnt = 0;
        int iCount = 0;

        // Using Iteration ~ for loop
        // Time Complexity ~ O(N)
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        } 

        return iCount;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program44
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program45
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        Implement iObj = new Implement(iNo);

        iRet = iObj.DisplayFactors();

        System.out.println("Count of factors of "+iNo+" : "+iRet);
    }
}