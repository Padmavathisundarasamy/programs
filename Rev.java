import java.util.*;
public class Rev{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Enter the Element");
int n=s.nextInt();
int a[]=new int[10];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int tmp,i=0,j=n-1;
tmp=a[i];
while(i<j)
{
tmp=a[i];
a[i]=a[j];
a[j]=tmp;
i++;
j--;
}
for(i=0;i<n;i++){
System.out.print(" "+a[i]);
}
}
}

