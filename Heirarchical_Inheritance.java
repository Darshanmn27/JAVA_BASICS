package java_coding.Inheritance;





class parent
{
    public  static  void  parent_method()
    {
        System.out.println("  darshan   this  is  parent  method ");
    }
}


class child1 extends parent
{
    public  static  void child_level_1()
    {
        System.out.println("   child  level method");
    }
}

class child2 extends parent
{
    public  static  void  child2()
    {
        System.out.println("   child   2  method");
    }
}
class child3 extends parent
{
    public  static  void  child3()
    {
        System.out.println("   child   3  method");
    }
}
public class Heirarchical_Inheritance
{




    public static void main(String[] args) 
    {


        child3 ob =  new child3();
        ob.child3();
        child2 o=  new child2();
        o.child2();
        
    }

    
}
