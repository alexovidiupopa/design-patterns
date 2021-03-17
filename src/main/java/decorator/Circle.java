package decorator;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import strategy.Filter;

public class Circle implements Shape {
    @Override
    public void draw(String path) {
        Mat mat = Imgcodecs.imread(Filter.PATH);
        Imgproc.circle(mat, new Point(300,300), 50, new Scalar(0, 0, 255));
        Imgcodecs.imwrite(path,mat);
    }
}
