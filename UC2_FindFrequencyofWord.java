package hashtableandbst.com;
import java.util.HashMap;
import java.util.Map;

public class uc2_findfrequencyofword {
	/*
	 *@purpose: Find the frequency of string
	 *@return: No return value
	 */
	 public void findfrequency() 
	 {
		 String str = "Paranoids are not paranoid because they are paranoid but " +
	                "because they keep putting themselves deliberately " +
	                "into paranoid avoidable situations";

	        String [] strArray = str.split(" ");
	         Map<String,Integer> map = new HashMap<String,Integer>();

	        for (String word : strArray)
	        {
	            Integer number = map.get(word);
	            if (number == null){
	                number = 1;
	         }
	         else 
	         {	 
	        	 number++;
	          }
	            map.put(word,number);
	    }
	        for (Map.Entry<String, Integer> entry : map.entrySet())
	        {
	            System.out.println(entry.getKey() + "  "+ entry.getValue());
	        }
	    }
	    public static void main(String args[]) 
	  {
	    	 uc2_findfrequencyofword freq = new uc2_findfrequencyofword();
		  freq.findfrequency();
	  }
}	




