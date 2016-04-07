public class Solution {
    public String shortestPalindrome(String s) {
         int len = s.length();
         
         if(len == 0 || len == 1) return s;
         StringBuilder sBuffer = new StringBuilder();
         palindrome(s, sBuffer, len-1);
         return sBuffer.toString();
        
    }
    private void palindrome(String sub, StringBuilder sBuffer, int bt)
    {
        //System.out.println(bt);
        if(bt==0 || bt==1)
        {
            sBuffer.append(sub);
            return;
        }
        String next = sub;
        int i=bt;
        if(sub.charAt(0)!=sub.charAt(bt))
        {
            next = sub;
            bt--;
        }
        else
        {
            //System.out.println("-");
            next = sub.substring(1);
            bt -= 2;
        }
            
        String tt = "" + sub.charAt(i);
        sBuffer.append(tt);
        palindrome(next, sBuffer, bt);
    }
}