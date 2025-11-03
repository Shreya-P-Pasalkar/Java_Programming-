class Logic
{
    void countFactors(int n)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
           if((iNo % iCnt) == 0)
           {
                iCount++;
                
           }
        }
        System.out.println(iCount);
    }
    
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}