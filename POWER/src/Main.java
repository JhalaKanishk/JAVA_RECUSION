import java.util.*;
class Main{
    static long Pow(int x,int n){
    if(n == 0) return 1;
    long temp = Pow(x,n/2);
    if(n % 2 == 1) return temp*temp*x;//ODD
        return temp*temp;//EVEN

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int x = sc.nextInt();
        System.out.println("X is "+x);

        System.out.println("Enter the value of Power:-");
        int n = sc.nextInt();
        System.out.println("N is "+n);

        if (n < 1){
            System.out.println("Error!!");
        }
        else {
            System.out.println("\nANSWER = "+Pow(x,n));
        }
    }
}