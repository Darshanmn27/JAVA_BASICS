import java.util.HashMap;
import java.util.HashSet;

public class Medium_coding 
{


    public static void maximum_subarray()
    {
        int arr[]={10,20,30,-90,9,98,-98,108};
        int max=arr[0];
        int cursum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            cursum=Math.max(arr[i], cursum+arr[i]);
            max=Math.max(cursum, max);
        }
        System.out.println(max);//117
    }


    



    public static void minimum_subarray()
    {
        int arr[]={90,-9,-76,-34,21};
        int minsum=arr[0];
        int curmin=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            curmin=Math.min(arr[i], arr[i]+curmin);
            minsum=Math.min(curmin, minsum);
        }
        System.out.println(minsum);
        
    }


    public static void besttimeto__sell()
    {


        
        System.out.println("  best  time  to  sell");
        int arr[]={90,87,91,0,100,108};
        int minprice=arr[0];
        int profit=0;


        if (arr == null || arr.length < 2) 
        {
            System.out.println("Not enough data to calculate profit.");
            return;
        }
        for(int p:arr)
        {
            if(p<minprice)
            {
                minprice=p;
            }
            else
            {
                profit=Math.max(profit, p-minprice);

            }
        }
        
        System.out.println(profit);
    }


    public static void moovezeroes_end()
    {
        System.out.println("  move  zeroes  at  the  end: ");
        int arr[]={10,29,0,0,19,-98,98,0,0,12,0,1,12,12};
        int lastnonzero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[lastnonzero]=arr[i];
                lastnonzero++;
            }
        }
        for(int i=lastnonzero;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int kk:arr)
        {
            System.out.print(kk+" ");
        }
        System.out.println();
    }
    public static void reverse(int []nums,int start,int end)
    {
        while (start<end) 
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            
        }
    }


    public static void rotate()
    {
        System.out.println("rotate  array: ");
        int [] nums={10,20,29,16,15,13,12};
        int k=3;
        reverse(nums, k, nums.length-1);
        for(int kk:nums)
        {
            System.out.print(kk+" ");

        }
    }

    public static void union()
    {
        int arr1[]={10,20,30,40};
        int arr2[]={1,2,3,4,5};
        HashSet<Integer>kk= new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            kk.add(arr1[i]);

        }
        for(int i:arr2)
        {
            kk.add(i);
        }
        System.out.println("intersection  of  arra  and  arr2:");
        System.out.println(kk);
    }

    public static void intersection()
    {
        int arr1[]={10,20,30,40};
        int arr2[]={90,87,10,20,30};
        HashSet<Integer> kk=  new HashSet<>();
        HashSet<Integer> dup=  new HashSet<>();
        HashSet<Integer> dup2=  new HashSet<>();
        for(int h:arr1)
        {
            kk.add(h);
        }
        for(int pp:arr2)
        {
            if(kk.contains(pp))
            {

                dup.add(pp);
            }
            else
            {
                dup2.add(pp);

            }
        }
        System.out.println("intersection  of  arr1  and  arr2:");
        System.out.println(dup);//[20, 10, 30]
        System.out.println(dup2);//[87, 90]
    }



     public   static int lengthOfLongest_Substring(String s) 
       {
           HashMap<Character,Integer> map=  new HashMap<>();
           int maxlength=0;
           int  start=0;
           for(int i=0;i<s.length();i++)
           {
               char cur=s.charAt(i);
           if(map.containsKey(cur))
           {
               start=Math.max(start,map.get(cur)+1);
           }
           map.put(cur,i);
           maxlength=Math.max(maxlength,i-start+1);
           }
           
       return maxlength;
       }



    public static void main(String[] args) 
    {
        maximum_subarray();//117
        minimum_subarray();//-119
        besttimeto__sell();//119
        moovezeroes_end();//10 29 19 -98 98 12 1 12 12 0 0 0 0 0
        int arr[]={10,20,2027,20230,918171};
        reverse(arr, 0, arr.length-1);
        for(int num:arr)
        {

            System.out.print(num+" ");//918171 20230 2027 20 10
        }
        rotate();//10 20 29 12 13 15 16
        union();//[1, 2, 3, 20, 4, 5, 40, 10, 30]
        intersection();
        System.out.println(lengthOfLongest_Substring("darshan"));
        
        
    }




    
}
