/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program53
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program53
{
    public static void main(String A[])
    {
        // Display Digit - static
        
        int iNo = 23456;
        int iDigit = 0;

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit+"\n");
        iNo = iNo / 10;

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit+"\n");
        iNo = iNo / 10;

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit+"\n");
        iNo = iNo / 10;

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit+"\n");
        iNo = iNo / 10;

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit+"\n");
        iNo = iNo / 10;
    }
}