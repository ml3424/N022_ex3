public class Triangle extends Shape{
    int base;
    int a;
    int b;
    int h;

    @Override
    void calculateArea()
    {
        System.out.println("Triangle Area: (base x h)/2 =" + base*h);
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Triangle P: a + b + c = " + a+b+base);
    }
}
