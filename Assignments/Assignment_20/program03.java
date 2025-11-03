class Logic
{
    void CheckPerfect(int n)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt <= (n/2); iCnt++)
        {
           if((n % iCnt) == 0)
           {
                iSum = iSum + iCnt;
           }
        }        
        if(n == iSum)
        {
            System.out.print(n+" is Perfect number");
        }
        else
        {
            System.out.print(n+" is not a Perfect number");
        }
    }
    
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
    }
}