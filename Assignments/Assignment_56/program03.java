import java.util.*;
import java.io.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////
// Accept file name from user open the file in write mode and write data to the end of file 
///////////////////////////////////////////////////////////////////////////////////////////////////////

class program02
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;
        int iSize = 0;
        byte Buffer[] = new byte[100];
        String Data = null;
        String str = null;
        String FileName = null;
        File fobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        System.out.println("Enter File Name : ");
        FileName = sobj.nextLine();

        fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File is opened successfully");

            System.out.println("Enter data to write into the file : ");
            Data = sobj.nextLine();

            byte Arr[] = Data.getBytes();

            foobj = new FileOutputStream(FileName);
            fiobj = new FileInputStream(FileName);

            while((iRet = fiobj.read(Buffer)) != -1)
            {
                iSize = iSize + iRet;
            }

            System.out.println("Size of file before writing : "+iSize);

            foobj.write(Arr, iSize+1, Arr.length);
        }        
        else
        {
            System.out.println("File is not present");
        }
    }
}