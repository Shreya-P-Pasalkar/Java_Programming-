/////////////////////////////////////////////////////////////////////////////////////////////
//  Required Header Files
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   Implement
//  Description :  It is used to implement the business logic
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class Implement
{
    
    public int iNo = 0;

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Constructor
    //  Description :  Parameterized constructor
    //  Input :        Integer
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public Implement(int iNo)
    {
        // Static
        this.iNo = iNo;
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //  Updater
    /////////////////////////////////////////////////////////////////////////////////////////
    public void Update()
    {
        if(this.iNo < 0)
        {
            this.iNo = -this.iNo;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////
    //
    //  Function :     Display
    //  Description :  It is used to return total number of factors
    //  Input :        Nothing
    //  Output :       Nothing
    //  Author :       Shreya Pramod Pasalkar  
    //
    /////////////////////////////////////////////////////////////////////////////////////////
    public void DisplayFactors()
    {
        int iCnt = 0;
        int iFact = 0, iNonFact = 0;

        // Using Iteration ~ for loop
        // Time Complexity ~ O(N)
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iFact++;
            }
            else
            {
                iNonFact++;
            }
        } 

        System.out.println("Factor Count of "+this.iNo+" : "+iFact);
        System.out.println("Non-Factor Count of "+this.iNo+" : "+iNonFact);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name :   program46
//  Description :  Entry point class
//  Author :       Shreya Pramod Pasalkar
//
/////////////////////////////////////////////////////////////////////////////////////////////
class program47
{
    public static void main(String A[]) throws IOException
    {
        int iNo = 0;

        // Scanner sobj = new Scanner(System.in);
        // Input using buffered reader
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Number : ");
        iNo = Integer.parseInt(bobj.readLine());    
        
        // Buffered reader is fundamentally designed to take characters and String inputs
        // It is faster than scanner class and uses buffer rather than actual disk space

        Implement iObj = new Implement(iNo);

        iObj.Update();
        
        iObj.DisplayFactors();
    }
}