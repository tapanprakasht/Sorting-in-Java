//Quick sort program in java
import java.io.*;
class QsortMain
 {
     int a[]=new int[50];
     int limit;
     public void quicksort(int left,int right)
      {
         int loc;
         if(left<right)
           {
              loc=partition(left,right);
              quicksort(left,loc-1);
              quicksort(loc+1,right);
           }
         
      }
      public int partition(int left,int right)
      {
         int loc=left,temp;
         while(left<right)
          {
              while((a[loc]<=a[right]) && (loc<right))
               {
                 right=right-1;
               }
              if(a[loc]>a[right])
               {
                 temp=a[loc];
                 a[loc]=a[right];
                 a[right]=temp;
                 loc=right;
                 left=left+1;
               }
              while((a[loc]>=a[left]) && (loc>left))
               {
                 left=left+1;
               }
               if(a[loc]<a[left])
               {
               
                 temp=a[loc];
                 a[loc]=a[left];
                 a[left]=temp;
                 loc=left;
                 right=right-1;
               }
          }
          return(loc);
      }
      public void readArray() throws IOException
      {
         int i;
         DataInputStream in=new DataInputStream(System.in);
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" numbers");
         for(i=0;i<limit;i++)
          {
             a[i]=Integer.parseInt(in.readLine());
             
          }
         quicksort(0,limit-1);
         System.out.println("Sorted array is\n");
         for(i=0;i<limit;i++)
          {
             System.out.println(a[i]+" ");
          }
      }
 }
 class Qsort
  {
    
     public static void main(String args[]) throws IOException
      {
         QsortMain q=new QsortMain();
         q.readArray();
      }
      
  }