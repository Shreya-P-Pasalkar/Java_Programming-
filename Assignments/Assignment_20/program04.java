class Logic
{
    void FindLargestDigit(int n)
    {
        int iDigit = 0;
        int iMax = 0;

        while(n > 0)
        {
            iDigit = n % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
        }
        System.out.println("Largest digit is : "+iMax);
    }
    
}
class program04
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}