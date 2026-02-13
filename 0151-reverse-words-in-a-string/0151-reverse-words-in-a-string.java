class Solution {
    public String reverseWords(String s) {
        StringBuilder a=new StringBuilder();
        String r[]=s.trim().split("\\s+");
        
        for(int i=r.length-1;i>=0;i--){
            a.append(r[i]);
            if(i!=0){
                a.append(" ");
            }
        }
        return a.toString();
    }
}