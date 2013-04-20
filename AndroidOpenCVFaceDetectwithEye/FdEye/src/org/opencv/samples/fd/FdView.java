package org.opencv.samples.fd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.opencv.android.Utils;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;
import org.opencv.objdetect.CascadeClassifier;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.SurfaceHolder;


class FdView extends SampleCvViewBase {
    private static final String   TAG = "Sample::FdView";
    private Mat                   mRgba;
    private Mat                   mGray;
    private File                  mCascadeFile,mEyeFile;
    private CascadeClassifier     mJavaDetector,mEyeDetector;
    private DetectionBasedTracker mNativeDetector;

    private static final Scalar   FACE_RECT_COLOR = new Scalar(0, 255, 0, 255);
    private static final Scalar   EYE_RECT_COLOR = new Scalar(255,0, 0, 255);
    
    
    public static final int       JAVA_DETECTOR     = 0;
    public static final int       NATIVE_DETECTOR   = 1;
    
    private int                   mDetectorType     = JAVA_DETECTOR;

    private float                 mRelativeFaceSize = 0;
    private int					  mAbsoluteFaceSize = 0;
    HeadPose hp;
    
    public void setMinFaceSize(float faceSize)
    {
		mRelativeFaceSize = faceSize;
		mAbsoluteFaceSize = 0;
    }
    
    public void setDetectorType(int type)
    {
    	if (mDetectorType != type)
    	{
    		mDetectorType = type;
    		
    		if (type == NATIVE_DETECTOR)
    		{
    			Log.i(TAG, "Detection Based Tracker enabled");
    			mNativeDetector.start();
    		}
    		else
    		{
    			Log.i(TAG, "Cascade detector enabled");
    			mNativeDetector.stop();
    		}
    	}
    }

    public FdView(Context context) {
        super(context);
        hp=new HeadPose();//imran
        try {
            /*InputStream is = context.getResources().openRawResource(R.raw.lbpcascade_frontalface);
            File cascadeDir = context.getDir("cascade", Context.MODE_PRIVATE);
            mCascadeFile = new File(cascadeDir, "lbpcascade_frontalface.xml");
            FileOutputStream os = new FileOutputStream(mCascadeFile);
            
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            is.close();
            os.close();

            mJavaDetector = new CascadeClassifier(mCascadeFile.getAbsolutePath());
            if (mJavaDetector.empty()) {
                Log.e(TAG, "Failed to load cascade classifier");
                mJavaDetector = null;
            } else
                Log.i(TAG, "Loaded cascade classifier from " + mCascadeFile.getAbsolutePath());

            mNativeDetector = new DetectionBasedTracker(mCascadeFile.getAbsolutePath(), 0);
            
            cascadeDir.delete();*/
        	
        	   InputStream is = context.getResources().openRawResource(R.raw.haarcascade_frontalface_alt);
               File cascadeDir = context.getDir("cascade", Context.MODE_PRIVATE);
               mCascadeFile = new File(cascadeDir, "haarcascade_frontalface_alt.xml");            
               FileOutputStream os = new FileOutputStream(mCascadeFile);
               
               byte[] buffer = new byte[4096];
               int bytesRead;
               while ((bytesRead = is.read(buffer)) != -1) {
                   os.write(buffer, 0, bytesRead);
               }
               is.close();
               os.close();
              
               mJavaDetector = new CascadeClassifier(mCascadeFile.getAbsolutePath());
               if (mJavaDetector.empty()) {
                   Log.e(TAG, "Failed to load cascade classifier");
                   mJavaDetector = null;
               } else
               {
                   Log.i(TAG, "Loaded cascade classifier from " + mCascadeFile.getAbsolutePath());
               }

               InputStream eye=context.getResources().openRawResource(R.raw.haarcascade_eye_tree_eyeglasses);
               File eyeDir=context.getDir("cascadeeye", Context.MODE_PRIVATE);
               mEyeFile=new File(eyeDir, "haarcascade_eye_tree_eyeglasses.xml");
               FileOutputStream os1 = new FileOutputStream(mEyeFile);
              
               byte[] buffer1 = new byte[4096];
               int bytesRead1;
               while ((bytesRead1 = eye.read(buffer1)) != -1) {
                   os1.write(buffer1, 0, bytesRead1);
               }
               eye.close();
               os1.close();
               
               mEyeDetector = new CascadeClassifier(mEyeFile.getAbsolutePath());
               if (mEyeDetector.empty()) {
                   Log.e(TAG, "Failed to load eye cascade classifier");
                   mEyeDetector = null;
               } else
               {
                   Log.i(TAG, "Loaded eye cascade classifier from " + mEyeFile.getAbsolutePath());
               }
           
               mNativeDetector = new DetectionBasedTracker(mCascadeFile.getAbsolutePath(), 0);
               if (mNativeDetector==null) 
               {
                   Log.e(TAG, "Failed to load native cascade classifier");
                  // mJavaDetector = null;
               } else
               {
                   Log.i(TAG, "Loaded native cascade classifier from " + mCascadeFile.getAbsolutePath());
               }
               
               cascadeDir.delete();
               eyeDir.delete();
        	
        	

        } catch (IOException e) {
            e.printStackTrace();
            Log.e(TAG, "Failed to load cascade. Exception thrown: " + e);
        }
    }

    @Override
	public void surfaceCreated(SurfaceHolder holder) {
        synchronized (this) {
            // initialize Mats before usage
            mGray = new Mat();
            mRgba = new Mat();
        }

        super.surfaceCreated(holder);
	}

	@Override
    protected Bitmap processFrame(VideoCapture capture) {
        capture.retrieve(mRgba, Highgui.CV_CAP_ANDROID_COLOR_FRAME_RGBA);
        capture.retrieve(mGray, Highgui.CV_CAP_ANDROID_GREY_FRAME);
        
        if (mAbsoluteFaceSize == 0)
        {
        	int height = mGray.rows();
        	if (Math.round(height * mRelativeFaceSize) > 0);
        	{
        		mAbsoluteFaceSize = Math.round(height * mRelativeFaceSize);
        	}
        	mNativeDetector.setMinFaceSize(mAbsoluteFaceSize);
        }
        
        MatOfRect faces = new MatOfRect();
        MatOfRect eyes = new MatOfRect();
        
        if (mDetectorType == JAVA_DETECTOR)
        {
        	if (mJavaDetector != null)
                mJavaDetector.detectMultiScale(mGray, faces, 1.1, 2, 2 // TODO: objdetect.CV_HAAR_SCALE_IMAGE
                        , new Size(mAbsoluteFaceSize, mAbsoluteFaceSize), new Size());
        }
        else if (mDetectorType == NATIVE_DETECTOR)
        {
        	if (mNativeDetector != null)
        		mNativeDetector.detect(mGray, faces);
        }
        else
        {
        	Log.e(TAG, "Detection method is not selected!");
        }
        
        Rect[] facesArray = faces.toArray();
        for (int i = 0; i < facesArray.length; i++)
            Core.rectangle(mRgba, facesArray[i].tl(), facesArray[i].br(), FACE_RECT_COLOR, 3);
       
        if(facesArray.length>0)
        {
        	
        	//Rect roi = new Rect((int)facesArray[0].tl().x,(int)facesArray[0].tl().y,facesArray[0].width,facesArray[0].height);
        	//Rect roi = new Rect((int)facesArray[0].tl().x,(int)(facesArray[0].tl().y+facesArray[0].height/5),facesArray[0].width,(int)(facesArray[0].height/3));//imran
        	Rect roi = new Rect((int)facesArray[0].tl().x,(int)(facesArray[0].tl().y),facesArray[0].width,(int)(facesArray[0].height));//imran
        	//taking inputs from nustrat opencv example
        	//imran check above, using tl of x and tl of y.other wise it will give runtime errors
        	Mat cropped = new Mat();
        	//cropped = mGray.submat(facesArray[0]);//imran yuppie!, this did the trick!...everything else was failing
        	//refer to opencv 2.4 tut pdf
        	cropped = mGray.submat(roi);
        	//cropped.copyTo(mGray.submat(roi));
        	if (mEyeDetector != null)
        	mEyeDetector.detectMultiScale(cropped, eyes, 1.1,2,2,new Size(mAbsoluteFaceSize, mAbsoluteFaceSize), new Size());
        	else
        	Log.i("Fdvuew","mEyeDetector is NULL");
        	
        Rect[] eyesArray;
        eyesArray = eyes.toArray();
        Log.i("Fdvuew","Eyes Count"+eyesArray.length);
        Point x1=new Point();
        //using opencv tutorials for circle, its working fine now.
        
        for (int i = 0; i < eyesArray.length; i++)
        {
           
        	x1.x=facesArray[0].x + eyesArray[i].x + eyesArray[i].width*0.5;
        	x1.y=facesArray[0].y + eyesArray[i].y + eyesArray[i].height*0.5;
        	int Radius=(int)((eyesArray[i].width + eyesArray[i].height)*0.25 );
        	Core.circle(mRgba, x1, Radius, EYE_RECT_COLOR);
        	//x1.y=faces[i].y + eyes[j].y + eyes[j].height*0.5;
        	
        	// Core.rectangle(mRgba,eyesArray[i].tl(), eyesArray[i].br(), EYE_RECT_COLOR, 3);
        	//x1.x=eyesArray[i].tl().x + facesArray[0].width;
        	//x1.y=eyesArray[i].tl().y + facesArray[0].width;
        	//Core.rectangle(mRgba,x1, eyesArray[i].br(), EYE_RECT_COLOR, 3);
        }
        }
      
        
        
        
       

       // Bitmap bmp = Bitmap.createBitmap(mRgba.cols(), mRgba.rows(), Bitmap.Config.ARGB_8888);
        Bitmap bmp = Bitmap.createBitmap(mRgba.cols(), mRgba.rows(), Bitmap.Config.ARGB_8888);

        try {
        	Utils.matToBitmap(mRgba, bmp);
        } catch(Exception e) {
        	Log.e(TAG, "Utils.matToBitmap() throws an exception: " + e.getMessage());
            bmp.recycle();
            bmp = null;
        }
        
        return bmp;
    }

    @Override
    public void run() {
        super.run();

        synchronized (this) {
            // Explicitly deallocate Mats
            if (mRgba != null)
                mRgba.release();
            if (mGray != null)
                mGray.release();
            if (mCascadeFile != null)
            	mCascadeFile.delete();
            if (mNativeDetector != null)
            	mNativeDetector.release();

            mRgba = null;
            mGray = null;
            mCascadeFile = null;
        }
    }
}
