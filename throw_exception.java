import  java.util.*;
public  class throw_exception
{


    public   static   void  finally_keyword()
    {
        try
        {
            int a=2027;
            int res=a/3;
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("    occur  an   arith metic   exception");

        }
        finally
        {
            System.out.println("   totally   exceuted ");
        }
    }

    public  static   void  throw_throws(int a,int b) throws ArithmeticException 
    {
        
        if(b==0)
        {
            throw new ArithmeticException("  occurs   an  exceprion");
        }
        else
        {
            System.out.println(a/b);
        }
        
    }
    public  static  void  exceptionerrors()
    {
        try 
        {
            throw_throws(20, 0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("  occur  an  exception ");
        }
    }
    public static void main(String[] args) 
    {
        finally_keyword();
        exceptionerrors();
        
        
    }

    
}