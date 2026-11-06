/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
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
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     CheckPerfect
    //  Description :  It is used to check perfect
    //  Input :        Nothing
    //  Output :       Boolean
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public boolean CheckPerfect()
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum += iCnt;
            }
        }

        return (iSum == iNo);
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program65
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program65
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Implement iobj;

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        // Negative value updater
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iobj = new Implement(iNo);

        bRet = iobj.CheckPerfect();

        if(bRet == true)
        {
            System.out.println(iNo+" is Perfect Number");
        }
        else
        {
            System.out.println(iNo+" is not Perfect Number");
        }

        iobj = null;
        sobj = null;
    }
}