class Logic
{
    void CheckLeapYear(int year)
    {
        if((year % 4) == 0)
        {
            System.out.println(year+ " is a Leap Year");
        }
        else
        {
            System.out.println(year+ " is not a Leap Year");
        }
    }
}
class program01
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
    }
}