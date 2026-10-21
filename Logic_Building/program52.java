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
        // Static
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     CheckPrime
    //  Description :  It is used to check prime
    //  Input :        Nothing
    //  Output :       boolean
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public boolean CheckPrime()
    {
        int iCnt = 0;
        boolean bFlag = false;

        // Time complexity : O(N/2)
        for(iCnt = 2, bFlag = true; iCnt <= this.iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program52
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        Implement iobj = new Implement(iNo);

        bRet = iobj.CheckPrime();

        if(bRet == true)
        {
            System.out.println(iNo+" is Prime Number");
        }
        else
        {
            System.out.println(iNo+" is not Prime Number");
        }
    }
}