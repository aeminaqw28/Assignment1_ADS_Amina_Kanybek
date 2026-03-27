import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // Task 1: Sum of squares
        int result=task1(n);
        System.out.println(result);


    }
    // Task 1: Sum of squares of first n positive integers
    // Time Complexity: O(n) - makes n recursive calls, each does O(1) work
    public static int task1(int n){
        if(n==0){return 0;}
        return task1(n-1)+(n*n);
    }
}

