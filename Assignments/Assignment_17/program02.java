class Logic
{
    void checkPalindrome(int num)
    {
        int iDigit = 0;
        int iRev = 0;

        while(num > 0)
        {
            iDigit = num % 10;
            iRev = (iRev * 10) + iDigit;
            num = num / 10;
        }
        
        if(num == iRev)
        {
            System.out.println(iRev+ " is a Palindrome!");
        }
        else
        {
            System.out.println(iRev+ " is not a Palindrome!");
        }
    }
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(1234);
    }
}