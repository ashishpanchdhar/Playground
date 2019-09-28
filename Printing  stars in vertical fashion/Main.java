import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int stars=1;stars<=n;stars++)
    {
      System.out.println("*");
    }
  }
}