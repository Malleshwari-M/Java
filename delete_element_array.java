Complete the function delete_element(), which deletes the element at the given position or print "deletion not possible" if given position is out of Bound.
import java.util.*;
class delete_element_array
{
  static void delete_element(int arr[], int size,int pos)
  {  
     //Fill your code here
     int ind=pos-1;
     if(pos>size)
     {
       System.out.print("Deletion not possible");
     }
     else
     {
     for(int i=0;i<size;i++)
     {
       if(i==ind)
       {
         continue;
     }
     
     else
     {
       System.out.print(arr[i]+" ");
     }
  }
  }}
  public static void main(String[] args)
  {
    int ind,size;
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    int[] arr = new int[size];
    for(ind=0;ind<size;ind++)
    {
      arr[ind]=sc.nextInt();
    }
    int pos=sc.nextInt();
    delete_element(arr,size,pos);
  }
}
