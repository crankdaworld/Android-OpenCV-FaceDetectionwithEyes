package org.opencv.features2d;

import org.opencv.core.Point;

/**
 * <p>Data structure for salient point detectors.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint">org.opencv.features2d.KeyPoint</a>
 */
public class KeyPoint {

    /**
     * coordinates of the keypoint
     */
    public Point pt;
    /**
     * diameter of the meaningful keypoint neighborhood
     */
    public float size;
    /**
     * computed orientation of the keypoint (-1 if not applicable)
     */
    public float angle;
    /**
     * the response by which the most strong keypoints have been selected. Can
     * be used for further sorting or subsampling
     */
    public float response;
    /**
     * octave (pyramid layer) from which the keypoint has been extracted
     */
    public int octave;
    /**
     * object id that can be used to clustered keypoints by an object they
     * belong to
     */
    public int class_id;

/**
 * <p>The keypoint constructors</p>
 *
 * @param x x-coordinate of the keypoint
 * @param y y-coordinate of the keypoint
 * @param _size keypoint diameter
 * @param _angle keypoint orientation
 * @param _response keypoint detector response on the keypoint (that is,
 * strength of the keypoint)
 * @param _octave pyramid octave in which the keypoint has been detected
 * @param _class_id object id
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint(float x, float y, float _size, float _angle, float _response, int _octave, int _class_id)
    {
        pt = new Point(x, y);
        size = _size;
        angle = _angle;
        response = _response;
        octave = _octave;
        class_id = _class_id;
    }

/**
 * <p>The keypoint constructors</p>
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint()
    {
        this(0, 0, 0, -1, 0, 0, -1);
    }

/**
 * <p>The keypoint constructors</p>
 *
 * @param x x-coordinate of the keypoint
 * @param y y-coordinate of the keypoint
 * @param _size keypoint diameter
 * @param _angle keypoint orientation
 * @param _response keypoint detector response on the keypoint (that is,
 * strength of the keypoint)
 * @param _octave pyramid octave in which the keypoint has been detected
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint(float x, float y, float _size, float _angle, float _response, int _octave)
    {
        this(x, y, _size, _angle, _response, _octave, -1);
    }

/**
 * <p>The keypoint constructors</p>
 *
 * @param x x-coordinate of the keypoint
 * @param y y-coordinate of the keypoint
 * @param _size keypoint diameter
 * @param _angle keypoint orientation
 * @param _response keypoint detector response on the keypoint (that is,
 * strength of the keypoint)
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint(float x, float y, float _size, float _angle, float _response)
    {
        this(x, y, _size, _angle, _response, 0, -1);
    }

/**
 * <p>The keypoint constructors</p>
 *
 * @param x x-coordinate of the keypoint
 * @param y y-coordinate of the keypoint
 * @param _size keypoint diameter
 * @param _angle keypoint orientation
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint(float x, float y, float _size, float _angle)
    {
        this(x, y, _size, _angle, 0, 0, -1);
    }

/**
 * <p>The keypoint constructors</p>
 *
 * @param x x-coordinate of the keypoint
 * @param y y-coordinate of the keypoint
 * @param _size keypoint diameter
 *
 * @see <a href="http://docs.opencv.org/modules/features2d/doc/common_interfaces_of_feature_detectors.html#keypoint-keypoint">org.opencv.features2d.KeyPoint.KeyPoint</a>
 */
    public KeyPoint(float x, float y, float _size)
    {
        this(x, y, _size, -1, 0, 0, -1);
    }

    @Override
    public String toString() {
        return "KeyPoint [pt=" + pt + ", size=" + size + ", angle=" + angle
                + ", response=" + response + ", octave=" + octave
                + ", class_id=" + class_id + "]";
    }

}
