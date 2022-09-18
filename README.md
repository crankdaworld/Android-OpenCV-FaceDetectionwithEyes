Android-OpenCV-FaceDetectionwithEyes
====================================

Android OpenCV Sample Code to detect Faces and Eyes within Faces.It uses devices front camera. This has been tested on Android ver 4.x
1. To Change Camera View : Change SampleCvViewBase.java 0penCamera() method. 

mCamera = new VideoCapture(Highgui.CV_CAP_ANDROID);//Default Camera 
mCamera = new VideoCapture(Highgui.CV_CAP_ANDROID+1);//Front Camera

2. This will detect eyes, only whithin found face. Check FdView.java for more details.

3. I have tested this in my handset Sony Neo V , Android SDK 4.0

More information on the source code login can be found at http://imranakthar.com/android-opencv-detecting-face-and-eye/ 

imran [AT] imranakthar [DOT] com
www.imranakthar.com






