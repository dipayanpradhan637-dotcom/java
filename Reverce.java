import java.util.Scanner;
public class Reverce
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number: ");
       int num=sc.nextInt();
       int reverse=0;
       while (num!=0) {
         int d=num%10;
         reverse=reverse*10+d;
         num=num/10;
       }
       System.err.println("Reverse number="+reverse);
       sc.close();
       
    }
}
