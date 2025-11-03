class Logic
{
    void CheckDivisible(int num)
    {
       if(((num % 5) == 0) && ((num % 11) == 0))
       {
        System.out.println(num+ " is Divisible by both 5 and 11");
       }
       else
       {
        System.out.println(num+ " is not Divisible by both 5 and 11");
       }
    }
}
class program03
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
    }
}