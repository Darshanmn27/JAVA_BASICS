package java_coding.Inheritance;

public class Over_Loading 
{


    public static void add(int n1,int n2)
    {
        int s=n1+n2;
        System.out.println(s);
    }
    public static void add(String n1,String n2)
    {
        String s=n1+n2;
        System.out.println(s);
    }
    public static int add(int n1,int n2,int n3)
    {
        int s=n1+n2+n3;
        return s;
    }

    public static void main(String[] args) 
    {
        add("darshan", "anvar");//darshananvar
        add(2027, 2023);//4050
     System.out.println(   add(12, 13, 14));//39
        
    }
    
}
