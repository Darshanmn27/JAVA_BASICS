package java_coding.Inheritance;

  class Parent

{
    public   static   void parent_method()
    {
        System.out.println("darshan   this  is   parent  method...");
    }
}


class child extends Parent
{
    public  void   child_Method()
    {
        System.out.println("    child  method   ");
    }
}


public class Single 
{

    public static void main(String[] args) 
    {
         child   ob =  new  child();
         ob.child_Method();
         ob.parent_method();
    }
    
}
