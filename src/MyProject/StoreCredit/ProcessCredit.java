
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
    public void intialize() throws IOException 
    {
        int testCases;
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
            for ( int i = 0; i < testCases; i++ )
            {
                CreditCase case = new CreditCase()
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
            if ( bw != null )
                bw.close();
        }
    }
}
