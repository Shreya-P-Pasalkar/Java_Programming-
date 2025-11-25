class Logic
{
    void CheckSign(int num)
    {
        if(num > 0)
        {
            System.out.println("The given number is Positive");
        }
        else if(num == 0)
        {
            System.out.println("The given number is Zero");
        }
        else
        {
            System.out.println("The given number is Negative");
        }
    }
}
class program05
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckSign(-8);
    }
}