class Logic
{
    void ProductofDigits(int n)
    {
        int iDigit = 0;
        int iProd = 0;

        while(n > 0)
        {
            iDigit = n % 10;
            if(iDigit > 0)
            {
                iProd = iProd * iDigit
            }
            n = n / 10;
        }
        System.out.println("Product of Digits is : "+iProd);
    }
    
}
class program05
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.ProductofDigits(234);
    }
}