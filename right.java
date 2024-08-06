import java.util.*;
class right
{
    public static void main(String args[])
    {
        int i,j,r;
        Scanner s=new  Scanner(System.in);
        System.out.println("enter the no of rows");
        r=s.nextInt();
        for(i=1;i<=r;i++)
    {
        for(j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
