class Logic
{
    void DisplayGrade(int marks)
    {
       if( marks <= 30)
       {
        System.out.println("Grade : Fail");
       }
       else if( (marks > 30) && (marks <= 50))
       {
        System.out.println("Grade : c");
       }
       else if( (marks > 50) && (marks <= 70))
       {
        System.out.println("Grade : B");
       }
       else if( (marks > 70) && (marks <= 80))
       {
        System.out.println("Grade : A");
       }
       else if( (marks > 80) && (marks <= 90))
       {
        System.out.println("Grade : A+");
       }
       else 
       {
        System.out.println("Grade : O");
       }

    }
}
class program02
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayGrade(82);
    }
}