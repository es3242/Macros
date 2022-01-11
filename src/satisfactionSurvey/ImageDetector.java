package satisfactionSurvey;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;

public class ImageDetector {

	public static void main(String[] args) {

		System.load("C:/Users/sku/Downloads/OpenCV/build/java/x64/opencv_java455.dll");

		System.out.println("Welcome to OpenCV " + Core.VERSION);
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        Mat m  = Mat.eye(3, 3, CvType.CV_8UC1);
        System.out.println("m = " + m.dump());
	}
	
	

}
