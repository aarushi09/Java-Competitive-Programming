
import java.util.Scanner;
public class Selection
{
    public static void main(String args[])
    {
        System.out.println("Selection Sort Technique!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("=============================================");
        Scanner sc=new Scanner(System.in);
        //length input
        System.out.println("Enter the No. of elements : ");
        int x=sc.nextInt();
        // declaring array
        System.out.println("Enter the Elements of the array : ");
        int a[]=new int[x];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        //now sorting
        for(int i=0;i<a.length;i++)
        {
            int n=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j] < a[n])
                {
                    n=j;
                }
                
            }   
            int t=0;
                t=a[n];
                a[n]=a[i];
                a[i]=t;
        }
        //now printing the soretd array
        System.out.println("The sorted array : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"  ");            
        }
    }
}
