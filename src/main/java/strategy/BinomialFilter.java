package strategy;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import java.io.IOException;

import static org.opencv.imgproc.Imgproc.bilateralFilter;

public class BinomialFilter implements Filter{
    @Override
    public Mat apply() throws IOException {
        Mat mat = Imgcodecs.imread(Filter.PATH);
        Mat dest = mat.clone();
        bilateralFilter(mat,dest, 1, 1, 1);
        return dest;
    }
}
