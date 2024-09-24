public class Circle extends Shape{
    @Override
    void calculateArea()
    {
        System.out.println("Circle Area: 2r x pie");
    }

    @Override
    void calculatePerimeter()
    {
        System.out.println("Circle P: d x pie");
    }
}