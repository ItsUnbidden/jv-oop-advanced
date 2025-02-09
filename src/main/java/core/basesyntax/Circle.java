package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getFigureInformation() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + 
        radius + " units, Color: " + getColor().name());
    } 
}
