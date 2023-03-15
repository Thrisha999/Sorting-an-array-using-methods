//Sorting an array
import java.util.*;
class Arraysorting
{
  int a[] = new int[10];
  void display(int n)
  {
    int i,temp,j;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array elements :");
    for (i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    System.out.println("Before sorting,Array elements are :");
    for (i=0;i<n ;i++ )
    {
      System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("After sorting, Array elements are :");
    for (i=0;i<n ;i++ )
    {
      for (j=i+1;j<n ;j++ )
      {
        if(a[i]>a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
      System.out.print(a[i]+" ");
    }
  }
}
public class Array_sorting
{
  public static void main(String[] args)
  {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the value of n :");
    n = in.nextInt();
    Arraysorting num = new Arraysorting();
    num.display(n);
  }
}
