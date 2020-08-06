package subarray;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array1= new int[n];
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        int count=0;
        for(int j=0;j<n;j++){
            int sum=0;
            for(int k=j;k<n;k++){
                sum=array1[k]+sum;
                System.out.println(sum);
                }
            }
        }
        //System.out.println(count);
    }
