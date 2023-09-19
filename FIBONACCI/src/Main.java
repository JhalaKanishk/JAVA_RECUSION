import java.io.*;
import java.util.*;

class FIBONACCI{
    static int fib(int n){
        if(n == 1||n == 2) return 1;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        System.out.println("FIBONACCI NUMBER FINDER:-\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:-\n");
        int n = sc.nextInt();
        if(n < 1){
            System.out.println("ERROR!");
        }
        else{
            System.out.println(fib(n));
        }
    }
}