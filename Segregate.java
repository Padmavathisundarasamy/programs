import java.util.*;
public class Segregate{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[10];
int i,j,temp=0;
    for(i=0;i<n;i++)
    {
    arr[i]=s.nextInt();
    }
      i=0;
      j=n-1;
   while(i<=j){
   if(arr[i]==0)
   i++;
else
    {
if(arr[j]==0)
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
j--;
i++;
}
else
j--;
}
}
for(i=0;i<n;i++)
System.out.print(arr[i]+" ");
}
}

