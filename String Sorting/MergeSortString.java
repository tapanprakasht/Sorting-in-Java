//Program to sort strings using merge sort algorithm
import java.io.*;
class MergesortMain
 {  
    String a[]=new String[50];
    int limit;
    public void readArray() throws IOException
      {
         int i;
         DataInputStream in=new DataInputStream(System.in);
         System.out.println("Enter the limit:");
         limit=Integer.parseInt(in.readLine());
         System.out.println("Enter "+limit+" strings");
         for(i=0;i<limit;i++)
          {
             a[i]=in.readLine();
             
          }
         mergesort(0,limit-1);
         System.out.println("Sorted array is\n");
         for(i=0;i<limit;i++)
          {
             System.out.println(a[i]+" ");
          }
      }
     public void mergesort(int l,int r)
      {
         int mid;
         if(l!=r)
          {
             mid=(l+r)/2;
             mergesort(l,mid);
             mergesort(mid+1,r);
             merge(l,mid,r);
          }
      }
     public void merge(int l,int mid,int r)
      {
         int i=l,j=mid+1,k=l;
         String c[]=new String[50];
         while((i<=mid) && (j<=r))
           {
              if((a[i].compareTo(a[j]))<0)
               {
                 c[k++]=a[i++];
               }
               else
               {
                 c[k++]=a[j++];
               }
             
           }
           while(i<=mid)
           {
              c[k++]=a[i++];
           }
           while(j<=r)
           {
              c[k++]=a[j++];
           }
           for(i=l;i<=r;i++)
           {
            a[i]=c[i];
           }
      }
 }
 
class MergeSortString
  {
    
     public static void main(String args[]) throws IOException
      {
        
        MergesortMain m=new MergesortMain();
        m.readArray();
         
      }
      
  }