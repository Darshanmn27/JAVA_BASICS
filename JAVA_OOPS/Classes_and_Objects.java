import  java.util.*;







class   car  
{
    String name;
    int speed;
    //constructor

    car(String b,int speed)
    {
        this.name=b;
        this.speed=speed;
    }
    void  display()
    {
        //method
        System.out.println("name:"+name+"speed:"+speed);
    }
}
public  class Classes_and_Objects
{
    public static void main(String[] args) 
    {
        car c1=  new car("metrcidous", 80);
        car c2=  new car("duster", 45);
        c1.display();
        c2.display();

        
    }
}