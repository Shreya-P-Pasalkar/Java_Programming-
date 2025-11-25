class Logic
{
    void FindMax(int a, int b, int c)
    {
        if((a > b) && (a > c))
        {
            System.out.println("Maximum number is: " +a);
        }
        else if((b > a) && (b > c))
        {
            System.out.println("Maximum number is: " +b);
        }
        else
        {
            System.out.println("Maximum number is: " +c);
        }

    }
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindMax(3, 7, 2);
    }
}