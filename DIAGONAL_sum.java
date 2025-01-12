package Inheritance;

import java.math.BigInteger;

public class DIAGONAL_sum 
{


    public  static   void   diagonals_difference()
    {
      int arr[][]={
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4}
      };
      int k=arr.length;
      int lfrd=0;
      int rtl=0;
      for(int i=0;i<k;i++)
      {
        lfrd=lfrd+arr[i][i];
        rtl=lfrd+arr[i][k-i-1];
        
      }
      int absolutediffernce=Math.abs(lfrd-rtl);
      System.out.println("    absolute   difference :");
      System.out.println(absolutediffernce);
    }



    public   static  String Addition_binarynumber()
    {
      String s1="10001";
      String s2="10001";
      BigInteger n1=new BigInteger(s1,2);
      BigInteger n2=new BigInteger(s2,2);
      BigInteger sum=n1.add(n2);
      System.out.println(sum);
      return sum.toString(2);

    }


    public   static   void propercomp_ression()
    {
        String s="a2b3c7p0m4";
        StringBuilder c=  new StringBuilder();
        for(int i=0;i<s.length();i=i+2)
        {
            char ch=s.charAt(i);
            int k=s.charAt(i+1)-'0';
            for(int j=0;j<k;j++)
            {
                c.append(ch);
            }
        }
        System.out.println(c.toString());
    }
    



    public static void main(String[] args) 
    {
        diagonals_difference();//1
        System.out.println(Addition_binarynumber());// 100010
        propercomp_ression();//aabbbcccccccmmmm
        
    }
}
