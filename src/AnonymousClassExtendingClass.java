class PolygonClass {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

class AnonymousClassExtendingClassDemo {
    public void createClass() {

        // creation of anonymous class extending class Polygon
        PolygonClass p1 = new PolygonClass() {
            public void display() {
                System.out.println("Inside an anonymous class.");
            }
        };
        p1.display();
    }
}

public class AnonymousClassExtendingClass {
    public static void main(String[] args) {
        AnonymousClassExtendingClassDemo an = new AnonymousClassExtendingClassDemo();
        an.createClass();
    }
}