
package MyProject.StoreCredit;

import java.util.List;


/**
 *
 * @author Derek
 */
public class CreditCase 
{
    private static int credit;
    private static int numItems;
    private static int[] items;
    private static int caseNum;
    
    public CreditCase( int cred, int num, int[] itms, int caseNo)
    {
        credit = cred;
        numItems = num;
        items = itms;
        caseNum = caseNo;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public int getNumItems()
    { 
        return numItems; 
    }
           
    public int[] getItems()
    {
        return items;
    }
    
    public int getCaseNum()
    {
        return caseNum;
    }
}
