public class Shapes {
    static class Shape{
        void draw(){
            System.out.println("I'm a shape");
        }
    }
    static class Circle extends Shape{
        @Override 
        void draw(){
            System.out.println("I'm a circle");
        }
        void radius(){
            System.out.println("Radius");
        }
    }
    public static void main(String[] args){
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
        c.radius();
        Shape n = new Circle();
        n.draw();
        // n.radius(); -> this will cause the error because reference type is shape.
    }
}
