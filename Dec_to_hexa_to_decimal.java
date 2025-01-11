public class Dec_to_hexa_to_decimal 
{
    public   static  void dec_to_hexa(int num)
    {
        String res="";
        char hexachars[]="0123456789ABCDEF".toCharArray();
        while (num > 0) {
            int r = num % 16;
            res = hexachars[r] + res;
            num = num / 16;
        }

        for (int i = 0; i < res.length(); i++) 
        {
            System.out.print(res.charAt(i) + " ");
        }
        System.out.println();

    }




    public static void inbuilt_method_dec_hexa(int num) 
    {
        String hex = Integer.toHexString(num).toUpperCase();
        for (int i = 0; i < hex.length(); i++) {
            System.out.print(hex.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void hexa_to_decimal(String hex) {
        int dec = 0;
        int pow = 0;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int val = (c >= '0' && c <= '9') ? c - '0' : c - 'A' + 10;
            dec += val * Math.pow(16, pow);
            pow++;
        }
        System.out.println(dec);
    }
    public static void inbuilt_hexa_to_dec(String hex) 
    {
        int dec = Integer.parseInt(hex, 16);
        System.out.println(dec);
    }
    public static void main(String[] args) 
    {
        dec_to_hexa(10);//A
        dec_to_hexa(27);//1 B
        inbuilt_method_dec_hexa(10);//A
        inbuilt_method_dec_hexa(27);//1 B
        hexa_to_decimal("2B");//43
        hexa_to_decimal("B");//11
        inbuilt_hexa_to_dec("AA");//170
        
    }
    
    
}
