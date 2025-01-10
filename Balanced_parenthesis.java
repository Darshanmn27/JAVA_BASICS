import java.util.Stack;

public class Balanced_parenthesis 
{


    public static boolean balanced(String ss)
    {
        
        Stack<Character> ch= new Stack<>();
        for(char ch1:ss.toCharArray())
        {
            if(ch1=='('||ch1=='{'||ch1=='[')
            {
                ch.push(ch1);
            }
            else if(ch1==')')
            {
                if(ch.isEmpty()||ch.pop()!='(')
                {
                    return false;
                }
            }
            else if(ch1==']')
            {
                if(ch.isEmpty()||ch.pop()!='[')
                {
                    return false;
                }
            }
            else if(ch1=='}')
            {
                if(ch.isEmpty()||ch.pop()!='{')
                {
                    return false;
                }
            }

        }
        return ch.isEmpty();
    }




    public static void main(String[] args)
     {

        System.out.println(balanced("((){}[])"));//true
        System.out.println(balanced("[((){}[])]"));//true
        System.out.println(balanced("[((){}[])}"));//false
        System.out.println(balanced("[(()}"));//false
        System.out.println(balanced("["));//false
        
    }
    
}
