class Logic
{
    void SumEvenOddNumbers(int num)
    {
        int iDigit = 0;
        int iEven = 0;
        int iOdd = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            if((iDigit  % 2) == 0)
            {
                iEven = iEven + iDigit;              
            }
            else
            {
                iOdd = iOdd + iDigit;    
            }
            num = num / 10;
        }
        System.out.println("Sum of even digits : " +iEven);
        System.out.println("Sum of odd digits : " +iOdd);
    }
}
class program04
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddNumbers(123456);
    }
}