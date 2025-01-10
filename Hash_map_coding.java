import java.util.HashMap;

public class Hash_map_coding 
{


    public static void  numberoccurance()
    {
        int arr[]={1,2,3,4,5,6,7,8,1,2,3,4,56,67,8};
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
    }




    public static void Digits_occurs_number()
    {
        int num=2027;
        System.out.println("   numbers   are:");
        HashMap<Integer,Integer> hm= new HashMap<>();
        while (num>0) 
        {
            int r= num%10;
            if(hm.containsKey(r))
            {
                hm.put(r, hm.get(r)+1);
            }
            else
            {
                hm.put(r, 1);
            }
            num=num/10;
            
        }
        System.out.println(hm);
    }



    public static void character_occurances()
    {
        String ss="darshan";
        char arr[]= ss.toCharArray();
        HashMap<Character,Integer> kk= new HashMap<>();
        for(int  i=0;i<arr.length;i++)
        {
          if(kk.containsKey(arr[i]))
          {
            kk.put(arr[i], kk.get(arr[i])+1);
          }
          else
          {
            kk.put(arr[i],1);
          }
        }
        System.out.println(kk);

    }

    public static void number_operation()
    {
        int num=123451723;
        HashMap<Integer,Integer> hm= new HashMap<>();
        while (num>0) 
        {
            int r= num%10;
            if(hm.containsKey(r))
            {
                hm.put(r, hm.get(r)+1);
            }
            else
            {
                hm.put(r, 1);
            }
            num=num/10;
            
        }
        System.out.println(hm);
        System.out.println(" number operation");
        for(int k:hm.keySet())
        {
            if(k>1)
            {
                System.out.print(k+"  ");//2  3  4  5  7
            }
        }
        HashMap<Integer,Character> ch= new HashMap<>();
        for(int k:hm.values())
        {
            if(k>1)
            {
               ch.put(1, 'a');
            }
        }
        System.out.println(ch);//  {1=a}
    }


    public static void Roman_to_Integer() {
        System.out.println("Conversion: ");
        String ss = "CM"; // Example Roman numeral
        char[] ch = ss.toCharArray();

        // Define the mapping of Roman numerals to their integer values
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < ch.length; i++) {
            // If the current value is smaller than the next, subtract it
            if (i < ch.length - 1 && hm.get(ch[i]) < hm.get(ch[i + 1])) {
                sum -= hm.get(ch[i]);
            } else {
                sum += hm.get(ch[i]);
            }
        }

        System.out.println("The integer value of the Roman numeral \"" + ss + "\" is: " + sum);
    }




    public static void main(String[] args) 
    {
        numberoccurance();//{1=2, 2=2, 3=2, 67=1, 4=2, 5=1, 6=1, 7=1, 8=2, 56=1}
        Digits_occurs_number();//{0=1, 2=2, 7=1}
        character_occurances();//{a=2, r=1, s=1, d=1, h=1, n=1}
        number_operation();
        Roman_to_Integer();//900
    
    }
    
}
