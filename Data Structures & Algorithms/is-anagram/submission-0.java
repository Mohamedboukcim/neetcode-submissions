class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();

        Arrays.sort(s_chars);
        Arrays.sort(t_chars);

        String s_sorted = new String(s_chars);
        String t_sorted = new String(t_chars);
        
        System.out.println(s_sorted);
        System.out.println(t_sorted);

        return s_sorted.equals(t_sorted);
    }
}
