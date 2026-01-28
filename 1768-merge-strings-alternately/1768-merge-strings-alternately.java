class Solution {
    public String mergeAlternately(String word1, String word2) {
        String a="";
        int l=Math.max(word1.length(),word2.length());
        for(int i=0;i<l;i++)
        {
            if(i<word1.length())
            {
                a=a+word1.charAt(i);
            }
            if(i<word2.length()){
                a=a+word2.charAt(i);
            }
        }
        return a;
    }
}