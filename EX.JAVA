class Solution {
    public boolean isValid(String s) {
        
        for(int i=0;i<=s.length();i++){
            String str=s.substring(i,i);
            if(str=="()"||str=="[]"||str=="{}"){
                return true;
            }
        }
        return false;
    }
}
class EX{
    public static void main(String args[]){
        String s="()";
        System.out.println(isValid(s));
    }
}