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
    //  Function :     DisplayDigits
    //  Description :  It is used to display digits
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void DisplayDigits()
    {
        int iDigit = 0;

        System.out.println("\nOriginal Number is : "+iNo);
        System.out.println("---------------------------------------------------------");

        while(this.iNo != 0)
        {
            iDigit = this.iNo % 10;
            this.iNo = this.iNo / 10;
            System.out.println("Number is : "+this.iNo);
            System.out.println("Digit is : "+iDigit);
            System.out.println("---------------------------------------------------------");
        }
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program57
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program58
{
    public static void main(String A[])
    {
        // Display Digit - Dynammic
        // Using Iteration - while loop

        Scanner sobj = new Scanner(System.in);
        Implement iobj;

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        iobj = new Implement(iNo);

        if(iNo < 0)
        {
            iobj.Updater();
        }
        
        iobj.DisplayDigits();
    }
}