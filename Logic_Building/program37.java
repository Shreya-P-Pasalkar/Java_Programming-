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
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to check and display if the number is divisible by 2 or not
    //  Pattern :      4 is completely divisible by 2!
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void CheckDivisibility()
    {   
        if(this.iNo % 2 == 0)
        {
            System.out.println(this.iNo+" is completely divisible by 2!");
        }
        else
        {
            System.out.println(this.iNo+" is not divisible by 2!");
        }
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program37
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program37
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);
        Implement iObj;

        int iNo = 0;

        System.out.println("Enter Number : ");
        iNo = sObj.nextInt();

        iObj = new Implement(iNo);

        iObj.CheckDivisibility();
    }
}