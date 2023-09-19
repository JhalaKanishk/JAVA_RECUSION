import java.io.*;
import java.util.*;
class  solution{
    static int fac(int n){
        if(n == 0)return 1;
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("ERROR!!");
        }
        else {
            System.out.println(fac(n));
        }
    }
}

