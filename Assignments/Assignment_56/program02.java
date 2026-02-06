import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////
// Accept file name from user open it display the data of from the file 
///////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        byte Buffer[] = new byte[100];
        String str = null;
        String FileName = null;
        File fobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is opened successfully");

            fiobj = new FileInputStream(FileName);

            System.out.println("Data from file : ");
            while((iRet = fiobj.read(Buffer)) != -1)
            {
                str = new String(Buffer, 0, iRet);
                System.out.print(str);
                str = null;
            }
            System.out.println();
        }        
        else
        {
            System.out.println("File is not present");
        }
    }
}