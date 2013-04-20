package org.opencv.core;

/**
 * <p>Template class specifying a continuous subsequence (slice) of a sequence.</p>
 *
 * <p>The class is used to specify a row or a column span in a matrix ("Mat") and
 * for many other purposes. <code>Range(a,b)</code> is basically the same as
 * <code>a:b</code> in Matlab or <code>a..b</code> in Python. As in Python,
 * <code>start</code> is an inclusive left boundary of the range and
 * <code>end</code> is an exclusive right boundary of the range. Such a
 * half-opened interval is usually denoted as <em>[start,end)</em>.</p>
 *
 * <p>The static method <code>Range.all()</code> returns a special variable that
 * means "the whole sequence" or "the whole range", just like " <code>:</code> "
 * in Matlab or " <code>...</code> " in Python. All the methods and functions in
 * OpenCV that take <code>Range</code> support this special <code>Range.all()</code>
 * value. But, of course, in case of your own custom processing, you will
 * probably have to check and handle it explicitly:</p>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/basic_structures.html#range">org.opencv.core.Range</a>
 */
public class Range {

    public int start, end;

    public Range(int s, int e) {
        this.start = s;
        this.end = e;
    }

    public Range() {
        this(0, 0);
    }

    public Range(double[] vals) {
        set(vals);
    }

    public void set(double[] vals) {
        if (vals != null) {
            start = vals.length > 0 ? (int) vals[0] : 0;
            end = vals.length > 1 ? (int) vals[1] : 0;
        } else {
            start = 0;
            end = 0;
        }

    }

    public int size() {
        return empty() ? 0 : end - start;
    }

    public boolean empty() {
        return end <= start;
    }

    public static Range all() {
        return new Range(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public Range intersection(Range r1) {
        Range r = new Range(Math.max(r1.start, this.start), Math.min(r1.end, this.end));
        r.end = Math.max(r.end, r.start);
        return r;
    }

    public Range shift(int delta) {
        return new Range(start + delta, end + delta);
    }

    public Range clone() {
        return new Range(start, end);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(start);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(end);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Range)) return false;
        Range it = (Range) obj;
        return start == it.start && end == it.end;
    }

    @Override
    public String toString() {
        return "[" + start + ", " + end + ")";
    }
}
