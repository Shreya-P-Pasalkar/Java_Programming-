class Logic
{
    void checkEvenOdd(int num)
    {
        if((num % 2) == 0)
        {
            System.out.println("given number "+num+ "is Even");
        }
        else
        {
            System.out.println("given number " +num+ " is Odd");   
        }
    }
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}