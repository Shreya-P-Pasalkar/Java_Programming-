import java.util.*;

class BankLoanEligibility
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        String LoanUnpaid = null;

        System.out.println("Enter Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income : ");
        Income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Enter existing unpaid load : (Yes/No)");
        LoanUnpaid = sobj.next();

        if((Age < 0) || (Income < 0) || (CreditScore < 0))
        {
            System.out.println("Loan Rejected : Age, Income, CreditScore cannot be negative");
            return;
        }

        if((LoanUnpaid.equalsIgnoreCase("Yes") == false) && (LoanUnpaid.equalsIgnoreCase("No") == false))
        {
            System.out.println("Loan Rejected : Unpaid Loans not allowed");
            return;
        }

        if(((Age >= 21) && (Age <= 60)) == false)
        {
            System.out.println("Loan Rejected : Age should be between 21 to 60(inclusive)");
            return;
        }

        if((Income >= 25000) == false)
        {
            System.out.println("Loan Rejected : Monthly income should be greater than 25000");
            return;
        }

        if((CreditScore < 700))
        {
            System.out.println("Loan Rejected : Credit score should be greater than 700");
            return
        }

        System.out.println("Loan Approved");

        sobj.close();
    }
}

// Time required :- 5:26.71 mins