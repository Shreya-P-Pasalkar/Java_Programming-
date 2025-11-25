class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }
        System.out.println("Even Count: "+iEven);
        System.out.println("Odd Count: "+iOdd);
    }
    
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}