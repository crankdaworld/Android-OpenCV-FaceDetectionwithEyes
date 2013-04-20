package org.opencv.core;

/**
 * <p>Template class for 2D points specified by its coordinates <em>x</em> and
 * <em>y</em>.
 * An instance of the class is interchangeable with C structures,
 * <code>CvPoint</code> and <code>CvPoint2D32f</code>. There is also a cast
 * operator to convert point coordinates to the specified type. The conversion
 * from floating-point coordinates to integer coordinates is done by rounding.
 * Commonly, the conversion uses this operation for each of the coordinates.
 * Besides the class members listed in the declaration above, the following
 * operations on points are implemented:</p>
 *
 * <p>For your convenience, the following type aliases are defined:</p>
 *
 * <p>Example:</p>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/basic_structures.html#point">org.opencv.core.Point_</a>
 */
public class Point {

    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public Point(double[] vals) {
        this();
        set(vals);
    }

    public void set(double[] vals) {
        if (vals != null) {
            x = vals.length > 0 ? vals[0] : 0;
            y = vals.length > 1 ? vals[1] : 0;
        } else {
            x = 0;
            y = 0;
        }
    }

    public Point clone() {
        return new Point(x, y);
    }

    public double dot(Point p) {
        return x * p.x + y * p.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point it = (Point) obj;
        return x == it.x && y == it.y;
    }

    public boolean inside(Rect r) {
        return r.contains(this);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
