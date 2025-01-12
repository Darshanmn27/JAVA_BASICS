package java_coding.Inheritance;




class parent
{
    void p()
    {
        System.out.println("darshan parent  class");
    }
}
class child  extends parent
{
    void p()
    {
        System.out.println("darshan  this  is  child  class");
    }
}

public class OVER_RIDINNG 
{


    public static void main(String[] args) 
    {
        parent o=  new parent();
        o.p();
        parent o2= new child();
        o2.p();

        
    }
    
}
