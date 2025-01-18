//A class inherits from another class, which itself inherits from a parent class.
class parent 
{
    void parent_method()
    {
        System.out.println("  darshan  this  is  parent  method");
    }
}
class  child  extends  parent
{
    void  child_method()
    {
        System.out.println("  darshan   this  is  child method ");
    }
}
class grand_child  extends child 
{
    void  grandchild_method()
    {
        System.out.println("  darshan  this  is   grand  child  method");
    }
}

public class Multi_level_Inheritance 
{



    public static void main(String[] args) 
    {


        //  with   the   help  of  grand   child   we  can   easy     all  the  data  even  parentr   and  child
        grand_child c= new grand_child();
        c.child_method();// darshan   this  is  child method 
        c.parent_method();//darshan  this  is  parent  method
        c.grandchild_method();//darshan  this  is   grand  child  method

        
    }
    
}
