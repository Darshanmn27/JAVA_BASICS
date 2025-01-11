public class Perfect_Numbers 
{


    public static boolean isperfectsquare(int num)
    {
        
        int sqr=(int)Math.sqrt(num);
        return sqr*sqr==num;

    }


    public static boolean isperfectcube(int num)
    {
       
        int sqr=(int)Math.cbrt(num);
        return sqr*sqr*sqr==num;

    }






    public static void main(String[] args) 
    {
        System.out.println(isperfectsquare(625));//true
        System.out.println(isperfectsquare(627));//false
        System.out.println(isperfectsquare(3025));//true
        System.out.println(" perfect  cube:");
        System.out.println(isperfectcube(64));//true
        System.out.println(isperfectcube(343));//true
        System.out.println(isperfectcube(125));//true
        System.out.println(isperfectcube(625));//false
        
    }
    
}
