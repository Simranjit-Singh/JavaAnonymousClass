interface PolygonInterface {
    public void display();
}

class AnonymousClassImplementingInterfaceDemo {
    public void createClass() {

        // anonymous class implementing interface
        PolygonInterface p1 = new PolygonInterface() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClassImplementingInterface {
    public static void main(String[] args) {
        AnonymousClassImplementingInterfaceDemo an = new AnonymousClassImplementingInterfaceDemo();
        an.createClass();
    }
}