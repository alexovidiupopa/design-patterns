package decorator;

import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import strategy.Filter;

public class Rectangle implements Shape {

    @Override
    public void draw(String path) {
        Mat mat = Imgcodecs.imread(Filter.PATH);
        Imgproc.rectangle(mat, new Point(10, 10),new Point(40, 40), new Scalar(0, 0, 255), 3);
        Imgcodecs.imwrite(path,mat);
    }
}
