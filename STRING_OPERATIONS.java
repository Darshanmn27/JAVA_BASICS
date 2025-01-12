package Inheritance;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.HashSet;

public class STRING_OPERATIONS 
{


    public   static  void   count_vowels()
    {
        String s="darshangoodmorning".replaceAll("[^aeiou]","");
        System.out.println(s.length());
    }

    public   static  void   count_consonents()
    {
        String s="darshangoodmorning".replaceAll("[AEIOUaeiou]","");
        System.out.println(s.length());
    }
    public  static  void  count_digits()
    {
        String s="2027darshan2023".replaceAll("[^0-9]","");
        System.out.println(s.length());
    }
    public  static  void  count_uppercase()
    {
        String s="2027darshan2023".replaceAll("[^A-Z]","");
        System.out.println(s.length());
    }
    public   static   void   lowerto_upper_vicse_versa()
    {
        String s="DARSHANgoodMORNING";
        StringBuilder res=  new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                res.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch))
            {
                res.append(Character.toLowerCase(ch));
            }
            else
            {
                res.append(ch);
            }
        }
        System.out.println(res.toString());
    }
   public   static  void  longest_substring_withoutrepeating()
    {
        String input="abcabcbb";
        HashSet<Character>hh=   new HashSet<>();
        int max=0;
        int start=0;
        for(int i=0;i<input.length();i++)
        {
            while (hh.contains(input.charAt(i)))
            {
               hh.remove(input.charAt(start));
                start++;    
            }
            hh.add(input.charAt(i));
            max=Math.max(max, i-start+1);
        }
        System.out.println(max);
    }
     public   static   boolean isomorphicstring()
    {
        String s1="title";
        String s2="paper";
        if(s1.length()!=s2.length())
        {
            return  false;
        }
        HashMap<Character,Character> m1=  new HashMap<>();
        HashMap<Character,Character> m2=  new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);
            if(m1.containsKey(ch1))
            {
                if(m1.get(ch1)!=ch2)
                {
                    return  false;
                }
            }
            else
            {
                m1.put(ch1, ch2);
            }
            if(m2.containsKey(ch2))
            {
                if(m2.get(ch2)!=ch1)
                {
                    return  false;
                }
            }
            else
            {
                m2.put(ch2,ch1);
            }
        }
        return  true;
    }
    public   static    void       unique_word()
    {
        System.out.println();
        String s[]={"darshan","amar","anvitha","aakaash","darsh","deepak"};
        for(int i=0;i<s.length;i++)
        {
            HashSet<Character>  hh=  new HashSet<>();
            boolean   isunique=true;
            String w=s[i];
            for(char ch:w.toCharArray())
            {
                if(!hh.add(ch))
                {
                    isunique=false;
                }
            }
           // System.out.println("hello   darshan ");
            if(isunique)
            {
                System.out.print(s[i]+" ");
            }
        }
    }
    public   static   void   multiplytwo_largenumbers()
    {
        BigInteger n1= new BigInteger("918171");
        BigInteger n2= new BigInteger("928272");
        BigInteger res=n1.multiply(n2);
        System.out.println("   product ");
        System.out.println(res);
    }

    public static void main(String[] args) 
    {
        count_vowels();//6
        count_consonents();//12
        count_digits();//8
        count_uppercase();//0
        lowerto_upper_vicse_versa();//darshanGOODmorning
        longest_substring_withoutrepeating();//3
        System.out.println(isomorphicstring());//true
        unique_word();//darsh
        multiplytwo_largenumbers();//852312430512
        
    }
    
}
