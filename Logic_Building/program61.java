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
    //  Function :     DigitSum
    //  Description :  It is used to do addition of digits
    //  Input :        Nothing
    //  Output :       Integer
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public int DigitSum()
    {
        int iSum = 0;
        int iDigit = 0;

        System.out.println("\n---------------------------------------------------------");
        System.out.println("Original Number is : "+iNo);

        while(this.iNo != 0)
        {
            iDigit = this.iNo % 10;
            this.iNo = this.iNo / 10;
            
            iSum = iSum + iDigit;
        }

        return iSum;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program60
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program61
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
        
        // without updater
        
        iRet = iobj.DigitSum();

        System.out.println("Sum of digits is : "+iRet);
        System.out.println("---------------------------------------------------------");
    }
}