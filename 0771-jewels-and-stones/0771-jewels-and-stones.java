class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> s = new HashSet<>();
        //int n=jewels.length;
        //int m=stones.length;
        for(char c:jewels.toCharArray()){
            s.add(c);
        }
        int count=0;
        for(char c:stones.toCharArray()){
            if(s.contains(c))
                count++;
        }
        return count;
    }
}