/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program56
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program56
{
    public static void main(String A[])
    {
        // Display Digit - static
        int iNo = 1093;
        int iDigit = 0;

        System.out.println("---------------------------------------------------------");
        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo = iNo / 10;
        System.out.println("---------------------------------------------------------");
        
        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo = iNo / 10;
        System.out.println("---------------------------------------------------------");

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo = iNo / 10;
        System.out.println("---------------------------------------------------------");

        System.out.println("Number is : "+iNo);
        iDigit = iNo % 10;
        System.out.println("Digit is : "+iDigit);
        iNo = iNo / 10;
        System.out.println("---------------------------------------------------------");

        System.out.println("Number is : "+iNo);
        System.out.println("---------------------------------------------------------");
    }
}