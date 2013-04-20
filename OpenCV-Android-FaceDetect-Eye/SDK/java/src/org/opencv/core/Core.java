
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.core;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import org.opencv.utils.Converters;

public class Core {

    private static final int
            CV_8U = 0,
            CV_8S = 1,
            CV_16U = 2,
            CV_16S = 3,
            CV_32S = 4,
            CV_32F = 5,
            CV_64F = 6,
            CV_USRTYPE1 = 7;


    public static final int
            SVD_MODIFY_A = 1,
            SVD_NO_UV = 2,
            SVD_FULL_UV = 4,
            FILLED = -1,
            LINE_AA = 16,
            LINE_8 = 8,
            LINE_4 = 4,
            REDUCE_SUM = 0,
            REDUCE_AVG = 1,
            REDUCE_MAX = 2,
            REDUCE_MIN = 3,
            DECOMP_LU = 0,
            DECOMP_SVD = 1,
            DECOMP_EIG = 2,
            DECOMP_CHOLESKY = 3,
            DECOMP_QR = 4,
            DECOMP_NORMAL = 16,
            NORM_INF = 1,
            NORM_L1 = 2,
            NORM_L2 = 4,
            NORM_L2SQR = 5,
            NORM_HAMMING = 6,
            NORM_HAMMING2 = 7,
            NORM_TYPE_MASK = 7,
            NORM_RELATIVE = 8,
            NORM_MINMAX = 32,
            CMP_EQ = 0,
            CMP_GT = 1,
            CMP_GE = 2,
            CMP_LT = 3,
            CMP_LE = 4,
            CMP_NE = 5,
            GEMM_1_T = 1,
            GEMM_2_T = 2,
            GEMM_3_T = 4,
            DFT_INVERSE = 1,
            DFT_SCALE = 2,
            DFT_ROWS = 4,
            DFT_COMPLEX_OUTPUT = 16,
            DFT_REAL_OUTPUT = 32,
            DCT_INVERSE = DFT_INVERSE,
            DCT_ROWS = DFT_ROWS,
            DEPTH_MASK_8U = 1 << CV_8U,
            DEPTH_MASK_8S = 1 << CV_8S,
            DEPTH_MASK_16U = 1 << CV_16U,
            DEPTH_MASK_16S = 1 << CV_16S,
            DEPTH_MASK_32S = 1 << CV_32S,
            DEPTH_MASK_32F = 1 << CV_32F,
            DEPTH_MASK_64F = 1 << CV_64F,
            DEPTH_MASK_ALL = (DEPTH_MASK_64F<<1)-1,
            DEPTH_MASK_ALL_BUT_8S = DEPTH_MASK_ALL & ~DEPTH_MASK_8S,
            DEPTH_MASK_FLT = DEPTH_MASK_32F + DEPTH_MASK_64F,
            MAGIC_MASK = 0xFFFF0000,
            TYPE_MASK = 0x00000FFF,
            DEPTH_MASK = 7,
            SORT_EVERY_ROW = 0,
            SORT_EVERY_COLUMN = 1,
            SORT_ASCENDING = 0,
            SORT_DESCENDING = 16,
            COVAR_SCRAMBLED = 0,
            COVAR_NORMAL = 1,
            COVAR_USE_AVG = 2,
            COVAR_SCALE = 4,
            COVAR_ROWS = 8,
            COVAR_COLS = 16,
            KMEANS_RANDOM_CENTERS = 0,
            KMEANS_PP_CENTERS = 2,
            KMEANS_USE_INITIAL_LABELS = 1,
            FONT_HERSHEY_SIMPLEX = 0,
            FONT_HERSHEY_PLAIN = 1,
            FONT_HERSHEY_DUPLEX = 2,
            FONT_HERSHEY_COMPLEX = 3,
            FONT_HERSHEY_TRIPLEX = 4,
            FONT_HERSHEY_COMPLEX_SMALL = 5,
            FONT_HERSHEY_SCRIPT_SIMPLEX = 6,
            FONT_HERSHEY_SCRIPT_COMPLEX = 7,
            FONT_ITALIC = 16;


    //
    // C++:  void LUT(Mat src, Mat lut, Mat& dst, int interpolation = 0)
    //

/**
 * <p>Performs a look-up table transform of an array.</p>
 *
 * <p>The function <code>LUT</code> fills the destination array with values from
 * the look-up table. Indices of the entries are taken from the source array.
 * That is, the function processes each element of <code>src</code> as follows:</p>
 *
 * <p><em>dst(I) <- lut(src(I) + d)</em></p>
 *
 * <p>where</p>
 *
 * <p><em>d = 0 if src has depth CV_8U; 128 if src has depth CV_8S</em></p>
 *
 * @param src Source array of 8-bit elements.
 * @param lut Look-up table of 256 elements. In case of multi-channel source
 * array, the table should either have a single channel (in this case the same
 * table is used for all channels) or the same number of channels as in the
 * source array.
 * @param dst Destination array of the same size and the same number of channels
 * as <code>src</code>, and the same depth as <code>lut</code>.
 * @param interpolation a interpolation
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#lut">org.opencv.core.Core.LUT</a>
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#convertScaleAbs
 */
    public static void LUT(Mat src, Mat lut, Mat dst, int interpolation)
    {

        LUT_0(src.nativeObj, lut.nativeObj, dst.nativeObj, interpolation);

        return;
    }

/**
 * <p>Performs a look-up table transform of an array.</p>
 *
 * <p>The function <code>LUT</code> fills the destination array with values from
 * the look-up table. Indices of the entries are taken from the source array.
 * That is, the function processes each element of <code>src</code> as follows:</p>
 *
 * <p><em>dst(I) <- lut(src(I) + d)</em></p>
 *
 * <p>where</p>
 *
 * <p><em>d = 0 if src has depth CV_8U; 128 if src has depth CV_8S</em></p>
 *
 * @param src Source array of 8-bit elements.
 * @param lut Look-up table of 256 elements. In case of multi-channel source
 * array, the table should either have a single channel (in this case the same
 * table is used for all channels) or the same number of channels as in the
 * source array.
 * @param dst Destination array of the same size and the same number of channels
 * as <code>src</code>, and the same depth as <code>lut</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#lut">org.opencv.core.Core.LUT</a>
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#convertScaleAbs
 */
    public static void LUT(Mat src, Mat lut, Mat dst)
    {

        LUT_1(src.nativeObj, lut.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    //

/**
 * <p>Calculates the Mahalanobis distance between two vectors.</p>
 *
 * <p>The function <code>Mahalanobis</code> calculates and returns the weighted
 * distance between two vectors:</p>
 *
 * <p><em>d(vec1, vec2)= sqrt(sum_(i,j)(icovar(i,j)*(vec1(I)-vec2(I))*(vec1(j)-vec2(j))))</em></p>
 *
 * <p>The covariance matrix may be calculated using the "calcCovarMatrix" function
 * and then inverted using the "invert" function (preferably using the
 * <code>DECOMP_SVD</code> method, as the most accurate).</p>
 *
 * @param v1 a v1
 * @param v2 a v2
 * @param icovar Inverse covariance matrix.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mahalanobis">org.opencv.core.Core.Mahalanobis</a>
 */
    public static double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    {

        double retVal = Mahalanobis_0(v1.nativeObj, v2.nativeObj, icovar.nativeObj);

        return retVal;
    }


    //
    // C++:  void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    //

    public static void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat result)
    {

        PCABackProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);

        return;
    }


    //
    // C++:  void PCACompute(Mat data, Mat& mean, Mat& eigenvectors, int maxComponents = 0)
    //

    public static void PCACompute(Mat data, Mat mean, Mat eigenvectors, int maxComponents)
    {

        PCACompute_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, maxComponents);

        return;
    }

    public static void PCACompute(Mat data, Mat mean, Mat eigenvectors)
    {

        PCACompute_1(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj);

        return;
    }


    //
    // C++:  void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    //

    public static void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat result)
    {

        PCAProject_0(data.nativeObj, mean.nativeObj, eigenvectors.nativeObj, result.nativeObj);

        return;
    }


    //
    // C++:  void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat& dst)
    //

    public static void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat dst)
    {

        SVBackSubst_0(w.nativeObj, u.nativeObj, vt.nativeObj, rhs.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void SVDecomp(Mat src, Mat& w, Mat& u, Mat& vt, int flags = 0)
    //

    public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt, int flags)
    {

        SVDecomp_0(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj, flags);

        return;
    }

    public static void SVDecomp(Mat src, Mat w, Mat u, Mat vt)
    {

        SVDecomp_1(src.nativeObj, w.nativeObj, u.nativeObj, vt.nativeObj);

        return;
    }


    //
    // C++:  void absdiff(Mat src1, Mat src2, Mat& dst)
    //

/**
 * <p>Computes the per-element absolute difference between two arrays or between an
 * array and a scalar.</p>
 *
 * <p>The function <code>absdiff</code> computes:</p>
 * <ul>
 *   <li> Absolute difference between two arrays when they have the same size
 * and type:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1(I) - src2(I)|)</em></p>
 *
 * <ul>
 *   <li> Absolute difference between an array and a scalar when the second
 * array is constructed from <code>Scalar</code> or has as many elements as the
 * number of channels in <code>src1</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1(I) - src2|)</em></p>
 *
 * <ul>
 *   <li> Absolute difference between a scalar and an array when the first array
 * is constructed from <code>Scalar</code> or has as many elements as the number
 * of channels in <code>src2</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1 - src2(I)|)</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the arrays have the depth
 * <code>CV_32S</code>. You may even get a negative value in the case of
 * overflow.</p>
 *
 * @param src1 First input array or a scalar.
 * @param src2 Second input array or a scalar.
 * @param dst Destination array that has the same size and type as
 * <code>src1</code> (or <code>src2</code>).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#absdiff">org.opencv.core.Core.absdiff</a>
 * @see org.opencv.core.Core#abs
 */
    public static void absdiff(Mat src1, Mat src2, Mat dst)
    {

        absdiff_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void absdiff(Mat src1, Scalar src2, Mat& dst)
    //

/**
 * <p>Computes the per-element absolute difference between two arrays or between an
 * array and a scalar.</p>
 *
 * <p>The function <code>absdiff</code> computes:</p>
 * <ul>
 *   <li> Absolute difference between two arrays when they have the same size
 * and type:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1(I) - src2(I)|)</em></p>
 *
 * <ul>
 *   <li> Absolute difference between an array and a scalar when the second
 * array is constructed from <code>Scalar</code> or has as many elements as the
 * number of channels in <code>src1</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1(I) - src2|)</em></p>
 *
 * <ul>
 *   <li> Absolute difference between a scalar and an array when the first array
 * is constructed from <code>Scalar</code> or has as many elements as the number
 * of channels in <code>src2</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(| src1 - src2(I)|)</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the arrays have the depth
 * <code>CV_32S</code>. You may even get a negative value in the case of
 * overflow.</p>
 *
 * @param src1 First input array or a scalar.
 * @param src2 Second input array or a scalar.
 * @param dst Destination array that has the same size and type as
 * <code>src1</code> (or <code>src2</code>).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#absdiff">org.opencv.core.Core.absdiff</a>
 * @see org.opencv.core.Core#abs
 */
    public static void absdiff(Mat src1, Scalar src2, Mat dst)
    {

        absdiff_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  void add(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 * @param dtype Optional depth of the output array. See the discussion below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Mat src2, Mat dst, Mat mask, int dtype)
    {

        add_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);

        return;
    }

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        add_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Mat src2, Mat dst)
    {

        add_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void add(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 * @param dtype Optional depth of the output array. See the discussion below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype)
    {

        add_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);

        return;
    }

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Scalar src2, Mat dst, Mat mask)
    {

        add_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Computes the per-element sum of two arrays or an array and a scalar.</p>
 *
 * <p>The function <code>add</code> computes:</p>
 * <ul>
 *   <li> Sum of two arrays when both input arrays have the same size and the
 * same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of an array and a scalar when <code>src2</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) + src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Sum of a scalar and an array when <code>src1</code> is constructed
 * from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 + src2(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can add a 16-bit unsigned array to a 8-bit signed
 * array and store the sum as a 32-bit floating-point array. Depth of the output
 * array is determined by the <code>dtype</code> parameter. In the second and
 * third cases above, as well as in the first case, when <code>src1.depth() ==
 * src2.depth()</code>, <code>dtype</code> can be set to the default
 * <code>-1</code>. In this case, the output array will have the same depth as
 * the input array, be it <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and number of channels as
 * the input array(s). The depth is defined by <code>dtype</code> or
 * <code>src1</code>/<code>src2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#add">org.opencv.core.Core.add</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void add(Mat src1, Scalar src2, Mat dst)
    {

        add_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat& dst, int dtype = -1)
    //

/**
 * <p>Computes the weighted sum of two arrays.</p>
 *
 * <p>The function <code>addWeighted</code> calculates the weighted sum of two
 * arrays as follows:</p>
 *
 * <p><em>dst(I)= saturate(src1(I)* alpha + src2(I)* beta + gamma)</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The function can be replaced with a matrix expression:</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param alpha Weight for the first array elements.
 * @param src2 Second source array of the same size and channel number as
 * <code>src1</code>.
 * @param beta Weight for the second array elements.
 * @param gamma Scalar added to each sum.
 * @param dst Destination array that has the same size and number of channels as
 * the input arrays.
 * @param dtype Optional depth of the destination array. When both input arrays
 * have the same depth, <code>dtype</code> can be set to <code>-1</code>, which
 * will be equivalent to <code>src1.depth()</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#addweighted">org.opencv.core.Core.addWeighted</a>
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst, int dtype)
    {

        addWeighted_0(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj, dtype);

        return;
    }

/**
 * <p>Computes the weighted sum of two arrays.</p>
 *
 * <p>The function <code>addWeighted</code> calculates the weighted sum of two
 * arrays as follows:</p>
 *
 * <p><em>dst(I)= saturate(src1(I)* alpha + src2(I)* beta + gamma)</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The function can be replaced with a matrix expression:</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param alpha Weight for the first array elements.
 * @param src2 Second source array of the same size and channel number as
 * <code>src1</code>.
 * @param beta Weight for the second array elements.
 * @param gamma Scalar added to each sum.
 * @param dst Destination array that has the same size and number of channels as
 * the input arrays.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#addweighted">org.opencv.core.Core.addWeighted</a>
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat dst)
    {

        addWeighted_1(src1.nativeObj, alpha, src2.nativeObj, beta, gamma, dst.nativeObj);

        return;
    }


    //
    // C++:  void batchDistance(Mat src1, Mat src2, Mat& dist, int dtype, Mat& nidx, int normType = NORM_L2, int K = 0, Mat mask = Mat(), int update = 0, bool crosscheck = false)
    //

    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K, Mat mask, int update, boolean crosscheck)
    {

        batchDistance_0(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K, mask.nativeObj, update, crosscheck);

        return;
    }

    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx, int normType, int K)
    {

        batchDistance_1(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj, normType, K);

        return;
    }

    public static void batchDistance(Mat src1, Mat src2, Mat dist, int dtype, Mat nidx)
    {

        batchDistance_2(src1.nativeObj, src2.nativeObj, dist.nativeObj, dtype, nidx.nativeObj);

        return;
    }


    //
    // C++:  void bitwise_and(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

/**
 * <p>Calculates the per-element bit-wise conjunction of two arrays or an array and
 * a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical conjunction for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) / src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) / src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1 / src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the second
 * and third cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-and">org.opencv.core.Core.bitwise_and</a>
 */
    public static void bitwise_and(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        bitwise_and_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates the per-element bit-wise conjunction of two arrays or an array and
 * a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical conjunction for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) / src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) / src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1 / src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the second
 * and third cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-and">org.opencv.core.Core.bitwise_and</a>
 */
    public static void bitwise_and(Mat src1, Mat src2, Mat dst)
    {

        bitwise_and_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void bitwise_not(Mat src, Mat& dst, Mat mask = Mat())
    //

/**
 * <p>Inverts every bit of an array.</p>
 *
 * <p>The function computes per-element bit-wise inversion of the source array:</p>
 *
 * <p><em>dst(I) = !src(I)</em></p>
 *
 * <p>In case of a floating-point source array, its machine-specific bit
 * representation (usually IEEE754-compliant) is used for the operation. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * @param src Source array.
 * @param dst Destination array that has the same size and type as the input
 * array.
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-not">org.opencv.core.Core.bitwise_not</a>
 */
    public static void bitwise_not(Mat src, Mat dst, Mat mask)
    {

        bitwise_not_0(src.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Inverts every bit of an array.</p>
 *
 * <p>The function computes per-element bit-wise inversion of the source array:</p>
 *
 * <p><em>dst(I) = !src(I)</em></p>
 *
 * <p>In case of a floating-point source array, its machine-specific bit
 * representation (usually IEEE754-compliant) is used for the operation. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * @param src Source array.
 * @param dst Destination array that has the same size and type as the input
 * array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-not">org.opencv.core.Core.bitwise_not</a>
 */
    public static void bitwise_not(Mat src, Mat dst)
    {

        bitwise_not_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void bitwise_or(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

/**
 * <p>Calculates the per-element bit-wise disjunction of two arrays or an array and
 * a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical disjunction for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) V src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) V src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1 V src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the second
 * and third cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-or">org.opencv.core.Core.bitwise_or</a>
 */
    public static void bitwise_or(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        bitwise_or_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates the per-element bit-wise disjunction of two arrays or an array and
 * a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical disjunction for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) V src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) V src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1 V src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the second
 * and third cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-or">org.opencv.core.Core.bitwise_or</a>
 */
    public static void bitwise_or(Mat src1, Mat src2, Mat dst)
    {

        bitwise_or_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void bitwise_xor(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    //

/**
 * <p>Calculates the per-element bit-wise "exclusive or" operation on two arrays or
 * an array and a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical "exclusive-or"
 * operation for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I)(+) src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I)(+) src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(+) src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the 2nd and
 * 3rd cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 * @param mask Optional operation mask, 8-bit single channel array, that
 * specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-xor">org.opencv.core.Core.bitwise_xor</a>
 */
    public static void bitwise_xor(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        bitwise_xor_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates the per-element bit-wise "exclusive or" operation on two arrays or
 * an array and a scalar.</p>
 *
 * <p>The function computes the per-element bit-wise logical "exclusive-or"
 * operation for:</p>
 * <ul>
 *   <li> Two arrays when <code>src1</code> and <code>src2</code> have the same
 * size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I)(+) src2(I) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> An array and a scalar when <code>src2</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(I)(+) src2 if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> A scalar and an array when <code>src1</code> is constructed from
 * <code>Scalar</code> or has the same number of elements as <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = src1(+) src2(I) if mask(I) != 0</em></p>
 *
 * <p>In case of floating-point arrays, their machine-specific bit representations
 * (usually IEEE754-compliant) are used for the operation. In case of
 * multi-channel arrays, each channel is processed independently. In the 2nd and
 * 3rd cases above, the scalar is first converted to the array type.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array that has the same size and type as the input
 * array(s).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#bitwise-xor">org.opencv.core.Core.bitwise_xor</a>
 */
    public static void bitwise_xor(Mat src1, Mat src2, Mat dst)
    {

        bitwise_xor_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void calcCovarMatrix(Mat samples, Mat& covar, Mat& mean, int flags, int ctype = CV_64F)
    //

/**
 * <p>Calculates the covariance matrix of a set of vectors.</p>
 *
 * <p>The functions <code>calcCovarMatrix</code> calculate the covariance matrix
 * and, optionally, the mean vector of the set of input vectors.</p>
 *
 * @param samples Samples stored either as separate matrices or as rows/columns
 * of a single matrix.
 * @param covar Output covariance matrix of the type <code>ctype</code> and
 * square size.
 * @param mean Input or output (depending on the flags) array as the average
 * value of the input vectors.
 * @param flags Operation flags as a combination of the following values:
 * <ul>
 *   <li> CV_COVAR_SCRAMBLED The output covariance matrix is calculated as:
 * </ul>
 *
 * <p><em>scale * [ vects [0]- mean, vects [1]- mean,...]^T * [ vects [0]- mean,
 * vects [1]- mean,...],</em></p>
 *
 * <p>The covariance matrix will be <code>nsamples x nsamples</code>. Such an
 * unusual covariance matrix is used for fast PCA of a set of very large vectors
 * (see, for example, the EigenFaces technique for face recognition).
 * Eigenvalues of this "scrambled" matrix match the eigenvalues of the true
 * covariance matrix. The "true" eigenvectors can be easily calculated from the
 * eigenvectors of the "scrambled" covariance matrix.</p>
 * <ul>
 *   <li> CV_COVAR_NORMAL The output covariance matrix is calculated as:
 * </ul>
 *
 * <p><em>scale * [ vects [0]- mean, vects [1]- mean,...] * [ vects [0]- mean,
 * vects [1]- mean,...]^T,</em></p>
 *
 * <p><code>covar</code> will be a square matrix of the same size as the total
 * number of elements in each input vector. One and only one of
 * <code>CV_COVAR_SCRAMBLED</code> and <code>CV_COVAR_NORMAL</code> must be
 * specified.</p>
 * <ul>
 *   <li> CV_COVAR_USE_AVG If the flag is specified, the function does not
 * calculate <code>mean</code> from the input vectors but, instead, uses the
 * passed <code>mean</code> vector. This is useful if <code>mean</code> has been
 * pre-computed or known in advance, or if the covariance matrix is calculated
 * by parts. In this case, <code>mean</code> is not a mean vector of the input
 * sub-set of vectors but rather the mean vector of the whole set.
 *   <li> CV_COVAR_SCALE If the flag is specified, the covariance matrix is
 * scaled. In the "normal" mode, <code>scale</code> is <code>1./nsamples</code>.
 * In the "scrambled" mode, <code>scale</code> is the reciprocal of the total
 * number of elements in each input vector. By default (if the flag is not
 * specified), the covariance matrix is not scaled (<code>scale=1</code>).
 *   <li> CV_COVAR_ROWS [Only useful in the second variant of the function] If
 * the flag is specified, all the input vectors are stored as rows of the
 * <code>samples</code> matrix. <code>mean</code> should be a single-row vector
 * in this case.
 *   <li> CV_COVAR_COLS [Only useful in the second variant of the function] If
 * the flag is specified, all the input vectors are stored as columns of the
 * <code>samples</code> matrix. <code>mean</code> should be a single-column
 * vector in this case.
 * </ul>
 * @param ctype a ctype
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#calccovarmatrix">org.opencv.core.Core.calcCovarMatrix</a>
 * @see org.opencv.core.Core#Mahalanobis
 * @see org.opencv.core.PCA
 * @see org.opencv.core.Core#mulTransposed
 */
    public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags, int ctype)
    {

        calcCovarMatrix_0(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags, ctype);

        return;
    }

/**
 * <p>Calculates the covariance matrix of a set of vectors.</p>
 *
 * <p>The functions <code>calcCovarMatrix</code> calculate the covariance matrix
 * and, optionally, the mean vector of the set of input vectors.</p>
 *
 * @param samples Samples stored either as separate matrices or as rows/columns
 * of a single matrix.
 * @param covar Output covariance matrix of the type <code>ctype</code> and
 * square size.
 * @param mean Input or output (depending on the flags) array as the average
 * value of the input vectors.
 * @param flags Operation flags as a combination of the following values:
 * <ul>
 *   <li> CV_COVAR_SCRAMBLED The output covariance matrix is calculated as:
 * </ul>
 *
 * <p><em>scale * [ vects [0]- mean, vects [1]- mean,...]^T * [ vects [0]- mean,
 * vects [1]- mean,...],</em></p>
 *
 * <p>The covariance matrix will be <code>nsamples x nsamples</code>. Such an
 * unusual covariance matrix is used for fast PCA of a set of very large vectors
 * (see, for example, the EigenFaces technique for face recognition).
 * Eigenvalues of this "scrambled" matrix match the eigenvalues of the true
 * covariance matrix. The "true" eigenvectors can be easily calculated from the
 * eigenvectors of the "scrambled" covariance matrix.</p>
 * <ul>
 *   <li> CV_COVAR_NORMAL The output covariance matrix is calculated as:
 * </ul>
 *
 * <p><em>scale * [ vects [0]- mean, vects [1]- mean,...] * [ vects [0]- mean,
 * vects [1]- mean,...]^T,</em></p>
 *
 * <p><code>covar</code> will be a square matrix of the same size as the total
 * number of elements in each input vector. One and only one of
 * <code>CV_COVAR_SCRAMBLED</code> and <code>CV_COVAR_NORMAL</code> must be
 * specified.</p>
 * <ul>
 *   <li> CV_COVAR_USE_AVG If the flag is specified, the function does not
 * calculate <code>mean</code> from the input vectors but, instead, uses the
 * passed <code>mean</code> vector. This is useful if <code>mean</code> has been
 * pre-computed or known in advance, or if the covariance matrix is calculated
 * by parts. In this case, <code>mean</code> is not a mean vector of the input
 * sub-set of vectors but rather the mean vector of the whole set.
 *   <li> CV_COVAR_SCALE If the flag is specified, the covariance matrix is
 * scaled. In the "normal" mode, <code>scale</code> is <code>1./nsamples</code>.
 * In the "scrambled" mode, <code>scale</code> is the reciprocal of the total
 * number of elements in each input vector. By default (if the flag is not
 * specified), the covariance matrix is not scaled (<code>scale=1</code>).
 *   <li> CV_COVAR_ROWS [Only useful in the second variant of the function] If
 * the flag is specified, all the input vectors are stored as rows of the
 * <code>samples</code> matrix. <code>mean</code> should be a single-row vector
 * in this case.
 *   <li> CV_COVAR_COLS [Only useful in the second variant of the function] If
 * the flag is specified, all the input vectors are stored as columns of the
 * <code>samples</code> matrix. <code>mean</code> should be a single-column
 * vector in this case.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#calccovarmatrix">org.opencv.core.Core.calcCovarMatrix</a>
 * @see org.opencv.core.Core#Mahalanobis
 * @see org.opencv.core.PCA
 * @see org.opencv.core.Core#mulTransposed
 */
    public static void calcCovarMatrix(Mat samples, Mat covar, Mat mean, int flags)
    {

        calcCovarMatrix_1(samples.nativeObj, covar.nativeObj, mean.nativeObj, flags);

        return;
    }


    //
    // C++:  void cartToPolar(Mat x, Mat y, Mat& magnitude, Mat& angle, bool angleInDegrees = false)
    //

/**
 * <p>Calculates the magnitude and angle of 2D vectors.</p>
 *
 * <p>The function <code>cartToPolar</code> calculates either the magnitude, angle,
 * or both for every 2D vector (x(I),y(I)):</p>
 *
 * <p><em>magnitude(I)= sqrt(x(I)^2+y(I)^2),
 * angle(I)= atan2(y(I), x(I))[ *180 / pi ] </em></p>
 *
 * <p>The angles are calculated with accuracy about 0.3 degrees. For the point
 * (0,0), the angle is set to 0.</p>
 *
 * @param x Array of x-coordinates. This must be a single-precision or
 * double-precision floating-point array.
 * @param y Array of y-coordinates that must have the same size and same type as
 * <code>x</code>.
 * @param magnitude Destination array of magnitudes of the same size and type as
 * <code>x</code>.
 * @param angle Destination array of angles that has the same size and type as
 * <code>x</code>. The angles are measured in radians (from 0 to 2*Pi) or in
 * degrees (0 to 360 degrees).
 * @param angleInDegrees Flag indicating whether the angles are measured in
 * radians, which is the default mode, or in degrees.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#carttopolar">org.opencv.core.Core.cartToPolar</a>
 * @see org.opencv.imgproc.Imgproc#Scharr
 * @see org.opencv.imgproc.Imgproc#Sobel
 */
    public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle, boolean angleInDegrees)
    {

        cartToPolar_0(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj, angleInDegrees);

        return;
    }

/**
 * <p>Calculates the magnitude and angle of 2D vectors.</p>
 *
 * <p>The function <code>cartToPolar</code> calculates either the magnitude, angle,
 * or both for every 2D vector (x(I),y(I)):</p>
 *
 * <p><em>magnitude(I)= sqrt(x(I)^2+y(I)^2),
 * angle(I)= atan2(y(I), x(I))[ *180 / pi ] </em></p>
 *
 * <p>The angles are calculated with accuracy about 0.3 degrees. For the point
 * (0,0), the angle is set to 0.</p>
 *
 * @param x Array of x-coordinates. This must be a single-precision or
 * double-precision floating-point array.
 * @param y Array of y-coordinates that must have the same size and same type as
 * <code>x</code>.
 * @param magnitude Destination array of magnitudes of the same size and type as
 * <code>x</code>.
 * @param angle Destination array of angles that has the same size and type as
 * <code>x</code>. The angles are measured in radians (from 0 to 2*Pi) or in
 * degrees (0 to 360 degrees).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#carttopolar">org.opencv.core.Core.cartToPolar</a>
 * @see org.opencv.imgproc.Imgproc#Scharr
 * @see org.opencv.imgproc.Imgproc#Sobel
 */
    public static void cartToPolar(Mat x, Mat y, Mat magnitude, Mat angle)
    {

        cartToPolar_1(x.nativeObj, y.nativeObj, magnitude.nativeObj, angle.nativeObj);

        return;
    }


    //
    // C++:  bool checkRange(Mat a, bool quiet = true,  _hidden_ * pos = 0, double minVal = -DBL_MAX, double maxVal = DBL_MAX)
    //

/**
 * <p>Checks every element of an input array for invalid values.</p>
 *
 * <p>The functions <code>checkRange</code> check that every array element is
 * neither NaN nor infinite. When <code>minVal < -DBL_MAX</code> and
 * <code>maxVal < DBL_MAX</code>, the functions also check that each value is
 * between <code>minVal</code> and <code>maxVal</code>. In case of multi-channel
 * arrays, each channel is processed independently.
 * If some values are out of range, position of the first outlier is stored in
 * <code>pos</code> (when <code>pos != NULL</code>). Then, the functions either
 * return false (when <code>quiet=true</code>) or throw an exception.</p>
 *
 * @param a Array to check.
 * @param quiet Flag indicating whether the functions quietly return false when
 * the array elements are out of range or they throw an exception.
 * @param minVal Inclusive lower boundary of valid values range.
 * @param maxVal Exclusive upper boundary of valid values range.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#checkrange">org.opencv.core.Core.checkRange</a>
 */
    public static boolean checkRange(Mat a, boolean quiet, double minVal, double maxVal)
    {

        boolean retVal = checkRange_0(a.nativeObj, quiet, minVal, maxVal);

        return retVal;
    }

/**
 * <p>Checks every element of an input array for invalid values.</p>
 *
 * <p>The functions <code>checkRange</code> check that every array element is
 * neither NaN nor infinite. When <code>minVal < -DBL_MAX</code> and
 * <code>maxVal < DBL_MAX</code>, the functions also check that each value is
 * between <code>minVal</code> and <code>maxVal</code>. In case of multi-channel
 * arrays, each channel is processed independently.
 * If some values are out of range, position of the first outlier is stored in
 * <code>pos</code> (when <code>pos != NULL</code>). Then, the functions either
 * return false (when <code>quiet=true</code>) or throw an exception.</p>
 *
 * @param a Array to check.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#checkrange">org.opencv.core.Core.checkRange</a>
 */
    public static boolean checkRange(Mat a)
    {

        boolean retVal = checkRange_1(a.nativeObj);

        return retVal;
    }


    //
    // C++:  void circle(Mat img, Point center, int radius, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

/**
 * <p>Draws a circle.</p>
 *
 * <p>The function <code>circle</code> draws a simple or filled circle with a given
 * center and radius.</p>
 *
 * @param img Image where the circle is drawn.
 * @param center Center of the circle.
 * @param radius Radius of the circle.
 * @param color Circle color.
 * @param thickness Thickness of the circle outline, if positive. Negative
 * thickness means that a filled circle is to be drawn.
 * @param lineType Type of the circle boundary. See the "line" description.
 * @param shift Number of fractional bits in the coordinates of the center and
 * in the radius value.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#circle">org.opencv.core.Core.circle</a>
 */
    public static void circle(Mat img, Point center, int radius, Scalar color, int thickness, int lineType, int shift)
    {

        circle_0(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);

        return;
    }

/**
 * <p>Draws a circle.</p>
 *
 * <p>The function <code>circle</code> draws a simple or filled circle with a given
 * center and radius.</p>
 *
 * @param img Image where the circle is drawn.
 * @param center Center of the circle.
 * @param radius Radius of the circle.
 * @param color Circle color.
 * @param thickness Thickness of the circle outline, if positive. Negative
 * thickness means that a filled circle is to be drawn.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#circle">org.opencv.core.Core.circle</a>
 */
    public static void circle(Mat img, Point center, int radius, Scalar color, int thickness)
    {

        circle_1(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a circle.</p>
 *
 * <p>The function <code>circle</code> draws a simple or filled circle with a given
 * center and radius.</p>
 *
 * @param img Image where the circle is drawn.
 * @param center Center of the circle.
 * @param radius Radius of the circle.
 * @param color Circle color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#circle">org.opencv.core.Core.circle</a>
 */
    public static void circle(Mat img, Point center, int radius, Scalar color)
    {

        circle_2(img.nativeObj, center.x, center.y, radius, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  bool clipLine(Rect imgRect, Point& pt1, Point& pt2)
    //

/**
 * <p>Clips the line against the image rectangle.</p>
 *
 * <p>The functions <code>clipLine</code> calculate a part of the line segment that
 * is entirely within the specified rectangle.
 * They return <code>false</code> if the line segment is completely outside the
 * rectangle. Otherwise, they return <code>true</code>.</p>
 *
 * @param imgRect Image rectangle.
 * @param pt1 First line point.
 * @param pt2 Second line point.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#clipline">org.opencv.core.Core.clipLine</a>
 */
    public static boolean clipLine(Rect imgRect, Point pt1, Point pt2)
    {
        double[] pt1_out = new double[2];
        double[] pt2_out = new double[2];
        boolean retVal = clipLine_0(imgRect.x, imgRect.y, imgRect.width, imgRect.height, pt1.x, pt1.y, pt1_out, pt2.x, pt2.y, pt2_out);
        if(pt1!=null){ pt1.x = pt1_out[0]; pt1.y = pt1_out[1]; }
        if(pt2!=null){ pt2.x = pt2_out[0]; pt2.y = pt2_out[1]; }
        return retVal;
    }


    //
    // C++:  void compare(Mat src1, Mat src2, Mat& dst, int cmpop)
    //

/**
 * <p>Performs the per-element comparison of two arrays or an array and scalar
 * value.</p>
 *
 * <p>The function compares:</p>
 * <ul>
 *   <li> Elements of two arrays when <code>src1</code> and <code>src2</code>
 * have the same size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) cmpop src2(I)</em></p>
 *
 * <ul>
 *   <li> Elements of <code>src1</code> with a scalar <code>src2" when
 * </code>src2<code> is constructed from </code>Scalar" or has a single element:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) cmpop src2</em></p>
 *
 * <ul>
 *   <li> <code>src1</code> with elements of <code>src2</code> when
 * <code>src1</code> is constructed from <code>Scalar</code> or has a single
 * element:
 * </ul>
 *
 * <p><em>dst(I) = src1 cmpop src2(I)</em></p>
 *
 * <p>When the comparison result is true, the corresponding element of destination
 * array is set to 255.
 * The comparison operations can be replaced with the equivalent matrix
 * expressions:</p>
 *
 * @param src1 First source array or a scalar (in the case of <code>cvCmp</code>,
 * <code>cv.Cmp</code>, <code>cvCmpS</code>, <code>cv.CmpS</code> it is always
 * an array). When it is array, it must have a single channel.
 * @param src2 Second source array or a scalar (in the case of <code>cvCmp</code>
 * and <code>cv.Cmp</code> it is always an array; in the case of
 * <code>cvCmpS</code>, <code>cv.CmpS</code> it is always a scalar). When it is
 * array, it must have a single channel.
 * @param dst Destination array that has the same size as the input array(s) and
 * type= <code>CV_8UC1</code>.
 * @param cmpop Flag specifying the relation between the elements to be checked.
 * <ul>
 *   <li> CMP_EQ <code>src1</code> equal to <code>src2</code>.
 *   <li> CMP_GT <code>src1</code> greater than <code>src2</code>.
 *   <li> CMP_GE <code>src1</code> greater than or equal to <code>src2</code>.
 *   <li> CMP_LT <code>src1</code> less than <code>src2</code>.
 *   <li> CMP_LE <code>src1</code> less than or equal to <code>src2</code>.
 *   <li> CMP_NE <code>src1</code> not equal to <code>src2</code>.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#compare">org.opencv.core.Core.compare</a>
 * @see org.opencv.imgproc.Imgproc#threshold
 * @see org.opencv.core.Core#max
 * @see MatrixExpressions
 * @see org.opencv.core.Core#checkRange
 * @see org.opencv.core.Core#min
 */
    public static void compare(Mat src1, Mat src2, Mat dst, int cmpop)
    {

        compare_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, cmpop);

        return;
    }


    //
    // C++:  void compare(Mat src1, Scalar src2, Mat& dst, int cmpop)
    //

/**
 * <p>Performs the per-element comparison of two arrays or an array and scalar
 * value.</p>
 *
 * <p>The function compares:</p>
 * <ul>
 *   <li> Elements of two arrays when <code>src1</code> and <code>src2</code>
 * have the same size:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) cmpop src2(I)</em></p>
 *
 * <ul>
 *   <li> Elements of <code>src1</code> with a scalar <code>src2" when
 * </code>src2<code> is constructed from </code>Scalar" or has a single element:
 * </ul>
 *
 * <p><em>dst(I) = src1(I) cmpop src2</em></p>
 *
 * <ul>
 *   <li> <code>src1</code> with elements of <code>src2</code> when
 * <code>src1</code> is constructed from <code>Scalar</code> or has a single
 * element:
 * </ul>
 *
 * <p><em>dst(I) = src1 cmpop src2(I)</em></p>
 *
 * <p>When the comparison result is true, the corresponding element of destination
 * array is set to 255.
 * The comparison operations can be replaced with the equivalent matrix
 * expressions:</p>
 *
 * @param src1 First source array or a scalar (in the case of <code>cvCmp</code>,
 * <code>cv.Cmp</code>, <code>cvCmpS</code>, <code>cv.CmpS</code> it is always
 * an array). When it is array, it must have a single channel.
 * @param src2 Second source array or a scalar (in the case of <code>cvCmp</code>
 * and <code>cv.Cmp</code> it is always an array; in the case of
 * <code>cvCmpS</code>, <code>cv.CmpS</code> it is always a scalar). When it is
 * array, it must have a single channel.
 * @param dst Destination array that has the same size as the input array(s) and
 * type= <code>CV_8UC1</code>.
 * @param cmpop Flag specifying the relation between the elements to be checked.
 * <ul>
 *   <li> CMP_EQ <code>src1</code> equal to <code>src2</code>.
 *   <li> CMP_GT <code>src1</code> greater than <code>src2</code>.
 *   <li> CMP_GE <code>src1</code> greater than or equal to <code>src2</code>.
 *   <li> CMP_LT <code>src1</code> less than <code>src2</code>.
 *   <li> CMP_LE <code>src1</code> less than or equal to <code>src2</code>.
 *   <li> CMP_NE <code>src1</code> not equal to <code>src2</code>.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#compare">org.opencv.core.Core.compare</a>
 * @see org.opencv.imgproc.Imgproc#threshold
 * @see org.opencv.core.Core#max
 * @see MatrixExpressions
 * @see org.opencv.core.Core#checkRange
 * @see org.opencv.core.Core#min
 */
    public static void compare(Mat src1, Scalar src2, Mat dst, int cmpop)
    {

        compare_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, cmpop);

        return;
    }


    //
    // C++:  void completeSymm(Mat& mtx, bool lowerToUpper = false)
    //

/**
 * <p>Copies the lower or the upper half of a square matrix to another half.</p>
 *
 * <p>The function <code>completeSymm</code> copies the lower half of a square
 * matrix to its another half. The matrix diagonal remains unchanged:</p>
 * <ul>
 *   <li> <em>mtx_(ij)=mtx_(ji)</em> for <em>i > j</em> if <code>lowerToUpper=false</code>
 *   <li> <em>mtx_(ij)=mtx_(ji)</em> for <em>i < j</em> if <code>lowerToUpper=true</code>
 * </ul>
 *
 * @param mtx Input-output floating-point square matrix.
 * @param lowerToUpper Operation flag. If it is true, the lower half is copied
 * to the upper half. Otherwise, the upper half is copied to the lower half.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#completesymm">org.opencv.core.Core.completeSymm</a>
 * @see org.opencv.core.Core#transpose
 * @see org.opencv.core.Core#flip
 */
    public static void completeSymm(Mat mtx, boolean lowerToUpper)
    {

        completeSymm_0(mtx.nativeObj, lowerToUpper);

        return;
    }

/**
 * <p>Copies the lower or the upper half of a square matrix to another half.</p>
 *
 * <p>The function <code>completeSymm</code> copies the lower half of a square
 * matrix to its another half. The matrix diagonal remains unchanged:</p>
 * <ul>
 *   <li> <em>mtx_(ij)=mtx_(ji)</em> for <em>i > j</em> if <code>lowerToUpper=false</code>
 *   <li> <em>mtx_(ij)=mtx_(ji)</em> for <em>i < j</em> if <code>lowerToUpper=true</code>
 * </ul>
 *
 * @param mtx Input-output floating-point square matrix.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#completesymm">org.opencv.core.Core.completeSymm</a>
 * @see org.opencv.core.Core#transpose
 * @see org.opencv.core.Core#flip
 */
    public static void completeSymm(Mat mtx)
    {

        completeSymm_1(mtx.nativeObj);

        return;
    }


    //
    // C++:  void convertScaleAbs(Mat src, Mat& dst, double alpha = 1, double beta = 0)
    //

/**
 * <p>Scales, computes absolute values, and converts the result to 8-bit.</p>
 *
 * <p>On each element of the input array, the function <code>convertScaleAbs</code>
 * performs three operations sequentially: scaling, taking an absolute value,
 * conversion to an unsigned 8-bit type:</p>
 *
 * <p><em>dst(I)= saturate_cast<uchar> (| src(I)* alpha + beta|)</em></p>
 *
 * <p>In case of multi-channel arrays, the function processes each channel
 * independently. When the output is not 8-bit, the operation can be emulated by
 * calling the <code>Mat.convertTo</code> method (or by using matrix
 * expressions) and then by computing an absolute value of the result. For
 * example:</p>
 *
 * @param src Source array.
 * @param dst Destination array.
 * @param alpha Optional scale factor.
 * @param beta Optional delta added to the scaled values.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#convertscaleabs">org.opencv.core.Core.convertScaleAbs</a>
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#abs
 */
    public static void convertScaleAbs(Mat src, Mat dst, double alpha, double beta)
    {

        convertScaleAbs_0(src.nativeObj, dst.nativeObj, alpha, beta);

        return;
    }

/**
 * <p>Scales, computes absolute values, and converts the result to 8-bit.</p>
 *
 * <p>On each element of the input array, the function <code>convertScaleAbs</code>
 * performs three operations sequentially: scaling, taking an absolute value,
 * conversion to an unsigned 8-bit type:</p>
 *
 * <p><em>dst(I)= saturate_cast<uchar> (| src(I)* alpha + beta|)</em></p>
 *
 * <p>In case of multi-channel arrays, the function processes each channel
 * independently. When the output is not 8-bit, the operation can be emulated by
 * calling the <code>Mat.convertTo</code> method (or by using matrix
 * expressions) and then by computing an absolute value of the result. For
 * example:</p>
 *
 * @param src Source array.
 * @param dst Destination array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#convertscaleabs">org.opencv.core.Core.convertScaleAbs</a>
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#abs
 */
    public static void convertScaleAbs(Mat src, Mat dst)
    {

        convertScaleAbs_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  int countNonZero(Mat src)
    //

/**
 * <p>Counts non-zero array elements.</p>
 *
 * <p>The function returns the number of non-zero elements in <code>src</code> :</p>
 *
 * <p><em>sum(by: I: src(I) != 0) 1</em></p>
 *
 * @param src Single-channel array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#countnonzero">org.opencv.core.Core.countNonZero</a>
 * @see org.opencv.core.Core#minMaxLoc
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#meanStdDev
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#mean
 */
    public static int countNonZero(Mat src)
    {

        int retVal = countNonZero_0(src.nativeObj);

        return retVal;
    }


    //
    // C++:  float cubeRoot(float val)
    //

/**
 * <p>Computes the cube root of an argument.</p>
 *
 * <p>The function <code>cubeRoot</code> computes <em>sqrt3(val)</em>. Negative
 * arguments are handled correctly. NaN and Inf are not handled. The accuracy
 * approaches the maximum possible accuracy for single-precision data.</p>
 *
 * @param val A function argument.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/utility_and_system_functions_and_macros.html#cuberoot">org.opencv.core.Core.cubeRoot</a>
 */
    public static float cubeRoot(float val)
    {

        float retVal = cubeRoot_0(val);

        return retVal;
    }


    //
    // C++:  void dct(Mat src, Mat& dst, int flags = 0)
    //

/**
 * <p>Performs a forward or inverse discrete Cosine transform of 1D or 2D array.</p>
 *
 * <p>The function <code>dct</code> performs a forward or inverse discrete Cosine
 * transform (DCT) of a 1D or 2D floating-point array:</p>
 * <ul>
 *   <li> Forward Cosine transform of a 1D vector of <code>N</code> elements:
 * </ul>
 *
 * <p><em>Y = C^N * X</em></p>
 *
 * <p>where</p>
 *
 * <p><em>C^N_(jk)= sqrt(alpha_j/N) cos((pi(2k+1)j)/(2N))</em></p>
 *
 * <p>and</p>
 *
 * <p><em>alpha_0=1</em>, <em>alpha_j=2</em> for *j > 0*.</p>
 * <ul>
 *   <li> Inverse Cosine transform of a 1D vector of <code>N</code> elements:
 * </ul>
 *
 * <p><em>X = (C^N)^(-1) * Y = (C^N)^T * Y</em></p>
 *
 * <p>(since <em>C^N</em> is an orthogonal matrix, <em>C^N * (C^N)^T = I</em>)</p>
 * <ul>
 *   <li> Forward 2D Cosine transform of <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>Y = C^N * X * (C^N)^T</em></p>
 *
 * <ul>
 *   <li> Inverse 2D Cosine transform of <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>X = (C^N)^T * X * C^N</em></p>
 *
 * <p>The function chooses the mode of operation by looking at the flags and size
 * of the input array:</p>
 * <ul>
 *   <li> If <code>(flags & DCT_INVERSE) == 0</code>, the function does a
 * forward 1D or 2D transform. Otherwise, it is an inverse 1D or 2D transform.
 *   <li> If <code>(flags & DCT_ROWS) != 0</code>, the function performs a 1D
 * transform of each row.
 *   <li> If the array is a single column or a single row, the function performs
 * a 1D transform.
 *   <li> If none of the above is true, the function performs a 2D transform.
 * </ul>
 *
 * <p>Note:</p>
 *
 * <p>Currently <code>dct</code> supports even-size arrays (2, 4, 6...). For data
 * analysis and approximation, you can pad the array when necessary.</p>
 *
 * <p>Also, the function performance depends very much, and not monotonically, on
 * the array size (see "getOptimalDFTSize"). In the current implementation DCT
 * of a vector of size <code>N</code> is computed via DFT of a vector of size
 * <code>N/2</code>. Thus, the optimal DCT size <code>N1 >= N</code> can be
 * computed as:</p>
 *
 * @param src Source floating-point array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 * @param flags Transformation flags as a combination of the following values:
 * <ul>
 *   <li> DCT_INVERSE performs an inverse 1D or 2D transform instead of the
 * default forward transform.
 *   <li> DCT_ROWS performs a forward or inverse transform of every individual
 * row of the input matrix. This flag enables you to transform multiple vectors
 * simultaneously and can be used to decrease the overhead (which is sometimes
 * several times larger than the processing itself) to perform 3D and
 * higher-dimensional transforms and so forth.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#dct">org.opencv.core.Core.dct</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#idct
 * @see org.opencv.core.Core#getOptimalDFTSize
 */
    public static void dct(Mat src, Mat dst, int flags)
    {

        dct_0(src.nativeObj, dst.nativeObj, flags);

        return;
    }

/**
 * <p>Performs a forward or inverse discrete Cosine transform of 1D or 2D array.</p>
 *
 * <p>The function <code>dct</code> performs a forward or inverse discrete Cosine
 * transform (DCT) of a 1D or 2D floating-point array:</p>
 * <ul>
 *   <li> Forward Cosine transform of a 1D vector of <code>N</code> elements:
 * </ul>
 *
 * <p><em>Y = C^N * X</em></p>
 *
 * <p>where</p>
 *
 * <p><em>C^N_(jk)= sqrt(alpha_j/N) cos((pi(2k+1)j)/(2N))</em></p>
 *
 * <p>and</p>
 *
 * <p><em>alpha_0=1</em>, <em>alpha_j=2</em> for *j > 0*.</p>
 * <ul>
 *   <li> Inverse Cosine transform of a 1D vector of <code>N</code> elements:
 * </ul>
 *
 * <p><em>X = (C^N)^(-1) * Y = (C^N)^T * Y</em></p>
 *
 * <p>(since <em>C^N</em> is an orthogonal matrix, <em>C^N * (C^N)^T = I</em>)</p>
 * <ul>
 *   <li> Forward 2D Cosine transform of <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>Y = C^N * X * (C^N)^T</em></p>
 *
 * <ul>
 *   <li> Inverse 2D Cosine transform of <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>X = (C^N)^T * X * C^N</em></p>
 *
 * <p>The function chooses the mode of operation by looking at the flags and size
 * of the input array:</p>
 * <ul>
 *   <li> If <code>(flags & DCT_INVERSE) == 0</code>, the function does a
 * forward 1D or 2D transform. Otherwise, it is an inverse 1D or 2D transform.
 *   <li> If <code>(flags & DCT_ROWS) != 0</code>, the function performs a 1D
 * transform of each row.
 *   <li> If the array is a single column or a single row, the function performs
 * a 1D transform.
 *   <li> If none of the above is true, the function performs a 2D transform.
 * </ul>
 *
 * <p>Note:</p>
 *
 * <p>Currently <code>dct</code> supports even-size arrays (2, 4, 6...). For data
 * analysis and approximation, you can pad the array when necessary.</p>
 *
 * <p>Also, the function performance depends very much, and not monotonically, on
 * the array size (see "getOptimalDFTSize"). In the current implementation DCT
 * of a vector of size <code>N</code> is computed via DFT of a vector of size
 * <code>N/2</code>. Thus, the optimal DCT size <code>N1 >= N</code> can be
 * computed as:</p>
 *
 * @param src Source floating-point array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#dct">org.opencv.core.Core.dct</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#idct
 * @see org.opencv.core.Core#getOptimalDFTSize
 */
    public static void dct(Mat src, Mat dst)
    {

        dct_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  double determinant(Mat mtx)
    //

/**
 * <p>Returns the determinant of a square floating-point matrix.</p>
 *
 * <p>The function <code>determinant</code> computes and returns the determinant of
 * the specified matrix. For small matrices (<code>mtx.cols=mtx.rows<=3</code>),
 * the direct method is used. For larger matrices, the function uses LU
 * factorization with partial pivoting.</p>
 *
 * <p>For symmetric positively-determined matrices, it is also possible to use
 * "eigen" decomposition to compute the determinant.</p>
 *
 * @param mtx Input matrix that must have <code>CV_32FC1</code> or
 * <code>CV_64FC1</code> type and square size.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#determinant">org.opencv.core.Core.determinant</a>
 * @see org.opencv.core.Core#invert
 * @see org.opencv.core.Core#solve
 * @see org.opencv.core.Core#eigen
 * @see org.opencv.core.Core#trace
 * @see MatrixExpressions
 */
    public static double determinant(Mat mtx)
    {

        double retVal = determinant_0(mtx.nativeObj);

        return retVal;
    }


    //
    // C++:  void dft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    //

/**
 * <p>Performs a forward or inverse Discrete Fourier transform of a 1D or 2D
 * floating-point array.</p>
 *
 * <p>The function performs one of the following:</p>
 * <ul>
 *   <li> Forward the Fourier transform of a 1D vector of <code>N</code>
 * elements:
 * </ul>
 *
 * <p><em>Y = F^N * X,</em></p>
 *
 * <p>where <em>F^N_(jk)=exp(-2pi i j k/N)</em> and <em>i=sqrt(-1)</em></p>
 * <ul>
 *   <li> Inverse the Fourier transform of a 1D vector of <code>N</code>
 * elements:
 * </ul>
 *
 * <p><em>X'= (F^N)^(-1) * Y = (F^N)^* * y
 * X = (1/N) * X, </em></p>
 *
 * <p>where <em>F^*=(Re(F^N)-Im(F^N))^T</em></p>
 * <ul>
 *   <li> Forward the 2D Fourier transform of a <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>Y = F^M * X * F^N</em></p>
 *
 * <ul>
 *   <li> Inverse the 2D Fourier transform of a <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>X'= (F^M)^* * Y * (F^N)^*
 * X = 1/(M * N) * X' </em></p>
 *
 * <p>In case of real (single-channel) data, the output spectrum of the forward
 * Fourier transform or input spectrum of the inverse Fourier transform can be
 * represented in a packed format called *CCS* (complex-conjugate-symmetrical).
 * It was borrowed from IPL (Intel* Image Processing Library). Here is how 2D
 * *CCS* spectrum looks:</p>
 *
 * <p><em>Re Y_(0,0) Re Y_(0,1) Im Y_(0,1) Re Y_(0,2) Im Y_(0,2) *s Re Y_(0,N/2-1)
 * Im Y_(0,N/2-1) Re Y_(0,N/2)
 * Re Y_(1,0) Re Y_(1,1) Im Y_(1,1) Re Y_(1,2) Im Y_(1,2) *s Re Y_(1,N/2-1) Im
 * Y_(1,N/2-1) Re Y_(1,N/2)
 * Im Y_(1,0) Re Y_(2,1) Im Y_(2,1) Re Y_(2,2) Im Y_(2,2) *s Re Y_(2,N/2-1) Im
 * Y_(2,N/2-1) Im Y_(1,N/2)...........................
 * Re Y_(M/2-1,0) Re Y_(M-3,1) Im Y_(M-3,1)......... Re Y_(M-3,N/2-1) Im
 * Y_(M-3,N/2-1) Re Y_(M/2-1,N/2)
 * Im Y_(M/2-1,0) Re Y_(M-2,1) Im Y_(M-2,1)......... Re Y_(M-2,N/2-1) Im
 * Y_(M-2,N/2-1) Im Y_(M/2-1,N/2)
 * Re Y_(M/2,0) Re Y_(M-1,1) Im Y_(M-1,1)......... Re Y_(M-1,N/2-1) Im
 * Y_(M-1,N/2-1) Re Y_(M/2,N/2) </em></p>
 *
 * <p>In case of 1D transform of a real vector, the output looks like the first row
 * of the matrix above.</p>
 *
 * <p>So, the function chooses an operation mode depending on the flags and size of
 * the input array:</p>
 * <ul>
 *   <li> If <code>DFT_ROWS</code> is set or the input array has a single row or
 * single column, the function performs a 1D forward or inverse transform of
 * each row of a matrix when <code>DFT_ROWS</code> is set. Otherwise, it
 * performs a 2D transform.
 *   <li> If the input array is real and <code>DFT_INVERSE</code> is not set,
 * the function performs a forward 1D or 2D transform:
 *   <li> When <code>DFT_COMPLEX_OUTPUT</code> is set, the output is a complex
 * matrix of the same size as input.
 *   <li> When <code>DFT_COMPLEX_OUTPUT</code> is not set, the output is a real
 * matrix of the same size as input. In case of 2D transform, it uses the packed
 * format as shown above. In case of a single 1D transform, it looks like the
 * first row of the matrix above. In case of multiple 1D transforms (when using
 * the <code>DCT_ROWS</code> flag), each row of the output matrix looks like the
 * first row of the matrix above.
 *   <li> If the input array is complex and either <code>DFT_INVERSE</code> or
 * <code>DFT_REAL_OUTPUT</code> are not set, the output is a complex array of
 * the same size as input. The function performs a forward or inverse 1D or 2D
 * transform of the whole input array or each row of the input array
 * independently, depending on the flags <code>DFT_INVERSE</code> and
 * <code>DFT_ROWS</code>.
 *   <li> When <code>DFT_INVERSE</code> is set and the input array is real, or
 * it is complex but <code>DFT_REAL_OUTPUT</code> is set, the output is a real
 * array of the same size as input. The function performs a 1D or 2D inverse
 * transformation of the whole input array or each individual row, depending on
 * the flags <code>DFT_INVERSE</code> and <code>DFT_ROWS</code>.
 * </ul>
 *
 * <p>If <code>DFT_SCALE</code> is set, the scaling is done after the
 * transformation.</p>
 *
 * <p>Unlike "dct", the function supports arrays of arbitrary size. But only those
 * arrays are processed efficiently, whose sizes can be factorized in a product
 * of small prime numbers (2, 3, and 5 in the current implementation). Such an
 * efficient DFT size can be computed using the "getOptimalDFTSize" method.</p>
 *
 * <p>The sample below illustrates how to compute a DFT-based convolution of two 2D
 * real arrays:</p>
 *
 * <p>To optimize this sample, consider the following approaches:</p>
 * <ul>
 *   <li> Since <code>nonzeroRows != 0</code> is passed to the forward transform
 * calls and since <code>A</code> and <code>B</code> are copied to the top-left
 * corners of <code>tempA</code> and <code>tempB</code>, respectively, it is not
 * necessary to clear the whole <code>tempA</code> and <code>tempB</code>. It is
 * only necessary to clear the <code>tempA.cols - A.cols</code>
 * (<code>tempB.cols - B.cols</code>) rightmost columns of the matrices.
 *   <li> This DFT-based convolution does not have to be applied to the whole
 * big arrays, especially if <code>B</code> is significantly smaller than
 * <code>A</code> or vice versa. Instead, you can compute convolution by parts.
 * To do this, you need to split the destination array <code>C</code> into
 * multiple tiles. For each tile, estimate which parts of <code>A</code> and
 * <code>B</code> are required to compute convolution in this tile. If the tiles
 * in <code>C</code> are too small, the speed will decrease a lot because of
 * repeated work. In the ultimate case, when each tile in <code>C</code> is a
 * single pixel, the algorithm becomes equivalent to the naive convolution
 * algorithm. If the tiles are too big, the temporary arrays <code>tempA</code>
 * and <code>tempB</code> become too big and there is also a slowdown because of
 * bad cache locality. So, there is an optimal tile size somewhere in the
 * middle.
 *   <li> If different tiles in <code>C</code> can be computed in parallel and,
 * thus, the convolution is done by parts, the loop can be threaded.
 * </ul>
 *
 * <p>All of the above improvements have been implemented in "matchTemplate" and
 * "filter2D". Therefore, by using them, you can get the performance even better
 * than with the above theoretically optimal implementation. Though, those two
 * functions actually compute cross-correlation, not convolution, so you need to
 * "flip" the second convolution operand <code>B</code> vertically and
 * horizontally using "flip".</p>
 *
 * @param src Source array that could be real or complex.
 * @param dst Destination array whose size and type depends on the
 * <code>flags</code>.
 * @param flags Transformation flags representing a combination of the following
 * values:
 * <ul>
 *   <li> DFT_INVERSE performs an inverse 1D or 2D transform instead of the
 * default forward transform.
 *   <li> DFT_SCALE scales the result: divide it by the number of array
 * elements. Normally, it is combined with <code>DFT_INVERSE</code>.
 *   <li> DFT_ROWS performs a forward or inverse transform of every individual
 * row of the input matrix. This flag enables you to transform multiple vectors
 * simultaneously and can be used to decrease the overhead (which is sometimes
 * several times larger than the processing itself) to perform 3D and
 * higher-dimensional transforms and so forth.
 *   <li> DFT_COMPLEX_OUTPUT performs a forward transformation of 1D or 2D real
 * array. The result, though being a complex array, has complex-conjugate
 * symmetry (*CCS*, see the function description below for details). Such an
 * array can be packed into a real array of the same size as input, which is the
 * fastest option and which is what the function does by default. However, you
 * may wish to get a full complex array (for simpler spectrum analysis, and so
 * on). Pass the flag to enable the function to produce a full-size complex
 * output array.
 *   <li> DFT_REAL_OUTPUT performs an inverse transformation of a 1D or 2D
 * complex array. The result is normally a complex array of the same size.
 * However, if the source array has conjugate-complex symmetry (for example, it
 * is a result of forward transformation with <code>DFT_COMPLEX_OUTPUT</code>
 * flag), the output is a real array. While the function itself does not check
 * whether the input is symmetrical or not, you can pass the flag and then the
 * function will assume the symmetry and produce the real output array. Note
 * that when the input is packed into a real array and inverse transformation is
 * executed, the function treats the input as a packed complex-conjugate
 * symmetrical array. So, the output will also be a real array.
 * </ul>
 * @param nonzeroRows When the parameter is not zero, the function assumes that
 * only the first <code>nonzeroRows</code> rows of the input array
 * (<code>DFT_INVERSE</code> is not set) or only the first <code>nonzeroRows</code>
 * of the output array (<code>DFT_INVERSE</code> is set) contain non-zeros.
 * Thus, the function can handle the rest of the rows more efficiently and save
 * some time. This technique is very useful for computing array
 * cross-correlation or convolution using DFT.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#dft">org.opencv.core.Core.dft</a>
 * @see org.opencv.imgproc.Imgproc#matchTemplate
 * @see org.opencv.core.Core#mulSpectrums
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#flip
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#phase
 * @see org.opencv.core.Core#dct
 * @see org.opencv.imgproc.Imgproc#filter2D
 * @see org.opencv.core.Core#getOptimalDFTSize
 */
    public static void dft(Mat src, Mat dst, int flags, int nonzeroRows)
    {

        dft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);

        return;
    }

/**
 * <p>Performs a forward or inverse Discrete Fourier transform of a 1D or 2D
 * floating-point array.</p>
 *
 * <p>The function performs one of the following:</p>
 * <ul>
 *   <li> Forward the Fourier transform of a 1D vector of <code>N</code>
 * elements:
 * </ul>
 *
 * <p><em>Y = F^N * X,</em></p>
 *
 * <p>where <em>F^N_(jk)=exp(-2pi i j k/N)</em> and <em>i=sqrt(-1)</em></p>
 * <ul>
 *   <li> Inverse the Fourier transform of a 1D vector of <code>N</code>
 * elements:
 * </ul>
 *
 * <p><em>X'= (F^N)^(-1) * Y = (F^N)^* * y
 * X = (1/N) * X, </em></p>
 *
 * <p>where <em>F^*=(Re(F^N)-Im(F^N))^T</em></p>
 * <ul>
 *   <li> Forward the 2D Fourier transform of a <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>Y = F^M * X * F^N</em></p>
 *
 * <ul>
 *   <li> Inverse the 2D Fourier transform of a <code>M x N</code> matrix:
 * </ul>
 *
 * <p><em>X'= (F^M)^* * Y * (F^N)^*
 * X = 1/(M * N) * X' </em></p>
 *
 * <p>In case of real (single-channel) data, the output spectrum of the forward
 * Fourier transform or input spectrum of the inverse Fourier transform can be
 * represented in a packed format called *CCS* (complex-conjugate-symmetrical).
 * It was borrowed from IPL (Intel* Image Processing Library). Here is how 2D
 * *CCS* spectrum looks:</p>
 *
 * <p><em>Re Y_(0,0) Re Y_(0,1) Im Y_(0,1) Re Y_(0,2) Im Y_(0,2) *s Re Y_(0,N/2-1)
 * Im Y_(0,N/2-1) Re Y_(0,N/2)
 * Re Y_(1,0) Re Y_(1,1) Im Y_(1,1) Re Y_(1,2) Im Y_(1,2) *s Re Y_(1,N/2-1) Im
 * Y_(1,N/2-1) Re Y_(1,N/2)
 * Im Y_(1,0) Re Y_(2,1) Im Y_(2,1) Re Y_(2,2) Im Y_(2,2) *s Re Y_(2,N/2-1) Im
 * Y_(2,N/2-1) Im Y_(1,N/2)...........................
 * Re Y_(M/2-1,0) Re Y_(M-3,1) Im Y_(M-3,1)......... Re Y_(M-3,N/2-1) Im
 * Y_(M-3,N/2-1) Re Y_(M/2-1,N/2)
 * Im Y_(M/2-1,0) Re Y_(M-2,1) Im Y_(M-2,1)......... Re Y_(M-2,N/2-1) Im
 * Y_(M-2,N/2-1) Im Y_(M/2-1,N/2)
 * Re Y_(M/2,0) Re Y_(M-1,1) Im Y_(M-1,1)......... Re Y_(M-1,N/2-1) Im
 * Y_(M-1,N/2-1) Re Y_(M/2,N/2) </em></p>
 *
 * <p>In case of 1D transform of a real vector, the output looks like the first row
 * of the matrix above.</p>
 *
 * <p>So, the function chooses an operation mode depending on the flags and size of
 * the input array:</p>
 * <ul>
 *   <li> If <code>DFT_ROWS</code> is set or the input array has a single row or
 * single column, the function performs a 1D forward or inverse transform of
 * each row of a matrix when <code>DFT_ROWS</code> is set. Otherwise, it
 * performs a 2D transform.
 *   <li> If the input array is real and <code>DFT_INVERSE</code> is not set,
 * the function performs a forward 1D or 2D transform:
 *   <li> When <code>DFT_COMPLEX_OUTPUT</code> is set, the output is a complex
 * matrix of the same size as input.
 *   <li> When <code>DFT_COMPLEX_OUTPUT</code> is not set, the output is a real
 * matrix of the same size as input. In case of 2D transform, it uses the packed
 * format as shown above. In case of a single 1D transform, it looks like the
 * first row of the matrix above. In case of multiple 1D transforms (when using
 * the <code>DCT_ROWS</code> flag), each row of the output matrix looks like the
 * first row of the matrix above.
 *   <li> If the input array is complex and either <code>DFT_INVERSE</code> or
 * <code>DFT_REAL_OUTPUT</code> are not set, the output is a complex array of
 * the same size as input. The function performs a forward or inverse 1D or 2D
 * transform of the whole input array or each row of the input array
 * independently, depending on the flags <code>DFT_INVERSE</code> and
 * <code>DFT_ROWS</code>.
 *   <li> When <code>DFT_INVERSE</code> is set and the input array is real, or
 * it is complex but <code>DFT_REAL_OUTPUT</code> is set, the output is a real
 * array of the same size as input. The function performs a 1D or 2D inverse
 * transformation of the whole input array or each individual row, depending on
 * the flags <code>DFT_INVERSE</code> and <code>DFT_ROWS</code>.
 * </ul>
 *
 * <p>If <code>DFT_SCALE</code> is set, the scaling is done after the
 * transformation.</p>
 *
 * <p>Unlike "dct", the function supports arrays of arbitrary size. But only those
 * arrays are processed efficiently, whose sizes can be factorized in a product
 * of small prime numbers (2, 3, and 5 in the current implementation). Such an
 * efficient DFT size can be computed using the "getOptimalDFTSize" method.</p>
 *
 * <p>The sample below illustrates how to compute a DFT-based convolution of two 2D
 * real arrays:</p>
 *
 * <p>To optimize this sample, consider the following approaches:</p>
 * <ul>
 *   <li> Since <code>nonzeroRows != 0</code> is passed to the forward transform
 * calls and since <code>A</code> and <code>B</code> are copied to the top-left
 * corners of <code>tempA</code> and <code>tempB</code>, respectively, it is not
 * necessary to clear the whole <code>tempA</code> and <code>tempB</code>. It is
 * only necessary to clear the <code>tempA.cols - A.cols</code>
 * (<code>tempB.cols - B.cols</code>) rightmost columns of the matrices.
 *   <li> This DFT-based convolution does not have to be applied to the whole
 * big arrays, especially if <code>B</code> is significantly smaller than
 * <code>A</code> or vice versa. Instead, you can compute convolution by parts.
 * To do this, you need to split the destination array <code>C</code> into
 * multiple tiles. For each tile, estimate which parts of <code>A</code> and
 * <code>B</code> are required to compute convolution in this tile. If the tiles
 * in <code>C</code> are too small, the speed will decrease a lot because of
 * repeated work. In the ultimate case, when each tile in <code>C</code> is a
 * single pixel, the algorithm becomes equivalent to the naive convolution
 * algorithm. If the tiles are too big, the temporary arrays <code>tempA</code>
 * and <code>tempB</code> become too big and there is also a slowdown because of
 * bad cache locality. So, there is an optimal tile size somewhere in the
 * middle.
 *   <li> If different tiles in <code>C</code> can be computed in parallel and,
 * thus, the convolution is done by parts, the loop can be threaded.
 * </ul>
 *
 * <p>All of the above improvements have been implemented in "matchTemplate" and
 * "filter2D". Therefore, by using them, you can get the performance even better
 * than with the above theoretically optimal implementation. Though, those two
 * functions actually compute cross-correlation, not convolution, so you need to
 * "flip" the second convolution operand <code>B</code> vertically and
 * horizontally using "flip".</p>
 *
 * @param src Source array that could be real or complex.
 * @param dst Destination array whose size and type depends on the
 * <code>flags</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#dft">org.opencv.core.Core.dft</a>
 * @see org.opencv.imgproc.Imgproc#matchTemplate
 * @see org.opencv.core.Core#mulSpectrums
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#flip
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#phase
 * @see org.opencv.core.Core#dct
 * @see org.opencv.imgproc.Imgproc#filter2D
 * @see org.opencv.core.Core#getOptimalDFTSize
 */
    public static void dft(Mat src, Mat dst)
    {

        dft_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void divide(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    //

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 * @param scale Scalar factor.
 * @param dtype Optional depth of the destination array. If it is
 * <code>-1</code>, <code>dst</code> will have depth <code>src2.depth()</code>.
 * In case of an array-by-array division, you can only pass <code>-1</code> when
 * <code>src1.depth()==src2.depth()</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Mat src2, Mat dst, double scale, int dtype)
    {

        divide_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);

        return;
    }

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 * @param scale Scalar factor.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Mat src2, Mat dst, double scale)
    {

        divide_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);

        return;
    }

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Mat src2, Mat dst)
    {

        divide_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void divide(double scale, Mat src2, Mat& dst, int dtype = -1)
    //

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param scale Scalar factor.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 * @param dtype Optional depth of the destination array. If it is
 * <code>-1</code>, <code>dst</code> will have depth <code>src2.depth()</code>.
 * In case of an array-by-array division, you can only pass <code>-1</code> when
 * <code>src1.depth()==src2.depth()</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(double scale, Mat src2, Mat dst, int dtype)
    {

        divide_3(scale, src2.nativeObj, dst.nativeObj, dtype);

        return;
    }

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param scale Scalar factor.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(double scale, Mat src2, Mat dst)
    {

        divide_4(scale, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void divide(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    //

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 * @param scale Scalar factor.
 * @param dtype Optional depth of the destination array. If it is
 * <code>-1</code>, <code>dst</code> will have depth <code>src2.depth()</code>.
 * In case of an array-by-array division, you can only pass <code>-1</code> when
 * <code>src1.depth()==src2.depth()</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Scalar src2, Mat dst, double scale, int dtype)
    {

        divide_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);

        return;
    }

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 * @param scale Scalar factor.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Scalar src2, Mat dst, double scale)
    {

        divide_6(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);

        return;
    }

/**
 * <p>Performs per-element division of two arrays or a scalar by an array.</p>
 *
 * <p>The functions <code>divide</code> divide one array by another:</p>
 *
 * <p><em>dst(I) = saturate(src1(I)*scale/src2(I))</em></p>
 *
 * <p>or a scalar by an array when there is no <code>src1</code> :</p>
 *
 * <p><em>dst(I) = saturate(scale/src2(I))</em></p>
 *
 * <p>When <code>src2(I)</code> is zero, <code>dst(I)</code> will also be zero.
 * Different channels of multi-channel arrays are processed independently.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src2</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#divide">org.opencv.core.Core.divide</a>
 * @see org.opencv.core.Core#multiply
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void divide(Mat src1, Scalar src2, Mat dst)
    {

        divide_7(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  bool eigen(Mat src, bool computeEigenvectors, Mat& eigenvalues, Mat& eigenvectors)
    //

/**
 * <p>Computes eigenvalues and eigenvectors of a symmetric matrix.</p>
 *
 * <p>The functions <code>eigen</code> compute just eigenvalues, or eigenvalues and
 * eigenvectors of the symmetric matrix <code>src</code> :</p>
 *
 * <p>Note: in the new and the old interfaces different ordering of eigenvalues and
 * eigenvectors parameters is used.</p>
 *
 * @param src Input matrix that must have <code>CV_32FC1</code> or
 * <code>CV_64FC1</code> type, square size and be symmetrical (<code>src</code>^"T"
 * == <code>src</code>).
 * @param computeEigenvectors a computeEigenvectors
 * @param eigenvalues Output vector of eigenvalues of the same type as
 * <code>src</code>. The eigenvalues are stored in the descending order.
 * @param eigenvectors Output matrix of eigenvectors. It has the same size and
 * type as <code>src</code>. The eigenvectors are stored as subsequent matrix
 * rows, in the same order as the corresponding eigenvalues.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#eigen">org.opencv.core.Core.eigen</a>
 * @see org.opencv.core.PCA
 * @see org.opencv.core.Core#completeSymm
 */
    public static boolean eigen(Mat src, boolean computeEigenvectors, Mat eigenvalues, Mat eigenvectors)
    {

        boolean retVal = eigen_0(src.nativeObj, computeEigenvectors, eigenvalues.nativeObj, eigenvectors.nativeObj);

        return retVal;
    }


    //
    // C++:  void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param center Center of the ellipse.
 * @param axes Length of the ellipse axes.
 * @param angle Ellipse rotation angle in degrees.
 * @param startAngle Starting angle of the elliptic arc in degrees.
 * @param endAngle Ending angle of the elliptic arc in degrees.
 * @param color Ellipse color.
 * @param thickness Thickness of the ellipse arc outline, if positive.
 * Otherwise, this indicates that a filled ellipse sector is to be drawn.
 * @param lineType Type of the ellipse boundary. See the "line" description.
 * @param shift Number of fractional bits in the coordinates of the center and
 * values of axes.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness, int lineType, int shift)
    {

        ellipse_0(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);

        return;
    }

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param center Center of the ellipse.
 * @param axes Length of the ellipse axes.
 * @param angle Ellipse rotation angle in degrees.
 * @param startAngle Starting angle of the elliptic arc in degrees.
 * @param endAngle Ending angle of the elliptic arc in degrees.
 * @param color Ellipse color.
 * @param thickness Thickness of the ellipse arc outline, if positive.
 * Otherwise, this indicates that a filled ellipse sector is to be drawn.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness)
    {

        ellipse_1(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param center Center of the ellipse.
 * @param axes Length of the ellipse axes.
 * @param angle Ellipse rotation angle in degrees.
 * @param startAngle Starting angle of the elliptic arc in degrees.
 * @param endAngle Ending angle of the elliptic arc in degrees.
 * @param color Ellipse color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color)
    {

        ellipse_2(img.nativeObj, center.x, center.y, axes.width, axes.height, angle, startAngle, endAngle, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void ellipse(Mat img, RotatedRect box, Scalar color, int thickness = 1, int lineType = 8)
    //

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param box Alternative ellipse representation via "RotatedRect" or
 * <code>CvBox2D</code>. This means that the function draws an ellipse inscribed
 * in the rotated rectangle.
 * @param color Ellipse color.
 * @param thickness Thickness of the ellipse arc outline, if positive.
 * Otherwise, this indicates that a filled ellipse sector is to be drawn.
 * @param lineType Type of the ellipse boundary. See the "line" description.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness, int lineType)
    {

        ellipse_3(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType);

        return;
    }

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param box Alternative ellipse representation via "RotatedRect" or
 * <code>CvBox2D</code>. This means that the function draws an ellipse inscribed
 * in the rotated rectangle.
 * @param color Ellipse color.
 * @param thickness Thickness of the ellipse arc outline, if positive.
 * Otherwise, this indicates that a filled ellipse sector is to be drawn.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, RotatedRect box, Scalar color, int thickness)
    {

        ellipse_4(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a simple or thick elliptic arc or fills an ellipse sector.</p>
 *
 * <p>The functions <code>ellipse</code> with less parameters draw an ellipse
 * outline, a filled ellipse, an elliptic arc, or a filled ellipse sector.
 * A piecewise-linear curve is used to approximate the elliptic arc boundary. If
 * you need more control of the ellipse rendering, you can retrieve the curve
 * using "ellipse2Poly" and then render it with "polylines" or fill it with
 * "fillPoly". If you use the first variant of the function and want to draw the
 * whole ellipse, not an arc, pass <code>startAngle=0</code> and
 * <code>endAngle=360</code>. The figure below explains the meaning of the
 * parameters.
 * Figure 1. Parameters of Elliptic Arc</p>
 *
 * @param img Image.
 * @param box Alternative ellipse representation via "RotatedRect" or
 * <code>CvBox2D</code>. This means that the function draws an ellipse inscribed
 * in the rotated rectangle.
 * @param color Ellipse color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse">org.opencv.core.Core.ellipse</a>
 */
    public static void ellipse(Mat img, RotatedRect box, Scalar color)
    {

        ellipse_5(img.nativeObj, box.center.x, box.center.y, box.size.width, box.size.height, box.angle, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, vector_Point& pts)
    //

/**
 * <p>Approximates an elliptic arc with a polyline.</p>
 *
 * <p>The function <code>ellipse2Poly</code> computes the vertices of a polyline
 * that approximates the specified elliptic arc. It is used by "ellipse".</p>
 *
 * @param center Center of the arc.
 * @param axes Half-sizes of the arc. See the "ellipse" for details.
 * @param angle Rotation angle of the ellipse in degrees. See the "ellipse" for
 * details.
 * @param arcStart Starting angle of the elliptic arc in degrees.
 * @param arcEnd Ending angle of the elliptic arc in degrees.
 * @param delta Angle between the subsequent polyline vertices. It defines the
 * approximation accuracy.
 * @param pts Output vector of polyline vertices.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#ellipse2poly">org.opencv.core.Core.ellipse2Poly</a>
 */
    public static void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, MatOfPoint pts)
    {
        Mat pts_mat = pts;
        ellipse2Poly_0(center.x, center.y, axes.width, axes.height, angle, arcStart, arcEnd, delta, pts_mat.nativeObj);

        return;
    }


    //
    // C++:  void exp(Mat src, Mat& dst)
    //

/**
 * <p>Calculates the exponent of every array element.</p>
 *
 * <p>The function <code>exp</code> calculates the exponent of every element of the
 * input array:</p>
 *
 * <p><em>dst [I] = e^(src(I))</em></p>
 *
 * <p>The maximum relative error is about <code>7e-6</code> for single-precision
 * input and less than <code>1e-10</code> for double-precision input. Currently,
 * the function converts denormalized values to zeros on output. Special values
 * (NaN, Inf) are not handled.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#exp">org.opencv.core.Core.exp</a>
 * @see org.opencv.core.Core#log
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#pow
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#polarToCart
 * @see org.opencv.core.Core#phase
 */
    public static void exp(Mat src, Mat dst)
    {

        exp_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void extractChannel(Mat src, Mat& dst, int coi)
    //

    public static void extractChannel(Mat src, Mat dst, int coi)
    {

        extractChannel_0(src.nativeObj, dst.nativeObj, coi);

        return;
    }


    //
    // C++:  float fastAtan2(float y, float x)
    //

/**
 * <p>Calculates the angle of a 2D vector in degrees.</p>
 *
 * <p>The function <code>fastAtan2</code> calculates the full-range angle of an
 * input 2D vector. The angle is measured in degrees and varies from 0 to 360
 * degrees. The accuracy is about 0.3 degrees.</p>
 *
 * @param y y-coordinate of the vector.
 * @param x x-coordinate of the vector.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/utility_and_system_functions_and_macros.html#fastatan2">org.opencv.core.Core.fastAtan2</a>
 */
    public static float fastAtan2(float y, float x)
    {

        float retVal = fastAtan2_0(y, x);

        return retVal;
    }


    //
    // C++:  void fillConvexPoly(Mat& img, vector_Point points, Scalar color, int lineType = 8, int shift = 0)
    //

/**
 * <p>Fills a convex polygon.</p>
 *
 * <p>The function <code>fillConvexPoly</code> draws a filled convex polygon.
 * This function is much faster than the function <code>fillPoly</code>. It can
 * fill not only convex polygons but any monotonic polygon without
 * self-intersections, that is, a polygon whose contour intersects every
 * horizontal line (scan line) twice at the most (though, its top-most and/or
 * the bottom edge could be horizontal).</p>
 *
 * @param img Image.
 * @param points a points
 * @param color Polygon color.
 * @param lineType Type of the polygon boundaries. See the "line" description.
 * @param shift Number of fractional bits in the vertex coordinates.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#fillconvexpoly">org.opencv.core.Core.fillConvexPoly</a>
 */
    public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color, int lineType, int shift)
    {
        Mat points_mat = points;
        fillConvexPoly_0(img.nativeObj, points_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift);

        return;
    }

/**
 * <p>Fills a convex polygon.</p>
 *
 * <p>The function <code>fillConvexPoly</code> draws a filled convex polygon.
 * This function is much faster than the function <code>fillPoly</code>. It can
 * fill not only convex polygons but any monotonic polygon without
 * self-intersections, that is, a polygon whose contour intersects every
 * horizontal line (scan line) twice at the most (though, its top-most and/or
 * the bottom edge could be horizontal).</p>
 *
 * @param img Image.
 * @param points a points
 * @param color Polygon color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#fillconvexpoly">org.opencv.core.Core.fillConvexPoly</a>
 */
    public static void fillConvexPoly(Mat img, MatOfPoint points, Scalar color)
    {
        Mat points_mat = points;
        fillConvexPoly_1(img.nativeObj, points_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void fillPoly(Mat& img, vector_vector_Point pts, Scalar color, int lineType = 8, int shift = 0, Point offset = Point())
    //

/**
 * <p>Fills the area bounded by one or more polygons.</p>
 *
 * <p>The function <code>fillPoly</code> fills an area bounded by several polygonal
 * contours. The function can fill complex areas, for example, areas with holes,
 * contours with self-intersections (some of their parts), and so forth.</p>
 *
 * @param img Image.
 * @param pts Array of polygons where each polygon is represented as an array of
 * points.
 * @param color Polygon color.
 * @param lineType Type of the polygon boundaries. See the "line" description.
 * @param shift Number of fractional bits in the vertex coordinates.
 * @param offset Optional offset of all points of the contours.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#fillpoly">org.opencv.core.Core.fillPoly</a>
 */
    public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color, int lineType, int shift, Point offset)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        fillPoly_0(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3], lineType, shift, offset.x, offset.y);

        return;
    }

/**
 * <p>Fills the area bounded by one or more polygons.</p>
 *
 * <p>The function <code>fillPoly</code> fills an area bounded by several polygonal
 * contours. The function can fill complex areas, for example, areas with holes,
 * contours with self-intersections (some of their parts), and so forth.</p>
 *
 * @param img Image.
 * @param pts Array of polygons where each polygon is represented as an array of
 * points.
 * @param color Polygon color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#fillpoly">org.opencv.core.Core.fillPoly</a>
 */
    public static void fillPoly(Mat img, List<MatOfPoint> pts, Scalar color)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        fillPoly_1(img.nativeObj, pts_mat.nativeObj, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void flip(Mat src, Mat& dst, int flipCode)
    //

/**
 * <p>Flips a 2D array around vertical, horizontal, or both axes.</p>
 *
 * <p>The function <code>flip</code> flips the array in one of three different ways
 * (row and column indices are 0-based):</p>
 *
 * <p><em>dst _(ij) =
 * <= ft(</p>
 *
 * <p>src _(src.rows-i-1,j) if flipCode = 0</p>
 *
 * <p>src _(i, src.cols -j-1) if flipCode > 0</p>
 *
 * <p>src _(src.rows -i-1, src.cols -j-1) if flipCode < 0</p>
 *
 *
 * <p>right.</em></p>
 *
 * <p>The example scenarios of using the function are the following:</p>
 * <ul>
 *   <li> Vertical flipping of the image (<code>flipCode == 0</code>) to switch
 * between top-left and bottom-left image origin. This is a typical operation in
 * video processing on Microsoft Windows* OS.
 *   <li> Horizontal flipping of the image with the subsequent horizontal shift
 * and absolute difference calculation to check for a vertical-axis symmetry
 * (<code>flipCode > 0</code>).
 *   <li> Simultaneous horizontal and vertical flipping of the image with the
 * subsequent shift and absolute difference calculation to check for a central
 * symmetry (<code>flipCode < 0</code>).
 *   <li> Reversing the order of point arrays (<code>flipCode > 0</code> or
 * <code>flipCode == 0</code>).
 * </ul>
 *
 * @param src Source array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 * @param flipCode Flag to specify how to flip the array. 0 means flipping
 * around the x-axis. Positive value (for example, 1) means flipping around
 * y-axis. Negative value (for example, -1) means flipping around both axes. See
 * the discussion below for the formulas.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#flip">org.opencv.core.Core.flip</a>
 * @see org.opencv.core.Core#repeat
 * @see org.opencv.core.Core#transpose
 * @see org.opencv.core.Core#completeSymm
 */
    public static void flip(Mat src, Mat dst, int flipCode)
    {

        flip_0(src.nativeObj, dst.nativeObj, flipCode);

        return;
    }


    //
    // C++:  void gemm(Mat src1, Mat src2, double alpha, Mat src3, double gamma, Mat& dst, int flags = 0)
    //

/**
 * <p>Performs generalized matrix multiplication.</p>
 *
 * <p>The function performs generalized matrix multiplication similar to the
 * <code>gemm</code> functions in BLAS level 3. For example, <code>gemm(src1,
 * src2, alpha, src3, beta, dst, GEMM_1_T + GEMM_3_T)</code> corresponds to</p>
 *
 * <p><em>dst = alpha * src1 ^T * src2 + beta * src3 ^T</em></p>
 *
 * <p>The function can be replaced with a matrix expression. For example, the above
 * call can be replaced with:</p>
 *
 * @param src1 First multiplied input matrix that should have <code>CV_32FC1</code>,
 * <code>CV_64FC1</code>, <code>CV_32FC2</code>, or <code>CV_64FC2</code> type.
 * @param src2 Second multiplied input matrix of the same type as
 * <code>src1</code>.
 * @param alpha Weight of the matrix product.
 * @param src3 Third optional delta matrix added to the matrix product. It
 * should have the same type as <code>src1</code> and <code>src2</code>.
 * @param gamma a gamma
 * @param dst Destination matrix. It has the proper size and the same type as
 * input matrices.
 * @param flags Operation flags:
 * <ul>
 *   <li> GEMM_1_T transpose <code>src1</code>
 *   <li> GEMM_2_T transpose <code>src2</code>
 *   <li> GEMM_3_T transpose <code>src3</code>
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#gemm">org.opencv.core.Core.gemm</a>
 * @see org.opencv.core.Core#mulTransposed
 * @see org.opencv.core.Core#transform
 * @see MatrixExpressions
 */
    public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double gamma, Mat dst, int flags)
    {

        gemm_0(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, gamma, dst.nativeObj, flags);

        return;
    }

/**
 * <p>Performs generalized matrix multiplication.</p>
 *
 * <p>The function performs generalized matrix multiplication similar to the
 * <code>gemm</code> functions in BLAS level 3. For example, <code>gemm(src1,
 * src2, alpha, src3, beta, dst, GEMM_1_T + GEMM_3_T)</code> corresponds to</p>
 *
 * <p><em>dst = alpha * src1 ^T * src2 + beta * src3 ^T</em></p>
 *
 * <p>The function can be replaced with a matrix expression. For example, the above
 * call can be replaced with:</p>
 *
 * @param src1 First multiplied input matrix that should have <code>CV_32FC1</code>,
 * <code>CV_64FC1</code>, <code>CV_32FC2</code>, or <code>CV_64FC2</code> type.
 * @param src2 Second multiplied input matrix of the same type as
 * <code>src1</code>.
 * @param alpha Weight of the matrix product.
 * @param src3 Third optional delta matrix added to the matrix product. It
 * should have the same type as <code>src1</code> and <code>src2</code>.
 * @param gamma a gamma
 * @param dst Destination matrix. It has the proper size and the same type as
 * input matrices.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#gemm">org.opencv.core.Core.gemm</a>
 * @see org.opencv.core.Core#mulTransposed
 * @see org.opencv.core.Core#transform
 * @see MatrixExpressions
 */
    public static void gemm(Mat src1, Mat src2, double alpha, Mat src3, double gamma, Mat dst)
    {

        gemm_1(src1.nativeObj, src2.nativeObj, alpha, src3.nativeObj, gamma, dst.nativeObj);

        return;
    }


    //
    // C++:  string getBuildInformation()
    //

    public static String getBuildInformation()
    {

        String retVal = getBuildInformation_0();

        return retVal;
    }


    //
    // C++:  int64 getCPUTickCount()
    //

/**
 * <p>Returns the number of CPU ticks.</p>
 *
 * <p>The function returns the current number of CPU ticks on some architectures
 * (such as x86, x64, PowerPC). On other platforms the function is equivalent to
 * <code>getTickCount</code>. It can also be used for very accurate time
 * measurements, as well as for RNG initialization. Note that in case of
 * multi-CPU systems a thread, from which <code>getCPUTickCount</code> is
 * called, can be suspended and resumed at another CPU with its own counter. So,
 * theoretically (and practically) the subsequent calls to the function do not
 * necessary return the monotonously increasing values. Also, since a modern CPU
 * varies the CPU frequency depending on the load, the number of CPU clocks
 * spent in some code cannot be directly converted to time units. Therefore,
 * <code>getTickCount</code> is generally a preferable solution for measuring
 * execution time.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/utility_and_system_functions_and_macros.html#getcputickcount">org.opencv.core.Core.getCPUTickCount</a>
 */
    public static long getCPUTickCount()
    {

        long retVal = getCPUTickCount_0();

        return retVal;
    }


    //
    // C++:  int getNumberOfCPUs()
    //

    public static int getNumberOfCPUs()
    {

        int retVal = getNumberOfCPUs_0();

        return retVal;
    }


    //
    // C++:  int getOptimalDFTSize(int vecsize)
    //

/**
 * <p>Returns the optimal DFT size for a given vector size.</p>
 *
 * <p>DFT performance is not a monotonic function of a vector size. Therefore, when
 * you compute convolution of two arrays or perform the spectral analysis of an
 * array, it usually makes sense to pad the input data with zeros to get a bit
 * larger array that can be transformed much faster than the original one.
 * Arrays whose size is a power-of-two (2, 4, 8, 16, 32,...) are the fastest to
 * process. Though, the arrays whose size is a product of 2's, 3's, and 5's (for
 * example, 300 = 5*5*3*2*2) are also processed quite efficiently.</p>
 *
 * <p>The function <code>getOptimalDFTSize</code> returns the minimum number
 * <code>N</code> that is greater than or equal to <code>vecsize</code> so that
 * the DFT of a vector of size <code>N</code> can be computed efficiently. In
 * the current implementation <code>N</code> = 2^"p" * 3^"q" * 5^"r" for some
 * integer <code>p</code>, <code>q</code>, <code>r</code>.</p>
 *
 * <p>The function returns a negative number if <code>vecsize</code> is too large
 * (very close to <code>INT_MAX</code>).</p>
 *
 * <p>While the function cannot be used directly to estimate the optimal vector
 * size for DCT transform (since the current DCT implementation supports only
 * even-size vectors), it can be easily computed as <code>getOptimalDFTSize((vecsize+1)/2)*2</code>.</p>
 *
 * @param vecsize Vector size.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#getoptimaldftsize">org.opencv.core.Core.getOptimalDFTSize</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#dct
 * @see org.opencv.core.Core#idct
 * @see org.opencv.core.Core#mulSpectrums
 * @see org.opencv.core.Core#idft
 */
    public static int getOptimalDFTSize(int vecsize)
    {

        int retVal = getOptimalDFTSize_0(vecsize);

        return retVal;
    }


    //
    // C++:  int64 getTickCount()
    //

/**
 * <p>Returns the number of ticks.</p>
 *
 * <p>The function returns the number of ticks after the certain event (for
 * example, when the machine was turned on).
 * It can be used to initialize "RNG" or to measure a function execution time by
 * reading the tick count before and after the function call. See also the tick
 * frequency.</p>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/utility_and_system_functions_and_macros.html#gettickcount">org.opencv.core.Core.getTickCount</a>
 */
    public static long getTickCount()
    {

        long retVal = getTickCount_0();

        return retVal;
    }


    //
    // C++:  double getTickFrequency()
    //

/**
 * <p>Returns the number of ticks per second.</p>
 *
 * <p>The function returns the number of ticks per second.
 * That is, the following code computes the execution time in seconds:</p>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/utility_and_system_functions_and_macros.html#gettickfrequency">org.opencv.core.Core.getTickFrequency</a>
 */
    public static double getTickFrequency()
    {

        double retVal = getTickFrequency_0();

        return retVal;
    }


    //
    // C++:  void hconcat(vector_Mat src, Mat& dst)
    //

    public static void hconcat(List<Mat> src, Mat dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        hconcat_0(src_mat.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void idct(Mat src, Mat& dst, int flags = 0)
    //

/**
 * <p>Computes the inverse Discrete Cosine Transform of a 1D or 2D array.</p>
 *
 * <p><code>idct(src, dst, flags)</code> is equivalent to <code>dct(src, dst, flags
 * | DCT_INVERSE)</code>.</p>
 *
 * @param src Source floating-point single-channel array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 * @param flags Operation flags.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#idct">org.opencv.core.Core.idct</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#dct
 * @see org.opencv.core.Core#getOptimalDFTSize
 * @see org.opencv.core.Core#idft
 */
    public static void idct(Mat src, Mat dst, int flags)
    {

        idct_0(src.nativeObj, dst.nativeObj, flags);

        return;
    }

/**
 * <p>Computes the inverse Discrete Cosine Transform of a 1D or 2D array.</p>
 *
 * <p><code>idct(src, dst, flags)</code> is equivalent to <code>dct(src, dst, flags
 * | DCT_INVERSE)</code>.</p>
 *
 * @param src Source floating-point single-channel array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#idct">org.opencv.core.Core.idct</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#dct
 * @see org.opencv.core.Core#getOptimalDFTSize
 * @see org.opencv.core.Core#idft
 */
    public static void idct(Mat src, Mat dst)
    {

        idct_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void idft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    //

/**
 * <p>Computes the inverse Discrete Fourier Transform of a 1D or 2D array.</p>
 *
 * <p><code>idft(src, dst, flags)</code> is equivalent to <code>dft(src, dst, flags
 * | DFT_INVERSE)</code>.</p>
 *
 * <p>See "dft" for details.</p>
 *
 * <p>Note: None of <code>dft</code> and <code>idft</code> scales the result by
 * default. So, you should pass <code>DFT_SCALE</code> to one of
 * <code>dft</code> or <code>idft</code> explicitly to make these transforms
 * mutually inverse.</p>
 *
 * @param src Source floating-point real or complex array.
 * @param dst Destination array whose size and type depend on the
 * <code>flags</code>.
 * @param flags Operation flags. See "dft".
 * @param nonzeroRows Number of <code>dst</code> rows to compute. The rest of
 * the rows have undefined content. See the convolution sample in "dft"
 * description.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#idft">org.opencv.core.Core.idft</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#dct
 * @see org.opencv.core.Core#getOptimalDFTSize
 * @see org.opencv.core.Core#idct
 * @see org.opencv.core.Core#mulSpectrums
 */
    public static void idft(Mat src, Mat dst, int flags, int nonzeroRows)
    {

        idft_0(src.nativeObj, dst.nativeObj, flags, nonzeroRows);

        return;
    }

/**
 * <p>Computes the inverse Discrete Fourier Transform of a 1D or 2D array.</p>
 *
 * <p><code>idft(src, dst, flags)</code> is equivalent to <code>dft(src, dst, flags
 * | DFT_INVERSE)</code>.</p>
 *
 * <p>See "dft" for details.</p>
 *
 * <p>Note: None of <code>dft</code> and <code>idft</code> scales the result by
 * default. So, you should pass <code>DFT_SCALE</code> to one of
 * <code>dft</code> or <code>idft</code> explicitly to make these transforms
 * mutually inverse.</p>
 *
 * @param src Source floating-point real or complex array.
 * @param dst Destination array whose size and type depend on the
 * <code>flags</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#idft">org.opencv.core.Core.idft</a>
 * @see org.opencv.core.Core#dft
 * @see org.opencv.core.Core#dct
 * @see org.opencv.core.Core#getOptimalDFTSize
 * @see org.opencv.core.Core#idct
 * @see org.opencv.core.Core#mulSpectrums
 */
    public static void idft(Mat src, Mat dst)
    {

        idft_1(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat& dst)
    //

/**
 * <p>Checks if array elements lie between the elements of two other arrays.</p>
 *
 * <p>The function checks the range as follows:</p>
 * <ul>
 *   <li> For every element of a single-channel input array:
 * </ul>
 *
 * <p><em>dst(I)= lowerb(I)_0 <= src(I)_0 <= upperb(I)_0</em></p>
 *
 * <ul>
 *   <li> For two-channel arrays:
 * </ul>
 *
 * <p><em>dst(I)= lowerb(I)_0 <= src(I)_0 <= upperb(I)_0 land lowerb(I)_1 <=
 * src(I)_1 <= upperb(I)_1</em></p>
 *
 * <ul>
 *   <li> and so forth.
 * </ul>
 *
 * <p>That is, <code>dst</code> (I) is set to 255 (all <code>1</code> -bits) if
 * <code>src</code> (I) is within the specified 1D, 2D, 3D,... box and 0
 * otherwise.</p>
 *
 * <p>When the lower and/or upper boundary parameters are scalars, the indexes
 * <code>(I)</code> at <code>lowerb</code> and <code>upperb</code> in the above
 * formulas should be omitted.</p>
 *
 * @param src First source array.
 * @param lowerb Inclusive lower boundary array or a scalar.
 * @param upperb Inclusive upper boundary array or a scalar.
 * @param dst Destination array of the same size as <code>src</code> and
 * <code>CV_8U</code> type.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#inrange">org.opencv.core.Core.inRange</a>
 */
    public static void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat dst)
    {

        inRange_0(src.nativeObj, lowerb.val[0], lowerb.val[1], lowerb.val[2], lowerb.val[3], upperb.val[0], upperb.val[1], upperb.val[2], upperb.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  void insertChannel(Mat src, Mat& dst, int coi)
    //

    public static void insertChannel(Mat src, Mat dst, int coi)
    {

        insertChannel_0(src.nativeObj, dst.nativeObj, coi);

        return;
    }


    //
    // C++:  double invert(Mat src, Mat& dst, int flags = DECOMP_LU)
    //

/**
 * <p>Finds the inverse or pseudo-inverse of a matrix.</p>
 *
 * <p>The function <code>invert</code> inverts the matrix <code>src</code> and
 * stores the result in <code>dst</code>.
 * When the matrix <code>src</code> is singular or non-square, the function
 * computes the pseudo-inverse matrix (the <code>dst</code> matrix) so that
 * <code>norm(src*dst - I)</code> is minimal, where I is an identity matrix.</p>
 *
 * <p>In case of the <code>DECOMP_LU</code> method, the function returns non-zero
 * value if the inverse has been successfully computed and 0 if <code>src</code>
 * is singular.</p>
 *
 * <p>In case of the <code>DECOMP_SVD</code> method, the function returns the
 * inverse condition number of <code>src</code> (the ratio of the smallest
 * singular value to the largest singular value) and 0 if <code>src</code> is
 * singular. The SVD method calculates a pseudo-inverse matrix if
 * <code>src</code> is singular.</p>
 *
 * <p>Similarly to <code>DECOMP_LU</code>, the method <code>DECOMP_CHOLESKY</code>
 * works only with non-singular square matrices that should also be symmetrical
 * and positively defined. In this case, the function stores the inverted matrix
 * in <code>dst</code> and returns non-zero. Otherwise, it returns 0.</p>
 *
 * @param src Source floating-point <code>M x N</code> matrix.
 * @param dst Destination matrix of <code>N x M</code> size and the same type as
 * <code>src</code>.
 * @param flags Inversion method :
 * <ul>
 *   <li> DECOMP_LU Gaussian elimination with the optimal pivot element chosen.
 *   <li> DECOMP_SVD Singular value decomposition (SVD) method.
 *   <li> DECOMP_CHOLESKY Cholesky decomposition. The matrix must be symmetrical
 * and positively defined.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#invert">org.opencv.core.Core.invert</a>
 * @see org.opencv.core.SVD
 * @see org.opencv.core.Core#solve
 */
    public static double invert(Mat src, Mat dst, int flags)
    {

        double retVal = invert_0(src.nativeObj, dst.nativeObj, flags);

        return retVal;
    }

/**
 * <p>Finds the inverse or pseudo-inverse of a matrix.</p>
 *
 * <p>The function <code>invert</code> inverts the matrix <code>src</code> and
 * stores the result in <code>dst</code>.
 * When the matrix <code>src</code> is singular or non-square, the function
 * computes the pseudo-inverse matrix (the <code>dst</code> matrix) so that
 * <code>norm(src*dst - I)</code> is minimal, where I is an identity matrix.</p>
 *
 * <p>In case of the <code>DECOMP_LU</code> method, the function returns non-zero
 * value if the inverse has been successfully computed and 0 if <code>src</code>
 * is singular.</p>
 *
 * <p>In case of the <code>DECOMP_SVD</code> method, the function returns the
 * inverse condition number of <code>src</code> (the ratio of the smallest
 * singular value to the largest singular value) and 0 if <code>src</code> is
 * singular. The SVD method calculates a pseudo-inverse matrix if
 * <code>src</code> is singular.</p>
 *
 * <p>Similarly to <code>DECOMP_LU</code>, the method <code>DECOMP_CHOLESKY</code>
 * works only with non-singular square matrices that should also be symmetrical
 * and positively defined. In this case, the function stores the inverted matrix
 * in <code>dst</code> and returns non-zero. Otherwise, it returns 0.</p>
 *
 * @param src Source floating-point <code>M x N</code> matrix.
 * @param dst Destination matrix of <code>N x M</code> size and the same type as
 * <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#invert">org.opencv.core.Core.invert</a>
 * @see org.opencv.core.SVD
 * @see org.opencv.core.Core#solve
 */
    public static double invert(Mat src, Mat dst)
    {

        double retVal = invert_1(src.nativeObj, dst.nativeObj);

        return retVal;
    }


    //
    // C++:  double kmeans(Mat data, int K, Mat& bestLabels, TermCriteria criteria, int attempts, int flags, Mat& centers = Mat())
    //

/**
 * <p>Finds centers of clusters and groups input samples around the clusters.</p>
 *
 * <p>The function <code>kmeans</code> implements a k-means algorithm that finds
 * the centers of <code>cluster_count</code> clusters and groups the input
 * samples around the clusters. As an output, <em>labels_i</em> contains a
 * 0-based cluster index for the sample stored in the <em>i^(th)</em> row of the
 * <code>samples</code> matrix.</p>
 *
 * <p>The function returns the compactness measure that is computed as</p>
 *
 * <p><em>sum _i|samples _i - centers _(labels _i)| ^2</em></p>
 *
 * <p>after every attempt. The best (minimum) value is chosen and the corresponding
 * labels and the compactness value are returned by the function.
 * Basically, you can use only the core of the function, set the number of
 * attempts to 1, initialize labels each time using a custom algorithm, pass
 * them with the (<code>flags</code> = <code>KMEANS_USE_INITIAL_LABELS</code>)
 * flag, and then choose the best (most-compact) clustering.</p>
 *
 * @param data a data
 * @param K a K
 * @param bestLabels a bestLabels
 * @param criteria The algorithm termination criteria, that is, the maximum
 * number of iterations and/or the desired accuracy. The accuracy is specified
 * as <code>criteria.epsilon</code>. As soon as each of the cluster centers
 * moves by less than <code>criteria.epsilon</code> on some iteration, the
 * algorithm stops.
 * @param attempts Flag to specify the number of times the algorithm is executed
 * using different initial labellings. The algorithm returns the labels that
 * yield the best compactness (see the last function parameter).
 * @param flags Flag that can take the following values:
 * <ul>
 *   <li> KMEANS_RANDOM_CENTERS Select random initial centers in each attempt.
 *   <li> KMEANS_PP_CENTERS Use <code>kmeans++</code> center initialization by
 * Arthur and Vassilvitskii [Arthur2007].
 *   <li> KMEANS_USE_INITIAL_LABELS During the first (and possibly the only)
 * attempt, use the user-supplied labels instead of computing them from the
 * initial centers. For the second and further attempts, use the random or
 * semi-random centers. Use one of <code>KMEANS_*_CENTERS</code> flag to specify
 * the exact method.
 * </ul>
 * @param centers Output matrix of the cluster centers, one row per each cluster
 * center.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/clustering.html#kmeans">org.opencv.core.Core.kmeans</a>
 */
    public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags, Mat centers)
    {

        double retVal = kmeans_0(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags, centers.nativeObj);

        return retVal;
    }

/**
 * <p>Finds centers of clusters and groups input samples around the clusters.</p>
 *
 * <p>The function <code>kmeans</code> implements a k-means algorithm that finds
 * the centers of <code>cluster_count</code> clusters and groups the input
 * samples around the clusters. As an output, <em>labels_i</em> contains a
 * 0-based cluster index for the sample stored in the <em>i^(th)</em> row of the
 * <code>samples</code> matrix.</p>
 *
 * <p>The function returns the compactness measure that is computed as</p>
 *
 * <p><em>sum _i|samples _i - centers _(labels _i)| ^2</em></p>
 *
 * <p>after every attempt. The best (minimum) value is chosen and the corresponding
 * labels and the compactness value are returned by the function.
 * Basically, you can use only the core of the function, set the number of
 * attempts to 1, initialize labels each time using a custom algorithm, pass
 * them with the (<code>flags</code> = <code>KMEANS_USE_INITIAL_LABELS</code>)
 * flag, and then choose the best (most-compact) clustering.</p>
 *
 * @param data a data
 * @param K a K
 * @param bestLabels a bestLabels
 * @param criteria The algorithm termination criteria, that is, the maximum
 * number of iterations and/or the desired accuracy. The accuracy is specified
 * as <code>criteria.epsilon</code>. As soon as each of the cluster centers
 * moves by less than <code>criteria.epsilon</code> on some iteration, the
 * algorithm stops.
 * @param attempts Flag to specify the number of times the algorithm is executed
 * using different initial labellings. The algorithm returns the labels that
 * yield the best compactness (see the last function parameter).
 * @param flags Flag that can take the following values:
 * <ul>
 *   <li> KMEANS_RANDOM_CENTERS Select random initial centers in each attempt.
 *   <li> KMEANS_PP_CENTERS Use <code>kmeans++</code> center initialization by
 * Arthur and Vassilvitskii [Arthur2007].
 *   <li> KMEANS_USE_INITIAL_LABELS During the first (and possibly the only)
 * attempt, use the user-supplied labels instead of computing them from the
 * initial centers. For the second and further attempts, use the random or
 * semi-random centers. Use one of <code>KMEANS_*_CENTERS</code> flag to specify
 * the exact method.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/clustering.html#kmeans">org.opencv.core.Core.kmeans</a>
 */
    public static double kmeans(Mat data, int K, Mat bestLabels, TermCriteria criteria, int attempts, int flags)
    {

        double retVal = kmeans_1(data.nativeObj, K, bestLabels.nativeObj, criteria.type, criteria.maxCount, criteria.epsilon, attempts, flags);

        return retVal;
    }


    //
    // C++:  void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

/**
 * <p>Draws a line segment connecting two points.</p>
 *
 * <p>The function <code>line</code> draws the line segment between
 * <code>pt1</code> and <code>pt2</code> points in the image. The line is
 * clipped by the image boundaries. For non-antialiased lines with integer
 * coordinates, the 8-connected or 4-connected Bresenham algorithm is used.
 * Thick lines are drawn with rounding endings.
 * Antialiased lines are drawn using Gaussian filtering. To specify the line
 * color, you may use the macro <code>CV_RGB(r, g, b)</code>.</p>
 *
 * @param img Image.
 * @param pt1 First point of the line segment.
 * @param pt2 Second point of the line segment.
 * @param color Line color.
 * @param thickness Line thickness.
 * @param lineType Type of the line:
 * <ul>
 *   <li> 8 (or omitted) - 8-connected line.
 *   <li> 4 - 4-connected line.
 *   <li> CV_AA - antialiased line.
 * </ul>
 * @param shift Number of fractional bits in the point coordinates.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#line">org.opencv.core.Core.line</a>
 */
    public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift)
    {

        line_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);

        return;
    }

/**
 * <p>Draws a line segment connecting two points.</p>
 *
 * <p>The function <code>line</code> draws the line segment between
 * <code>pt1</code> and <code>pt2</code> points in the image. The line is
 * clipped by the image boundaries. For non-antialiased lines with integer
 * coordinates, the 8-connected or 4-connected Bresenham algorithm is used.
 * Thick lines are drawn with rounding endings.
 * Antialiased lines are drawn using Gaussian filtering. To specify the line
 * color, you may use the macro <code>CV_RGB(r, g, b)</code>.</p>
 *
 * @param img Image.
 * @param pt1 First point of the line segment.
 * @param pt2 Second point of the line segment.
 * @param color Line color.
 * @param thickness Line thickness.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#line">org.opencv.core.Core.line</a>
 */
    public static void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness)
    {

        line_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a line segment connecting two points.</p>
 *
 * <p>The function <code>line</code> draws the line segment between
 * <code>pt1</code> and <code>pt2</code> points in the image. The line is
 * clipped by the image boundaries. For non-antialiased lines with integer
 * coordinates, the 8-connected or 4-connected Bresenham algorithm is used.
 * Thick lines are drawn with rounding endings.
 * Antialiased lines are drawn using Gaussian filtering. To specify the line
 * color, you may use the macro <code>CV_RGB(r, g, b)</code>.</p>
 *
 * @param img Image.
 * @param pt1 First point of the line segment.
 * @param pt2 Second point of the line segment.
 * @param color Line color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#line">org.opencv.core.Core.line</a>
 */
    public static void line(Mat img, Point pt1, Point pt2, Scalar color)
    {

        line_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void log(Mat src, Mat& dst)
    //

/**
 * <p>Calculates the natural logarithm of every array element.</p>
 *
 * <p>The function <code>log</code> calculates the natural logarithm of the
 * absolute value of every element of the input array:</p>
 *
 * <p><em>dst(I) = log|src(I)| if src(I) != 0 ; C otherwise</em></p>
 *
 * <p>where <code>C</code> is a large negative number (about -700 in the current
 * implementation).
 * The maximum relative error is about <code>7e-6</code> for single-precision
 * input and less than <code>1e-10</code> for double-precision input. Special
 * values (NaN, Inf) are not handled.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#log">org.opencv.core.Core.log</a>
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#pow
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#polarToCart
 * @see org.opencv.core.Core#exp
 * @see org.opencv.core.Core#phase
 */
    public static void log(Mat src, Mat dst)
    {

        log_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void magnitude(Mat x, Mat y, Mat& magnitude)
    //

/**
 * <p>Calculates the magnitude of 2D vectors.</p>
 *
 * <p>The function <code>magnitude</code> calculates the magnitude of 2D vectors
 * formed from the corresponding elements of <code>x</code> and <code>y</code>
 * arrays:</p>
 *
 * <p><em>dst(I) = sqrt(x(I)^2 + y(I)^2)</em></p>
 *
 * @param x Floating-point array of x-coordinates of the vectors.
 * @param y Floating-point array of y-coordinates of the vectors. It must have
 * the same size as <code>x</code>.
 * @param magnitude Destination array of the same size and type as
 * <code>x</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#magnitude">org.opencv.core.Core.magnitude</a>
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#phase
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#polarToCart
 */
    public static void magnitude(Mat x, Mat y, Mat magnitude)
    {

        magnitude_0(x.nativeObj, y.nativeObj, magnitude.nativeObj);

        return;
    }


    //
    // C++:  void max(Mat src1, Mat src2, Mat& dst)
    //

/**
 * <p>Calculates per-element maximum of two arrays or an array and a scalar.</p>
 *
 * <p>The functions <code>max</code> compute the per-element maximum of two arrays:</p>
 *
 * <p><em>dst(I)= max(src1(I), src2(I))</em></p>
 *
 * <p>or array and a scalar:</p>
 *
 * <p><em>dst(I)= max(src1(I), value)</em></p>
 *
 * <p>In the second variant, when the source array is multi-channel, each channel
 * is compared with <code>value</code> independently.</p>
 *
 * <p>The first 3 variants of the function listed above are actually a part of
 * "MatrixExpressions". They return an expression object that can be further
 * either transformed/ assigned to a matrix, or passed to a function, and so on.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#max">org.opencv.core.Core.max</a>
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#inRange
 * @see org.opencv.core.Core#minMaxLoc
 * @see MatrixExpressions
 * @see org.opencv.core.Core#min
 */
    public static void max(Mat src1, Mat src2, Mat dst)
    {

        max_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void max(Mat src1, Scalar src2, Mat& dst)
    //

/**
 * <p>Calculates per-element maximum of two arrays or an array and a scalar.</p>
 *
 * <p>The functions <code>max</code> compute the per-element maximum of two arrays:</p>
 *
 * <p><em>dst(I)= max(src1(I), src2(I))</em></p>
 *
 * <p>or array and a scalar:</p>
 *
 * <p><em>dst(I)= max(src1(I), value)</em></p>
 *
 * <p>In the second variant, when the source array is multi-channel, each channel
 * is compared with <code>value</code> independently.</p>
 *
 * <p>The first 3 variants of the function listed above are actually a part of
 * "MatrixExpressions". They return an expression object that can be further
 * either transformed/ assigned to a matrix, or passed to a function, and so on.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#max">org.opencv.core.Core.max</a>
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#inRange
 * @see org.opencv.core.Core#minMaxLoc
 * @see MatrixExpressions
 * @see org.opencv.core.Core#min
 */
    public static void max(Mat src1, Scalar src2, Mat dst)
    {

        max_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  Scalar mean(Mat src, Mat mask = Mat())
    //

/**
 * <p>Calculates an average (mean) of array elements.</p>
 *
 * <p>The function <code>mean</code> computes the mean value <code>M</code> of
 * array elements, independently for each channel, and return it:</p>
 *
 * <p><em>N = sum(by: I: mask(I) != 0) 1
 * M_c = (sum(by: I: mask(I) != 0)(mtx(I)_c))/N </em></p>
 *
 * <p>When all the mask elements are 0's, the functions return <code>Scalar.all(0)</code>.</p>
 *
 * @param src Source array that should have from 1 to 4 channels so that the
 * result can be stored in "Scalar_".
 * @param mask Optional operation mask.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mean">org.opencv.core.Core.mean</a>
 * @see org.opencv.core.Core#countNonZero
 * @see org.opencv.core.Core#meanStdDev
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#minMaxLoc
 */
    public static Scalar mean(Mat src, Mat mask)
    {

        Scalar retVal = new Scalar(mean_0(src.nativeObj, mask.nativeObj));

        return retVal;
    }

/**
 * <p>Calculates an average (mean) of array elements.</p>
 *
 * <p>The function <code>mean</code> computes the mean value <code>M</code> of
 * array elements, independently for each channel, and return it:</p>
 *
 * <p><em>N = sum(by: I: mask(I) != 0) 1
 * M_c = (sum(by: I: mask(I) != 0)(mtx(I)_c))/N </em></p>
 *
 * <p>When all the mask elements are 0's, the functions return <code>Scalar.all(0)</code>.</p>
 *
 * @param src Source array that should have from 1 to 4 channels so that the
 * result can be stored in "Scalar_".
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mean">org.opencv.core.Core.mean</a>
 * @see org.opencv.core.Core#countNonZero
 * @see org.opencv.core.Core#meanStdDev
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#minMaxLoc
 */
    public static Scalar mean(Mat src)
    {

        Scalar retVal = new Scalar(mean_1(src.nativeObj));

        return retVal;
    }


    //
    // C++:  void meanStdDev(Mat src, vector_double& mean, vector_double& stddev, Mat mask = Mat())
    //

/**
 * <p>Calculates a mean and standard deviation of array elements.</p>
 *
 * <p>The function <code>meanStdDev</code> computes the mean and the standard
 * deviation <code>M</code> of array elements independently for each channel and
 * returns it via the output parameters:</p>
 *
 * <p><em>N = sum(by: I, mask(I) != 0) 1
 * mean _c = (sum_(I: mask(I) != 0) src(I)_c)/(N)
 * stddev _c = sqrt((sum_(I: mask(I) != 0)(src(I)_c - mean _c)^2)/(N)) </em></p>
 *
 * <p>When all the mask elements are 0's, the functions return <code>mean=stddev=Scalar.all(0)</code>.</p>
 *
 * <p>Note: The computed standard deviation is only the diagonal of the complete
 * normalized covariance matrix. If the full matrix is needed, you can reshape
 * the multi-channel array <code>M x N</code> to the single-channel array
 * <code>M*N x mtx.channels()</code> (only possible when the matrix is
 * continuous) and then pass the matrix to "calcCovarMatrix".</p>
 *
 * @param src Source array that should have from 1 to 4 channels so that the
 * results can be stored in "Scalar_" 's.
 * @param mean Output parameter: computed mean value.
 * @param stddev Output parameter: computed standard deviation.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#meanstddev">org.opencv.core.Core.meanStdDev</a>
 * @see org.opencv.core.Core#countNonZero
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#minMaxLoc
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#mean
 */
    public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev, Mat mask)
    {
        Mat mean_mat = mean;
        Mat stddev_mat = stddev;
        meanStdDev_0(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates a mean and standard deviation of array elements.</p>
 *
 * <p>The function <code>meanStdDev</code> computes the mean and the standard
 * deviation <code>M</code> of array elements independently for each channel and
 * returns it via the output parameters:</p>
 *
 * <p><em>N = sum(by: I, mask(I) != 0) 1
 * mean _c = (sum_(I: mask(I) != 0) src(I)_c)/(N)
 * stddev _c = sqrt((sum_(I: mask(I) != 0)(src(I)_c - mean _c)^2)/(N)) </em></p>
 *
 * <p>When all the mask elements are 0's, the functions return <code>mean=stddev=Scalar.all(0)</code>.</p>
 *
 * <p>Note: The computed standard deviation is only the diagonal of the complete
 * normalized covariance matrix. If the full matrix is needed, you can reshape
 * the multi-channel array <code>M x N</code> to the single-channel array
 * <code>M*N x mtx.channels()</code> (only possible when the matrix is
 * continuous) and then pass the matrix to "calcCovarMatrix".</p>
 *
 * @param src Source array that should have from 1 to 4 channels so that the
 * results can be stored in "Scalar_" 's.
 * @param mean Output parameter: computed mean value.
 * @param stddev Output parameter: computed standard deviation.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#meanstddev">org.opencv.core.Core.meanStdDev</a>
 * @see org.opencv.core.Core#countNonZero
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#minMaxLoc
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#mean
 */
    public static void meanStdDev(Mat src, MatOfDouble mean, MatOfDouble stddev)
    {
        Mat mean_mat = mean;
        Mat stddev_mat = stddev;
        meanStdDev_1(src.nativeObj, mean_mat.nativeObj, stddev_mat.nativeObj);

        return;
    }


    //
    // C++:  void merge(vector_Mat mv, Mat& dst)
    //

/**
 * <p>Composes a multi-channel array from several single-channel arrays.</p>
 *
 * <p>The functions <code>merge</code> merge several arrays to make a single
 * multi-channel array. That is, each element of the output array will be a
 * concatenation of the elements of the input arrays, where elements of i-th
 * input array are treated as <code>mv[i].channels()</code>-element vectors.</p>
 *
 * <p>The function "split" does the reverse operation. If you need to shuffle
 * channels in some other advanced way, use "mixChannels".</p>
 *
 * @param mv Source array or vector of matrices to be merged. All the matrices
 * in <code>mv</code> must have the same size and the same depth.
 * @param dst Destination array of the same size and the same depth as
 * <code>mv[0]</code>. The number of channels will be the total number of
 * channels in the matrix array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#merge">org.opencv.core.Core.merge</a>
 * @see org.opencv.core.Mat#reshape
 * @see org.opencv.core.Core#mixChannels
 * @see org.opencv.core.Core#split
 */
    public static void merge(List<Mat> mv, Mat dst)
    {
        Mat mv_mat = Converters.vector_Mat_to_Mat(mv);
        merge_0(mv_mat.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void min(Mat src1, Mat src2, Mat& dst)
    //

/**
 * <p>Calculates per-element minimum of two arrays or array and a scalar.</p>
 *
 * <p>The functions <code>min</code> compute the per-element minimum of two arrays:</p>
 *
 * <p><em>dst(I)= min(src1(I), src2(I))</em></p>
 *
 * <p>or array and a scalar:</p>
 *
 * <p><em>dst(I)= min(src1(I), value)</em></p>
 *
 * <p>In the second variant, when the source array is multi-channel, each channel
 * is compared with <code>value</code> independently.</p>
 *
 * <p>The first three variants of the function listed above are actually a part of
 * "MatrixExpressions". They return the expression object that can be further
 * either transformed/assigned to a matrix, or passed to a function, and so on.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#min">org.opencv.core.Core.min</a>
 * @see org.opencv.core.Core#max
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#inRange
 * @see org.opencv.core.Core#minMaxLoc
 * @see MatrixExpressions
 */
    public static void min(Mat src1, Mat src2, Mat dst)
    {

        min_0(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void min(Mat src1, Scalar src2, Mat& dst)
    //

/**
 * <p>Calculates per-element minimum of two arrays or array and a scalar.</p>
 *
 * <p>The functions <code>min</code> compute the per-element minimum of two arrays:</p>
 *
 * <p><em>dst(I)= min(src1(I), src2(I))</em></p>
 *
 * <p>or array and a scalar:</p>
 *
 * <p><em>dst(I)= min(src1(I), value)</em></p>
 *
 * <p>In the second variant, when the source array is multi-channel, each channel
 * is compared with <code>value</code> independently.</p>
 *
 * <p>The first three variants of the function listed above are actually a part of
 * "MatrixExpressions". They return the expression object that can be further
 * either transformed/assigned to a matrix, or passed to a function, and so on.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#min">org.opencv.core.Core.min</a>
 * @see org.opencv.core.Core#max
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#inRange
 * @see org.opencv.core.Core#minMaxLoc
 * @see MatrixExpressions
 */
    public static void min(Mat src1, Scalar src2, Mat dst)
    {

        min_1(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  void mixChannels(vector_Mat src, vector_Mat dst, vector_int fromTo)
    //

/**
 * <p>Copies specified channels from input arrays to the specified channels of
 * output arrays.</p>
 *
 * <p>The functions <code>mixChannels</code> provide an advanced mechanism for
 * shuffling image channels.</p>
 *
 * <p>"split" and "merge" and some forms of "cvtColor" are partial cases of
 * <code>mixChannels</code>.</p>
 *
 * <p>In the example below, the code splits a 4-channel RGBA image into a 3-channel
 * BGR (with R and B channels swapped) and a separate alpha-channel image:</p>
 *
 * <p>Note: Unlike many other new-style C++ functions in OpenCV (see the
 * introduction section and "Mat.create"), <code>mixChannels</code> requires
 * the destination arrays to be pre-allocated before calling the function.</p>
 *
 * @param src Input array or vector of matrices. All the matrices must have the
 * same size and the same depth.
 * @param dst Output array or vector of matrices. All the matrices *must be
 * allocated*. Their size and depth must be the same as in <code>src[0]</code>.
 * @param fromTo Array of index pairs specifying which channels are copied and
 * where. <code>fromTo[k*2]</code> is a 0-based index of the input channel in
 * <code>src</code>. <code>fromTo[k*2+1]</code> is an index of the output
 * channel in <code>dst</code>. The continuous channel numbering is used: the
 * first input image channels are indexed from <code>0</code> to
 * <code>src[0].channels()-1</code>, the second input image channels are indexed
 * from <code>src[0].channels()</code> to <code>src[0].channels() +
 * src[1].channels()-1</code>, and so on. The same scheme is used for the output
 * image channels. As a special case, when <code>fromTo[k*2]</code> is negative,
 * the corresponding output channel is filled with zero.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mixchannels">org.opencv.core.Core.mixChannels</a>
 * @see org.opencv.core.Core#merge
 * @see org.opencv.core.Core#split
 * @see org.opencv.imgproc.Imgproc#cvtColor
 */
    public static void mixChannels(List<Mat> src, List<Mat> dst, MatOfInt fromTo)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        Mat dst_mat = Converters.vector_Mat_to_Mat(dst);
        Mat fromTo_mat = fromTo;
        mixChannels_0(src_mat.nativeObj, dst_mat.nativeObj, fromTo_mat.nativeObj);

        return;
    }


    //
    // C++:  void mulSpectrums(Mat a, Mat b, Mat& c, int flags, bool conjB = false)
    //

/**
 * <p>Performs the per-element multiplication of two Fourier spectrums.</p>
 *
 * <p>The function <code>mulSpectrums</code> performs the per-element
 * multiplication of the two CCS-packed or complex matrices that are results of
 * a real or complex Fourier transform.</p>
 *
 * <p>The function, together with "dft" and "idft", may be used to calculate
 * convolution (pass <code>conjB=false</code>) or correlation (pass
 * <code>conjB=true</code>) of two arrays rapidly. When the arrays are complex,
 * they are simply multiplied (per element) with an optional conjugation of the
 * second-array elements. When the arrays are real, they are assumed to be
 * CCS-packed (see "dft" for details).</p>
 *
 * @param a a a
 * @param b a b
 * @param c a c
 * @param flags Operation flags. Currently, the only supported flag is
 * <code>DFT_ROWS</code>, which indicates that each row of <code>src1</code> and
 * <code>src2</code> is an independent 1D Fourier spectrum.
 * @param conjB Optional flag that conjugates the second source array before the
 * multiplication (true) or not (false).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mulspectrums">org.opencv.core.Core.mulSpectrums</a>
 */
    public static void mulSpectrums(Mat a, Mat b, Mat c, int flags, boolean conjB)
    {

        mulSpectrums_0(a.nativeObj, b.nativeObj, c.nativeObj, flags, conjB);

        return;
    }

/**
 * <p>Performs the per-element multiplication of two Fourier spectrums.</p>
 *
 * <p>The function <code>mulSpectrums</code> performs the per-element
 * multiplication of the two CCS-packed or complex matrices that are results of
 * a real or complex Fourier transform.</p>
 *
 * <p>The function, together with "dft" and "idft", may be used to calculate
 * convolution (pass <code>conjB=false</code>) or correlation (pass
 * <code>conjB=true</code>) of two arrays rapidly. When the arrays are complex,
 * they are simply multiplied (per element) with an optional conjugation of the
 * second-array elements. When the arrays are real, they are assumed to be
 * CCS-packed (see "dft" for details).</p>
 *
 * @param a a a
 * @param b a b
 * @param c a c
 * @param flags Operation flags. Currently, the only supported flag is
 * <code>DFT_ROWS</code>, which indicates that each row of <code>src1</code> and
 * <code>src2</code> is an independent 1D Fourier spectrum.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#mulspectrums">org.opencv.core.Core.mulSpectrums</a>
 */
    public static void mulSpectrums(Mat a, Mat b, Mat c, int flags)
    {

        mulSpectrums_1(a.nativeObj, b.nativeObj, c.nativeObj, flags);

        return;
    }


    //
    // C++:  void mulTransposed(Mat src, Mat& dst, bool aTa, Mat delta = Mat(), double scale = 1, int dtype = -1)
    //

/**
 * <p>Calculates the product of a matrix and its transposition.</p>
 *
 * <p>The function <code>mulTransposed</code> calculates the product of
 * <code>src</code> and its transposition:</p>
 *
 * <p><em>dst = scale(src - delta)^T(src - delta)</em></p>
 *
 * <p>if <code>aTa=true</code>, and</p>
 *
 * <p><em>dst = scale(src - delta)(src - delta)^T</em></p>
 *
 * <p>otherwise. The function is used to compute the covariance matrix. With zero
 * delta, it can be used as a faster substitute for general matrix product
 * <code>A*B</code> when <code>B=A'</code></p>
 *
 * @param src Source single-channel matrix. Note that unlike "gemm", the
 * function can multiply not only floating-point matrices.
 * @param dst Destination square matrix.
 * @param aTa Flag specifying the multiplication ordering. See the description
 * below.
 * @param delta Optional delta matrix subtracted from <code>src</code> before
 * the multiplication. When the matrix is empty (<code>delta=noArray()</code>),
 * it is assumed to be zero, that is, nothing is subtracted. If it has the same
 * size as <code>src</code>, it is simply subtracted. Otherwise, it is
 * "repeated" (see "repeat") to cover the full <code>src</code> and then
 * subtracted. Type of the delta matrix, when it is not empty, must be the same
 * as the type of created destination matrix. See the <code>dtype</code>
 * parameter description below.
 * @param scale Optional scale factor for the matrix product.
 * @param dtype Optional type of the destination matrix. When it is negative,
 * the destination matrix will have the same type as <code>src</code>.
 * Otherwise, it will be <code>type=CV_MAT_DEPTH(dtype)</code> that should be
 * either <code>CV_32F</code> or <code>CV_64F</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multransposed">org.opencv.core.Core.mulTransposed</a>
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#repeat
 * @see org.opencv.core.Core#reduce
 * @see org.opencv.core.Core#gemm
 */
    public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale, int dtype)
    {

        mulTransposed_0(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale, dtype);

        return;
    }

/**
 * <p>Calculates the product of a matrix and its transposition.</p>
 *
 * <p>The function <code>mulTransposed</code> calculates the product of
 * <code>src</code> and its transposition:</p>
 *
 * <p><em>dst = scale(src - delta)^T(src - delta)</em></p>
 *
 * <p>if <code>aTa=true</code>, and</p>
 *
 * <p><em>dst = scale(src - delta)(src - delta)^T</em></p>
 *
 * <p>otherwise. The function is used to compute the covariance matrix. With zero
 * delta, it can be used as a faster substitute for general matrix product
 * <code>A*B</code> when <code>B=A'</code></p>
 *
 * @param src Source single-channel matrix. Note that unlike "gemm", the
 * function can multiply not only floating-point matrices.
 * @param dst Destination square matrix.
 * @param aTa Flag specifying the multiplication ordering. See the description
 * below.
 * @param delta Optional delta matrix subtracted from <code>src</code> before
 * the multiplication. When the matrix is empty (<code>delta=noArray()</code>),
 * it is assumed to be zero, that is, nothing is subtracted. If it has the same
 * size as <code>src</code>, it is simply subtracted. Otherwise, it is
 * "repeated" (see "repeat") to cover the full <code>src</code> and then
 * subtracted. Type of the delta matrix, when it is not empty, must be the same
 * as the type of created destination matrix. See the <code>dtype</code>
 * parameter description below.
 * @param scale Optional scale factor for the matrix product.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multransposed">org.opencv.core.Core.mulTransposed</a>
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#repeat
 * @see org.opencv.core.Core#reduce
 * @see org.opencv.core.Core#gemm
 */
    public static void mulTransposed(Mat src, Mat dst, boolean aTa, Mat delta, double scale)
    {

        mulTransposed_1(src.nativeObj, dst.nativeObj, aTa, delta.nativeObj, scale);

        return;
    }

/**
 * <p>Calculates the product of a matrix and its transposition.</p>
 *
 * <p>The function <code>mulTransposed</code> calculates the product of
 * <code>src</code> and its transposition:</p>
 *
 * <p><em>dst = scale(src - delta)^T(src - delta)</em></p>
 *
 * <p>if <code>aTa=true</code>, and</p>
 *
 * <p><em>dst = scale(src - delta)(src - delta)^T</em></p>
 *
 * <p>otherwise. The function is used to compute the covariance matrix. With zero
 * delta, it can be used as a faster substitute for general matrix product
 * <code>A*B</code> when <code>B=A'</code></p>
 *
 * @param src Source single-channel matrix. Note that unlike "gemm", the
 * function can multiply not only floating-point matrices.
 * @param dst Destination square matrix.
 * @param aTa Flag specifying the multiplication ordering. See the description
 * below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multransposed">org.opencv.core.Core.mulTransposed</a>
 * @see org.opencv.core.Core#calcCovarMatrix
 * @see org.opencv.core.Core#repeat
 * @see org.opencv.core.Core#reduce
 * @see org.opencv.core.Core#gemm
 */
    public static void mulTransposed(Mat src, Mat dst, boolean aTa)
    {

        mulTransposed_2(src.nativeObj, dst.nativeObj, aTa);

        return;
    }


    //
    // C++:  void multiply(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    //

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 * @param scale Optional scale factor.
 * @param dtype a dtype
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Mat src2, Mat dst, double scale, int dtype)
    {

        multiply_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale, dtype);

        return;
    }

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 * @param scale Optional scale factor.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Mat src2, Mat dst, double scale)
    {

        multiply_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, scale);

        return;
    }

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Mat src2, Mat dst)
    {

        multiply_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void multiply(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    //

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 * @param scale Optional scale factor.
 * @param dtype a dtype
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Scalar src2, Mat dst, double scale, int dtype)
    {

        multiply_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale, dtype);

        return;
    }

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 * @param scale Optional scale factor.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Scalar src2, Mat dst, double scale)
    {

        multiply_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, scale);

        return;
    }

/**
 * <p>Calculates the per-element scaled product of two arrays.</p>
 *
 * <p>The function <code>multiply</code> calculates the per-element product of two
 * arrays:</p>
 *
 * <p><em>dst(I)= saturate(scale * src1(I) * src2(I))</em></p>
 *
 * <p>There is also a "MatrixExpressions" -friendly variant of the first function.
 * See "Mat.mul".</p>
 *
 * <p>For a not-per-element matrix product, see "gemm".</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#multiply">org.opencv.core.Core.multiply</a>
 * @see org.opencv.core.Core#divide
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.imgproc.Imgproc#accumulateSquare
 * @see org.opencv.imgproc.Imgproc#accumulate
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 * @see org.opencv.imgproc.Imgproc#accumulateProduct
 */
    public static void multiply(Mat src1, Scalar src2, Mat dst)
    {

        multiply_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  double norm(Mat src1, int normType = NORM_L2, Mat mask = Mat())
    //

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 * @param normType Type of the norm. See the details below.
 * @param mask Optional operation mask. It must have the same size as
 * <code>src1</code> and <code>CV_8UC1</code> type.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1, int normType, Mat mask)
    {

        double retVal = norm_0(src1.nativeObj, normType, mask.nativeObj);

        return retVal;
    }

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 * @param normType Type of the norm. See the details below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1, int normType)
    {

        double retVal = norm_1(src1.nativeObj, normType);

        return retVal;
    }

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1)
    {

        double retVal = norm_2(src1.nativeObj);

        return retVal;
    }


    //
    // C++:  double norm(Mat src1, Mat src2, int normType = NORM_L2, Mat mask = Mat())
    //

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param normType Type of the norm. See the details below.
 * @param mask Optional operation mask. It must have the same size as
 * <code>src1</code> and <code>CV_8UC1</code> type.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1, Mat src2, int normType, Mat mask)
    {

        double retVal = norm_3(src1.nativeObj, src2.nativeObj, normType, mask.nativeObj);

        return retVal;
    }

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 * @param normType Type of the norm. See the details below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1, Mat src2, int normType)
    {

        double retVal = norm_4(src1.nativeObj, src2.nativeObj, normType);

        return retVal;
    }

/**
 * <p>Calculates an absolute array norm, an absolute difference norm, or a relative
 * difference norm.</p>
 *
 * <p>The functions <code>norm</code> calculate an absolute norm of
 * <code>src1</code> (when there is no <code>src2</code>):</p>
 *
 * <p><em>norm = forkthree(|src1|_(L_(infty)) = max _I|src1(I)|)(if normType =
 * NORM_INF)
 * (|src1|_(L_1) = sum _I|src1(I)|)(if normType = NORM_L1)
 * (|src1|_(L_2) = sqrt(sum_I src1(I)^2))(if normType = NORM_L2)</em></p>
 *
 * <p>or an absolute or relative difference norm if <code>src2</code> is there:</p>
 *
 * <p><em>norm = forkthree(|src1-src2|_(L_(infty)) = max _I|src1(I) - src2(I)|)(if
 * normType = NORM_INF)
 * (|src1 - src2|_(L_1) = sum _I|src1(I) - src2(I)|)(if normType = NORM_L1)
 * (|src1 - src2|_(L_2) = sqrt(sum_I(src1(I) - src2(I))^2))(if normType =
 * NORM_L2)</em></p>
 *
 * <p>or</p>
 *
 * <p><em>norm = forkthree((|src1-src2|_(L_(infty)))/(|src2|_(L_(infty))))(if
 * normType = NORM_RELATIVE_INF)
 * ((|src1-src2|_(L_1))/(|src2|_(L_1)))(if normType = NORM_RELATIVE_L1)
 * ((|src1-src2|_(L_2))/(|src2|_(L_2)))(if normType = NORM_RELATIVE_L2)</em></p>
 *
 * <p>The functions <code>norm</code> return the calculated norm.</p>
 *
 * <p>When the <code>mask</code> parameter is specified and it is not empty, the
 * norm is computed only over the region specified by the mask.</p>
 *
 * <p>A multi-channel source arrays are treated as a single-channel, that is, the
 * results for all channels are combined.</p>
 *
 * @param src1 First source array.
 * @param src2 Second source array of the same size and the same type as
 * <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#norm">org.opencv.core.Core.norm</a>
 */
    public static double norm(Mat src1, Mat src2)
    {

        double retVal = norm_5(src1.nativeObj, src2.nativeObj);

        return retVal;
    }


    //
    // C++:  void normalize(Mat src, Mat& dst, double alpha = 1, double beta = 0, int norm_type = NORM_L2, int dtype = -1, Mat mask = Mat())
    //

/**
 * <p>Normalizes the norm or value range of an array.</p>
 *
 * <p>The functions <code>normalize</code> scale and shift the source array
 * elements so that</p>
 *
 * <p><em>| dst|_(L_p)= alpha</em></p>
 *
 * <p>(where p=Inf, 1 or 2) when <code>normType=NORM_INF</code>, <code>NORM_L1</code>,
 * or <code>NORM_L2</code>, respectively; or so that</p>
 *
 * <p><em>min _I dst(I)= alpha, max _I dst(I)= beta</em></p>
 *
 * <p>when <code>normType=NORM_MINMAX</code> (for dense arrays only).
 * The optional mask specifies a sub-array to be normalized. This means that the
 * norm or min-n-max are computed over the sub-array, and then this sub-array is
 * modified to be normalized. If you want to only use the mask to compute the
 * norm or min-max but modify the whole array, you can use "norm" and
 * "Mat.convertTo".</p>
 *
 * <p>In case of sparse matrices, only the non-zero values are analyzed and
 * transformed. Because of this, the range transformation for sparse matrices is
 * not allowed since it can shift the zero level.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size as <code>src</code>.
 * @param alpha Norm value to normalize to or the lower range boundary in case
 * of the range normalization.
 * @param beta Upper range boundary in case of the range normalization. It is
 * not used for the norm normalization.
 * @param norm_type a norm_type
 * @param dtype When the parameter is negative, the destination array has the
 * same type as <code>src</code>. Otherwise, it has the same number of channels
 * as <code>src</code> and the depth <code>=CV_MAT_DEPTH(dtype)</code>.
 * @param mask Optional operation mask.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#normalize">org.opencv.core.Core.normalize</a>
 * @see SparseMat.convertTo
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#norm
 */
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype, Mat mask)
    {

        normalize_0(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype, mask.nativeObj);

        return;
    }

/**
 * <p>Normalizes the norm or value range of an array.</p>
 *
 * <p>The functions <code>normalize</code> scale and shift the source array
 * elements so that</p>
 *
 * <p><em>| dst|_(L_p)= alpha</em></p>
 *
 * <p>(where p=Inf, 1 or 2) when <code>normType=NORM_INF</code>, <code>NORM_L1</code>,
 * or <code>NORM_L2</code>, respectively; or so that</p>
 *
 * <p><em>min _I dst(I)= alpha, max _I dst(I)= beta</em></p>
 *
 * <p>when <code>normType=NORM_MINMAX</code> (for dense arrays only).
 * The optional mask specifies a sub-array to be normalized. This means that the
 * norm or min-n-max are computed over the sub-array, and then this sub-array is
 * modified to be normalized. If you want to only use the mask to compute the
 * norm or min-max but modify the whole array, you can use "norm" and
 * "Mat.convertTo".</p>
 *
 * <p>In case of sparse matrices, only the non-zero values are analyzed and
 * transformed. Because of this, the range transformation for sparse matrices is
 * not allowed since it can shift the zero level.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size as <code>src</code>.
 * @param alpha Norm value to normalize to or the lower range boundary in case
 * of the range normalization.
 * @param beta Upper range boundary in case of the range normalization. It is
 * not used for the norm normalization.
 * @param norm_type a norm_type
 * @param dtype When the parameter is negative, the destination array has the
 * same type as <code>src</code>. Otherwise, it has the same number of channels
 * as <code>src</code> and the depth <code>=CV_MAT_DEPTH(dtype)</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#normalize">org.opencv.core.Core.normalize</a>
 * @see SparseMat.convertTo
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#norm
 */
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type, int dtype)
    {

        normalize_1(src.nativeObj, dst.nativeObj, alpha, beta, norm_type, dtype);

        return;
    }

/**
 * <p>Normalizes the norm or value range of an array.</p>
 *
 * <p>The functions <code>normalize</code> scale and shift the source array
 * elements so that</p>
 *
 * <p><em>| dst|_(L_p)= alpha</em></p>
 *
 * <p>(where p=Inf, 1 or 2) when <code>normType=NORM_INF</code>, <code>NORM_L1</code>,
 * or <code>NORM_L2</code>, respectively; or so that</p>
 *
 * <p><em>min _I dst(I)= alpha, max _I dst(I)= beta</em></p>
 *
 * <p>when <code>normType=NORM_MINMAX</code> (for dense arrays only).
 * The optional mask specifies a sub-array to be normalized. This means that the
 * norm or min-n-max are computed over the sub-array, and then this sub-array is
 * modified to be normalized. If you want to only use the mask to compute the
 * norm or min-max but modify the whole array, you can use "norm" and
 * "Mat.convertTo".</p>
 *
 * <p>In case of sparse matrices, only the non-zero values are analyzed and
 * transformed. Because of this, the range transformation for sparse matrices is
 * not allowed since it can shift the zero level.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size as <code>src</code>.
 * @param alpha Norm value to normalize to or the lower range boundary in case
 * of the range normalization.
 * @param beta Upper range boundary in case of the range normalization. It is
 * not used for the norm normalization.
 * @param norm_type a norm_type
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#normalize">org.opencv.core.Core.normalize</a>
 * @see SparseMat.convertTo
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#norm
 */
    public static void normalize(Mat src, Mat dst, double alpha, double beta, int norm_type)
    {

        normalize_2(src.nativeObj, dst.nativeObj, alpha, beta, norm_type);

        return;
    }

/**
 * <p>Normalizes the norm or value range of an array.</p>
 *
 * <p>The functions <code>normalize</code> scale and shift the source array
 * elements so that</p>
 *
 * <p><em>| dst|_(L_p)= alpha</em></p>
 *
 * <p>(where p=Inf, 1 or 2) when <code>normType=NORM_INF</code>, <code>NORM_L1</code>,
 * or <code>NORM_L2</code>, respectively; or so that</p>
 *
 * <p><em>min _I dst(I)= alpha, max _I dst(I)= beta</em></p>
 *
 * <p>when <code>normType=NORM_MINMAX</code> (for dense arrays only).
 * The optional mask specifies a sub-array to be normalized. This means that the
 * norm or min-n-max are computed over the sub-array, and then this sub-array is
 * modified to be normalized. If you want to only use the mask to compute the
 * norm or min-max but modify the whole array, you can use "norm" and
 * "Mat.convertTo".</p>
 *
 * <p>In case of sparse matrices, only the non-zero values are analyzed and
 * transformed. Because of this, the range transformation for sparse matrices is
 * not allowed since it can shift the zero level.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same size as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#normalize">org.opencv.core.Core.normalize</a>
 * @see SparseMat.convertTo
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#norm
 */
    public static void normalize(Mat src, Mat dst)
    {

        normalize_3(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void patchNaNs(Mat& a, double val = 0)
    //

    public static void patchNaNs(Mat a, double val)
    {

        patchNaNs_0(a.nativeObj, val);

        return;
    }

    public static void patchNaNs(Mat a)
    {

        patchNaNs_1(a.nativeObj);

        return;
    }


    //
    // C++:  void perspectiveTransform(Mat src, Mat& dst, Mat m)
    //

/**
 * <p>Performs the perspective matrix transformation of vectors.</p>
 *
 * <p>The function <code>perspectiveTransform</code> transforms every element of
 * <code>src</code> by treating it as a 2D or 3D vector, in the following way:</p>
 *
 * <p><em>(x, y, z) -> (x'/w, y'/w, z'/w)</em></p>
 *
 * <p>where</p>
 *
 * <p><em>(x', y', z', w') = mat * x y z 1 </em></p>
 *
 * <p>and</p>
 *
 * <p><em>w = w' if w' != 0; infty otherwise</em></p>
 *
 * <p>Here a 3D vector transformation is shown. In case of a 2D vector
 * transformation, the <code>z</code> component is omitted.</p>
 *
 * <p>Note: The function transforms a sparse set of 2D or 3D vectors. If you want
 * to transform an image using perspective transformation, use "warpPerspective".
 * If you have an inverse problem, that is, you want to compute the most
 * probable perspective transformation out of several pairs of corresponding
 * points, you can use "getPerspectiveTransform" or "findHomography".</p>
 *
 * @param src Source two-channel or three-channel floating-point array. Each
 * element is a 2D/3D vector to be transformed.
 * @param dst Destination array of the same size and type as <code>src</code>.
 * @param m <code>3x3</code> or <code>4x4</code> floating-point transformation
 * matrix.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#perspectivetransform">org.opencv.core.Core.perspectiveTransform</a>
 * @see org.opencv.calib3d.Calib3d#findHomography
 * @see org.opencv.imgproc.Imgproc#warpPerspective
 * @see org.opencv.core.Core#transform
 * @see org.opencv.imgproc.Imgproc#getPerspectiveTransform
 */
    public static void perspectiveTransform(Mat src, Mat dst, Mat m)
    {

        perspectiveTransform_0(src.nativeObj, dst.nativeObj, m.nativeObj);

        return;
    }


    //
    // C++:  void phase(Mat x, Mat y, Mat& angle, bool angleInDegrees = false)
    //

/**
 * <p>Calculates the rotation angle of 2D vectors.</p>
 *
 * <p>The function <code>phase</code> computes the rotation angle of each 2D vector
 * that is formed from the corresponding elements of <code>x</code> and
 * <code>y</code> :</p>
 *
 * <p><em>angle(I) = atan2(y(I), x(I))</em></p>
 *
 * <p>The angle estimation accuracy is about 0.3 degrees. When <code>x(I)=y(I)=0</code>,
 * the corresponding <code>angle(I)</code> is set to 0.</p>
 *
 * @param x Source floating-point array of x-coordinates of 2D vectors.
 * @param y Source array of y-coordinates of 2D vectors. It must have the same
 * size and the same type as <code>x</code>.
 * @param angle Destination array of vector angles. It has the same size and
 * same type as <code>x</code>.
 * @param angleInDegrees When it is true, the function computes the angle in
 * degrees. Otherwise, they are measured in radians.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#phase">org.opencv.core.Core.phase</a>
 */
    public static void phase(Mat x, Mat y, Mat angle, boolean angleInDegrees)
    {

        phase_0(x.nativeObj, y.nativeObj, angle.nativeObj, angleInDegrees);

        return;
    }

/**
 * <p>Calculates the rotation angle of 2D vectors.</p>
 *
 * <p>The function <code>phase</code> computes the rotation angle of each 2D vector
 * that is formed from the corresponding elements of <code>x</code> and
 * <code>y</code> :</p>
 *
 * <p><em>angle(I) = atan2(y(I), x(I))</em></p>
 *
 * <p>The angle estimation accuracy is about 0.3 degrees. When <code>x(I)=y(I)=0</code>,
 * the corresponding <code>angle(I)</code> is set to 0.</p>
 *
 * @param x Source floating-point array of x-coordinates of 2D vectors.
 * @param y Source array of y-coordinates of 2D vectors. It must have the same
 * size and the same type as <code>x</code>.
 * @param angle Destination array of vector angles. It has the same size and
 * same type as <code>x</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#phase">org.opencv.core.Core.phase</a>
 */
    public static void phase(Mat x, Mat y, Mat angle)
    {

        phase_1(x.nativeObj, y.nativeObj, angle.nativeObj);

        return;
    }


    //
    // C++:  void polarToCart(Mat magnitude, Mat angle, Mat& x, Mat& y, bool angleInDegrees = false)
    //

/**
 * <p>Computes x and y coordinates of 2D vectors from their magnitude and angle.</p>
 *
 * <p>The function <code>polarToCart</code> computes the Cartesian coordinates of
 * each 2D vector represented by the corresponding elements of <code>magnitude</code>
 * and <code>angle</code> :</p>
 *
 * <p><em>x(I) = magnitude(I) cos(angle(I))
 * y(I) = magnitude(I) sin(angle(I))
 * </em></p>
 *
 * <p>The relative accuracy of the estimated coordinates is about <code>1e-6</code>.</p>
 *
 * @param magnitude Source floating-point array of magnitudes of 2D vectors. It
 * can be an empty matrix (<code>=Mat()</code>). In this case, the function
 * assumes that all the magnitudes are =1. If it is not empty, it must have the
 * same size and type as <code>angle</code>.
 * @param angle Source floating-point array of angles of 2D vectors.
 * @param x Destination array of x-coordinates of 2D vectors. It has the same
 * size and type as <code>angle</code>.
 * @param y Destination array of y-coordinates of 2D vectors. It has the same
 * size and type as <code>angle</code>.
 * @param angleInDegrees When it is true, the input angles are measured in
 * degrees. Otherwise. they are measured in radians.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#polartocart">org.opencv.core.Core.polarToCart</a>
 * @see org.opencv.core.Core#log
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#pow
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#exp
 * @see org.opencv.core.Core#phase
 */
    public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y, boolean angleInDegrees)
    {

        polarToCart_0(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj, angleInDegrees);

        return;
    }

/**
 * <p>Computes x and y coordinates of 2D vectors from their magnitude and angle.</p>
 *
 * <p>The function <code>polarToCart</code> computes the Cartesian coordinates of
 * each 2D vector represented by the corresponding elements of <code>magnitude</code>
 * and <code>angle</code> :</p>
 *
 * <p><em>x(I) = magnitude(I) cos(angle(I))
 * y(I) = magnitude(I) sin(angle(I))
 * </em></p>
 *
 * <p>The relative accuracy of the estimated coordinates is about <code>1e-6</code>.</p>
 *
 * @param magnitude Source floating-point array of magnitudes of 2D vectors. It
 * can be an empty matrix (<code>=Mat()</code>). In this case, the function
 * assumes that all the magnitudes are =1. If it is not empty, it must have the
 * same size and type as <code>angle</code>.
 * @param angle Source floating-point array of angles of 2D vectors.
 * @param x Destination array of x-coordinates of 2D vectors. It has the same
 * size and type as <code>angle</code>.
 * @param y Destination array of y-coordinates of 2D vectors. It has the same
 * size and type as <code>angle</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#polartocart">org.opencv.core.Core.polarToCart</a>
 * @see org.opencv.core.Core#log
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#pow
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#magnitude
 * @see org.opencv.core.Core#exp
 * @see org.opencv.core.Core#phase
 */
    public static void polarToCart(Mat magnitude, Mat angle, Mat x, Mat y)
    {

        polarToCart_1(magnitude.nativeObj, angle.nativeObj, x.nativeObj, y.nativeObj);

        return;
    }


    //
    // C++:  void polylines(Mat& img, vector_vector_Point pts, bool isClosed, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

/**
 * <p>Draws several polygonal curves.</p>
 *
 * <p>The function <code>polylines</code> draws one or more polygonal curves.</p>
 *
 * @param img Image.
 * @param pts Array of polygonal curves.
 * @param isClosed Flag indicating whether the drawn polylines are closed or
 * not. If they are closed, the function draws a line from the last vertex of
 * each curve to its first vertex.
 * @param color Polyline color.
 * @param thickness Thickness of the polyline edges.
 * @param lineType Type of the line segments. See the "line" description.
 * @param shift Number of fractional bits in the vertex coordinates.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#polylines">org.opencv.core.Core.polylines</a>
 */
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness, int lineType, int shift)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_0(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);

        return;
    }

/**
 * <p>Draws several polygonal curves.</p>
 *
 * <p>The function <code>polylines</code> draws one or more polygonal curves.</p>
 *
 * @param img Image.
 * @param pts Array of polygonal curves.
 * @param isClosed Flag indicating whether the drawn polylines are closed or
 * not. If they are closed, the function draws a line from the last vertex of
 * each curve to its first vertex.
 * @param color Polyline color.
 * @param thickness Thickness of the polyline edges.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#polylines">org.opencv.core.Core.polylines</a>
 */
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color, int thickness)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_1(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws several polygonal curves.</p>
 *
 * <p>The function <code>polylines</code> draws one or more polygonal curves.</p>
 *
 * @param img Image.
 * @param pts Array of polygonal curves.
 * @param isClosed Flag indicating whether the drawn polylines are closed or
 * not. If they are closed, the function draws a line from the last vertex of
 * each curve to its first vertex.
 * @param color Polyline color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#polylines">org.opencv.core.Core.polylines</a>
 */
    public static void polylines(Mat img, List<MatOfPoint> pts, boolean isClosed, Scalar color)
    {
        List<Mat> pts_tmplm = new ArrayList<Mat>((pts != null) ? pts.size() : 0);
        Mat pts_mat = Converters.vector_vector_Point_to_Mat(pts, pts_tmplm);
        polylines_2(img.nativeObj, pts_mat.nativeObj, isClosed, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void pow(Mat src, double power, Mat& dst)
    //

/**
 * <p>Raises every array element to a power.</p>
 *
 * <p>The function <code>pow</code> raises every element of the input array to
 * <code>power</code> :</p>
 *
 * <p><em>dst(I) = src(I)^power if power is integer; |src(I)|^power otherwise</em></p>
 *
 * <p>So, for a non-integer power exponent, the absolute values of input array
 * elements are used. However, it is possible to get true values for negative
 * values using some extra operations. In the example below, computing the 5th
 * root of array <code>src</code> shows:</p>
 *
 * <p>For some values of <code>power</code>, such as integer values, 0.5 and -0.5,
 * specialized faster algorithms are used.</p>
 *
 * <p>Special values (NaN, Inf) are not handled.</p>
 *
 * @param src Source array.
 * @param power Exponent of power.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#pow">org.opencv.core.Core.pow</a>
 * @see org.opencv.core.Core#cartToPolar
 * @see org.opencv.core.Core#polarToCart
 * @see org.opencv.core.Core#exp
 * @see org.opencv.core.Core#sqrt
 * @see org.opencv.core.Core#log
 */
    public static void pow(Mat src, double power, Mat dst)
    {

        pow_0(src.nativeObj, power, dst.nativeObj);

        return;
    }


    //
    // C++:  void putText(Mat img, string text, Point org, int fontFace, double fontScale, Scalar color, int thickness = 1, int lineType = 8, bool bottomLeftOrigin = false)
    //

/**
 * <p>Draws a text string.</p>
 *
 * <p>The function <code>putText</code> renders the specified text string in the
 * image.
 * Symbols that cannot be rendered using the specified font are replaced by
 * question marks. See "getTextSize" for a text rendering code example.</p>
 *
 * @param img Image.
 * @param text Text string to be drawn.
 * @param org Bottom-left corner of the text string in the image.
 * @param fontFace Font type. One of <code>FONT_HERSHEY_SIMPLEX</code>,
 * <code>FONT_HERSHEY_PLAIN</code>, <code>FONT_HERSHEY_DUPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX</code>, <code>FONT_HERSHEY_TRIPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX_SMALL</code>, <code>FONT_HERSHEY_SCRIPT_SIMPLEX</code>,
 * or <code>FONT_HERSHEY_SCRIPT_COMPLEX</code>, where each of the font ID's can
 * be combined with <code>FONT_HERSHEY_ITALIC</code> to get the slanted letters.
 * @param fontScale Font scale factor that is multiplied by the font-specific
 * base size.
 * @param color Text color.
 * @param thickness Thickness of the lines used to draw a text.
 * @param lineType Line type. See the <code>line</code> for details.
 * @param bottomLeftOrigin When true, the image data origin is at the
 * bottom-left corner. Otherwise, it is at the top-left corner.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#puttext">org.opencv.core.Core.putText</a>
 */
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness, int lineType, boolean bottomLeftOrigin)
    {

        putText_0(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, bottomLeftOrigin);

        return;
    }

/**
 * <p>Draws a text string.</p>
 *
 * <p>The function <code>putText</code> renders the specified text string in the
 * image.
 * Symbols that cannot be rendered using the specified font are replaced by
 * question marks. See "getTextSize" for a text rendering code example.</p>
 *
 * @param img Image.
 * @param text Text string to be drawn.
 * @param org Bottom-left corner of the text string in the image.
 * @param fontFace Font type. One of <code>FONT_HERSHEY_SIMPLEX</code>,
 * <code>FONT_HERSHEY_PLAIN</code>, <code>FONT_HERSHEY_DUPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX</code>, <code>FONT_HERSHEY_TRIPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX_SMALL</code>, <code>FONT_HERSHEY_SCRIPT_SIMPLEX</code>,
 * or <code>FONT_HERSHEY_SCRIPT_COMPLEX</code>, where each of the font ID's can
 * be combined with <code>FONT_HERSHEY_ITALIC</code> to get the slanted letters.
 * @param fontScale Font scale factor that is multiplied by the font-specific
 * base size.
 * @param color Text color.
 * @param thickness Thickness of the lines used to draw a text.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#puttext">org.opencv.core.Core.putText</a>
 */
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color, int thickness)
    {

        putText_1(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a text string.</p>
 *
 * <p>The function <code>putText</code> renders the specified text string in the
 * image.
 * Symbols that cannot be rendered using the specified font are replaced by
 * question marks. See "getTextSize" for a text rendering code example.</p>
 *
 * @param img Image.
 * @param text Text string to be drawn.
 * @param org Bottom-left corner of the text string in the image.
 * @param fontFace Font type. One of <code>FONT_HERSHEY_SIMPLEX</code>,
 * <code>FONT_HERSHEY_PLAIN</code>, <code>FONT_HERSHEY_DUPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX</code>, <code>FONT_HERSHEY_TRIPLEX</code>,
 * <code>FONT_HERSHEY_COMPLEX_SMALL</code>, <code>FONT_HERSHEY_SCRIPT_SIMPLEX</code>,
 * or <code>FONT_HERSHEY_SCRIPT_COMPLEX</code>, where each of the font ID's can
 * be combined with <code>FONT_HERSHEY_ITALIC</code> to get the slanted letters.
 * @param fontScale Font scale factor that is multiplied by the font-specific
 * base size.
 * @param color Text color.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#puttext">org.opencv.core.Core.putText</a>
 */
    public static void putText(Mat img, String text, Point org, int fontFace, double fontScale, Scalar color)
    {

        putText_2(img.nativeObj, text, org.x, org.y, fontFace, fontScale, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void randShuffle_(Mat& dst, double iterFactor = 1.)
    //

    public static void randShuffle(Mat dst, double iterFactor)
    {

        randShuffle_0(dst.nativeObj, iterFactor);

        return;
    }

    public static void randShuffle(Mat dst)
    {

        randShuffle_1(dst.nativeObj);

        return;
    }


    //
    // C++:  void randn(Mat& dst, double mean, double stddev)
    //

/**
 * <p>Fills the array with normally distributed random numbers.</p>
 *
 * <p>The function <code>randn</code> fills the matrix <code>dst</code> with
 * normally distributed random numbers with the specified mean vector and the
 * standard deviation matrix. The generated random numbers are clipped to fit
 * the value range of the destination array data type.</p>
 *
 * @param dst Output array of random numbers. The array must be pre-allocated
 * and have 1 to 4 channels.
 * @param mean Mean value (expectation) of the generated random numbers.
 * @param stddev Standard deviation of the generated random numbers. It can be
 * either a vector (in which case a diagonal standard deviation matrix is
 * assumed) or a square matrix.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#randn">org.opencv.core.Core.randn</a>
 * @see org.opencv.core.RNG
 * @see org.opencv.core.Core#randu
 */
    public static void randn(Mat dst, double mean, double stddev)
    {

        randn_0(dst.nativeObj, mean, stddev);

        return;
    }


    //
    // C++:  void randu(Mat& dst, double low, double high)
    //

/**
 * <p>Generates a single uniformly-distributed random number or an array of random
 * numbers.</p>
 *
 * <p>The template functions <code>randu</code> generate and return the next
 * uniformly-distributed random value of the specified type. <code>randu<int>()</code>
 * is an equivalent to <code>(int)theRNG();</code>, and so on. See "RNG"
 * description.</p>
 *
 * <p>The second non-template variant of the function fills the matrix
 * <code>dst</code> with uniformly-distributed random numbers from the specified
 * range:</p>
 *
 * <p><em>low _c <= dst(I)_c < high _c</em></p>
 *
 * @param dst Output array of random numbers. The array must be pre-allocated.
 * @param low Inclusive lower boundary of the generated random numbers.
 * @param high Exclusive upper boundary of the generated random numbers.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#randu">org.opencv.core.Core.randu</a>
 * @see org.opencv.core.Core#randn
 * @see org.opencv.core.RNG
 * @see org.opencv.core.Core#theRNG
 */
    public static void randu(Mat dst, double low, double high)
    {

        randu_0(dst.nativeObj, low, high);

        return;
    }


    //
    // C++:  void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    //

/**
 * <p>Draws a simple, thick, or filled up-right rectangle.</p>
 *
 * <p>The function <code>rectangle</code> draws a rectangle outline or a filled
 * rectangle whose two opposite corners are <code>pt1</code> and
 * <code>pt2</code>, or <code>r.tl()</code> and <code>r.br()-Point(1,1)</code>.</p>
 *
 * @param img Image.
 * @param pt1 Vertex of the rectangle.
 * @param pt2 Vertex of the rectangle opposite to <code>pt1</code>.
 * @param color Rectangle color or brightness (grayscale image).
 * @param thickness Thickness of lines that make up the rectangle. Negative
 * values, like <code>CV_FILLED</code>, mean that the function has to draw a
 * filled rectangle.
 * @param lineType Type of the line. See the "line" description.
 * @param shift Number of fractional bits in the point coordinates.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#rectangle">org.opencv.core.Core.rectangle</a>
 */
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness, int lineType, int shift)
    {

        rectangle_0(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness, lineType, shift);

        return;
    }

/**
 * <p>Draws a simple, thick, or filled up-right rectangle.</p>
 *
 * <p>The function <code>rectangle</code> draws a rectangle outline or a filled
 * rectangle whose two opposite corners are <code>pt1</code> and
 * <code>pt2</code>, or <code>r.tl()</code> and <code>r.br()-Point(1,1)</code>.</p>
 *
 * @param img Image.
 * @param pt1 Vertex of the rectangle.
 * @param pt2 Vertex of the rectangle opposite to <code>pt1</code>.
 * @param color Rectangle color or brightness (grayscale image).
 * @param thickness Thickness of lines that make up the rectangle. Negative
 * values, like <code>CV_FILLED</code>, mean that the function has to draw a
 * filled rectangle.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#rectangle">org.opencv.core.Core.rectangle</a>
 */
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness)
    {

        rectangle_1(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3], thickness);

        return;
    }

/**
 * <p>Draws a simple, thick, or filled up-right rectangle.</p>
 *
 * <p>The function <code>rectangle</code> draws a rectangle outline or a filled
 * rectangle whose two opposite corners are <code>pt1</code> and
 * <code>pt2</code>, or <code>r.tl()</code> and <code>r.br()-Point(1,1)</code>.</p>
 *
 * @param img Image.
 * @param pt1 Vertex of the rectangle.
 * @param pt2 Vertex of the rectangle opposite to <code>pt1</code>.
 * @param color Rectangle color or brightness (grayscale image).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#rectangle">org.opencv.core.Core.rectangle</a>
 */
    public static void rectangle(Mat img, Point pt1, Point pt2, Scalar color)
    {

        rectangle_2(img.nativeObj, pt1.x, pt1.y, pt2.x, pt2.y, color.val[0], color.val[1], color.val[2], color.val[3]);

        return;
    }


    //
    // C++:  void reduce(Mat src, Mat& dst, int dim, int rtype, int dtype = -1)
    //

/**
 * <p>Reduces a matrix to a vector.</p>
 *
 * <p>The function <code>reduce</code> reduces the matrix to a vector by treating
 * the matrix rows/columns as a set of 1D vectors and performing the specified
 * operation on the vectors until a single row/column is obtained. For example,
 * the function can be used to compute horizontal and vertical projections of a
 * raster image. In case of <code>CV_REDUCE_SUM</code> and <code>CV_REDUCE_AVG</code>,
 * the output may have a larger element bit-depth to preserve accuracy. And
 * multi-channel arrays are also supported in these two reduction modes.</p>
 *
 * @param src Source 2D matrix.
 * @param dst Destination vector. Its size and type is defined by
 * <code>dim</code> and <code>dtype</code> parameters.
 * @param dim Dimension index along which the matrix is reduced. 0 means that
 * the matrix is reduced to a single row. 1 means that the matrix is reduced to
 * a single column.
 * @param rtype Reduction operation that could be one of the following:
 * <ul>
 *   <li> CV_REDUCE_SUM The output is the sum of all rows/columns of the matrix.
 *   <li> CV_REDUCE_AVG The output is the mean vector of all rows/columns of the
 * matrix.
 *   <li> CV_REDUCE_MAX The output is the maximum (column/row-wise) of all
 * rows/columns of the matrix.
 *   <li> CV_REDUCE_MIN The output is the minimum (column/row-wise) of all
 * rows/columns of the matrix.
 * </ul>
 * @param dtype When it is negative, the destination vector will have the same
 * type as the source matrix. Otherwise, its type will be <code>CV_MAKE_TYPE(CV_MAT_DEPTH(dtype),
 * src.channels())</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#reduce">org.opencv.core.Core.reduce</a>
 * @see org.opencv.core.Core#repeat
 */
    public static void reduce(Mat src, Mat dst, int dim, int rtype, int dtype)
    {

        reduce_0(src.nativeObj, dst.nativeObj, dim, rtype, dtype);

        return;
    }

/**
 * <p>Reduces a matrix to a vector.</p>
 *
 * <p>The function <code>reduce</code> reduces the matrix to a vector by treating
 * the matrix rows/columns as a set of 1D vectors and performing the specified
 * operation on the vectors until a single row/column is obtained. For example,
 * the function can be used to compute horizontal and vertical projections of a
 * raster image. In case of <code>CV_REDUCE_SUM</code> and <code>CV_REDUCE_AVG</code>,
 * the output may have a larger element bit-depth to preserve accuracy. And
 * multi-channel arrays are also supported in these two reduction modes.</p>
 *
 * @param src Source 2D matrix.
 * @param dst Destination vector. Its size and type is defined by
 * <code>dim</code> and <code>dtype</code> parameters.
 * @param dim Dimension index along which the matrix is reduced. 0 means that
 * the matrix is reduced to a single row. 1 means that the matrix is reduced to
 * a single column.
 * @param rtype Reduction operation that could be one of the following:
 * <ul>
 *   <li> CV_REDUCE_SUM The output is the sum of all rows/columns of the matrix.
 *   <li> CV_REDUCE_AVG The output is the mean vector of all rows/columns of the
 * matrix.
 *   <li> CV_REDUCE_MAX The output is the maximum (column/row-wise) of all
 * rows/columns of the matrix.
 *   <li> CV_REDUCE_MIN The output is the minimum (column/row-wise) of all
 * rows/columns of the matrix.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#reduce">org.opencv.core.Core.reduce</a>
 * @see org.opencv.core.Core#repeat
 */
    public static void reduce(Mat src, Mat dst, int dim, int rtype)
    {

        reduce_1(src.nativeObj, dst.nativeObj, dim, rtype);

        return;
    }


    //
    // C++:  void repeat(Mat src, int ny, int nx, Mat& dst)
    //

/**
 * <p>Fills the destination array with repeated copies of the source array.</p>
 *
 * <p>The functions "repeat" duplicate the source array one or more times along
 * each of the two axes:</p>
 *
 * <p><em>dst _(ij)= src _(i mod src.rows, j mod src.cols)</em></p>
 *
 * <p>The second variant of the function is more convenient to use with
 * "MatrixExpressions".</p>
 *
 * @param src Source array to replicate.
 * @param ny Flag to specify how many times the <code>src</code> is repeated
 * along the vertical axis.
 * @param nx Flag to specify how many times the <code>src</code> is repeated
 * along the horizontal axis.
 * @param dst Destination array of the same type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#repeat">org.opencv.core.Core.repeat</a>
 * @see org.opencv.core.Core#reduce
 * @see MatrixExpressions
 */
    public static void repeat(Mat src, int ny, int nx, Mat dst)
    {

        repeat_0(src.nativeObj, ny, nx, dst.nativeObj);

        return;
    }


    //
    // C++:  void scaleAdd(Mat src1, double alpha, Mat src2, Mat& dst)
    //

/**
 * <p>Calculates the sum of a scaled array and another array.</p>
 *
 * <p>The function <code>scaleAdd</code> is one of the classical primitive linear
 * algebra operations, known as <code>DAXPY</code> or <code>SAXPY</code> in BLAS
 * (http://en.wikipedia.org/wiki/Basic_Linear_Algebra_Subprograms). It
 * calculates the sum of a scaled array and another array:</p>
 *
 * <p><em>dst(I)= scale * src1(I) + src2(I)</em></p>
 *
 * <p>The function can also be emulated with a matrix expression, for example:</p>
 *
 * @param src1 First source array.
 * @param alpha a alpha
 * @param src2 Second source array of the same size and type as
 * <code>src1</code>.
 * @param dst Destination array of the same size and type as <code>src1</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#scaleadd">org.opencv.core.Core.scaleAdd</a>
 * @see org.opencv.core.Mat#dot
 * @see org.opencv.core.Mat#convertTo
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#subtract
 * @see MatrixExpressions
 */
    public static void scaleAdd(Mat src1, double alpha, Mat src2, Mat dst)
    {

        scaleAdd_0(src1.nativeObj, alpha, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void setIdentity(Mat& mtx, Scalar s = Scalar(1))
    //

/**
 * <p>Initializes a scaled identity matrix.</p>
 *
 * <p>The function "setIdentity" initializes a scaled identity matrix:</p>
 *
 * <p><em>mtx(i,j)= value if i=j; 0 otherwise</em></p>
 *
 * <p>The function can also be emulated using the matrix initializers and the
 * matrix expressions:</p>
 *
 * @param mtx Matrix to initialize (not necessarily square).
 * @param s a s
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#setidentity">org.opencv.core.Core.setIdentity</a>
 * @see Mat.operator=
 * @see org.opencv.core.Mat#setTo
 * @see org.opencv.core.Mat#ones
 * @see org.opencv.core.Mat#zeros
 * @see MatrixExpressions
 */
    public static void setIdentity(Mat mtx, Scalar s)
    {

        setIdentity_0(mtx.nativeObj, s.val[0], s.val[1], s.val[2], s.val[3]);

        return;
    }

/**
 * <p>Initializes a scaled identity matrix.</p>
 *
 * <p>The function "setIdentity" initializes a scaled identity matrix:</p>
 *
 * <p><em>mtx(i,j)= value if i=j; 0 otherwise</em></p>
 *
 * <p>The function can also be emulated using the matrix initializers and the
 * matrix expressions:</p>
 *
 * @param mtx Matrix to initialize (not necessarily square).
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#setidentity">org.opencv.core.Core.setIdentity</a>
 * @see Mat.operator=
 * @see org.opencv.core.Mat#setTo
 * @see org.opencv.core.Mat#ones
 * @see org.opencv.core.Mat#zeros
 * @see MatrixExpressions
 */
    public static void setIdentity(Mat mtx)
    {

        setIdentity_1(mtx.nativeObj);

        return;
    }


    //
    // C++:  bool solve(Mat src1, Mat src2, Mat& dst, int flags = DECOMP_LU)
    //

/**
 * <p>Solves one or more linear systems or least-squares problems.</p>
 *
 * <p>The function <code>solve</code> solves a linear system or least-squares
 * problem (the latter is possible with SVD or QR methods, or by specifying the
 * flag <code>DECOMP_NORMAL</code>):</p>
 *
 * <p><em>dst = arg min _X|src1 * X - src2|</em></p>
 *
 * <p>If <code>DECOMP_LU</code> or <code>DECOMP_CHOLESKY</code> method is used, the
 * function returns 1 if <code>src1</code> (or <em>src1^Tsrc1</em>) is
 * non-singular. Otherwise, it returns 0. In the latter case, <code>dst</code>
 * is not valid. Other methods find a pseudo-solution in case of a singular
 * left-hand side part.</p>
 *
 * <p>Note: If you want to find a unity-norm solution of an under-defined singular
 * system <em>src1*dst=0</em>, the function <code>solve</code> will not do the
 * work. Use "SVD.solveZ" instead.</p>
 *
 * @param src1 Input matrix on the left-hand side of the system.
 * @param src2 Input matrix on the right-hand side of the system.
 * @param dst Output solution.
 * @param flags Solution (matrix inversion) method.
 * <ul>
 *   <li> DECOMP_LU Gaussian elimination with optimal pivot element chosen.
 *   <li> DECOMP_CHOLESKY Cholesky <em>LL^T</em> factorization. The matrix
 * <code>src1</code> must be symmetrical and positively defined.
 *   <li> DECOMP_EIG Eigenvalue decomposition. The matrix <code>src1</code> must
 * be symmetrical.
 *   <li> DECOMP_SVD Singular value decomposition (SVD) method. The system can
 * be over-defined and/or the matrix <code>src1</code> can be singular.
 *   <li> DECOMP_QR QR factorization. The system can be over-defined and/or the
 * matrix <code>src1</code> can be singular.
 *   <li> DECOMP_NORMAL While all the previous flags are mutually exclusive,
 * this flag can be used together with any of the previous. It means that the
 * normal equations <em>src1^T*src1*dst=src1^Tsrc2</em> are solved instead of
 * the original system <em>src1*dst=src2</em>.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#solve">org.opencv.core.Core.solve</a>
 * @see org.opencv.core.Core#invert
 * @see org.opencv.core.SVD
 * @see org.opencv.core.Core#eigen
 */
    public static boolean solve(Mat src1, Mat src2, Mat dst, int flags)
    {

        boolean retVal = solve_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, flags);

        return retVal;
    }

/**
 * <p>Solves one or more linear systems or least-squares problems.</p>
 *
 * <p>The function <code>solve</code> solves a linear system or least-squares
 * problem (the latter is possible with SVD or QR methods, or by specifying the
 * flag <code>DECOMP_NORMAL</code>):</p>
 *
 * <p><em>dst = arg min _X|src1 * X - src2|</em></p>
 *
 * <p>If <code>DECOMP_LU</code> or <code>DECOMP_CHOLESKY</code> method is used, the
 * function returns 1 if <code>src1</code> (or <em>src1^Tsrc1</em>) is
 * non-singular. Otherwise, it returns 0. In the latter case, <code>dst</code>
 * is not valid. Other methods find a pseudo-solution in case of a singular
 * left-hand side part.</p>
 *
 * <p>Note: If you want to find a unity-norm solution of an under-defined singular
 * system <em>src1*dst=0</em>, the function <code>solve</code> will not do the
 * work. Use "SVD.solveZ" instead.</p>
 *
 * @param src1 Input matrix on the left-hand side of the system.
 * @param src2 Input matrix on the right-hand side of the system.
 * @param dst Output solution.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#solve">org.opencv.core.Core.solve</a>
 * @see org.opencv.core.Core#invert
 * @see org.opencv.core.SVD
 * @see org.opencv.core.Core#eigen
 */
    public static boolean solve(Mat src1, Mat src2, Mat dst)
    {

        boolean retVal = solve_1(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return retVal;
    }


    //
    // C++:  int solveCubic(Mat coeffs, Mat& roots)
    //

/**
 * <p>Finds the real roots of a cubic equation.</p>
 *
 * <p>The function <code>solveCubic</code> finds the real roots of a cubic
 * equation:</p>
 * <ul>
 *   <li> if <code>coeffs</code> is a 4-element vector:
 * </ul>
 *
 * <p><em>coeffs [0] x^3 + coeffs [1] x^2 + coeffs [2] x + coeffs [3] = 0</em></p>
 *
 * <ul>
 *   <li> if <code>coeffs</code> is a 3-element vector:
 * </ul>
 *
 * <p><em>x^3 + coeffs [0] x^2 + coeffs [1] x + coeffs [2] = 0</em></p>
 *
 * <p>The roots are stored in the <code>roots</code> array.</p>
 *
 * @param coeffs Equation coefficients, an array of 3 or 4 elements.
 * @param roots Destination array of real roots that has 1 or 3 elements.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#solvecubic">org.opencv.core.Core.solveCubic</a>
 */
    public static int solveCubic(Mat coeffs, Mat roots)
    {

        int retVal = solveCubic_0(coeffs.nativeObj, roots.nativeObj);

        return retVal;
    }


    //
    // C++:  double solvePoly(Mat coeffs, Mat& roots, int maxIters = 300)
    //

/**
 * <p>Finds the real or complex roots of a polynomial equation.</p>
 *
 * <p>The function <code>solvePoly</code> finds real and complex roots of a
 * polynomial equation:</p>
 *
 * <p><em>coeffs [n] x^(n) + coeffs [n-1] x^(n-1) +... + coeffs [1] x + coeffs [0]
 * = 0</em></p>
 *
 * @param coeffs Array of polynomial coefficients.
 * @param roots Destination (complex) array of roots.
 * @param maxIters Maximum number of iterations the algorithm does.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#solvepoly">org.opencv.core.Core.solvePoly</a>
 */
    public static double solvePoly(Mat coeffs, Mat roots, int maxIters)
    {

        double retVal = solvePoly_0(coeffs.nativeObj, roots.nativeObj, maxIters);

        return retVal;
    }

/**
 * <p>Finds the real or complex roots of a polynomial equation.</p>
 *
 * <p>The function <code>solvePoly</code> finds real and complex roots of a
 * polynomial equation:</p>
 *
 * <p><em>coeffs [n] x^(n) + coeffs [n-1] x^(n-1) +... + coeffs [1] x + coeffs [0]
 * = 0</em></p>
 *
 * @param coeffs Array of polynomial coefficients.
 * @param roots Destination (complex) array of roots.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#solvepoly">org.opencv.core.Core.solvePoly</a>
 */
    public static double solvePoly(Mat coeffs, Mat roots)
    {

        double retVal = solvePoly_1(coeffs.nativeObj, roots.nativeObj);

        return retVal;
    }


    //
    // C++:  void sort(Mat src, Mat& dst, int flags)
    //

/**
 * <p>Sorts each row or each column of a matrix.</p>
 *
 * <p>The function <code>sort</code> sorts each matrix row or each matrix column in
 * ascending or descending order. So you should pass two operation flags to get
 * desired behaviour. If you want to sort matrix rows or columns
 * lexicographically, you can use STL <code>std.sort</code> generic function
 * with the proper comparison predicate.</p>
 *
 * @param src Source single-channel array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 * @param flags Operation flags, a combination of the following values:
 * <ul>
 *   <li> CV_SORT_EVERY_ROW Each matrix row is sorted independently.
 *   <li> CV_SORT_EVERY_COLUMN Each matrix column is sorted independently. This
 * flag and the previous one are mutually exclusive.
 *   <li> CV_SORT_ASCENDING Each matrix row is sorted in the ascending order.
 *   <li> CV_SORT_DESCENDING Each matrix row is sorted in the descending order.
 * This flag and the previous one are also mutually exclusive.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#sort">org.opencv.core.Core.sort</a>
 * @see org.opencv.core.Core#randShuffle
 * @see org.opencv.core.Core#sortIdx
 */
    public static void sort(Mat src, Mat dst, int flags)
    {

        sort_0(src.nativeObj, dst.nativeObj, flags);

        return;
    }


    //
    // C++:  void sortIdx(Mat src, Mat& dst, int flags)
    //

/**
 * <p>Sorts each row or each column of a matrix.</p>
 *
 * <p>The function <code>sortIdx</code> sorts each matrix row or each matrix column
 * in the ascending or descending order. So you should pass two operation flags
 * to get desired behaviour. Instead of reordering the elements themselves, it
 * stores the indices of sorted elements in the destination array. For example:</p>
 *
 * @param src Source single-channel array.
 * @param dst Destination integer array of the same size as <code>src</code>.
 * @param flags Operation flags that could be a combination of the following
 * values:
 * <ul>
 *   <li> CV_SORT_EVERY_ROW Each matrix row is sorted independently.
 *   <li> CV_SORT_EVERY_COLUMN Each matrix column is sorted independently. This
 * flag and the previous one are mutually exclusive.
 *   <li> CV_SORT_ASCENDING Each matrix row is sorted in the ascending order.
 *   <li> CV_SORT_DESCENDING Each matrix row is sorted in the descending order.
 * This flag and the previous one are also mutually exclusive.
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#sortidx">org.opencv.core.Core.sortIdx</a>
 * @see org.opencv.core.Core#sort
 * @see org.opencv.core.Core#randShuffle
 */
    public static void sortIdx(Mat src, Mat dst, int flags)
    {

        sortIdx_0(src.nativeObj, dst.nativeObj, flags);

        return;
    }


    //
    // C++:  void split(Mat m, vector_Mat& mv)
    //

/**
 * <p>Divides a multi-channel array into several single-channel arrays.</p>
 *
 * <p>The functions <code>split</code> split a multi-channel array into separate
 * single-channel arrays:</p>
 *
 * <p><em>mv [c](I) = src(I)_c</em></p>
 *
 * <p>If you need to extract a single channel or do some other sophisticated
 * channel permutation, use "mixChannels".</p>
 *
 * @param m a m
 * @param mv Destination array or vector of arrays. In the first variant of the
 * function the number of arrays must match <code>src.channels()</code>. The
 * arrays themselves are reallocated, if needed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#split">org.opencv.core.Core.split</a>
 * @see org.opencv.core.Core#merge
 * @see org.opencv.imgproc.Imgproc#cvtColor
 * @see org.opencv.core.Core#mixChannels
 */
    public static void split(Mat m, List<Mat> mv)
    {
        Mat mv_mat = new Mat();
        split_0(m.nativeObj, mv_mat.nativeObj);
        Converters.Mat_to_vector_Mat(mv_mat, mv);
        return;
    }


    //
    // C++:  void sqrt(Mat src, Mat& dst)
    //

/**
 * <p>Calculates a square root of array elements.</p>
 *
 * <p>The functions <code>sqrt</code> calculate a square root of each source array
 * element. In case of multi-channel arrays, each channel is processed
 * independently. The accuracy is approximately the same as of the built-in
 * <code>std.sqrt</code>.</p>
 *
 * @param src Source floating-point array.
 * @param dst Destination array of the same size and type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#sqrt">org.opencv.core.Core.sqrt</a>
 * @see org.opencv.core.Core#pow
 * @see org.opencv.core.Core#magnitude
 */
    public static void sqrt(Mat src, Mat dst)
    {

        sqrt_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void subtract(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 * @param mask Optional operation mask. This is an 8-bit single channel array
 * that specifies elements of the destination array to be changed.
 * @param dtype Optional depth of the output array. See the details below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask, int dtype)
    {

        subtract_0(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj, dtype);

        return;
    }

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 * @param mask Optional operation mask. This is an 8-bit single channel array
 * that specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Mat src2, Mat dst, Mat mask)
    {

        subtract_1(src1.nativeObj, src2.nativeObj, dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Mat src2, Mat dst)
    {

        subtract_2(src1.nativeObj, src2.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void subtract(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    //

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 * @param mask Optional operation mask. This is an 8-bit single channel array
 * that specifies elements of the destination array to be changed.
 * @param dtype Optional depth of the output array. See the details below.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask, int dtype)
    {

        subtract_3(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj, dtype);

        return;
    }

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 * @param mask Optional operation mask. This is an 8-bit single channel array
 * that specifies elements of the destination array to be changed.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Scalar src2, Mat dst, Mat mask)
    {

        subtract_4(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj, mask.nativeObj);

        return;
    }

/**
 * <p>Calculates the per-element difference between two arrays or array and a
 * scalar.</p>
 *
 * <p>The function <code>subtract</code> computes:</p>
 * <ul>
 *   <li> Difference between two arrays, when both input arrays have the same
 * size and the same number of channels:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between an array and a scalar, when <code>src2</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src1.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1(I) - src2) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> Difference between a scalar and an array, when <code>src1</code> is
 * constructed from <code>Scalar</code> or has the same number of elements as
 * <code>src2.channels()</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src1 - src2(I)) if mask(I) != 0</em></p>
 *
 * <ul>
 *   <li> The reverse difference between a scalar and an array in the case of
 * <code>SubRS</code>:
 * </ul>
 *
 * <p><em>dst(I) = saturate(src2 - src1(I)) if mask(I) != 0</em></p>
 *
 * <p>where <code>I</code> is a multi-dimensional index of array elements. In case
 * of multi-channel arrays, each channel is processed independently.</p>
 *
 * <p>The first function in the list above can be replaced with matrix expressions:</p>
 *
 * <p>The input arrays and the destination array can all have the same or different
 * depths. For example, you can subtract to 8-bit unsigned arrays and store the
 * difference in a 16-bit signed array. Depth of the output array is determined
 * by <code>dtype</code> parameter. In the second and third cases above, as well
 * as in the first case, when <code>src1.depth() == src2.depth()</code>,
 * <code>dtype</code> can be set to the default <code>-1</code>. In this case
 * the output array will have the same depth as the input array, be it
 * <code>src1</code>, <code>src2</code> or both.</p>
 *
 * <p>Note: Saturation is not applied when the output array has the depth
 * <code>CV_32S</code>. You may even get result of an incorrect sign in the case
 * of overflow.</p>
 *
 * @param src1 First source array or a scalar.
 * @param src2 Second source array or a scalar.
 * @param dst Destination array of the same size and the same number of channels
 * as the input array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#subtract">org.opencv.core.Core.subtract</a>
 * @see org.opencv.core.Core#addWeighted
 * @see org.opencv.core.Core#add
 * @see org.opencv.core.Core#scaleAdd
 * @see org.opencv.core.Mat#convertTo
 * @see MatrixExpressions
 */
    public static void subtract(Mat src1, Scalar src2, Mat dst)
    {

        subtract_5(src1.nativeObj, src2.val[0], src2.val[1], src2.val[2], src2.val[3], dst.nativeObj);

        return;
    }


    //
    // C++:  Scalar sum(Mat src)
    //

/**
 * <p>Calculates the sum of array elements.</p>
 *
 * <p>The functions <code>sum</code> calculate and return the sum of array
 * elements, independently for each channel.</p>
 *
 * @param src a src
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#sum">org.opencv.core.Core.sum</a>
 * @see org.opencv.core.Core#meanStdDev
 * @see org.opencv.core.Core#reduce
 * @see org.opencv.core.Core#minMaxLoc
 * @see org.opencv.core.Core#countNonZero
 * @see org.opencv.core.Core#norm
 * @see org.opencv.core.Core#mean
 */
    public static Scalar sumElems(Mat src)
    {

        Scalar retVal = new Scalar(sumElems_0(src.nativeObj));

        return retVal;
    }


    //
    // C++:  Scalar trace(Mat mtx)
    //

/**
 * <p>Returns the trace of a matrix.</p>
 *
 * <p>The function <code>trace</code> returns the sum of the diagonal elements of
 * the matrix <code>mtx</code>.</p>
 *
 * <p><em>tr(mtx) = sum _i mtx(i,i)</em></p>
 *
 * @param mtx a mtx
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#trace">org.opencv.core.Core.trace</a>
 */
    public static Scalar trace(Mat mtx)
    {

        Scalar retVal = new Scalar(trace_0(mtx.nativeObj));

        return retVal;
    }


    //
    // C++:  void transform(Mat src, Mat& dst, Mat m)
    //

/**
 * <p>Performs the matrix transformation of every array element.</p>
 *
 * <p>The function <code>transform</code> performs the matrix transformation of
 * every element of the array <code>src</code> and stores the results in
 * <code>dst</code> :</p>
 *
 * <p><em>dst(I) = m * src(I)</em></p>
 *
 * <p>(when <code>m.cols=src.channels()</code>), or</p>
 *
 * <p><em>dst(I) = m * [ src(I); 1]</em></p>
 *
 * <p>(when <code>m.cols=src.channels()+1</code>)</p>
 *
 * <p>Every element of the <code>N</code> -channel array <code>src</code> is
 * interpreted as <code>N</code> -element vector that is transformed using the
 * <code>M x N</code> or <code>M x (N+1)</code> matrix <code>m</code> to
 * <code>M</code>-element vector - the corresponding element of the destination
 * array <code>dst</code>.</p>
 *
 * <p>The function may be used for geometrical transformation of <code>N</code>
 * -dimensional points, arbitrary linear color space transformation (such as
 * various kinds of RGB to YUV transforms), shuffling the image channels, and so
 * forth.</p>
 *
 * @param src Source array that must have as many channels (1 to 4) as
 * <code>m.cols</code> or <code>m.cols-1</code>.
 * @param dst Destination array of the same size and depth as <code>src</code>.
 * It has as many channels as <code>m.rows</code>.
 * @param m Transformation <code>2x2</code> or <code>2x3</code> floating-point
 * matrix.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#transform">org.opencv.core.Core.transform</a>
 * @see org.opencv.imgproc.Imgproc#warpAffine
 * @see org.opencv.core.Core#perspectiveTransform
 * @see org.opencv.imgproc.Imgproc#warpPerspective
 * @see org.opencv.imgproc.Imgproc#getAffineTransform
 * @see org.opencv.video.Video#estimateRigidTransform
 */
    public static void transform(Mat src, Mat dst, Mat m)
    {

        transform_0(src.nativeObj, dst.nativeObj, m.nativeObj);

        return;
    }


    //
    // C++:  void transpose(Mat src, Mat& dst)
    //

/**
 * <p>Transposes a matrix.</p>
 *
 * <p>The function "transpose" transposes the matrix <code>src</code> :</p>
 *
 * <p><em>dst(i,j) = src(j,i)</em></p>
 *
 * <p>Note: No complex conjugation is done in case of a complex matrix. It it
 * should be done separately if needed.</p>
 *
 * @param src Source array.
 * @param dst Destination array of the same type as <code>src</code>.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#transpose">org.opencv.core.Core.transpose</a>
 */
    public static void transpose(Mat src, Mat dst)
    {

        transpose_0(src.nativeObj, dst.nativeObj);

        return;
    }


    //
    // C++:  void vconcat(vector_Mat src, Mat& dst)
    //

    public static void vconcat(List<Mat> src, Mat dst)
    {
        Mat src_mat = Converters.vector_Mat_to_Mat(src);
        vconcat_0(src_mat.nativeObj, dst.nativeObj);

        return;
    }


    // manual port
    public static class MinMaxLocResult {
        public double minVal;
        public double maxVal;
        public Point minLoc;
        public Point maxLoc;

        public MinMaxLocResult() {
            minVal=0; maxVal=0;
            minLoc=new Point();
            maxLoc=new Point();
        }
    }

    // C++: minMaxLoc(Mat src, double* minVal, double* maxVal=0, Point* minLoc=0, Point* maxLoc=0, InputArray mask=noArray())

/**
 * <p>Finds the global minimum and maximum in an array.</p>
 *
 * <p>The functions <code>minMaxLoc</code> find the minimum and maximum element
 * values and their positions. The extremums are searched across the whole array
 * or, if <code>mask</code> is not an empty array, in the specified array
 * region.</p>
 *
 * <p>The functions do not work with multi-channel arrays. If you need to find
 * minimum or maximum elements across all the channels, use "Mat.reshape" first
 * to reinterpret the array as single-channel. Or you may extract the particular
 * channel using either "extractImageCOI", or "mixChannels", or "split".</p>
 *
 * @param src Source single-channel array.
 * @param mask Optional mask used to select a sub-array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#minmaxloc">org.opencv.core.Core.minMaxLoc</a>
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#extractImageCOI
 * @see org.opencv.core.Core#min
 * @see org.opencv.core.Core#mixChannels
 * @see org.opencv.core.Mat#reshape
 * @see org.opencv.core.Core#split
 * @see org.opencv.core.Core#max
 * @see org.opencv.core.Core#inRange
 */
    public static MinMaxLocResult minMaxLoc(Mat src, Mat mask) {
        MinMaxLocResult res = new MinMaxLocResult();
        long maskNativeObj=0;
        if (mask != null) {
            maskNativeObj=mask.nativeObj;
        }
        double resarr[] = n_minMaxLocManual(src.nativeObj, maskNativeObj);
        res.minVal=resarr[0];
        res.maxVal=resarr[1];
        res.minLoc.x=resarr[2];
        res.minLoc.y=resarr[3];
        res.maxLoc.x=resarr[4];
        res.maxLoc.y=resarr[5];
        return res;
    }

/**
 * <p>Finds the global minimum and maximum in an array.</p>
 *
 * <p>The functions <code>minMaxLoc</code> find the minimum and maximum element
 * values and their positions. The extremums are searched across the whole array
 * or, if <code>mask</code> is not an empty array, in the specified array
 * region.</p>
 *
 * <p>The functions do not work with multi-channel arrays. If you need to find
 * minimum or maximum elements across all the channels, use "Mat.reshape" first
 * to reinterpret the array as single-channel. Or you may extract the particular
 * channel using either "extractImageCOI", or "mixChannels", or "split".</p>
 *
 * @param src Source single-channel array.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/operations_on_arrays.html#minmaxloc">org.opencv.core.Core.minMaxLoc</a>
 * @see org.opencv.core.Core#compare
 * @see org.opencv.core.Core#extractImageCOI
 * @see org.opencv.core.Core#min
 * @see org.opencv.core.Core#mixChannels
 * @see org.opencv.core.Mat#reshape
 * @see org.opencv.core.Core#split
 * @see org.opencv.core.Core#max
 * @see org.opencv.core.Core#inRange
 */
    public static MinMaxLocResult minMaxLoc(Mat src) {
        return minMaxLoc(src, null);
    }


    // C++: Size getTextSize(const string& text, int fontFace, double fontScale, int thickness, int* baseLine);
/**
 * <p>Calculates the width and height of a text string.</p>
 *
 * <p>The function <code>getTextSize</code> calculates and returns the size of a
 * box that contains the specified text.
 * That is, the following code renders some text, the tight box surrounding it,
 * and the baseline:</p>
 *
 * @param text Input text string.
 * @param fontFace Font to use. See the "putText" for details.
 * @param fontScale Font scale. See the "putText" for details.
 * @param thickness Thickness of lines used to render the text. See "putText"
 * for details.
 * @param baseLine Output parameter - y-coordinate of the baseline relative to
 * the bottom-most text point.
 *
 * @see <a href="http://docs.opencv.org/modules/core/doc/drawing_functions.html#gettextsize">org.opencv.core.Core.getTextSize</a>
 */
    public static Size getTextSize(String text, int fontFace, double fontScale, int thickness, int[] baseLine) {
        if(baseLine != null && baseLine.length != 1)
            throw new java.lang.IllegalArgumentException("'baseLine' must be 'int[1]' or 'null'.");
        Size retVal = new Size(n_getTextSize(text, fontFace, fontScale, thickness, baseLine));
        return retVal;
    }



    // C++:  void LUT(Mat src, Mat lut, Mat& dst, int interpolation = 0)
    private static native void LUT_0(long src_nativeObj, long lut_nativeObj, long dst_nativeObj, int interpolation);
    private static native void LUT_1(long src_nativeObj, long lut_nativeObj, long dst_nativeObj);

    // C++:  double Mahalanobis(Mat v1, Mat v2, Mat icovar)
    private static native double Mahalanobis_0(long v1_nativeObj, long v2_nativeObj, long icovar_nativeObj);

    // C++:  void PCABackProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    private static native void PCABackProject_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, long result_nativeObj);

    // C++:  void PCACompute(Mat data, Mat& mean, Mat& eigenvectors, int maxComponents = 0)
    private static native void PCACompute_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, int maxComponents);
    private static native void PCACompute_1(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj);

    // C++:  void PCAProject(Mat data, Mat mean, Mat eigenvectors, Mat& result)
    private static native void PCAProject_0(long data_nativeObj, long mean_nativeObj, long eigenvectors_nativeObj, long result_nativeObj);

    // C++:  void SVBackSubst(Mat w, Mat u, Mat vt, Mat rhs, Mat& dst)
    private static native void SVBackSubst_0(long w_nativeObj, long u_nativeObj, long vt_nativeObj, long rhs_nativeObj, long dst_nativeObj);

    // C++:  void SVDecomp(Mat src, Mat& w, Mat& u, Mat& vt, int flags = 0)
    private static native void SVDecomp_0(long src_nativeObj, long w_nativeObj, long u_nativeObj, long vt_nativeObj, int flags);
    private static native void SVDecomp_1(long src_nativeObj, long w_nativeObj, long u_nativeObj, long vt_nativeObj);

    // C++:  void absdiff(Mat src1, Mat src2, Mat& dst)
    private static native void absdiff_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void absdiff(Mat src1, Scalar src2, Mat& dst)
    private static native void absdiff_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void add(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void add_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void add_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void add_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void add(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void add_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void add_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj);
    private static native void add_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void addWeighted(Mat src1, double alpha, Mat src2, double beta, double gamma, Mat& dst, int dtype = -1)
    private static native void addWeighted_0(long src1_nativeObj, double alpha, long src2_nativeObj, double beta, double gamma, long dst_nativeObj, int dtype);
    private static native void addWeighted_1(long src1_nativeObj, double alpha, long src2_nativeObj, double beta, double gamma, long dst_nativeObj);

    // C++:  void batchDistance(Mat src1, Mat src2, Mat& dist, int dtype, Mat& nidx, int normType = NORM_L2, int K = 0, Mat mask = Mat(), int update = 0, bool crosscheck = false)
    private static native void batchDistance_0(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj, int normType, int K, long mask_nativeObj, int update, boolean crosscheck);
    private static native void batchDistance_1(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj, int normType, int K);
    private static native void batchDistance_2(long src1_nativeObj, long src2_nativeObj, long dist_nativeObj, int dtype, long nidx_nativeObj);

    // C++:  void bitwise_and(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_and_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_and_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_not(Mat src, Mat& dst, Mat mask = Mat())
    private static native void bitwise_not_0(long src_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_not_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_or(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_or_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_or_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void bitwise_xor(Mat src1, Mat src2, Mat& dst, Mat mask = Mat())
    private static native void bitwise_xor_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void bitwise_xor_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void calcCovarMatrix(Mat samples, Mat& covar, Mat& mean, int flags, int ctype = CV_64F)
    private static native void calcCovarMatrix_0(long samples_nativeObj, long covar_nativeObj, long mean_nativeObj, int flags, int ctype);
    private static native void calcCovarMatrix_1(long samples_nativeObj, long covar_nativeObj, long mean_nativeObj, int flags);

    // C++:  void cartToPolar(Mat x, Mat y, Mat& magnitude, Mat& angle, bool angleInDegrees = false)
    private static native void cartToPolar_0(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj, long angle_nativeObj, boolean angleInDegrees);
    private static native void cartToPolar_1(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj, long angle_nativeObj);

    // C++:  bool checkRange(Mat a, bool quiet = true,  _hidden_ * pos = 0, double minVal = -DBL_MAX, double maxVal = DBL_MAX)
    private static native boolean checkRange_0(long a_nativeObj, boolean quiet, double minVal, double maxVal);
    private static native boolean checkRange_1(long a_nativeObj);

    // C++:  void circle(Mat img, Point center, int radius, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void circle_0(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void circle_1(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void circle_2(long img_nativeObj, double center_x, double center_y, int radius, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  bool clipLine(Rect imgRect, Point& pt1, Point& pt2)
    private static native boolean clipLine_0(int imgRect_x, int imgRect_y, int imgRect_width, int imgRect_height, double pt1_x, double pt1_y, double[] pt1_out, double pt2_x, double pt2_y, double[] pt2_out);

    // C++:  void compare(Mat src1, Mat src2, Mat& dst, int cmpop)
    private static native void compare_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, int cmpop);

    // C++:  void compare(Mat src1, Scalar src2, Mat& dst, int cmpop)
    private static native void compare_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, int cmpop);

    // C++:  void completeSymm(Mat& mtx, bool lowerToUpper = false)
    private static native void completeSymm_0(long mtx_nativeObj, boolean lowerToUpper);
    private static native void completeSymm_1(long mtx_nativeObj);

    // C++:  void convertScaleAbs(Mat src, Mat& dst, double alpha = 1, double beta = 0)
    private static native void convertScaleAbs_0(long src_nativeObj, long dst_nativeObj, double alpha, double beta);
    private static native void convertScaleAbs_1(long src_nativeObj, long dst_nativeObj);

    // C++:  int countNonZero(Mat src)
    private static native int countNonZero_0(long src_nativeObj);

    // C++:  float cubeRoot(float val)
    private static native float cubeRoot_0(float val);

    // C++:  void dct(Mat src, Mat& dst, int flags = 0)
    private static native void dct_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native void dct_1(long src_nativeObj, long dst_nativeObj);

    // C++:  double determinant(Mat mtx)
    private static native double determinant_0(long mtx_nativeObj);

    // C++:  void dft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    private static native void dft_0(long src_nativeObj, long dst_nativeObj, int flags, int nonzeroRows);
    private static native void dft_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void divide(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void divide_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale, int dtype);
    private static native void divide_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale);
    private static native void divide_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void divide(double scale, Mat src2, Mat& dst, int dtype = -1)
    private static native void divide_3(double scale, long src2_nativeObj, long dst_nativeObj, int dtype);
    private static native void divide_4(double scale, long src2_nativeObj, long dst_nativeObj);

    // C++:  void divide(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void divide_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale, int dtype);
    private static native void divide_6(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale);
    private static native void divide_7(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  bool eigen(Mat src, bool computeEigenvectors, Mat& eigenvalues, Mat& eigenvectors)
    private static native boolean eigen_0(long src_nativeObj, boolean computeEigenvectors, long eigenvalues_nativeObj, long eigenvectors_nativeObj);

    // C++:  void ellipse(Mat img, Point center, Size axes, double angle, double startAngle, double endAngle, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void ellipse_0(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void ellipse_1(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void ellipse_2(long img_nativeObj, double center_x, double center_y, double axes_width, double axes_height, double angle, double startAngle, double endAngle, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void ellipse(Mat img, RotatedRect box, Scalar color, int thickness = 1, int lineType = 8)
    private static native void ellipse_3(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType);
    private static native void ellipse_4(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void ellipse_5(long img_nativeObj, double box_center_x, double box_center_y, double box_size_width, double box_size_height, double box_angle, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void ellipse2Poly(Point center, Size axes, int angle, int arcStart, int arcEnd, int delta, vector_Point& pts)
    private static native void ellipse2Poly_0(double center_x, double center_y, double axes_width, double axes_height, int angle, int arcStart, int arcEnd, int delta, long pts_mat_nativeObj);

    // C++:  void exp(Mat src, Mat& dst)
    private static native void exp_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void extractChannel(Mat src, Mat& dst, int coi)
    private static native void extractChannel_0(long src_nativeObj, long dst_nativeObj, int coi);

    // C++:  float fastAtan2(float y, float x)
    private static native float fastAtan2_0(float y, float x);

    // C++:  void fillConvexPoly(Mat& img, vector_Point points, Scalar color, int lineType = 8, int shift = 0)
    private static native void fillConvexPoly_0(long img_nativeObj, long points_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int lineType, int shift);
    private static native void fillConvexPoly_1(long img_nativeObj, long points_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void fillPoly(Mat& img, vector_vector_Point pts, Scalar color, int lineType = 8, int shift = 0, Point offset = Point())
    private static native void fillPoly_0(long img_nativeObj, long pts_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3, int lineType, int shift, double offset_x, double offset_y);
    private static native void fillPoly_1(long img_nativeObj, long pts_mat_nativeObj, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void flip(Mat src, Mat& dst, int flipCode)
    private static native void flip_0(long src_nativeObj, long dst_nativeObj, int flipCode);

    // C++:  void gemm(Mat src1, Mat src2, double alpha, Mat src3, double gamma, Mat& dst, int flags = 0)
    private static native void gemm_0(long src1_nativeObj, long src2_nativeObj, double alpha, long src3_nativeObj, double gamma, long dst_nativeObj, int flags);
    private static native void gemm_1(long src1_nativeObj, long src2_nativeObj, double alpha, long src3_nativeObj, double gamma, long dst_nativeObj);

    // C++:  string getBuildInformation()
    private static native String getBuildInformation_0();

    // C++:  int64 getCPUTickCount()
    private static native long getCPUTickCount_0();

    // C++:  int getNumberOfCPUs()
    private static native int getNumberOfCPUs_0();

    // C++:  int getOptimalDFTSize(int vecsize)
    private static native int getOptimalDFTSize_0(int vecsize);

    // C++:  int64 getTickCount()
    private static native long getTickCount_0();

    // C++:  double getTickFrequency()
    private static native double getTickFrequency_0();

    // C++:  void hconcat(vector_Mat src, Mat& dst)
    private static native void hconcat_0(long src_mat_nativeObj, long dst_nativeObj);

    // C++:  void idct(Mat src, Mat& dst, int flags = 0)
    private static native void idct_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native void idct_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void idft(Mat src, Mat& dst, int flags = 0, int nonzeroRows = 0)
    private static native void idft_0(long src_nativeObj, long dst_nativeObj, int flags, int nonzeroRows);
    private static native void idft_1(long src_nativeObj, long dst_nativeObj);

    // C++:  void inRange(Mat src, Scalar lowerb, Scalar upperb, Mat& dst)
    private static native void inRange_0(long src_nativeObj, double lowerb_val0, double lowerb_val1, double lowerb_val2, double lowerb_val3, double upperb_val0, double upperb_val1, double upperb_val2, double upperb_val3, long dst_nativeObj);

    // C++:  void insertChannel(Mat src, Mat& dst, int coi)
    private static native void insertChannel_0(long src_nativeObj, long dst_nativeObj, int coi);

    // C++:  double invert(Mat src, Mat& dst, int flags = DECOMP_LU)
    private static native double invert_0(long src_nativeObj, long dst_nativeObj, int flags);
    private static native double invert_1(long src_nativeObj, long dst_nativeObj);

    // C++:  double kmeans(Mat data, int K, Mat& bestLabels, TermCriteria criteria, int attempts, int flags, Mat& centers = Mat())
    private static native double kmeans_0(long data_nativeObj, int K, long bestLabels_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, int attempts, int flags, long centers_nativeObj);
    private static native double kmeans_1(long data_nativeObj, int K, long bestLabels_nativeObj, int criteria_type, int criteria_maxCount, double criteria_epsilon, int attempts, int flags);

    // C++:  void line(Mat img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void line_0(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void line_1(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void line_2(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void log(Mat src, Mat& dst)
    private static native void log_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void magnitude(Mat x, Mat y, Mat& magnitude)
    private static native void magnitude_0(long x_nativeObj, long y_nativeObj, long magnitude_nativeObj);

    // C++:  void max(Mat src1, Mat src2, Mat& dst)
    private static native void max_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void max(Mat src1, Scalar src2, Mat& dst)
    private static native void max_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  Scalar mean(Mat src, Mat mask = Mat())
    private static native double[] mean_0(long src_nativeObj, long mask_nativeObj);
    private static native double[] mean_1(long src_nativeObj);

    // C++:  void meanStdDev(Mat src, vector_double& mean, vector_double& stddev, Mat mask = Mat())
    private static native void meanStdDev_0(long src_nativeObj, long mean_mat_nativeObj, long stddev_mat_nativeObj, long mask_nativeObj);
    private static native void meanStdDev_1(long src_nativeObj, long mean_mat_nativeObj, long stddev_mat_nativeObj);

    // C++:  void merge(vector_Mat mv, Mat& dst)
    private static native void merge_0(long mv_mat_nativeObj, long dst_nativeObj);

    // C++:  void min(Mat src1, Mat src2, Mat& dst)
    private static native void min_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void min(Mat src1, Scalar src2, Mat& dst)
    private static native void min_1(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  void mixChannels(vector_Mat src, vector_Mat dst, vector_int fromTo)
    private static native void mixChannels_0(long src_mat_nativeObj, long dst_mat_nativeObj, long fromTo_mat_nativeObj);

    // C++:  void mulSpectrums(Mat a, Mat b, Mat& c, int flags, bool conjB = false)
    private static native void mulSpectrums_0(long a_nativeObj, long b_nativeObj, long c_nativeObj, int flags, boolean conjB);
    private static native void mulSpectrums_1(long a_nativeObj, long b_nativeObj, long c_nativeObj, int flags);

    // C++:  void mulTransposed(Mat src, Mat& dst, bool aTa, Mat delta = Mat(), double scale = 1, int dtype = -1)
    private static native void mulTransposed_0(long src_nativeObj, long dst_nativeObj, boolean aTa, long delta_nativeObj, double scale, int dtype);
    private static native void mulTransposed_1(long src_nativeObj, long dst_nativeObj, boolean aTa, long delta_nativeObj, double scale);
    private static native void mulTransposed_2(long src_nativeObj, long dst_nativeObj, boolean aTa);

    // C++:  void multiply(Mat src1, Mat src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void multiply_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale, int dtype);
    private static native void multiply_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, double scale);
    private static native void multiply_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void multiply(Mat src1, Scalar src2, Mat& dst, double scale = 1, int dtype = -1)
    private static native void multiply_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale, int dtype);
    private static native void multiply_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, double scale);
    private static native void multiply_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  double norm(Mat src1, int normType = NORM_L2, Mat mask = Mat())
    private static native double norm_0(long src1_nativeObj, int normType, long mask_nativeObj);
    private static native double norm_1(long src1_nativeObj, int normType);
    private static native double norm_2(long src1_nativeObj);

    // C++:  double norm(Mat src1, Mat src2, int normType = NORM_L2, Mat mask = Mat())
    private static native double norm_3(long src1_nativeObj, long src2_nativeObj, int normType, long mask_nativeObj);
    private static native double norm_4(long src1_nativeObj, long src2_nativeObj, int normType);
    private static native double norm_5(long src1_nativeObj, long src2_nativeObj);

    // C++:  void normalize(Mat src, Mat& dst, double alpha = 1, double beta = 0, int norm_type = NORM_L2, int dtype = -1, Mat mask = Mat())
    private static native void normalize_0(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type, int dtype, long mask_nativeObj);
    private static native void normalize_1(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type, int dtype);
    private static native void normalize_2(long src_nativeObj, long dst_nativeObj, double alpha, double beta, int norm_type);
    private static native void normalize_3(long src_nativeObj, long dst_nativeObj);

    // C++:  void patchNaNs(Mat& a, double val = 0)
    private static native void patchNaNs_0(long a_nativeObj, double val);
    private static native void patchNaNs_1(long a_nativeObj);

    // C++:  void perspectiveTransform(Mat src, Mat& dst, Mat m)
    private static native void perspectiveTransform_0(long src_nativeObj, long dst_nativeObj, long m_nativeObj);

    // C++:  void phase(Mat x, Mat y, Mat& angle, bool angleInDegrees = false)
    private static native void phase_0(long x_nativeObj, long y_nativeObj, long angle_nativeObj, boolean angleInDegrees);
    private static native void phase_1(long x_nativeObj, long y_nativeObj, long angle_nativeObj);

    // C++:  void polarToCart(Mat magnitude, Mat angle, Mat& x, Mat& y, bool angleInDegrees = false)
    private static native void polarToCart_0(long magnitude_nativeObj, long angle_nativeObj, long x_nativeObj, long y_nativeObj, boolean angleInDegrees);
    private static native void polarToCart_1(long magnitude_nativeObj, long angle_nativeObj, long x_nativeObj, long y_nativeObj);

    // C++:  void polylines(Mat& img, vector_vector_Point pts, bool isClosed, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void polylines_0(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void polylines_1(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void polylines_2(long img_nativeObj, long pts_mat_nativeObj, boolean isClosed, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void pow(Mat src, double power, Mat& dst)
    private static native void pow_0(long src_nativeObj, double power, long dst_nativeObj);

    // C++:  void putText(Mat img, string text, Point org, int fontFace, double fontScale, Scalar color, int thickness = 1, int lineType = 8, bool bottomLeftOrigin = false)
    private static native void putText_0(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, boolean bottomLeftOrigin);
    private static native void putText_1(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void putText_2(long img_nativeObj, String text, double org_x, double org_y, int fontFace, double fontScale, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void randShuffle_(Mat& dst, double iterFactor = 1.)
    private static native void randShuffle_0(long dst_nativeObj, double iterFactor);
    private static native void randShuffle_1(long dst_nativeObj);

    // C++:  void randn(Mat& dst, double mean, double stddev)
    private static native void randn_0(long dst_nativeObj, double mean, double stddev);

    // C++:  void randu(Mat& dst, double low, double high)
    private static native void randu_0(long dst_nativeObj, double low, double high);

    // C++:  void rectangle(Mat img, Point pt1, Point pt2, Scalar color, int thickness = 1, int lineType = 8, int shift = 0)
    private static native void rectangle_0(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness, int lineType, int shift);
    private static native void rectangle_1(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3, int thickness);
    private static native void rectangle_2(long img_nativeObj, double pt1_x, double pt1_y, double pt2_x, double pt2_y, double color_val0, double color_val1, double color_val2, double color_val3);

    // C++:  void reduce(Mat src, Mat& dst, int dim, int rtype, int dtype = -1)
    private static native void reduce_0(long src_nativeObj, long dst_nativeObj, int dim, int rtype, int dtype);
    private static native void reduce_1(long src_nativeObj, long dst_nativeObj, int dim, int rtype);

    // C++:  void repeat(Mat src, int ny, int nx, Mat& dst)
    private static native void repeat_0(long src_nativeObj, int ny, int nx, long dst_nativeObj);

    // C++:  void scaleAdd(Mat src1, double alpha, Mat src2, Mat& dst)
    private static native void scaleAdd_0(long src1_nativeObj, double alpha, long src2_nativeObj, long dst_nativeObj);

    // C++:  void setIdentity(Mat& mtx, Scalar s = Scalar(1))
    private static native void setIdentity_0(long mtx_nativeObj, double s_val0, double s_val1, double s_val2, double s_val3);
    private static native void setIdentity_1(long mtx_nativeObj);

    // C++:  bool solve(Mat src1, Mat src2, Mat& dst, int flags = DECOMP_LU)
    private static native boolean solve_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, int flags);
    private static native boolean solve_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  int solveCubic(Mat coeffs, Mat& roots)
    private static native int solveCubic_0(long coeffs_nativeObj, long roots_nativeObj);

    // C++:  double solvePoly(Mat coeffs, Mat& roots, int maxIters = 300)
    private static native double solvePoly_0(long coeffs_nativeObj, long roots_nativeObj, int maxIters);
    private static native double solvePoly_1(long coeffs_nativeObj, long roots_nativeObj);

    // C++:  void sort(Mat src, Mat& dst, int flags)
    private static native void sort_0(long src_nativeObj, long dst_nativeObj, int flags);

    // C++:  void sortIdx(Mat src, Mat& dst, int flags)
    private static native void sortIdx_0(long src_nativeObj, long dst_nativeObj, int flags);

    // C++:  void split(Mat m, vector_Mat& mv)
    private static native void split_0(long m_nativeObj, long mv_mat_nativeObj);

    // C++:  void sqrt(Mat src, Mat& dst)
    private static native void sqrt_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void subtract(Mat src1, Mat src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void subtract_0(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void subtract_1(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj, long mask_nativeObj);
    private static native void subtract_2(long src1_nativeObj, long src2_nativeObj, long dst_nativeObj);

    // C++:  void subtract(Mat src1, Scalar src2, Mat& dst, Mat mask = Mat(), int dtype = -1)
    private static native void subtract_3(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj, int dtype);
    private static native void subtract_4(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj, long mask_nativeObj);
    private static native void subtract_5(long src1_nativeObj, double src2_val0, double src2_val1, double src2_val2, double src2_val3, long dst_nativeObj);

    // C++:  Scalar sum(Mat src)
    private static native double[] sumElems_0(long src_nativeObj);

    // C++:  Scalar trace(Mat mtx)
    private static native double[] trace_0(long mtx_nativeObj);

    // C++:  void transform(Mat src, Mat& dst, Mat m)
    private static native void transform_0(long src_nativeObj, long dst_nativeObj, long m_nativeObj);

    // C++:  void transpose(Mat src, Mat& dst)
    private static native void transpose_0(long src_nativeObj, long dst_nativeObj);

    // C++:  void vconcat(vector_Mat src, Mat& dst)
    private static native void vconcat_0(long src_mat_nativeObj, long dst_nativeObj);
    private static native double[] n_minMaxLocManual(long src_nativeObj, long mask_nativeObj);
    private static native double[] n_getTextSize(String text, int fontFace, double fontScale, int thickness, int[] baseLine);

}
