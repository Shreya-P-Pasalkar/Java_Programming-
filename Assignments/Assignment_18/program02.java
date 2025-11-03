class Logic
{
    void PrintEvenNumbers(int num)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            if((iCnt % 2) == 0)
            {
               System.out.print(iCnt+ "\t");
            }
        }

    }
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);
    }
}