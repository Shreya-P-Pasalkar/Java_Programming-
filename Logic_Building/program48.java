/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
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
    public void Updator()
    {
        if(this.iNo < 0)
        {
            this.iNo = -this.iNo;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     CheckDivisibility
    //  Description :  It is used to check divisibility by 2
    //  Input :        Nothing
    //  Output :       boolean
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public boolean CheckDivisibility()
    {
        if(this.iNo % 2 == 0)
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
//  Class Name :   program48
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program48
{
    public static void main(String A[])
    {
        Implement iObj = new Implement(42);

        boolean bRet = false;

        bRet = iObj.CheckDivisibility();

        if(bRet == true)
        {
            System.out.println("42 is divisible by 2");
        }
        else
        {
            System.out.println("42 is not divisible by 2");
        }
    }
}