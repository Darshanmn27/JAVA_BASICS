public class types_of_numbers 
{


    public   static  void  perfect()
    {
        int n=28,s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
        {
            System.out.println(" perfect  number");
        }
        else
        {
            System.out.println("  not  perfect  number");
        }
    }



    public static void friendly()
{
    int n1=6;
    int n2=28;
    int s1=0,s2=0;
    for(int i=1;i<n1;i++)
    {
        if(n1%i==0)
        {
            s1=s1+i;
        }
    }
    System.out.println(s1);
    for(int j=1;j<n2;j++)
    {
        if(n2%j==0)
        {
            s2=s2+j;
        }
    }
    
   // System.out.println(s1);
    if((float)s1/n1==(float)s2/n2)
    {
        System.out.println("frindly pair");
    }
    else
    {
        System.out.println("not friendly");
    }
}

public static void aboundance()
{
    int a=6,s=0;
    for(int i=1;i<a;i++)
    {
        if(a%i==0)
        {
            s=s+i;
        }

    }
    if(s>a) 
    {
        System.out.println("aboundance");
    }
    else
    {
        System.out.println(" not  aboundace");
    }
}



public static void reverse()
{
    int num=2027;
    int rev=0;
    while (num>0) 
    {
        int rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        
    }
    System.out.println(rev);

}

public static void palindrome()
    {
        int num=202;
        int rev=0;
        int temp=num;
        while (num>0) 
        {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
            
        }
        if(temp==rev)
        {

            System.out.println("palindrome number");
        }
        else
        {
            System.out.println(" not  a palindrome");
        }

    }
    public  static void  fibanocii(int num)
    {
        int f1=0,f2=1,f3=1;
        for(  int i=0;i<=num;i++)
         {
             System.out.print(f1+" ");
             f3=f1+f2;
             f1=f2;
             f2=f3;
            }
        }
        public static  void lcm()
        {
            int num1=12;
            int num2=9,hcf=1;
            for(  int i=1;i<num1&&i<num2;i++)
            {
                if( num1 %i==0 && num2%i==0)
                {
                    hcf=i;
                }
            }
            //System.out.println((hcf));
            System.out.println((num1*num2)/hcf);
        }

        public  static void  sumdigits(int num)
        {
            int sum=0;
            while (num>0)
            {
                int rem= num%10;
                sum=sum+rem;
                num=num/10;
                
                
            }
            System.out.println(sum);
        }

        public  static void factorial(  int num)
    {
        int fact=1;
        for(  int i=1;i<=num;i++)
         {
            fact =fact*i;
            
        }
        System.out.println(""+fact);
    }


    public  static   boolean isprime(int num)
    {
        if(num<2)
        {
            return  false;
        }
        for(int i=2;i*i<=num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }



    public   static   void  check_armstrong_number(int num)
    {
        int temp=num;
        int res_num=num;
        int arm=0;
        int count=0;
        while (num>0) 
        {
            count++;
            num=num/10;
        }
        while (temp>0) 
        {
            int r=temp%10;
            arm=arm+(int)(Math.pow(r, count));
            temp=temp/10;
            
        }
        if(res_num==arm)
        {
            System.out.println("  armstrong  number");
        }
        else
        {
            System.out.println("  not   armstrong  number");
        }
    }
    public static void main(String[] args) 
    {
        perfect();//perfect number
        friendly();//frindly pair
        aboundance();//not aboundance
        reverse();//7202
        palindrome();//palindrome number
        fibanocii(10);//0 1 1 2 3 5 8 13 21 34 55
        lcm();//36
        sumdigits(2027);//11
        factorial(3);//6
        System.out.println(isprime(2027));//true
        System.out.println(isprime(20271));//false
        System.out.println(isprime(91816));//false
        check_armstrong_number(370);//armstrong  numbe
        check_armstrong_number(372);// not armstrong  numbe
        check_armstrong_number(371);//armstrong  numbe
        
    }
    
}
