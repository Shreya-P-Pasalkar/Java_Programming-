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
    //  Function :     main
    //  Description :  Entry point function
    //  Author :       Shreya Pramod Pasalkar
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Enter first Number : ");
        a = sobj.nextInt();

        System.out.println("Enter second Number : ");
        b = sobj.nextInt();

        c = a + b;

        System.out.println("Addition is : "+c);

    }
}