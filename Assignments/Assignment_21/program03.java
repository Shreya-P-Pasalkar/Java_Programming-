class Logic
{
    void DisplayFactors(int n)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
           if((iNo % iCnt) == 0)
           {
                System.out.print(iCnt+"\t");
           }
        }
    }
    
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(12);
    }
}