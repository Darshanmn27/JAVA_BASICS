class parent 
{
    void  parent_method()
    {
        System.out.println("   hello  this  is  parent  method ..");
    }
}
class child  extends parent
{
    void  child_method()
    {
        System.out.println("  hello  this  is   child  method");
    }
}
class grand_child extends parent 
{
    void  grand_child_method()
    {
        System.out.println(" hello  this  is  grand  child   method");

    }
}

public class Heirarchical_inheritance 
{

    public static void main(String[] args) 
    {

        parent p= new parent();
        p.parent_method();
        


        child  c=  new child();
        c.child_method();
        c.parent_method();

        grand_child   gc=  new grand_child();
        gc.parent_method();
        gc.grand_child_method();
        

        
    }
    
}
