package java_coding.Inheritance;



class parent1
{
    public   static void parent_method1()
    {
        System.out.println("  parent  methgod 1");
    }
    
}
class child1 extends parent1
{
    public  static  void child_level1()
    {
        System.out.println("   child  1    method");
    }
}
class child2 extends child1
{ 
    public   static   void   child_level_2()
    {
        System.out.println("   child  level_2");
    }

}
class child3 extends child2
{
    public   static  void  childlevel_3()
    {
        System.out.println(" child  level  3 method");
    }
}


public class Multiple_Level 
{

    public static void main(String[] args) 
    {
        child3 ob  =  new child3();
        ob.child_level1();
        ob.child_level_2();
        ob.childlevel_3();
        
    }



    
}
