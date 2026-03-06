interface Shape {
    public void area();
    public void perimeter();
}

class Circle implements Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        double area = 3.14 * r * r;
        System.out.println(area);
    }

    public void perimeter() {
        double perimeter = 2 * 3.14 * r;
        System.out.println(perimeter);
    }
}

class Rectangle implements Shape{
    double l,b;

    Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        double area=l*b;
        System.out.println(area);
    }
    public void perimeter()
    {
        double perimeter=2*(l+b);
        System.out.println(perimeter);
    }
}

class Triangle implements Shape{
    double a,b,c;

    Triangle(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void perimeter(){
        double perimeter= a+b+c;
        System.out.println(perimeter);
    }
    public void area(){
    double s = (a + b + c) / 2;
    double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    System.out.println(area);
    }
}
class calculate{
    public static void main(String[] args) {
        Circle c=new Circle(12.45);
        c.area();
        c.perimeter();
        Rectangle R=new Rectangle(5.05,10.50);
        R.area();
        R.perimeter();
        Triangle T=new Triangle(7.02,6.02,5.02);
        T.area();
        T.perimeter();
    }
}