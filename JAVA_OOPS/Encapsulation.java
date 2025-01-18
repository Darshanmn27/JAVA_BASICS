//Encapsulation hides the internal state of an object and requires all interactions to be performed through methods.

class  employee
{
    private  String name;
    private  int  salary;

    void   setname(String name)
    {
        this.name=name;
    }
    void  setsalary(int  salary)
    {
        if(salary>0)
        {
            this.salary=salary;
        }
    }

    String getname()
    {
        return name;
    }
    int getsalary()
    {
        return salary;
    }
}
public class Encapsulation 
{


    public static void main(String[] args) 
    {
        employee e= new employee();
        e.setname("darshan");
        e.setsalary(918171);
        System.out.println("   darshan  salary :"+e.getsalary());
        System.out.println(" employees  name:"+e.getname());
        
    }
    
}
