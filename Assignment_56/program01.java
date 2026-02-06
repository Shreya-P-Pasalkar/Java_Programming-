import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////
// Accept file name from user and open it
///////////////////////////////////////////////////////////////////////////////////////////////////////

class program01 
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String FileName = null;
        File fobj = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is opened successfully");
        }        
        else
        {
            System.out.println("File not present");
        }
    }
}