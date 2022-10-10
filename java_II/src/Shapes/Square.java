package Shapes;

public class Square extends Quadrilateral {
     // public Square(long side) {
    //     super(side,side);
    // }

    // public long getArea() {
    //     return (long) Math.pow(length,2);
    // }
    
    // public long getPerimeter() {
    //     return 4 * width;
    // }

    public Square(long length, long width) {
        super(length, width);
        // Auto-generated constructor stub
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
