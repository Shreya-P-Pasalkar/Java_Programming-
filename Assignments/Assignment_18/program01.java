class Logic
{
    void CheckPrime(int num)
    {
        int iCnt = 0;
        int iFactCnt = 0;

        for(iCnt = 2; iCnt <= (num/2); iCnt++)
        {
            if((num % iCnt) == 0)
            {
                iFactCnt++;
            }
        }

        if(iFactCnt == 0)
        {
            System.out.println(num+ " is Prime");
        }
        else
        {
            System.out.println(num+ " is not Prime");
        }
    }
}
class program01
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPrime(11);
    }
}