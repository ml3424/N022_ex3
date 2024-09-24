public class Triangle extends Shape{
    @Override
    void calculateArea()
    {
        System.out.println("Triangle Area: (base x h)/2");
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Triangle P: a x b x c");
    }
}
