package core.basesyntax;

public abstract class Figure implements FigurePrinter {
    private Color color;
    
    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
   
    @Override
    public abstract void getFigureInformation();
}
