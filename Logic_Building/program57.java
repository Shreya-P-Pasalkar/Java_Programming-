/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program57
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program57
{
    public static void main(String A[])
    {
        // Display Digit - Dynammic
        // Using Iteration - while loop

        Scanner sobj = new Scanner(System.in);

        int iNo = 0;
        int iDigit = 0;

        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();

        System.out.println("\nOriginal Number is : "+iNo);
        System.out.println("---------------------------------------------------------");

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            System.out.println("Number is : "+iNo);
            System.out.println("Digit is : "+iDigit);
            System.out.println("---------------------------------------------------------");
        }
    }
}