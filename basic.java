import java.util.*;

public class basic 
{

    public static void datatypesize()
    {
        System.out.println(Byte.SIZE);//8
        System.out.println(Byte.MIN_VALUE+"to"+Byte.MAX_VALUE);//-128to127
        System.out.println(Short.MIN_VALUE+"to"+Short.MAX_VALUE);//-32768to32767
        System.out.println(Short.SIZE);//16
        System.out.println(Character.SIZE);//16
        System.out.println(Character.MIN_VALUE+"to"+Character.MAX_VALUE);//to?
        System.out.println(Integer.SIZE);//32
        System.out.println(Integer.MIN_VALUE+"to"+Integer.MAX_VALUE);//-2147483648to2147483647
        System.out.println(Float.SIZE);//32
        System.out.println(Float.MIN_VALUE+"to"+Float.MAX_VALUE);//-2147483648to2147483647  
        System.out.println(Long.MIN_VALUE+"to"+Long.MAX_VALUE);//-9223372036854775808to9223372036854775807
        System.out.println(Long.SIZE);//64
        System.out.println(Double.MIN_VALUE+"to"+Double.MAX_VALUE);//4.9E-324to1.7976931348623157E308
        System.out.println(Double.SIZE);//64
    }
    public static void arithmetic()
    {
        System.out.println("  arithmetic  operators :");
        int a=10,b=5;
        System.out.println(a+b);//15
        System.out.println(a-b);//5
        System.out.println(a*b);//50
        System.out.println(a/b);//2
        System.out.println(a%b);//0
    }
    public static void assignment()
    {
        System.out.println("assignment  operators :");
        int a=10;
        System.out.println(a=+80);//80
        System.out.println(a);//80
        System.out.println(a=-80);//-80
        System.out.println(a);//-80
        System.out.println(a*=80);//-6400
        System.out.println(a);//-6400
        System.out.println(a/=80);//-80
        System.out.println(a);//-80
        System.out.println(a%=80);//0
        System.out.println(a);//0


    }


    public static void unary()
    {
        System.out.println("unary operators");
        int a=10;
        System.out.println((a++));//10
        System.out.println(a);//11
        System.out.println((++a));//12
        System.out.println(a);//12
        System.out.println((a--));//12
        System.out.println(a);//11
        System.out.println((--a));//10
        System.out.println(a);//10
    
    }

    public static void relational()
    {
        System.out.println("relational");
        int a=20,b=10;
        System.out.println(a==b);//false
        System.out.println(a>b);//true
        System.out.println(a>=b);//true
        System.out.println(a<b);//false
        System.out.println(a<=b);//false
        System.out.println(a!=b);//true
    
    }

    public static  void logical()
    {
        int a=10,b=20;
        System.out.println("using  and  operation");
        System.out.println(a==b&&b>a);//false
        System.out.println(a>=b&&b>=a);//false
        System.out.println(a==b&&b>a);//false
        System.out.println(a<=b&&b==a);//false
        System.out.println(a==b&&b<=a);//false
        System.out.println("using  or operation");
        System.out.println(a==b||b>a);//true
        System.out.println(a>=b||b>=a);//true
        System.out.println(a==b||b>a);//true
        System.out.println(a<=b||b==a);//true
        System.out.println(a==b||b<=a);//false
        System.out.println("using  not operation");
        System.out.println(a==b!=b>a);//true
        System.out.println(a>=b!=b>=a);//true
        System.out.println(a==b!=b>a);//true
        System.out.println(a<=b!=(b==a));//true
        System.out.println(a==b!=b<=a);//false
    }

    public static void shift()
    {
        int a=10;
        System.out.println("shift left");
        System.out.println(a<<1);//20
        System.out.println(1<<1);//2
        System.out.println(2<<1);//4
        System.out.println(3<<4);//48
        System.out.println("shift right");
        System.out.println(a>>1);//5
        System.out.println(1>>1);//0
        System.out.println(2>>1);//1
        System.out.println(3>>4);//0

        
    }
    public static void ternary()
    {
        System.out.println("ternaryoperators");
        int year=2024;
        String r=((year%4==0&& year%100!=0 ||year%400==0?"leap year":"normal year"));//leap year
        System.out.println(r);
    }


    public static void main(String[] args) 
    {
        datatypesize();
        arithmetic();
        assignment();
        unary();
        relational();
        logical();
        shift();
        ternary();
        
    }

    
}