package java_coding;

import java.util.HashMap;
import java.util.Map;

public class Mejarity_firstNonrepeating 
{


    public  static  void   mejority_occurance()
    {
        int arr[]={1,1,1,1,2,2,2,3};
        HashMap<Integer,Integer> hm=  new HashMap<>();
        for(int num:arr)
        {
            
                if(hm.containsKey(num))
                {
                    hm.put(num, hm.get(num)+1);
                }
                else
                {
                    hm.put(num, 1);
                }
        }
       // System.out.println(hm);


       System.out.println("  mejaority  :");

        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            if(e.getValue()>=arr.length/3)
            {
                System.out.print(e.getKey()+" ");
            }

        }
    }



    public  static  void  firstnon_repeating_character()
    {
        HashMap<Character,Integer>  hm=  new HashMap<>();
        String ss="darshan";
        char ch[]=ss.toCharArray();
        for(char chh:ch)
        {
           hm.put(chh,hm.getOrDefault(chh,0)+1);
        }

        for(char cc:ch)
        {
            if(hm.get(cc)==1)
            {
                System.out.println(cc);
                break;
            }
        }
    }



    public static void main(String[] args) 
    {
        mejority_occurance();//1 2
        firstnon_repeating_character();//d 
        
    }
    
}
