package java_coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fizz_Buzz 
{

    public  static void fizbuzz()
    {
        int num=16;
        ArrayList kk= new ArrayList();
        for(int i=1;i<=num;i++)
        {
             if(i%3==0&&i%5==0)
            {
                kk.add("FIZZBUZZ");
            }
            else if(i%3==0)
            {
                kk.add("FIZZ");
            }
            else if(i%5==0)
            {
                kk.add("BUZZ");
            }
            
            else
            {
                kk.add(Integer.toString(i));

            }
        }
        System.out.println("\n hello  darshan: ");
        System.out.println(kk);
    }



    public static void  groupofanagram()
    {
        String words[]={"pin","tin","what","tawh","ni","abc","cba","bac"};
        Map<String,List<String>> grpanagram=  new  HashMap();
        for(String word:words)
        {
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String sorted=  new String(ch);
            if(!grpanagram.containsKey(sorted))
            {
                grpanagram.put(sorted, new ArrayList<>());
            }
            grpanagram.get(sorted).add(word);
        }
        for(List<String> ana:grpanagram.values())
        {
            System.out.println(ana);
        }

    }




    public static void main(String[] args) 
    {
        fizbuzz();//[1, 2, FIZZ, 4, BUZZ, FIZZ, 7, 8, FIZZ, BUZZ, 11, FIZZ, 13, 14, FIZZBUZZ, 16]
        groupofanagram();//[abc, cba, bac] [ni] [what, tawh] [pin] [tin]
        
    }
    
}
