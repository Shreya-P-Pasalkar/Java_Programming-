class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = num; iCnt >= 1; iCnt--)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial of " + num + " is :" +iFact);
    }
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}