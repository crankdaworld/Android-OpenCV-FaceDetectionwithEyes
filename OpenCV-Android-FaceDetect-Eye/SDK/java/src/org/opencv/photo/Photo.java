
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.photo;

import org.opencv.core.Mat;

public class Photo {

    private static final int
            CV_INPAINT_NS = 0,
            CV_INPAINT_TELEA = 1;


    public static final int
            INPAINT_NS = CV_INPAINT_NS,
            INPAINT_TELEA = CV_INPAINT_TELEA;


    //
    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRadius, int flags)
    //

/**
 * <p>Restores the selected region in an image using the region neighborhood.</p>
 *
 * <p>The function reconstructs the selected image area from the pixel near the
 * area boundary. The function may be used to remove dust and scratches from a
 * scanned photo, or to remove undesirable objects from still images or video.
 * See http://en.wikipedia.org/wiki/Inpainting for more details.</p>
 *
 * @param src Input 8-bit 1-channel or 3-channel image.
 * @param inpaintMask Inpainting mask, 8-bit 1-channel image. Non-zero pixels
 * indicate the area that needs to be inpainted.
 * @param dst Output image with the same size and type as <code>src</code>.
 * @param inpaintRadius Radius of a circular neighborhood of each point
 * inpainted that is considered by the algorithm.
 * @param flags Inpainting method that could be one of the following:
 * <ul>
 *   <li> INPAINT_NS Navier-Stokes based method.
 *   <li> INPAINT_TELEA Method by Alexandru Telea [Telea04].
 * </ul>
 *
 * @see <a href="http://docs.opencv.org/modules/photo/doc/inpainting.html#inpaint">org.opencv.photo.Photo.inpaint</a>
 */
    public static void inpaint(Mat src, Mat inpaintMask, Mat dst, double inpaintRadius, int flags)
    {

        inpaint_0(src.nativeObj, inpaintMask.nativeObj, dst.nativeObj, inpaintRadius, flags);

        return;
    }




    // C++:  void inpaint(Mat src, Mat inpaintMask, Mat& dst, double inpaintRadius, int flags)
    private static native void inpaint_0(long src_nativeObj, long inpaintMask_nativeObj, long dst_nativeObj, double inpaintRadius, int flags);

}
