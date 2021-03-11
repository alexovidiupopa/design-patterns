package strategy;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.osgi.OpenCVNativeLoader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import static org.opencv.imgproc.Imgproc.bilateralFilter;

public class BinomialFilter implements Filter{
    @Override
    public Mat apply() throws IOException {
        byte[] bytes = Files.readAllBytes(new File(Filter.PATH).toPath());
        Mat mat = Imgcodecs.imread(Filter.PATH);
        Mat dest = mat.clone();
        bilateralFilter(mat,dest, 1, 1, 1);
        return dest;
    }
}
