class Logic
{
    void CalculatePower(int base,int exp)
    {
        int iPower = 1;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }

        System.out.println("Power is: " +iPower);
    }
}
class program05
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 5);
    }
}