class Logic
{
    void FindSmallestDigit(int n)
    {
        int iDigit = 0;
        int iMax = n;

        while(n > 0)
        {
            iDigit = n % 10;
            if(iDigit < iMax)
            {
                iMax = iDigit;
            }
        }
        System.out.println("Smallest digit is : "+iMax);
    }
    
}
class program05
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
    }
}