package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected long lenght;
    protected long width;

    public Quadrilateral(long lenght, long width) {
        this.lenght = lenght;
        this.width = width;
    }

    public long getLenght() {
        return lenght;
    }

    public long getWidth() {
        return width;
    }

    public abstract void setLenght(long lenght);

    public abstract void setWidth(long width);
}
