import java.util.*;
public class WindowMax
{
    public static void max(int arr[],int k)
    {
        int n=arr.length;
        for(int i=0;i<=n-k;i++)
		{
			int max=-999;
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>max)
					max=arr[j];
			}
			System.out.print(max+" ");
		}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of the subarray:");
        int k=sc.nextInt();
        max(arr,k);
        sc.close();
    }
}