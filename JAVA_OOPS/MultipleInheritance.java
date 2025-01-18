interface Parent {
    void parentMethod();
}

interface Child {
    void childMethod();
}

class GrandChild implements Parent, Child {
    public void parentMethod() {
        System.out.println("This is the parent method");
    }

    public void childMethod() {
        System.out.println("This is the child method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        GrandChild g = new GrandChild();
        g.childMethod();
        g.parentMethod();
    }
}
