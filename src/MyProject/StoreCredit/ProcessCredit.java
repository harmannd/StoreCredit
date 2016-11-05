
package MyProject.StoreCredit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Hashtable;
import static java.util.Objects.hash;

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
        File inFile = new File("C:\\Users\\Derek\\Documents\\NetBeansProjects"
                + "\\StoreCredit\\src\\MyProject\\StoreCredit\\input.txt");
        
        try
        {
            br = new BufferedReader( new InputStreamReader( new FileInputStream(inFile)));
            testCases = Integer.parseInt(br.readLine());
            creditCases = new CreditCase[testCases];
            for ( int i = 0; i < testCases; i++ )
            {
                int cred = Integer.parseInt(br.readLine());
                int num = Integer.parseInt(br.readLine());
                int caseNo = i + 1;
                String str = br.readLine();
                String[] strArray = str.split(" ");
                int[] intArray = new int[strArray.length];
                for ( int j = 0; j < strArray.length; j++ )
                    intArray[j] = Integer.parseInt(strArray[j]);
                CreditCase c = new CreditCase(cred, num, intArray, caseNo);
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
    
    public void process( CreditCase[] cc ) throws IOException
    {
        File outFile = new File("C:\\Users\\Derek\\Documents\\NetBeansProjects"
                + "\\StoreCredit\\src\\MyProject\\StoreCredit\\output.txt");
        PrintWriter pw = null;
        try
        {
            pw = new PrintWriter( new BufferedWriter( new OutputStreamWriter( new FileOutputStream(outFile))));
            for ( CreditCase element : cc )
            {
                Hashtable h = new Hashtable();
                int[] itms = element.getItems();
                for ( int i = 0; i < element.getNumItems(); i++ )
                {
                    h.put(itms[i], i);
                }
                for ( int i = 0; i < element.getNumItems(); i++ )
                {
                    int pInt = element.getCredit() - itms[i];
                    if ( h.containsKey(pInt) )
                    {
                        int item1 = itms[i];
                        int item2 = (int)h.get(pInt);
                        pw.println("Case #" + element.getCaseNum() + ": " + item1 + " " + item2);
                    }
                }
            }
        }
        catch( Exception e )
        {
            System.out.println("Exception: " + e);
        }
        finally
        {
            if ( pw != null )
                pw.close();
        }  
    }
}
