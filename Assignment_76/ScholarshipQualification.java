import java.util.*;

class ScholarshipQualification
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Marks = 0;
        int Attendance = 0;
        int Income = 0;
        boolean qualification = true;

        System.out.println("Enter Marks : ");
        Marks = sobj.nextInt();

        System.out.println("Enter Attendance : ");
        Attendance = sobj.nextInt();

        System.out.println("Enter family income : ");
        Income = sobj.nextInt();

        if(((Marks < 0) || (Marks > 100)) || ((Attendance < 0) || (Attendance  > 100)))
        {
            System.out.println("Marks and attendance should be 0-100");
            return;
        }

        if(Income < 0)
        {
            System.out.println("Income cannot be negative");
            return;
        }

        if(Marks < 80)
        {
            System.out.println("Scholarship Rejected : Marks should be greater than equal to 80%");
            qualification = false;
        }

        if(Attendance < 75)
        {
            System.out.println("Scholarship Rejected : Attendance should be greater than equal to 75%");
            qualification = false;
        }

        if(Income > 300000)
        {
            System.out.println("Scholarship Rejected : Family Income should be less than INR 300000");
            qualification = false;
        }

        if(qualification == true)
        {
            System.out.println("Scholarship Approved");
        }
                
        sobj.close();
    }
}

// Time required :- 9:58.09 mins