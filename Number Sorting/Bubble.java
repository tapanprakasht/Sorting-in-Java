//Bubble sort program in Java
import java.io.*;

class Bubble
 {
    public static void main(String args[]) throws IOException
      {
         DataInputStream in=new DataInputStream(System.in);
         int arr[]=new int[30];
         int limit,i,j,temp;
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" numbers");
         for(i=0;i<limit;i++)
          {
             arr[i]=Integer.parseInt(in.readLine());
             
          }
         for(i=0;i<limit;i++)
          {
            for(j=0;j<(limit-1)-i;j++)
              {
                 if(arr[j+1]<arr[j])
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