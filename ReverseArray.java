import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        
        int a[] = new int[1000];
        int size;
        Scanner sc  = new Scanner(System.in);
        
       // System.out.println("Enter Size of Array : ");
        size=sc.nextInt();
        
       // System.out.println("Enter Elements of Array : ");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        
        reverseArray(a , size);
        
        //System.out.println("Reversing Elements of Array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i] + " ");
        }

    }

    private static int[] reverseArray(int[] a, int size) {
        
        int len = size-1;
        for(int i =0 ; i <size/2 ; i++)
        {
            int temp=a[i];
            a[i] = a[len-i];
            a[len-i] =temp;
        }
        return a;
    }

}
