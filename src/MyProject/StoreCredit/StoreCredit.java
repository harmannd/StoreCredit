package MyProject.StoreCredit;

import java.io.IOException;

/**
 *
 * @author Derek
 */
public class StoreCredit 
{
    public static void main(String[] args) throws IOException
    {
        ProcessCredit pc = new ProcessCredit();
        CreditCase[] cc = pc.intialize();
        pc.process(cc);
    }
}
