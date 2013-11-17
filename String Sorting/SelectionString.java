// Selection sort program for sorting strings
import java.io.*;

class SelectionString
 {
    public static void main(String args[]) throws IOException
     {
        String str[]=new String[20];
        int i,j,index,num;
        String temp;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter the number of strings:");
        num=Integer.parseInt(in.readLine());
        System.out.println("Enter "+num+" strings");
        for(i=0;i<num;i++)
         {
           str[i]=in.readLine();
         }
        for(i=0;i<num;i++)
         {
           index=i;
           for(j=i+1;j<num;j++)
            {
              if((str[j].compareTo(str[index]))<0)
                {
                  index=j;
                }
               temp=str[index];
               str[index]=str[i];
               str[i]=temp;
            }
         }
         System.out.println("Sorted strings is \n");
         for(i=0;i<num;i++)
         {
           System.out.println(str[i]);
         }
     }
 }