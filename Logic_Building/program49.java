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
    
    public float iNo1 = 0;
    public float iNo2 = 0;

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Constructor
    //  Description :  Parameterized constructor
    //  Input :        float, float
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement(float iNo1, float iNo2)
    {
        // Static
        this.iNo1 = iNo1;
        this.iNo1 = iNo1;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //  Updater
    /////////////////////////////////////////////////////////////////////////////////////////
    public void Updator()
    {
        if(this.iNo1 < 0)
        {
            this.iNo1 = -this.iNo1;
        }

        if(this.iNo2 < 0)
        {
            this.iNo2 = -this.iNo2;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     CheckDivisibility
    //  Description :  It is used to check divisibility by number
    //  Input :        Nothing
    //  Output :       boolean
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public boolean CheckDivisibility()
    {
        boolean bFlag = false;

        if(this.iNo1 % this.iNo2 == 0.0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program48
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program49
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float iNo1 = 0.0f;
        float iNo2 = 0.0f;
        boolean bRet = false;

        System.out.println("Enter Divident (Integer) : ");
        iNo1 = sobj.nextFloat();

        System.out.println("Enter Divisor (Integer) : ");
        iNo2 = sobj.nextFloat();

        Implement iObj = new Implement(iNo1, iNo2);

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