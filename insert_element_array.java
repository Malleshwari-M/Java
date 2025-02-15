Complete the function insert_element()  to insert the given element at given position and display the updated array. 
import java.util.*;
class insert_element_array
{
  static void insert_element(int arr[], int size,int ele,int pos)
  {  
     //Fill your code here
     int ins=pos-1;
     for(int i=0;i<size;i++)
     {
       if(i==ins)
       {
       System.out.print(ele+" ");
       System.out.print(arr[i]+" ");
     }
     else
     {
       System.out.print(arr[i]+" ");
     }
  }
  }
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size+1];
    for(ind=0;ind<size;ind++)
    {
      arr[ind]=sc.nextInt();
    }
    int ele=sc.nextInt();
    int pos=sc.nextInt();
    insert_element(arr,size,ele,pos);
  }
}
