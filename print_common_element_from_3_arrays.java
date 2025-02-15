Complete the function print_common_element(), which prints the common elements from 3 sorted array.
import java.util.*;
public class print_common_element_from_3_arrays
{   
   public static void print_common_element(int a,int b,int c,int arr1[],int arr2[],int arr3[])
   { 
      //Fill your code here
      for(int i=0;i<a;i++)
      {
   for(int j=0;j<b;j++)
   {
     for(int k=0;k<c;k++)
     {
       if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]&&arr1[i]==arr3[k])
       {
     System.out.print(arr1[i]+" ");
   }}}}}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int size3=sc.nextInt();
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int arr3[]=new int[size3];
		int ind;
		for(ind=0;ind<size1;ind++)
		{
		    arr1[ind]=sc.nextInt();
		}
		for(ind=0;ind<size2;ind++)
		{
		    arr2[ind]=sc.nextInt();
		}
		for(ind=0;ind<size3;ind++)
		{
		    arr3[ind]=sc.nextInt();
		}
	  print_common_element(size1,size2,size3,arr1,arr2,arr3);
	}
}
