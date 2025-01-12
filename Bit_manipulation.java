package java_coding;

public class Bit_manipulation 
{


    public static void evenodd(int n)
    {
        if((n&1)==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }


    public static void array_non_repeated_element()
    {
        int arr[]={1,2,3,4,5,6,6,9,5,4,3,2,1};
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            k^=arr[i];
         
        }
        System.out.println(k);
    }
    public  static  void  bitmasking()
    {
        //System.out.println("bit  masking");
        int n=20;
        System.out.println(n&(1<<(19)));//0
        System.out.println(~12);//-13
        System.out.println(~987);//-988
        System.out.println(~-65);//64
        int a[]={1,1,1,2,2,2,3,3,3,4};
        System.out.println(6&1);//0


    }

    public static void magic(int n)
    {
        
        int ans=0;
        int b=5;
        while (n>0) 
        {
            int last=n&1;
            n=n>>1;
            ans+=last*b;
            b=b*5;
            
        }
        System.out.println(" hello :");
        System.out.println(ans);//650
    }



    public static void powera()
    {

        System.out.println("  power  of  a  number  or  not :");
        int b=3;
        int p=6;
        int a=1;
        while (p>0) 
        {
            if((p&1)==1)
            {
                a*=b;
            }
            b*=b;
            p=p>>1;
            
        }
        System.out.println(a);
    }
    public static int setbits(int n)
    {
        int c=0;
        while (c>0) 
        {
            c++;
            n-=(n&n-1);
            
        }
    return c;
    }

    public static void main(String[] args)
    {
        evenodd(2027);//odd
        evenodd(20278);//even
        array_non_repeated_element();//9
        bitmasking();
        magic(10);
        powera();//729
        System.out.println(setbits(8));//0
        
    }
    
}
