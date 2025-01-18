class Parent {
    void parent_method() {
        System.out.println("This is parent method inside the Parent class");
    }
}

class Child extends Parent {
    void parent_method() {
        System.out.println("This is parent method inside the Child class");
    }
}

class Grandchild extends Child {
    void parent_method() {
        System.out.println("This is parent method inside the Grandchild class");
    }
    
    void newMethod() {
        System.out.println("This is a new method in Grandchild class");
    }
}

public class CompileTime {
    public static void main(String[] args) {
        Parent p = new Grandchild();
        // This will compile and run the method correctly
        p.parent_method();
        
        // This line will throw a NullPointerException at runtime
        p = null;
        p.parent_method();
    }
}
