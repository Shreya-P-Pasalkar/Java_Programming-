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
    public int iNo1 = 0;
    public int iNo2 = 0;

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Constructor
    //  Description :  Parameterized constructor
    //  Input :        Integer , Integer
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement(int iNo1, int iNo2)
    {
        this.iNo1 = iNo1;
        this.iNo2 = iNo2;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to check divisibility
    //  Input :        Nothing
    //  Output :       boolean
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public boolean CheckDivisibility()
    {   
        if(this.iNo1 % this.iNo2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program38
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program38
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        Implement iObj;

        boolean bRet = false;

        int iNo1 = 0;
        int iNo2 = 0;

        System.out.println("Enter First Number : ");
        iNo1 = sObj.nextInt();

        System.out.println("Enter First Number : ");
        iNo2 = sObj.nextInt();

        iObj = new Implement(iNo1, iNo2);

        bRet = iObj.CheckDivisibility();

        if(bRet == true)
        {
            System.out.println(iNo1+" is divisible by "+iNo2);
        }
        else
        {
            System.out.println(iNo1+" is not divisible by "+iNo2);
        }
    }
}