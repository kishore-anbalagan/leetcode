class Solution {
    public boolean canAliceWin(int n) {
        for(int i=10;i>=1;i--){
            n=n-i;
            if(i%2==0){
                if(n<0) return false;
            }
            else{
                if(n<0) return true;
            }
        }
        return false;
    }
}