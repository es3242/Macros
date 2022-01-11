package satisfactionSurvey;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.*;
import javax.print.DocFlavor.URL;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

public class ImageDetector {

	public static void main(String[] args) {

		
		try {
		
		//System.load("C:/Users/sku/Downloads/OpenCV/build/java/x64/opencv_java455.dll");
		System.load("C:/opencv/build/java/x64/opencv_java455.dll");
		
		BufferedImage image;
		
		URL url = new URL("https://github.com/es3242/Macros/blob/master/test_src.png");
		image = ImageIO.read(url);

		
		
		Imgproc.matchTemplate(image, image, image, Imgproc.TM_CCOEFF_NORMED); 
		}catch (IOException e){}
		
	}
	
	

}
