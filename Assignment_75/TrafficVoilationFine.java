import java.util.*;

class TrafficViolationFine
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Fine = 0;
        String Helmet = null;
        String License = null;
        String Overspeeding = null;

        System.out.println("Helmet Worn : (Yes/No)");
        Helmet = sobj.next();

        System.out.println("Has License : (Yes/No)");
        License = sobj.next();

        System.out.println("Was overspeeding : (Yes/No)");
        Overspeeding = sobj.next();

        if(((Helmet.equalsIgnoreCase("Yes")==false) && (Helmet.equalsIgnoreCase("No")==false)) || (((License.equalsIgnoreCase("Yes")==false) && (License.equalsIgnoreCase("No")==false))) || (((Overspeeding.equalsIgnoreCase("Yes")==false) && (Overspeeding.equalsIgnoreCase("No")==false))))
        {
            System.out.println("Input must be Yes/No only");
            return;
        }

        if(Helmet.equalsIgnoreCase("No"))
        {
            Fine = 500;
        }

        if(License.equalsIgnoreCase("No"))
        {
            Fine = Fine + 1000;
        }

        if(Overspeeding.equalsIgnoreCase("Yes"))
        {
            Fine = Fine + 1500;
        }

        System.out.println("Total Fine Amount : "+Fine);
        
        sobj.close();
    }
}

// Time required :- 6:39.98 mins