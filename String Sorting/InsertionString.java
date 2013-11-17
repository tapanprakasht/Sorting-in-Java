//Program to sort strings using Insertion sort algorithm
import java.io.*;

class InsertionString
 {
    public static void main(String args[]) throws IOException
      {
         DataInputStream in=new DataInputStream(System.in);
         String arr[]=new String[30];
         String key;
         int i,j,limit;
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" Strings");
         for(i=0;i<limit;i++)
          {
             arr[i]=in.readLine();
             
          }
         for(j=1;j<limit;j++)
          {
            key=arr[j];
            for(i=j-1;i>=0 && (arr[i].compareTo(key))>0;i--)
              {
                 arr[i+1]=arr[i];
              }
              arr[i+1]=key;
          }
         System.out.println("\nSorted array is");
         for(j=0;j<limit;j++)
          {
            System.out.println(arr[j]+" ");
          }
       }
 }