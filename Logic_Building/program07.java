/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program01
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program01
{
    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Addition
    //  Description :  It is used to do addition of two numbers
    //  Input :        float, float
    //  Output :       float
    //  Author :       Shreya Pramod Pasalkar
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public static float Addition(float No1, float No2)
    {
        float Ans = 0;

        if(No1 < 0)
        {
            No1 = -No1;
        }

        if(No2 < 0)
        {
            No2 = -No2;
        }

        Ans = No1 + No2;

        return Ans;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     main
    //  Description :  Entry point function
    //  Author :       Shreya Pramod Pasalkar
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;

        System.out.println("Enter first Number : ");
        a = sobj.nextFloat();

        System.out.println("Enter second Number : ");
        b = sobj.nextFloat();
 
        c = Addition(a,b);

        System.out.println("Addition is : "+c);

    }
}