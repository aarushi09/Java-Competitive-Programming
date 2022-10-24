import java.util.Scanner;
public class Bubble
{
    public static void main(String args[])
    {
        System.out.println("Bubble Sort Technique!");
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter number of elements: ");
        int n=sc.nextInt();
        
        System.out.println("Enter the Elements of the array: ");
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            System.out.println(a[i]);
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    int t=0;
                    t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        
        System.out.println("The sorted array  : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
