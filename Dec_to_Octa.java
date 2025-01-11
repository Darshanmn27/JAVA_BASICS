public class Dec_to_Octa 
{


    public   static   void  dec_to_octa(int num)
    {
        String res="";
        while (num>0) 
        {
            int r=num%8;
            res=res+r;
            num=num/8;
        }
        for(int i=res.length()-1;i>=0;i--)
        {
            System.out.print(res.charAt(i)+" ");
        }
        System.out.println();
        System.out.println();
    }


    public   static  void inbuilt_method_dec_octa(int num)
    {

        
        String octa=Integer.toOctalString(num);
        for (int i = 0; i < octa.length(); i++) {
           System.out.print(octa.charAt(i) + " ");
       }

       System.out.println();

    }



    public  static   void Octa_to_decimal(String Octa)
    {
        int dec=0;
        int pow=0;
        for(int i=Octa.length()-1;i>=0;i--)
        {
            int d=Octa.charAt(i)-'0';
            dec+=d*Math.pow(8, pow);
            pow++;
        }
        System.out.println(dec);
    }


    public   static   void inbuilt_octa_to_dec(String octa)
    {
        int dec=Integer.parseInt(octa,8);
        System.out.println(dec);
    }


    public static void main(String[] args) 
    {
        dec_to_octa(10);//1 2
        inbuilt_method_dec_octa(10);//12
        Octa_to_decimal("12");//10
        Octa_to_decimal("17");//15
        inbuilt_octa_to_dec("31");//25
        
    }
    
}
