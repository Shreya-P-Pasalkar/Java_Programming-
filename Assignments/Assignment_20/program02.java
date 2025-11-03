class Logic
{
    void PrintReverse(int n)
    {
        int iCnt = 0;

        for(iCnt = n; iCnt >= 1; iCnt--)
        {
           System.out.print(iCnt+ "\t");
        }        
    }
    
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintReverse(10);
    }
}