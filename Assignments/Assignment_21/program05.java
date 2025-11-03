class Logic
{
    void PrintDivisible(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
           if(((iCnt % 2) == 0) && ((iCnt % 2) == 0))
           {
               System.out.println(iCnt);    
           }
        }
        
    }
    
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDivisible(30);
    }
}