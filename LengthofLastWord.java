class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,w=0;
   for(int i=s.length()-1;i>=0;i--){
       if(Character.isWhitespace(s.charAt(i))&& count==0){
           continue;
       }
       if(count>=1 && Character.isWhitespace(s.charAt(i))){
           w++;
       } 
 if ((s.charAt(i)<'z' ||s.charAt(i)<'Z' ||s.charAt(i)>'a'  || s.charAt(i)>'A' ))
     if(w==1){

         break;
     }
     count++;
        }
        
       return count;
    }
}