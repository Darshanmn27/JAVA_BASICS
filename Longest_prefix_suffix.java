package java_coding;

public class Longest_prefix_suffix 
{


    public  static  String Longest_prefix()
    {
        String arr[]={"darshan","darsh","darsha","darshan"};
        String prefix=arr[0];
        if(arr.length==0||arr==null)
        {
            return " ";
        }
        for(int i=1;i<arr.length;i++)
        {
            while(!arr[i].startsWith(prefix))
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return " ";
                }
            }
        }
        return prefix;

    }


    public  static  String Longest_suffix()
    {
        String arr[]={"darshansingh","darshsingh","darshasingh","darshansingh"};
        String suffix=arr[0];
        if(arr.length==0||arr==null)
        {
            return " ";
        }
        for(int i=1;i<arr.length;i++)
        {
            while(!arr[i].endsWith(suffix))
            {

                suffix=suffix.substring(1);
                if(suffix.isEmpty())
                {
                    return " ";
                }
            }
        }
        return suffix;

    }


    public static void main(String[] args) 
    {
        System.out.println(Longest_prefix());//darsh
        System.out.println(Longest_suffix());//singh
        
    }


    
}
