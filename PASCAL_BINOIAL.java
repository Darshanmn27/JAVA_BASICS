package Inheritance;

public class PASCAL_BINOIAL 
{

    public  static  int fact(int n)
    {
        int r=1;
        for(int i=1;i<=n;i++)
        {
            r=r*i;
        }
        return r;
    }
    public  static  int binomial_cofficient(int r,int c)
    {
        return fact(r)/(fact(c)*fact(r-c));
    }
    public   static  void  printlast(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(binomial_cofficient(n-1, i)+" ");
        }
    }



    public static void main(String[] args) 
    {
        printlast(4);// 1 3 3 1 
        
    }
    
}
