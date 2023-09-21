import java.util.*;
class Solution{
    public static void toPermute(String str){
        if (str == null || str.length() == 0) return;// string is empty
        permute(str.toCharArray(),0);// string is not empty call function
    }
    private static void permute(char[] chars,int curr){
       if(curr==chars.length-1){
           System.out.println(String.valueOf(chars));
       }
       for (int i=curr;i<chars.length;i++){
           swap(chars,curr,i);
           permute(chars,curr+1);
           swap(chars,curr,i);
       }
    }
    public static void swap(char[] chars,int i,int j){// function which swap the (i)th element with the current element
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args){// main function
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        toPermute(s);// calling of recursive function
    }
}