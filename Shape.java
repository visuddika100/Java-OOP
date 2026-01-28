class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing a circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing a rectangle");
    }
}

class Main{
    public static void main(String[] args){
        Shape c1 = new Circle();
        Shape r1 = new Rectangle();

        c1.draw();
        r1.draw();
    }
}
