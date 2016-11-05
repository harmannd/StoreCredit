
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
    private static List<Integer> items;
    
    public CreditCase( int cred, int num, List<Integer> itms )
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
           
    public List<Integer> getItems()
    {
        return items;
    }
}
