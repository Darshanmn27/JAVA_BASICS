import java.util.*;

interface Parent {
    void parentMethod();
}

interface Child {
    void childMethod();
}

class Friend implements Parent {
    public void parentMethod() {
        System.out.println("Hello, this is Java implementation.");
    }
}

class AnotherChild extends Friend implements Child {
    public void childMethod() {
        System.out.println("This is interfaces concept.");
    }
}

public class InnerHybridInheritance {
    public static void main(String[] args) {
        AnotherChild a = new AnotherChild();
        a.childMethod();
        a.parentMethod();
    }
}
