//Program to sort strings using Bubble sort algorithm
import java.io.*;

class BubbleSortString
 {
    public static void main(String args[]) throws IOException
      {
         DataInputStream in=new DataInputStream(System.in);
         String arr[]=new String[30];
         int limit,i,j;
         String temp;
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" strings");
         for(i=0;i<limit;i++)
          {
             arr[i]=in.readLine();
             
          }
         for(i=0;i<limit;i++)
          {
            for(j=0;j<(limit-1)-i;j++)
              {
                 if((arr[j+1].compareTo(arr[j]))<0)
                  {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                  }
              }
              
          }
         System.out.println("Sorted array is");
         for(i=0;i<limit;i++)
          { 
            System.out.println(arr[i]+" ");
          }
       }
 }