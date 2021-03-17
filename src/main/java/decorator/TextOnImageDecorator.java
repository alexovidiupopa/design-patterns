package decorator;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.highgui.HighGui;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class TextOnImageDecorator extends ImageDecorator {

    public TextOnImageDecorator(Shape decoratedBorder) {
        super(decoratedBorder);
    }

    @Override
    public void draw(String path) {
        super.draw(path);
        extra(path);
    }

    public void extra(String path){
        Mat src = Imgcodecs.imread(path);
        Point position = new Point(250, 250);
        Scalar color = new Scalar(255, 255, 255);
        int font = Imgproc.FONT_HERSHEY_SIMPLEX;
        int scale = 1;
        int thickness = 1;
        Imgproc.putText(src, "hello", position, font, scale, color, thickness);
        HighGui.imshow("Img with text", src);
        HighGui.waitKey();
    }
}
