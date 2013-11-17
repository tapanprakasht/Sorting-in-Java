// Insertion sort program in Java
import java.io.*;

class Insertion
 {
    public static void main(String args[]) throws IOException
      {
         DataInputStream in=new DataInputStream(System.in);
         int arr[]=new int[30];
         int key,i,j,limit;
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" numbers");
         for(i=0;i<limit;i++)
          {
             arr[i]=Integer.parseInt(in.readLine());
             
          }
         for(j=1;j<limit;j++)
          {
            key=arr[j];
            for(i=j-1;i>=0 && arr[i]>key;i--)
              {
                 arr[i+1]=arr[i];
              }
              arr[i+1]=key;
          }
         System.out.println("Sorted array is");
         for(j=0;j<limit;j++)
          {
            System.out.println(arr[j]+" ");
          }
       }
 }