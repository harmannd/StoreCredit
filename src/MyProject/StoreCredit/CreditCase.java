
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
    
    public CreditCase( int cred, int num, int[] itms )
    {
        credit = cred;
        numItems = num;
        items = itms;
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
}
