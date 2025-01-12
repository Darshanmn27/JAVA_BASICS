import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_Excepion 
{


     public   static  void matching_patterns()
    {
        System.out.println(Pattern.matches("darshan","darshan"));//true
        System.out.println(Pattern.matches("d.c", "doc"));//true
        System.out.println(Pattern.matches("d.n","dar"));//false
        System.out.println(Pattern.matches("da*", "darshan"));//false
        System.out.println(Pattern.matches("da*", "daaaa"));//true
        System.out.println(Pattern.matches("ab*","abbb"));//true
        System.out.println(Pattern.matches(".*darshan.*", "darshan good  morning"));//true
        System.out.println(Pattern.matches("a+b","aaaab"));
        System.out.println(Pattern.matches("darsh?an", "darshan"));//true
        System.out.println(Pattern.matches("darsh?an", "darshaan"));//false
        System.out.println(Pattern.matches("[darshan]","d"));//true
        System.out.println(Pattern.matches("[darshan]","r"));//true
        System.out.println(Pattern.matches("[darshan]","p"));//false


    }
    public   static  void Matching_patter2()
    {
        System.out.println("  other  methods  in  re:");
        System.out.println(Pattern.matches("geeks.*","geeksforgeeks"));//true
        System.out.println(Pattern.matches("darshan.*","darshangoodmorning"));//true
        System.out.println(Pattern.matches("geeks[0-9]","geeks9"));//true
        System.out.println(Pattern.matches("geeks[0-9]","geeks0"));//true
        System.out.println(Pattern.matches("geeks[0-9]","geeks98"));//false
    }

    public   static   void Regular_Exception_Matcher()
    {
        Pattern p=Pattern.compile("darshan");
        Matcher m= p.matcher("good morning darshan");
        while (m.find()) 
        {
            System.out.println("pattern  found :"+m.start()+"   to :"+m.end());
            
        }
    }
    public   static  void  method_class_character()
    {
        System.out.println(Pattern.matches("[darshna]","a"));//true
        System.out.println(Pattern.matches("[^xzy]","d"));//true
        System.out.println(Pattern.matches("[a-zA-Z]","D"));
    }
    public static   void  regular_exception_importent_method()
    {
        System.out.println("   regular   expression  are:");
        System.out.println(Pattern.matches("dar.","dars"));//true
        System.out.println(Pattern.matches("\\d", "0"));//true
        System.out.println(Pattern.matches("\\d","9"));//true
        System.out.println(Pattern.matches("\\d","y"));//false
        System.out.println(Pattern.matches("\\D","y"));//true
        System.out.println(Pattern.matches("\\D","9"));//false
        System.out.println(Pattern.matches("\\s"," "));//true
        System.out.println(Pattern.matches("\\s","a"));//false
        System.out.println(Pattern.matches("\\s","\s"));//true
        System.out.println(Pattern.matches("\\S","d"));//true
        System.out.println(Pattern.matches("\\S"," "));//false
        System.out.println(Pattern.matches("\\w","2"));//true
        System.out.println(Pattern.matches("\\w","a"));//true
        System.out.println(Pattern.matches("\\w","_"));//true
        System.out.println(Pattern.matches("\\w","*"));//false
        System.out.println(Pattern.matches("\\W","*"));//true
        System.out.println(Pattern.matches("\\W","9"));//false
        String s="darshan";
        System.out.println(s.matches(".*\\bhello\\b.*"));//true
        System.out.println(s.matches(".*\\bgood\\b.*"));//true
        System.out.println(s.matches(".*\\bmor\\b.*"));//false
        System.out.println(s.matches(".*\\Bsh\\B.*"));//true
        System.out.println(s.matches(".*\\Bdar\\B.*"));//false
    }


    public   static void   valid_email_id()
    {
        String email="darshanmn2327@gmail.com";
        String reges="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        System.out.println(Pattern.matches(reges, email));
    }




    public   static   void check_only_numbers()
    {
        String input="182736346";
        String re="\\d+";
        System.out.println(Pattern.matches(re, input));
    }
    public   static void valid_password()
    {
        String pass="darshanmn2327@darsh";
        String resgx="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        System.out.println(Pattern.matches(resgx,pass));

    }
    public   static  void  extract_numbers()
    {
        System.out.println("   extract  numbers  are  :");
        String input="darsdhan20272023";
        String re="\\d+";
        Pattern p= Pattern.compile(re);
        Matcher m= p.matcher(input);
        while (m.find())
         {
            System.out.println(m.group());
            
        }
    }
    public   static   void  check_validdate()
    {
        String date="22/12/2024";
        String re="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        System.out.println(Pattern.matches(re,date));
    }
    public  static   void  validphone_number()
    {
        String num="+1-123-456-7890";
        String regex = "^\\+?[1-9]\\d{0,2}[-\\s]?\\d{3}[-\\s]?\\d{3}[-\\s]?\\d{4}$";
        System.out.println(Pattern.matches(regex, num));
    }
    public   static  void  check_hexadecimalornot()
    {
        String color = "#1A2B3C";
        String regex = "^#[a-fA-F0-9]{6}$";
        System.out.println(Pattern.matches(regex, color));


    }

    public   static  void valid__ssn()
    {
        String ss="123-45-6789";
        String re="^\\d{3}-\\d{2}-\\d{4}$";
        System.out.println(Pattern.matches(re,ss));
    }


    public static void main(String[] args) 
    {
        matching_patterns();
       Matching_patter2();
       Regular_Exception_Matcher();
       method_class_character();
       regular_exception_importent_method();
       valid_email_id();//true
       check_only_numbers();//true
       valid_password();//false
       extract_numbers();//20272023
       check_validdate();//true
       validphone_number();//true
       check_hexadecimalornot();//true
       valid__ssn();//true
    
        
    }
    
}
