class Solution {
    public boolean isPalindrome(String s) {
        
        String s_trim = s.replaceAll("[\\s\\p{Punct}]", "");
        s_trim = s_trim.toLowerCase();
        int size = s_trim.length();
        if(size == 0) return true;
        
        for(int i=0; i<=size/2; i++){
            if(s_trim.charAt(i) != s_trim.charAt(size-1-i)){
                return false;
            }
        }
        return true; 
    }
}
