// Implementation of selection sort algorithm
import java.io.*;

class selection
 {
    public static void main(String args[]) throws IOException
      {
         DataInputStream in=new DataInputStream(System.in);
         int arr[]=new int[30],temp;
         int limit,index,small,i,j;
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" numbers");
         for(i=0;i<limit;i++)
          {
             arr[i]=Integer.parseInt(in.readLine());
             
          }
         for(i=0;i<limit;i++)
          {
             index=i;
             for(j=i+1;j<limit;j++)
              {
                 if(arr[j]<arr[index])
                   index=j;
              }
              temp=arr[index];
              arr[index]=arr[i];
              arr[i]=temp;
          }
          System.out.println("Sorted array is\n");
         for(i=0;i<limit;i++)
          {
             System.out.println(arr[i]+" ");
          }
      }
 }