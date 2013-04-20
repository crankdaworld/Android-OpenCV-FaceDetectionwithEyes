
//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.ml;

import org.opencv.core.TermCriteria;

// C++: class CvANN_MLP_TrainParams
/**
 * <p>Parameters of the MLP training algorithm. You can initialize the structure by
 * a constructor or the individual parameters can be adjusted after the
 * structure is created.</p>
 *
 * <p>The back-propagation algorithm parameters:</p>
 *
 * @see <a href="http://docs.opencv.org/modules/ml/doc/neural_networks.html#cvann-mlp-trainparams">org.opencv.ml.CvANN_MLP_TrainParams</a>
 */
public class CvANN_MLP_TrainParams {

    protected final long nativeObj;
    protected CvANN_MLP_TrainParams(long addr) { nativeObj = addr; }


    public static final int
            BACKPROP = 0,
            RPROP = 1;


    //
    // C++:   CvANN_MLP_TrainParams::CvANN_MLP_TrainParams()
    //

/**
 * <p>The constructors.</p>
 *
 * <p>By default the RPROP algorithm is used:</p>
 *
 * @see <a href="http://docs.opencv.org/modules/ml/doc/neural_networks.html#cvann-mlp-trainparams-cvann-mlp-trainparams">org.opencv.ml.CvANN_MLP_TrainParams.CvANN_MLP_TrainParams</a>
 */
    public   CvANN_MLP_TrainParams()
    {

        nativeObj = CvANN_MLP_TrainParams_0();

        return;
    }


    //
    // C++: TermCriteria CvANN_MLP_TrainParams::term_crit
    //

    public  TermCriteria get_term_crit()
    {

        TermCriteria retVal = new TermCriteria(get_term_crit_0(nativeObj));

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::term_crit
    //

    public  void set_term_crit(TermCriteria term_crit)
    {

        set_term_crit_0(nativeObj, term_crit.type, term_crit.maxCount, term_crit.epsilon);

        return;
    }


    //
    // C++: int CvANN_MLP_TrainParams::train_method
    //

    public  int get_train_method()
    {

        int retVal = get_train_method_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::train_method
    //

    public  void set_train_method(int train_method)
    {

        set_train_method_0(nativeObj, train_method);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::bp_dw_scale
    //

    public  double get_bp_dw_scale()
    {

        double retVal = get_bp_dw_scale_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::bp_dw_scale
    //

    public  void set_bp_dw_scale(double bp_dw_scale)
    {

        set_bp_dw_scale_0(nativeObj, bp_dw_scale);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::bp_moment_scale
    //

    public  double get_bp_moment_scale()
    {

        double retVal = get_bp_moment_scale_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::bp_moment_scale
    //

    public  void set_bp_moment_scale(double bp_moment_scale)
    {

        set_bp_moment_scale_0(nativeObj, bp_moment_scale);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw0
    //

    public  double get_rp_dw0()
    {

        double retVal = get_rp_dw0_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw0
    //

    public  void set_rp_dw0(double rp_dw0)
    {

        set_rp_dw0_0(nativeObj, rp_dw0);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_plus
    //

    public  double get_rp_dw_plus()
    {

        double retVal = get_rp_dw_plus_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_plus
    //

    public  void set_rp_dw_plus(double rp_dw_plus)
    {

        set_rp_dw_plus_0(nativeObj, rp_dw_plus);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_minus
    //

    public  double get_rp_dw_minus()
    {

        double retVal = get_rp_dw_minus_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_minus
    //

    public  void set_rp_dw_minus(double rp_dw_minus)
    {

        set_rp_dw_minus_0(nativeObj, rp_dw_minus);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_min
    //

    public  double get_rp_dw_min()
    {

        double retVal = get_rp_dw_min_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_min
    //

    public  void set_rp_dw_min(double rp_dw_min)
    {

        set_rp_dw_min_0(nativeObj, rp_dw_min);

        return;
    }


    //
    // C++: double CvANN_MLP_TrainParams::rp_dw_max
    //

    public  double get_rp_dw_max()
    {

        double retVal = get_rp_dw_max_0(nativeObj);

        return retVal;
    }


    //
    // C++: void CvANN_MLP_TrainParams::rp_dw_max
    //

    public  void set_rp_dw_max(double rp_dw_max)
    {

        set_rp_dw_max_0(nativeObj, rp_dw_max);

        return;
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   CvANN_MLP_TrainParams::CvANN_MLP_TrainParams()
    private static native long CvANN_MLP_TrainParams_0();

    // C++: TermCriteria CvANN_MLP_TrainParams::term_crit
    private static native double[] get_term_crit_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::term_crit
    private static native void set_term_crit_0(long nativeObj, int term_crit_type, int term_crit_maxCount, double term_crit_epsilon);

    // C++: int CvANN_MLP_TrainParams::train_method
    private static native int get_train_method_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::train_method
    private static native void set_train_method_0(long nativeObj, int train_method);

    // C++: double CvANN_MLP_TrainParams::bp_dw_scale
    private static native double get_bp_dw_scale_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::bp_dw_scale
    private static native void set_bp_dw_scale_0(long nativeObj, double bp_dw_scale);

    // C++: double CvANN_MLP_TrainParams::bp_moment_scale
    private static native double get_bp_moment_scale_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::bp_moment_scale
    private static native void set_bp_moment_scale_0(long nativeObj, double bp_moment_scale);

    // C++: double CvANN_MLP_TrainParams::rp_dw0
    private static native double get_rp_dw0_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw0
    private static native void set_rp_dw0_0(long nativeObj, double rp_dw0);

    // C++: double CvANN_MLP_TrainParams::rp_dw_plus
    private static native double get_rp_dw_plus_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_plus
    private static native void set_rp_dw_plus_0(long nativeObj, double rp_dw_plus);

    // C++: double CvANN_MLP_TrainParams::rp_dw_minus
    private static native double get_rp_dw_minus_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_minus
    private static native void set_rp_dw_minus_0(long nativeObj, double rp_dw_minus);

    // C++: double CvANN_MLP_TrainParams::rp_dw_min
    private static native double get_rp_dw_min_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_min
    private static native void set_rp_dw_min_0(long nativeObj, double rp_dw_min);

    // C++: double CvANN_MLP_TrainParams::rp_dw_max
    private static native double get_rp_dw_max_0(long nativeObj);

    // C++: void CvANN_MLP_TrainParams::rp_dw_max
    private static native void set_rp_dw_max_0(long nativeObj, double rp_dw_max);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
