class calculation
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
}




class  area
{
    int aread_square(int a,int b)
    {
        return a*b;
    }
    float area_squre2(int a,float b)
    {
        return a*b;
    }
}
public class Poly_Method_overloading 
{

    //compile   time   poly morphism

    //Polymorphism allows methods to behave differently based on the object calling them.
    public static void main(String[] args) 
    {
        calculation a=  new calculation();
        System.out.println(a.add(2023, 2027));
        System.out.println(a.add(20.9282f, 20.9181f));
        area   aa=  new area();
        aa.area_squre2(9181, 98);
        aa.aread_square(12, 98);
        
    }
    
}
