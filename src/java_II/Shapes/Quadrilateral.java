package java_II.Shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected long length;
    protected long width;

    public Quadrilateral(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getlength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    public abstract void setlength(long length);

    public abstract void setWidth(long width);
}