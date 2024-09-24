public class Circle extends Shape{
    int r;

    @Override
    void calculateArea()
    {
        System.out.println("Circle Area: r x r x pie = " + r*r*3.14);
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Circle P: d x pie = " + 2*r*3.14);
    }
}