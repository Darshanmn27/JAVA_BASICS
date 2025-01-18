
//single  inheritance   example 
class parent {
    void parent_mathod() {
        System.out.println("  hello this  is  parent  method");
    }
}

// child inerits parent all the properties methods
class child extends parent {
    void child_mathod() {
        System.out.println("  darshan  this  is    parent  method :");
    }
}

public class Inheritance_example {

    public static void main(String[] args) {

        child a = new child();
        a.parent_mathod();
        a.child_mathod();

    }

}
