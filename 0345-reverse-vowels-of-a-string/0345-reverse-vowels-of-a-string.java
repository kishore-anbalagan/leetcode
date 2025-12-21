class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        char[] a=s.toCharArray();
        String n="aeiouAEIOU";
        while(l<r){
            if(n.indexOf(a[l])==-1)
            {
                l++;
            }
            else if(n.indexOf(a[r])==-1)
            {
                r--;
            }
            else
            {
                char t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;
                r--;
            }
        }
        String m=String.valueOf(a);
        return m;
    }
}