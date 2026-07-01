class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[]=version1.split("\\.");
        String v2[]=version2.split("\\.");
        int n=Math.max(v1.length,v2.length);
        int n1,n2;
        for(int i=0;i<n;i++){
            if(i<v1.length){
                n1=Integer.parseInt(v1[i]);
            }
            else{
                n1=0;
            }
            if(i<v2.length){
                n2=Integer.parseInt(v2[i]);
            }
            else{
                n2=0;
            }
        if(n1<n2){
            return -1;
        }
        if(n1>n2){
            return 1;
        }
        }
        return 0;
    }
}