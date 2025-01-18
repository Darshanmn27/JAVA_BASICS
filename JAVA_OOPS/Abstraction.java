//Definition: Abstraction is a process of hiding the implementation details and showing only the functionality to the user. In Java, abstract classes and interfaces are used to achieve abstraction.



abstract  class shape
{
    abstract  void draw();

}

class   Circle   extends  shape 
{
    @Override
 void  draw()
 {
    System.out.println("  drawing   a  circele");
 }
}
public class Abstraction 
{







    public static void main(String[] args) 
    {
        shape s=  new  Circle();
        s.draw();
        
    }
    
}
