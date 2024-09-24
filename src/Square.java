public class Square extends Shape{
    int a;

    @Override
    void calculateArea()
    {
        System.out.println("Circle Area: a x a = " + a*a);
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Circle P: 4a = " + 4*a);
    }
}
