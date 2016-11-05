
package MyProject.StoreCredit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *
 * @author Derek
 */
public class ProcessCredit 
{
    public CreditCase[] intialize() throws IOException 
    {
        int testCases;
        CreditCase[] creditCases = null;
        BufferedReader br = null;
        BufferedWriter bw = null;
        File inFile = new File("C:\\Users\\Derek\\Documents\\NetBeansProjects"
                + "\\StoreCredit\\src\\MyProject\\StoreCredit\\input.txt");
        File outFile = new File("C:\\Users\\Derek\\Documents\\NetBeansProjects"
                + "\\StoreCredit\\src\\MyProject\\StoreCredit\\output.txt");
        
        try
        {
            br = new BufferedReader( new InputStreamReader( new FileInputStream(inFile)));
            bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(outFile)));
            testCases = Integer.parseInt(br.readLine());
            creditCases = new CreditCase[testCases];
            for ( int i = 0; i < testCases; i++ )
            {
                int cred = Integer.parseInt(br.readLine());
                int num = Integer.parseInt(br.readLine());
                String str = br.readLine();
                String[] strArray = str.split(" ");
                int[] intArray = new int[strArray.length];
                for ( int j = 0; j < strArray.length; j++ )
                    intArray[j] = Integer.parseInt(strArray[j]);
                CreditCase c = new CreditCase(cred, num, intArray);
                creditCases[i] = c;
            }
        }
        catch( Exception e )
        {
            System.out.println("Exception: " + e);
        }
        finally
        {
            if ( br != null )
                br.close();
        }
        return creditCases;
    }
    
    public void process( CreditCase[] cc )
    {
        for ( CreditCase element : cc )
        {
            
        }
    }
}
