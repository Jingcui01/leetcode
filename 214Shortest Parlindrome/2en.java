public class Solution {
    public String shortestPalindrome(String s) {
	if (s == null || s.length() <= 1)
		return s;
 
	String result = null;
 // find the center, only in the first half
	int len = s.length();
	int mid= len / 2;
 
	for (int i = mid; i >= 0; i--) 
	{
	    if ((result = scanFromCenter(s, i, i)) != null)
	        return result;
	    
		if (i>=1 && s.charAt(i) == s.charAt(i - 1)) // two symble as the center
			if ((result = scanFromCenter(s, i-1 , i)) != null)
				return result;
	}
	return result;
}
 
    private String scanFromCenter(String s, int l, int r) {
    	int i = 1;
     
    	//scan from center to both sides
    	for (; ; i++) 
    	{
    	    if(l-i < 0)
    	    {
    	        StringBuilder sb = new StringBuilder(s.substring(r + i));
    	        sb.reverse();
            	return sb.append(s).toString();
    	    }
    		if ((r + i)>=s.length() || s.charAt(l - i) != s.charAt(r + i))
    			return null;
    	}
    }
    
}