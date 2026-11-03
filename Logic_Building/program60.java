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
    //  Function :     Updater
    //  Description :  It is used to update negative values
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void Updater()
    {
        if(this.iNo < 0)
        {
            this.iNo = -this.iNo;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     CountDigits
    //  Description :  It is used to count digits
    //  Input :        Nothing
    //  Output :       Integer
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public int CountDigits()
    {
        int iCount = 0;

        System.out.println("\n---------------------------------------------------------");
        System.out.println("Original Number is : "+iNo);

        while(this.iNo != 0)
        {
            this.iNo = this.iNo / 10;
            
            iCount++;
        }

        return iCount;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program60
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program60
{
    public static void main(String A[])
    {

        Scanner sobj = new Scanner(System.in);
        Implement iobj;

        int iNo = 0;
        int iRet = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iobj = new Implement(iNo);

        if(iNo < 0)
        {
            iobj.Updater();
        }
        
        iRet = iobj.CountDigits();

        System.out.println("Total number of digits is : "+iRet);
        System.out.println("---------------------------------------------------------");
    }
}