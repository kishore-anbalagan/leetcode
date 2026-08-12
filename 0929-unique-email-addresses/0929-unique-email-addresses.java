class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set=new HashSet<>();
        for(String email:emails){
            String n[]=email.split("@");
            String a=n[0];
            String b=n[1];
        
        if(a.contains("+")){
            a=a.substring(0,a.indexOf('+'));
        }
        a=a.replace(".","");
        String c=a+"@"+b;
        set.add(c);
    }
    return set.size();
    }
}