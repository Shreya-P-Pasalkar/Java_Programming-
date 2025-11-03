class Logic
{
    void PrintTable(int num)
    {
        int iCnt = 0;
        int iMult = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMult = num * iCnt;
            System.out.println(iMult+ "\t");
        }
    }
}
class program05
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
    }
}