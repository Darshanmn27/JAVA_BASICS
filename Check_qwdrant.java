public class Check_qwdrant 
{
    public static void checkquadrant()
   {
    int x=0,y=0;
    if(x>0 &&y>0)
    {
        System.out.println("quadrant1");
    }
    else if(x<0 && y>0)
    {
        System.out.println("quadrant 2:");
    }
    else if(x<0 && y<0)
    {
        System.out.println("quadrant 3");
    }
    else if(x==0&& y==0)
    {
        System.out.println("origin");
    }
    else
    {
        System.out.println("quadrant 4");
    }
   }



    public static void main(String[] args) 
    {
        checkquadrant();//origin
        
    }
}
