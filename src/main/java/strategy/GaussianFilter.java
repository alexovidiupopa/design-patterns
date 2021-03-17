package strategy;

import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class GaussianFilter implements Filter{
    @Override
    public Mat apply() throws IOException {
        byte[] bytes = Files.readAllBytes(new File(Filter.PATH).toPath());
        Mat mat = Imgcodecs.imdecode(new MatOfByte(bytes), Imgcodecs.IMREAD_UNCHANGED);
        Mat dest = mat.clone();
        Imgproc.sqrBoxFilter(mat, dest, 1, new Size(10,10));
        return dest;
    }
}
