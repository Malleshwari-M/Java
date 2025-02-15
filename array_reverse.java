Given the size of array and array values to function arr_reverse(), write a code to reverse the given array.
import java.util.*;
class array_reverse
{
  static void array_reverse(int arr[], int size)
  {
    for(int i=size-1;i>=0;i--)
    {
      System.out.print(arr[i]+" ");
    }
  }
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
    array_reverse(arr,size);
    //for(ind=0;ind<size;ind++)
     // System.out.print(arr[ind]+" ");
  }
}
