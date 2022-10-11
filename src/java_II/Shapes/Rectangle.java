package java_II.Shapes;

public class Rectangle extends Quadrilateral {
    // protected long length;
    // protected long width;

    // public Rectangle(long length, long width) {
    //     this.length = length;
    //     this.width = width;
    // }

    // public long getPerimeter() {
    //     return (2 * this.length) + (2 * this.width);
    // }

    // public long getArea() {
    //     return this.length * this.width;
    // }

    public Rectangle(long length, long width) {
        super(length, width);
    }

    @Override
    public void setlength(long length) {
        super.length = length;
    }

    @Override
    public void setWidth(long width) {
        super.width = width;
    }

    @Override
    public long getArea() {
        // Auto-generated method stub
        return 0;
    }

    @Override
    public long getPerimeter() {
        // Auto-generated method stub
        return 0;
    }
}