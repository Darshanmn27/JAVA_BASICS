public class DEC_TO_BIN_TO_DEC 
{



    public   static   void  dec_to_bin(int num)
    {
        String res="";
        while (num>0) 
        {
            int r=num%2;
            res=res+r;
            num=num/2;
        }
        for(int i=res.length()-1;i>=0;i--)
        {
            System.out.print(res.charAt(i)+" ");
        }
        System.out.println();
        System.out.println();
    }

    public   static void  inbuilt_method(  int num)
    {
      
         String bin=Integer.toBinaryString(num);
         for (int i = 0; i < bin.length(); i++) {
            System.out.print(bin.charAt(i) + " ");
        }

        System.out.println(" ");
    }



    public  static   void bin_to_decimal(String bin)
    {
        int dec=0;
        int pow=0;
        for(int i=bin.length()-1;i>=0;i--)
        {
            int d=bin.charAt(i)-'0';
            dec+=d*Math.pow(2, pow);
            pow++;
        }
        System.out.println(dec);
    }


    public   static   void inbuilt_bin_to_dec(String bin)
    {
        int dec=Integer.parseInt(bin,2);
        System.out.println(dec);
    }

    public static void main(String[] args) 
    {
        dec_to_bin(32);//1 0 0 0 0 0
        dec_to_bin(10);//1 0 1 0
        dec_to_bin(17);//1 0 0 0 1
        inbuilt_method(10);// 1 0 1 0
        inbuilt_method(32);//1 0 0 0 0 0
        bin_to_decimal("1010");//10
        bin_to_decimal("1111");//15
        bin_to_decimal("111111");//63
        inbuilt_bin_to_dec("1010");//10
        inbuilt_bin_to_dec("11110");//32
    }
    
}
