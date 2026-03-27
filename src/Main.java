import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("task1 input n:");
        int n=sc.nextInt();
        // Task 1: Sum of squares
        int result=task1(n);
        System.out.println(result);
        //Task2:sum of the first n elements of the array
        System.out.println("task2 input n:");
        int n2=sc.nextInt();
        System.out.println("Input"+n+"array elements");
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]= sc.nextInt();
        }
        int result2=task2( n2, arr2);
        System.out.println("task2 result:"+result2);
        //task3:
        System.out.println("Task3 input b: ");
        int b3=sc.nextInt();
        System.out.println("Task3 input n: ");
        int n3=sc.nextInt();
        int result3=task3(n3,b3);
        System.out.println("Answert task3 is:"+result3);



    }
    // Task 1: Sum of squares of first n positive integers
    // Time Complexity: O(n) - makes n recursive calls, each does O(1) work
    //(one multiplication and one addition). Therefore, runtime grows linearly with n.
    public static int task1(int n){
        if(n==0){return 0;}
        return task1(n-1)+(n*n);
    }

    //Task2:
    // Time Complexity: O(n)
    // Explanation: The method makes n recursive calls (from n down to 0).
    // At each call, it does O(1) work (one addition and array access).
    // Therefore, runtime grows linearly with n.
    public static int task2(int n2,int[] arr2){
        if (n2==0){
            return 0;
        }
        return task2(n2-1,arr2)+arr2[n2-1];

    }

    //Task3
    public static int  task3(int n3, int b3){
        if(n3==0){
            return 1;
        }
        return task3(n3-1,b3)+(int)Math.pow(b3,n3);
    }

// return task3(b,n-1)+(Math.pow(b,n3-1)+Math.pow(b))
}

