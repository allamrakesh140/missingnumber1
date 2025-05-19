/*missing number in an array*/

import java.util.Scanner;
import java.util.Arrays;
class Missingnumber1{
public static int missing(int arr[],int x){
      for(int i=1;i<=x;i++)
        {
         boolean found=false;
         for(int j=0;j<arr.length;j++)
            {
             if(arr[j]==i)

               {
                 found=true;
                  break;
            }
        }                               
           if (!found){
             return i;
}
 }
return -1;
}
public static void main(String []args)
{

		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=scanner.nextInt();
		System.out.println("enter the value of x:");
                 int x =scanner.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of an array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
        int result=missing(arr,x);
if (result != -1) {
            System.out.println("The missing number in the array is: " + result);
        } else {
            System.out.println("No number is missing.");
        }
                          
}
}
