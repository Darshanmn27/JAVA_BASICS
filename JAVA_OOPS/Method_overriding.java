class parent

{
    void   parent_method()
    {


        System.out.println("darshan  this  is    parent  method  inside  the  parent  class");
    }
}
class child extends parent
{
    void parent_mathod()
    {
        System.out.println("   this  is  parent method  inside  the   child  class");
    }
}
class grandchild extends child
{
    void parent_mathod()
    {
        System.out.println("  darshan  grandchild  this  is  parent method  inside  the   child  class");
    }
}
public class Method_overriding 
{


    public static void main(String[] args) 
    {
        grand_child p=  new grand_child();
        p.parent_method();
        
    }



}
